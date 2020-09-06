import java.io.File;

public class RecursionFile {
    public static void main(String[] args) {
        // create File obj
        File dir = new File("/home/davis/myproject/my_java");
        printDir(dir);
    }

    // printDir
    public static void printDir(File dir){
        // get sub files and dirs
        File[] files = dir.listFiles();

        // loop print
        for (File file:files){
            if (file.isFile()){
                if (file.getName().endsWith(".java")){
                    System.out.println("File name: "+ file.getAbsolutePath());
                }else {
                    // dir, continue loop,recursion
                    printDir(file);
                }
            }
        }
    }
}
