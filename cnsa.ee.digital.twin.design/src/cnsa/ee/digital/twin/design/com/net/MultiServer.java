package cnsa.ee.digital.twin.design.com.net;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

import component.Component;
import component.Output;

import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;

public class MultiServer {
	private static MultiServer single_instance = null;
	public static Map<String, Thread> port_map = new HashMap<>();
	public static Map<String, Double> reading_map = new HashMap<>();
	protected MultiServer() { }
	
    public static void main(String[] args) {
    	Component component = null;
    	MultiServer multiServer = MultiServer.getInstance();
        int[] ports = {8888, 8889, 8899};
        for (int port : ports) {
        	multiServer.createServerThread(port, component);
        }
    }
    
	public static synchronized MultiServer getInstance() {
		if (single_instance == null) 
			single_instance = new MultiServer(); 
		return single_instance; 
	}
        
    public void createServerThread(int port,Component component) {
    	Thread listenerThread = new Thread(() -> {
        	Socket socket = null;
        	ServerSocket server = null;
        	DataInputStream dis = null;
        	try {
				server = new ServerSocket(port);
            	boolean listening = true;
                System.out.println("开始监听，端口号：" + port);
            	while(listening) {
            		try {
            			socket = server.accept();
            			System.out.println("成功与端口 " + port + " 连接");
                        dis = new DataInputStream(socket.getInputStream());
                        while (listening) {
                            String message = dis.readUTF();
                            if (message.equals("q")) {
                            	if (dis != null) {
                            		dis.close();
                            	}
                            	if (server != null) {
                            		server.close();
                            	}
                            	System.out.println("端口" + port + "终止监听。");
        						listening = false;
        						closeThread(port);
                            }
                            else if (message.equals("a")) {
                            	printAllThread();
                            }
                            else if (stringIsLegal(message)){
                            	outputMessage(port, message);
                            	updateReading(port, message, component);
                            }
                        }
                    } catch (EOFException e) {
    					System.out.println("检测到端口 "+port+" 客户端关闭。");
                    } catch (IOException e) {
                        e.printStackTrace();
                        listening = false;
                    } finally {
                    	try {
	                    	if (dis != null) {
	                    		dis.close();
	                    	}
	                    	if (socket != null) {
	                    		socket.close();
	                    	}
	                    } catch (Exception e){
							e.printStackTrace();
						}
                    }
            	}
    		} catch (BindException e){
    			System.out.println(port + "端口不存在。");
    		} catch (IOException e){
    			e.printStackTrace();
    		}
        });
        listenerThread.start();
        port_map.put(String.valueOf(port), listenerThread);
        reading_map.put(String.valueOf(port), 0.0);
    }
    
    private boolean stringIsLegal(String message) {
        try {
            Double.parseDouble(message);
            return true;
        } catch (NumberFormatException e) {
        	System.out.println("信息不可识别。");
            return false;
        }
	}

	public void closeThread(int port) {
    	Thread listenerThread = port_map.get(String.valueOf(port));
    	listenerThread.interrupt();
    	port_map.remove(String.valueOf(port));
    }
    
    private void printAllThread() {
    	for (String key : port_map.keySet()) {
            System.out.println("正在运行的端口号: " + key);
        }
    }
    
    private void outputMessage(int port, String message) {
    	System.out.println("来自端口 " + port + " 的消息：" + message);
    }
    
    private void updateReading(int port, String message, Component cp) {
    	Double reading_number = Double.parseDouble(message);
    	reading_map.put(String.valueOf(port), reading_number);
    	if (cp != null) {
    		for(Output i : cp.getOutputs()) {
    			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(i);
    			try {
    			    editingDomain.getCommandStack().execute(new AbstractCommand() {
    			        @Override
    			        protected boolean prepare() {
    			            return true;
    			        }
    			        @Override
    			        public void execute() {
    			        	i.getReading().setValue(reading_number);
    			        }
    			        @Override
    			        public void redo() {
    			        }
    			    });
    			} catch (Exception e) {
    			    editingDomain.getCommandStack().undo();
    			}
    		}
    	}
    }
}
