package cnsa.ee.digital.twin.design.com.net;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ClientUDP {
    public static void main(String[] args) {
        // Ҫ���͵���Ϣ
        String message = "Hello, UDP Server!";
        // ��������IP��ַ�Ͷ˿ں�
        String serverHost = "10.5.188.132";
        int serverPort = 8400;

        try {
            // ����DatagramSocket����
            DatagramSocket socket = new DatagramSocket();

            // ����Ϣת��Ϊ�ֽ�����
            byte[] messageBytes = message.getBytes();

            // ����DatagramPacket����ָ����Ϣ����Ϣ���ȡ���������IP��ַ�Ͷ˿ں�
            DatagramPacket packet = new DatagramPacket(messageBytes, messageBytes.length,
                    InetAddress.getByName(serverHost), serverPort);

            // �������ݰ�
            socket.send(packet);
            System.out.println("Message sent to the server.");

            // �ر�socket
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
