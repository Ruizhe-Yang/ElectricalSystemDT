package cnsa.ee.digital.twin.design.com.net;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerVS {
	static DataInputStream dis = null;
	public static void main(String[] args){
		ServerVS server = new ServerVS();
//		server.run("8888");
		server.runTest("12345");
	}
	public void runTest(String port) {
		try {
            ServerSocket serverSocket = new ServerSocket(Integer.parseInt(port)); // 服务器绑定到端口 12345
            System.out.println("Java服务器正在监听端口...");

            // 等待客户端连接
            Socket clientSocket = serverSocket.accept();
            System.out.println("客户端连接成功");

            // 获取输入流和输出流
            InputStream inputStream = clientSocket.getInputStream();
            OutputStream outputStream = clientSocket.getOutputStream();

            // 从客户端接收数据
            byte[] buffer = new byte[1024];
            int bytesRead;
            bytesRead = inputStream.read(buffer);
            String receivedData = new String(buffer, 0, bytesRead);
            System.out.println("从客户端接收的数据: " + receivedData);

            // 发送响应到客户端
            String response = "Hello from Java Server";
            outputStream.write(response.getBytes());
            outputStream.flush();

            // 关闭连接
            clientSocket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
		
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

