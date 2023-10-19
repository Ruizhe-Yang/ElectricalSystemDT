package cnsa.ee.digital.twin.design.com.net;

import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;

public class TCPServer {
	static DataInputStream dis = null;
	public static void main(String[] args){
		System.out.println("OK");
		boolean started = false;
		Socket s = null;
		TextArea ta = new TextArea();
		ta.append("从客户端接受的数据:"+"\n");
		ServerSocket ss = null;
		try{
			ss = new ServerSocket(8889);//端口号
		} catch (BindException e){
			System.exit(0);
		} catch (IOException e){
			e.printStackTrace();
		}
		Frame f = new Frame("服务器端");//窗体名称	
		f.setLocation(400, 300);//窗体出现位置
		f.setSize(300, 300);//窗体大小
		f.add(ta,BorderLayout.NORTH);
		f.pack();
		f.addWindowListener(
			new WindowAdapter(){
				public void windowClosing(WindowEvent e){
					System.exit(0);
					}
				}
			);
		f.setVisible(true);
		try{			 //try-catch块捕捉异常
			started = true;
			while(started){
				boolean bConnected = false;
				s = ss.accept();
				bConnected = true;
				dis = new DataInputStream(s.getInputStream());
				while(bConnected){
				    String str = dis.readUTF();
				    ta.append(str+"\n");
				}
			}
		}catch(EOFException e){                                 
			System.out.println("Client closed!");
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
