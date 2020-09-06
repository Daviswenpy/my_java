import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTcp {
    public static void main(String[] args) throws IOException {
        System.out.println("Server starts, waiting for connecting...");
        // 1.create serverSocket obj,bind port,begin to wait
        ServerSocket ss = new ServerSocket(6666);
        // 2.accept connecting,return socket obj
        Socket server = ss.accept();
        // 3.get inputstream by socket
        InputStream is = server.getInputStream();
        // 4. read data by one time
        // 4.1 create byteArray
        byte[] b = new byte[1024];
        // 4.2 put the data which read into array
        int len = is.read();
        // 4.3 parse array,print str info
        String msg = new String(b,0,len);
        System.out.println(msg);
        // 5. close resource
        is.close();
        server.close();
    }
}
