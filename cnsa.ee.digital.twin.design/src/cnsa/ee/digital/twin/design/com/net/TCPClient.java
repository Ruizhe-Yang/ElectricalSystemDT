package cnsa.ee.digital.twin.design.com.net;

import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;

public class TCPClient extends Frame{
	Socket s = null;
	DataOutputStream dos = null;
	DataInputStream  dis = null;
	TextField tf = new TextField(40);
	List list = new List(4);
	
	public static void main(String[] args){
		TCPServer server = new TCPServer();
		
		TCPClient client = new TCPClient();
		client.list.add("向服务器端发送的数据:");
		client.setTitle("客户端");
		client.run();
	}
	
	public void run(){
		this.setLocation(400, 300);
		this.setSize(300, 300);
		this.add(list, BorderLayout.NORTH);
		this.add(tf, BorderLayout.SOUTH);
		this.pack();
		this.addWindowListener(
			new WindowAdapter(){
				public void windowClosing(WindowEvent e){
					disconnect();
					System.exit(0);
					}
				}
			);
		tf.addActionListener(new MyListener());
		setVisible(true);
		connect();
	}

	public void connect(){
		try{
			s = new Socket("127.0.0.1", 8889);
			dos = new DataOutputStream(s.getOutputStream());
		} catch (UnknownHostException e){
			e.printStackTrace();
		} catch (IOException e){
			e.printStackTrace();
		}
	}

	public void disconnect(){
		try{
			dos.close();
			s.close();
		} catch (IOException e){
			e.printStackTrace();
		}
	}

	private class MyListener implements ActionListener{
	    public void actionPerformed(ActionEvent e){
		    String str = tf.getText().trim();
		    System.out.println("str: "+str);
		    if (str == "1") {
		    	System.out.println("111111111");
		    	sendRegularly();
		    }
		    list.add(str);
		    tf.setText("");
		    try{
		    	dos.writeUTF(str);
		    	dos.flush();
		    } catch (IOException e1){
		       e1.printStackTrace();  
		    }
	    }
	}
	
	private void sendRegularly() {
		for (int i = 0; i < 5; i++) {
	        try {
	            Thread.sleep(1000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
		    try{
		    	String str = String.valueOf(i);
		    	list.add(str);
			    tf.setText("");
		    	dos.writeUTF(str);
		    	dos.flush();
		    } catch (IOException e1){
		       e1.printStackTrace();  
		    }
		}
	}
	
//	public class TCPServer {
//		static DataInputStream dis = null;
//		public static void main(String[] args){
//			System.out.println("OK");
//			boolean started = false;
//			Socket s = null;
//			TextArea ta = new TextArea();
//			ta.append("从客户端接受的数据:"+"\n");
//			ServerSocket ss = null;
//			try{
//				ss = new ServerSocket(8889);//端口号
//			} catch (BindException e){
//				System.exit(0);
//			} catch (IOException e){
//				e.printStackTrace();
//			}
//			Frame f = new Frame("服务器端");//窗体名称	
//			f.setLocation(400, 300);//窗体出现位置
//			f.setSize(300, 300);//窗体大小
//			f.add(ta,BorderLayout.NORTH);
//			f.pack();
//			f.addWindowListener(
//				new WindowAdapter(){
//					public void windowClosing(WindowEvent e){
//						System.exit(0);
//						}
//					}
//				);
//			f.setVisible(true);
//			try{			 //try-catch块捕捉异常
//				started = true;
//				while(started){
//					boolean bConnected = false;
//					s = ss.accept();
//					bConnected = true;
//					dis = new DataInputStream(s.getInputStream());
//					while(bConnected){
//					    String str = dis.readUTF();
//					    ta.append(str+"\n");
//					}
//				}
//			}catch(EOFException e){                                 
//				System.out.println("Client closed!");
//			}catch(IOException e){
//				e.printStackTrace();
//			}finally{
//				try{
//					if(dis != null)
//						dis.close();
//					if(s != null)
//						s.close();
//				}catch(Exception e){
//					e.printStackTrace();
//				}
//			}
//		}
//	}
	
}


