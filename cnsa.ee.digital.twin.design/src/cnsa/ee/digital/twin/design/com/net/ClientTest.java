package cnsa.ee.digital.twin.design.com.net;

import java.io.*;
import java.net.*;

public class ClientTest{
	Socket socket = null;
	DataOutputStream dos = null;

	public static void main(String[] args) {		
		ClientTest client = new ClientTest();
		client.connect();
		client.send("ok");
		client.disconnect();
	}
	
	public void connect(){
		String port = "8400";
		try{
			socket = new Socket("127.0.0.1", Integer.parseInt(port));
			dos = new DataOutputStream(socket.getOutputStream());
		} catch (UnknownHostException e){
			e.printStackTrace();
		} catch (IOException e){
			e.printStackTrace();
		}
	}
	
	public void send(String str){
		try{
			this.dos.writeUTF(str);
			this.dos.flush();
	    } catch (IOException e){
	        e.printStackTrace();
	    }
	}
	
	public void disconnect(){
		try{
			this.dos.close();
			this.socket.close();
		} catch (IOException e){
			e.printStackTrace();
		}
	}
}

