// 打印三角形 将图形分解，分析循环次数
public class PrintTriangDemo {
    public static void main(String[] args) {
        printTriang(4);
        System.out.println("-------------------");
        printTriangRe(5);
    }

    // 打印图形
    public static void printTriang(int size) {
        for (int i = 1; i <= size; i++) {
            // print blank
            for (int j = size; j >= i; j--) {
                System.out.print(" ");
            }
            // print *
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            for (int j = 1; j < i; j++) {
                System.out.print("*");

            }
            // change line
            System.out.println();
        }
    }

    // 倒三角
    public static void printTriangRe(int size){
        for (int i=1;i <= size;i++){
            // print blank
            for (int j=0;j<i ;j++){
                System.out.print(" ");
            }
            // print *
            for (int j=1;j <= size-i+1;j++){
                System.out.print("*");
            }
            for (int j=1;j < size-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

