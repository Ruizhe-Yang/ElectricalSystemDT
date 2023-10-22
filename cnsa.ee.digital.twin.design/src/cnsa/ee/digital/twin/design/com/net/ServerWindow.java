package cnsa.ee.digital.twin.design.com.net;

import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;

public class ServerWindow {
	static DataInputStream dis = null;
	public static void main(String[] args){
		ServerWindow server = new ServerWindow();
		server.run();
	}
	
	public void run () {
		String port = "8888";
		Socket s = null;
		TextArea ta = new TextArea();
		ServerSocket socket = null;
		try{
			socket = new ServerSocket(Integer.parseInt(port));
		} catch (BindException e){
			System.exit(0);
		} catch (IOException e){
			e.printStackTrace();
		}
		ta.append("从客户端接受的数据:"+"\n");
		Frame server = new Frame("接收端");
		server.setLocation(400, 300);
		server.setSize(300, 300);
		server.add(ta,BorderLayout.NORTH);
		server.pack();
		server.addWindowListener(
			new WindowAdapter(){
				public void windowClosing(WindowEvent e){
					System.exit(0);
					}
				}
			);
		server.setVisible(true);
		while(true){
			try{
				System.out.println("开始监听，端口号："+port);
				s = socket.accept();
				dis = new DataInputStream(s.getInputStream());
				while(true){
				    String str = dis.readUTF();
				    if (str.equals("q")) {
				    	if(dis != null)
							dis.close();
						if(s != null)
							s.close();
						System.out.println("检测到客户端关闭。");
						System.out.println("接收端关闭。");
						System.exit(0);
				    }
				    ta.append(str+"\n");
				}
			}catch(EOFException e){
				System.out.println("检测到客户端关闭。");
			}catch(IOException e){
				e.printStackTrace();
			}finally{
				try{
					if(dis != null)
						dis.close();
					if(s != null)
						s.close();
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		}
	}
}
