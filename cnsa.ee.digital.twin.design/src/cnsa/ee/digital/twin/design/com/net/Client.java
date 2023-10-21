package cnsa.ee.digital.twin.design.com.net;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            Socket clientSocket = new Socket("localhost", 8888);
            PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true);

            // 向服务器发送消息
            writer.println("Hello, Server!");
            System.out.println("消息已发送");

            writer.close();
            clientSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

