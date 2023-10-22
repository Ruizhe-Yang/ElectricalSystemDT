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
                System.out.println("��ʼ�������˿ںţ�" + port);
            	while(listening) {
            		try {
            			socket = server.accept();
            			System.out.println("�ɹ���˿� " + port + " ����");
                        dis = new DataInputStream(socket.getInputStream());
                        while (listening) {
                            String message = dis.readUTF();
                            System.out.println("���Զ˿� " + port + " ����Ϣ��" + message);
                            if (message.equals("q")) {
                            	if (dis != null) {
                            		dis.close();   
                            	}
                            	if (server != null) {
                            		server.close();
                            	}
                            	System.out.println("��ֹ������");
        						listening = false;
                            }
                        }
                    } catch (EOFException e) {
    					System.out.println("��⵽�˿� "+port+" �ͻ��˹رա�");
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
    			System.out.println(port + "�˿ڲ����ڡ�");
    		} catch (IOException e){
    			e.printStackTrace();
    		}
        });
        listenerThread.start();
    }
}
