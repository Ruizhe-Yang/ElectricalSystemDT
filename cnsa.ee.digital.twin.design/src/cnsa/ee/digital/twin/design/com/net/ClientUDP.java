package cnsa.ee.digital.twin.design.com.net;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ClientUDP {
    public static void main(String[] args) {
        // 要发送的消息
        String message = "Hello, UDP Server!";
        // 服务器的IP地址和端口号
        String serverHost = "10.5.188.132";
        int serverPort = 8400;

        try {
            // 创建DatagramSocket对象
            DatagramSocket socket = new DatagramSocket();

            // 将消息转换为字节数组
            byte[] messageBytes = message.getBytes();

            // 创建DatagramPacket对象，指定消息、消息长度、服务器的IP地址和端口号
            DatagramPacket packet = new DatagramPacket(messageBytes, messageBytes.length,
                    InetAddress.getByName(serverHost), serverPort);

            // 发送数据包
            socket.send(packet);
            System.out.println("Message sent to the server.");

            // 关闭socket
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
