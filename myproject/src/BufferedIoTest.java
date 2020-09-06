import java.io.*;
import java.util.HashMap;

public class BufferedIoTest {
    public static void main(String[] args) throws IOException {
        // create map for save text-data,key is order,value is word
        HashMap<String,String> lineMap = new HashMap<>();

        // create stream obj
        BufferedReader br = new BufferedReader(new FileReader("/home/davis/myproject/my_java/myproject/src/in.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("out.txt"));

        // read data
        String line;
        // loop
        while ((line = br.readLine())!=null){
            // parse txt
            String[] split = line.split("\\.");
            // save to set
            lineMap.put(split[0],split[1]);
            // release resource/home/davis/myproject/my_java/myproject/src
        br.close();

        // loop map
        for (int i=1;i<=lineMap.size();i++){
            String key = String.valueOf(i);
            // get txt of map
            String value = lineMap.get(key);

            // write attach txt
            bw.newLine();
        }
        // release resource
        bw.close();
        }
    }
}
