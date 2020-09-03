// package StringDemo;
import java.util.StringTokenizer;
public class StrCrud {
    // delete
    public void strDelete(){
        String str = "this is java";
        System.out.println(removeCharAt(str,3));
    }
    public  String removeCharAt(String s, int pos){
        return s.substring(0,pos) + s.substring(pos+1);
    }
    // search
    public void strSearch(){
        String strOri = "Google Runoob Taobao";
        int intIndex = strOri.indexOf("Runnoob");
        if (intIndex == -1){
            System.out.println("not found");
        }else {
            System.out.println("location is "+intIndex);
        }
    }

    // main()
    public static void main(String[] args) {
        StrCrud str = new StrCrud();
        str.strDelete();
        str.strSearch();

        // 字符串反转 reverse
        String string = "davis";
        String reverse = new StringBuffer(string).reverse().toString();
        System.out.println("反转后: "+reverse);

        // 分割 split
        String str1 = "www-runoob-com";
        // String res = str1.
        String[] temp;
        String delimeter = "-";  // 指定分割字符
        temp = str1.split(delimeter); // 分割字符串
        // 普通 for 循环
        for(int i =0; i < temp.length ; i++){
            System.out.println(temp[i]);
            // System.out.println("");
        }

        // StringTokenizer
        String str2 = "This is String , split by StringTokenizer, created by runoob";
        StringTokenizer st = new StringTokenizer(str2);

        System.out.println("----- 通过空格分隔 ------");
        while (st.hasMoreElements()) {
            System.out.println(st.nextElement());
        }

        System.out.println("----- 通过逗号分隔 ------");
        StringTokenizer st2 = new StringTokenizer(str2, ",");

        while (st2.hasMoreElements()) {
            System.out.println(st2.nextElement());
        }

        // 字符串性能测试 关键字创建比创建对象及intern快
        long startTime = System.currentTimeMillis();
        for(int i=0;i<50000;i++){
            String s1 = "hello";
            String s2 = "hello";
            // 优选关键字创建字符串
        }
        long endTime = System.currentTimeMillis();
        System.out.println("通过 String 关键词创建字符串"
                + " : "+ (endTime - startTime)
                + " 毫秒" );
        long startTime1 = System.currentTimeMillis();
        for(int i=0;i<50000;i++){
            String s3 = new String("hello");
            String s4 = new String("hello");
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("通过 String 对象创建字符串"
                + " : " + (endTime1 - startTime1)
                + " 毫秒");

        // 连接字符串性能，+性能比append好
        long startTime2 = System.currentTimeMillis();
        for(int i=0;i<50000;i++){
            String result = "This is"
                    + "testing the"
                    + "difference"+ "between"
                    + "String"+ "and"+ "StringBuffer";
        }
        long endTime2 = System.currentTimeMillis();
        System.out.println("字符串连接"
                + " - 使用 + 操作符 : "
                + (endTime2 - startTime2)+ " ms");
        /**********************/
        long startTime3 = System.currentTimeMillis();
        for(int i=0;i<50000;i++){
            StringBuffer result = new StringBuffer();
            result.append("This is");
            result.append("testing the");
            result.append("difference");
            result.append("between");
            result.append("String");
            result.append("and");
            result.append("StringBuffer");
        }
        long endTime3 = System.currentTimeMillis();
        System.out.println("字符串连接"
                + " - 使用 StringBuffer : "
                + (endTime3 - startTime3)+ " ms");

    }
}
