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
import component.Input;
import component.Output;

import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;

public class MultiServerDemo {
	private static MultiServerDemo single_instance = null;
	public static Map<String, Thread> port_map = new HashMap<>();
	public static Map<String, Double> reading_map = new HashMap<>();
	protected MultiServerDemo() { }
	
    public static void main(String[] args) {
    	Component component = null;
    	MultiServerDemo multiServer = MultiServerDemo.getInstance();
        int[] ports = {8888, 8888, 8899};
        for (int port : ports) {
        	multiServer.createServerThread(port, component);
        }
    }
    
	public static synchronized MultiServerDemo getInstance() {
		if (single_instance == null) 
			single_instance = new MultiServerDemo(); 
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
                System.out.println("Start listening, port number£º" + port);
            	while(listening) {
            		try {
            			socket = server.accept();
            			System.out.println("Successfully connected to port " + port);
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
                            	System.out.println("port" + port + "terminates listening.");
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
    					System.out.println("Detected that the sending end of port " + port + " is closed.");
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
    			System.out.println("The port " + port + " does not exist.");
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
        	System.out.println("The information is not recognizable.");
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
            System.out.println("Running port number:" + key);
        }
    }
    
    private void outputMessage(int port, String message) {
    	System.out.println("Message from port " + port + " : " + message);
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
    			        	if (port == 8001) {
    			        		send2DTSystem(1, reading_number);
    			        	}
    			        	else if (port == 8005) {
    			        		send2DTSystem(2, reading_number);
    			        	}
    			        }
    			        @Override
    			        public void redo() {
    			        }
    			    });
    			} catch (Exception e) {
    			    editingDomain.getCommandStack().undo();
    			}
    		}
    		for(Input i : cp.getInputs()) {
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
    
    private void send2DTSystem(int state, Double value) {
    	ClientUDP clientUDP = ClientUDP.getInstance();
    	if (state == 1) {
    		ClientUDP.state1 = value.toString();
    	}
    	else if (state == 2) {
    		ClientUDP.state2 = value.toString();
    	}
    	clientUDP.sendStateInfo();
    }
}
