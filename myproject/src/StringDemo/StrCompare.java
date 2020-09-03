// package StringDemo;

public class StrCompare {
    public static void main(String[] args){
        String str = "Hello world";
        String anoStr = "hello world";
        Object objStr = str;

        System.out.println(str.compareTo(anoStr));
        System.out.println(str.compareToIgnoreCase(anoStr));
        System.out.println(str.compareTo(objStr.toString()));
    }
}
/*
-32
0
0 */