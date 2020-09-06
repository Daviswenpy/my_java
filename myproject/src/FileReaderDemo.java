import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo  {
    public static void main(String[] args)throws IOException {
        FileReader fr = new FileReader("fos.txt");

        int len ;
        char[] cbuf = new char[1];

        // loop read
        while ((len= fr.read(cbuf)) != -1){
            System.out.println(new String(cbuf,0,len));
        }
        fr.close();
    }
}
