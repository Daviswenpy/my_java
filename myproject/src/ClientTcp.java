import java.io.OutputStream;
import java.net.Socket;

public class ClientTcp {
    public static void main(String[] args) throws Exception{
        System.out.println("Client sending msg...");
        // 1.create socket(ip,port), ensure where to connect
        Socket client = new Socket("localhost",6666);
        // 2.get stream obj, output stream
        OutputStream os = client.getOutputStream();
        // 3. write data
        os.write("a u ok,tcp? i am coming".getBytes());
        // 4. close resource
        os.close();
        client.close();
    }
}

