package cnsa.ee.digital.twin.design.com.net;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ClientUDP {
	public static String message = "";
	public static String serverHost = "127.0.0.1";
	public static int serverPort = 9999;
	
	public static void sendMessageUDP() {
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
	
    public static void main(String[] args) {
    	sendMessageUDP();
    }
}
