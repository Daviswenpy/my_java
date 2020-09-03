// 平行四边形
public class PrintParalleDemo {
    public static void main(String[] args) {
        for (int i=0; i < 5;i++){
            // print blank
            for (int j=1 ; j<=5-i;j++){
                System.out.print(" ");
            }
            // print *
            for (int j=1; j<=5; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
