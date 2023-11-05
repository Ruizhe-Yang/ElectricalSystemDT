package cnsa.ee.digital.twin.design.com.net;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest {
	static DataInputStream dis = null;
	public static void main(String[] args){
		ServerTest server = new ServerTest();
		server.run("8888");
	}
	
	public void run (String port) {
		Socket socket = null;
		ServerSocket server = null;
		try{
			server = new ServerSocket(Integer.parseInt(port));
			boolean listening = true;
			while(listening){
				try{
					System.out.println("开始监听，端口号："+port);
					socket = server.accept();
					dis = new DataInputStream(socket.getInputStream());
					while(listening){
					    String str = dis.readUTF();
					    System.out.println("收到数据："+str);
					    if (str.equals("e")) {
					        try {
					            Thread.sleep(1000);
					        } catch (InterruptedException e) {
					            e.printStackTrace();
					        }
					    	DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
					    	dos.writeUTF("123456789");
					    	dos.flush();
					    	System.out.println("返回信息已经发送");
					    }

					    if (str.equals("q")) {
					    	if(dis != null)
								dis.close();
							if(socket != null)
								socket.close();
							System.out.println("检测到客户端关闭。");
							listening = false;
					    }
					}
				} catch (EOFException e) {
					System.out.println("检测到客户端关闭。");
				} catch (IOException e) {
					e.printStackTrace();
					listening = false;
				} finally {
					try{
						if(dis != null)
							dis.close();
						if(socket != null)
							socket.close();
					}catch(Exception e){
						e.printStackTrace();
					}
				}
			}
		} catch (BindException e){
			System.out.println(port + "端口不存在。");
		} catch (IOException e){
			e.printStackTrace();
		}
	}
}

