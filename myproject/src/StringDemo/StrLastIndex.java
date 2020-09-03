// package StringDemo;

public class StrLastIndex {
    public static void main(String[] args) {
        String strOri = "hello world,hello runnoob";
        int lastIndex = strOri.lastIndexOf("runnoob");

        if (lastIndex == -1){
            System.out.println("没有找到对应字符串");
        }else {
            System.out.println("字符串出现位置: "+lastIndex);
        }
    }
}
