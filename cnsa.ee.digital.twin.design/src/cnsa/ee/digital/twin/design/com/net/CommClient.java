package cnsa.ee.digital.twin.design.com.net;

import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;

public class CommClient extends Frame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2979302049596512894L;
	Socket socket = null;
	DataOutputStream dos = null;
	TextField tf = new TextField(40);
	List list = new List(10);
	
	public static void main(String[] args){		
		CommClient client = new CommClient();
		client.setLocation(400, 300);
		client.setSize(300, 300);
		client.list.add("��������˷��͵�����:");
		client.setTitle("�ͻ���");
		client.add(client.list, BorderLayout.NORTH);
		client.add(client.tf, BorderLayout.SOUTH);
		client.pack();
		client.addWindowListener(
			new WindowAdapter(){
				public void windowClosing(WindowEvent e){
					client.disconnect();
					System.exit(0);
					}
				}
			);
		client.addListener();
		client.setVisible(true);
		client.connect();
	}
	
	public void connect(){
		try{
			socket = new Socket("127.0.0.1", 8888);
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
		    if (str.equals("1")) {
		    	System.out.println("��֤��ȷ");
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
	            Thread.sleep(100);
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
}


