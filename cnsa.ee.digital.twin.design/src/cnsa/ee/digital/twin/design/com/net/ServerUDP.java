package cnsa.ee.digital.twin.design.com.net;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
public class ServerUDP {

    public static void main(String[] args) {
        // 指定UDP服务器端口
        int serverPort = 9999;

        try {
            // 创建DatagramSocket对象并绑定到指定端口
            DatagramSocket serverSocket = new DatagramSocket(serverPort);
//            System.out.println("UDP服务器启动，等待消息...");
            // 创建一个字节数组用于接收数据
            byte[] receiveData = new byte[1024];
            while (true) {
                // 创建DatagramPacket对象用于接收数据
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                // 接收数据
                serverSocket.receive(receivePacket);
                // 从DatagramPacket中获取接收到的数据和发送方的信息
                String receivedMessage = new String(receivePacket.getData(), 0, receivePacket.getLength());
                System.out.println("收到消息: " + receivedMessage);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
