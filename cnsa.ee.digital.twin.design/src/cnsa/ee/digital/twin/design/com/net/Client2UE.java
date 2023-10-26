package cnsa.ee.digital.twin.design.com.net;

import java.io.*;
import java.net.*;

public class Client2UE{
	Socket socket = null;
	OutputStream out = null;

	public static void main(String[] args) {		
		Client2UE client = new Client2UE();
		client.connect();
		client.send("ok");
		client.disconnect();
	}
	
	public void connect(){
		try{
			socket = new Socket("10.5.188.132", 8400);
			out = socket.getOutputStream();
		} catch (UnknownHostException e){
			e.printStackTrace();
		} catch (IOException e){
			e.printStackTrace();
		}
	}
	
	public void send(String str){
		try{
			out.write(str.getBytes());
			out.flush();
	    } catch (IOException e){
	        e.printStackTrace();
	    }
	}
	
	public void disconnect(){
		try{
			out.close();
			socket.close();
		} catch (IOException e){
			e.printStackTrace();
		}
	}
}

