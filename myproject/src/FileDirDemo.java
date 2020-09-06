import java.io.File;

public class FileDirDemo {
    public static void main(String[] args) {
        File dir = new File("/home/davis/myproject");

        // get this dir and filename
        String[] names = dir.list();
        for (String name:names){
            System.out.println(name);
        }
        System.out.println("-----**************------");

        // get file under the dir and dir obj
        File[] files = dir.listFiles();
        for (File file: files){
            System.out.println(file);
        }

    }
}
