import java.util.Scanner;

public class demo_exec01 {
    public static void main(String[] args) {
        for (int i =1;i <= 3;i++){
            System.out.print("请输入班级：");
            String class_name = new Scanner(System.in).next();
            int sum = 0;
            int avg = 0;
            for (int j = 1; j <= 4; j++){
                System.out.print("请输入同学成绩：");
                int score = new Scanner(System.in).nextInt();
                sum += score;
            }
            avg = sum /4;
            System.out.println(class_name+"班平均成绩："+avg);

        }
    }
}
