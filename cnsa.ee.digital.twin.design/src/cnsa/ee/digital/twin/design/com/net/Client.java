package cnsa.ee.digital.twin.design.com.net;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            Socket clientSocket = new Socket("localhost", 8888);
            PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true);

            // �������������Ϣ
            writer.println("Hello, Server!");
            System.out.println("��Ϣ�ѷ���");

            writer.close();
            clientSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

