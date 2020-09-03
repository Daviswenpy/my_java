// 文件写入

//import java.io.BufferedWriter;
import java.io.*;

/**
 * @author davis
 */
public class FileWriteInDemo {
    public static void main(String[] args) {
        // write
        /* try{
            BufferedWriter out = new BufferedWriter(new FileWriter("mynote.txt"));
            out.write("i will try my best!");
            out.close();
            System.out.println("文件创建成功！");
        }catch (IOException e){

        } */
        // read  读文件要绝对路径
        try{
            BufferedReader in = new BufferedReader(new FileReader("/home/davis/myproject/my_java/myproject/src/demo.txt"));
            String str;
            while ((str = in.readLine()) != null){
                System.out.println(str);
            }
            System.out.println(str);
        }catch (IOException e){
            System.out.println("error");
        }
    }
}
