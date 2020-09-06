import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutStreamDemo {
    public static void main(String[] args) throws IOException {
        // create obj
        FileOutputStream fos = new FileOutputStream("fos.txt");
        // 字符串转化为字节数组
        byte[] b = "野生程序员".getBytes();
        fos.write(b);
//        fos.write(98);
//        fos.write(99);
        fos.close();
    }
}
