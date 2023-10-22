package cnsa.ee.digital.twin.design.com.net;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiServer {
    public static void main(String[] args) {
    	MultiServer multiServer = new MultiServer();
        int[] ports = {8888, 8889, 8899};
        for (int port : ports) {
        	multiServer.createServerThread(port);
        }
    }
        
    public void createServerThread(int port) {
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
                            System.out.println("来自端口 " + port + " 的消息：" + message);
                            if (message.equals("q")) {
                            	if (dis != null) {
                            		dis.close();   
                            	}
                            	if (server != null) {
                            		server.close();
                            	}
                            	System.out.println("终止监听。");
        						listening = false;
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
    }
}
