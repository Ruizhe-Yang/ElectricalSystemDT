package cnsa.ee.digital.twin.design.com.net;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;

public class ClientUDP {
	private static ClientUDP single_instance = null;
	public static String message = "launch";
	public static String serverHost = "127.0.0.1";
	public static int serverPort = 9999;
	public static String state1 = "";
	public static String state2 = "";
	protected ClientUDP() { }
	
	public static synchronized ClientUDP getInstance() {
		if (single_instance == null) 
			launch();
			single_instance = new ClientUDP(); 
		return single_instance; 
	}
	
	public static void launch() {
		try {
            DatagramSocket socket = new DatagramSocket();        
            byte[] messageBytes = message.getBytes();
            DatagramPacket packet = new DatagramPacket(messageBytes, messageBytes.length,
                    InetAddress.getByName(serverHost), serverPort);
            socket.send(packet);
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }	
	}
	
	public static void sendStateInfo() {
		try {
            DatagramSocket socket = new DatagramSocket();        
            JSONObject json = new JSONObject();
            json.put("state1", state1);
            json.put("state2", state2);
            String jsonData = json.toString();
            byte[] messageBytes = jsonData.getBytes();
            DatagramPacket packet = new DatagramPacket(messageBytes, messageBytes.length,
                    InetAddress.getByName(serverHost), serverPort);
            socket.send(packet);
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }	
	}
    public static void main(String[] args) {
    	launch();
    	state1 = "123";
    	sendStateInfo();
    }
}
