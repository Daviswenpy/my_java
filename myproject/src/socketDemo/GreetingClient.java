/* socket实现-客户端 */
// package socketDemo;
import java.net.*;
import java.io.*;

public class GreetingClient {
    public static void main(String[] args) {
        String serverName = args[0];
        int port = Integer.parseInt(args[1]);
        try
        {
            System.out.println("连接主机: "+ serverName+", 端口号: "+port);
            Socket client = new Socket(serverName,port);
            OutputStream outToServer = client.getOutputStream();
            DataOutputStream out = new DataOutputStream(outToServer);

            out.writeUTF("hello from"+client.getLocalSocketAddress());
            InputStream inFromServer = client.getInputStream();
            DataInputStream in = new DataInputStream(inFromServer);
            System.out.println("服务器响应: "+in.readUTF());
        } catch (IOException e)
        {
            e.printStackTrace();
        }

    }
}
