package cnsa.ee.digital.twin.design.com.net;

import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;

public class CommClient extends Frame{
	private static final long serialVersionUID = 2979302049596512894L;
	Socket socket = null;
	DataOutputStream dos = null;
	TextField tf = new TextField(40);
	List list = new List(10);
	
	public static void main(String[] args){		
		CommClient client = new CommClient();
		client.createClientWindow();
		client.addListener();
	}
	
	public void createClientWindow() {
		this.connect();
		this.setLocation(400, 300);
		this.setSize(300, 300);
		this.list.add("��������˷��͵�����:");
		this.setTitle("�ͻ���");
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
		this.setVisible(true);
	}
	
	public void connect(){
		String port = "8888";
		try{
			socket = new Socket("127.0.0.1", Integer.parseInt(port));
			dos = new DataOutputStream(socket.getOutputStream());
			System.out.println("���ӳɹ�");
		} catch (UnknownHostException e){
			e.printStackTrace();
		} catch (IOException e){
			e.printStackTrace();
		}
	}

	public void disconnect(){
		try{
			dos.close();
			socket.close();
			System.exit(0);
		} catch (IOException e){
			e.printStackTrace();
		}
	}
	
	public void addListener() {
		tf.addActionListener(new MyListener());
	}
	
	private class MyListener implements ActionListener{
	    public void actionPerformed(ActionEvent e){
		    String str = tf.getText().trim();
		    list.add(str);
		    tf.setText("");
		    try{
		    	dos.writeUTF(str);
		    	dos.flush();
		    } catch (IOException e1){
		       e1.printStackTrace();  
		    }
		    if (str.equals("0") | str.equals("q")) {
		    	System.out.println("�������");
//		    	sendRegularly();
		    	disconnect();
		    }
	    }
	}
	
//	private void sendRegularly() {
//		for (int i = 0; i < 5; i++) {
//	        try {
//	            Thread.sleep(100);
//	        } catch (InterruptedException e) {
//	            e.printStackTrace();
//	        }
//		    try{
//		    	String str = String.valueOf(i);
//		    	list.add(str);
//			    tf.setText("");
//		    	dos.writeUTF(str);
//		    	dos.flush();
//		    } catch (IOException e1){
//		       e1.printStackTrace();  
//		    }
//		}
//	}
}

