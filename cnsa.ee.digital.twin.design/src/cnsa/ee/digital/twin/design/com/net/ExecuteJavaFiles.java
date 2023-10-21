package cnsa.ee.digital.twin.design.com.net;

public class ExecuteJavaFiles {
    public static void main(String[] args) {
        // 先执行Client.java
        System.out.println("Executing Client.java");
        CommServer.main(new String[0]);

        // 然后执行Server.java
        System.out.println("Executing Server.java");
        CommClient.main(new String[0]);
    }
}