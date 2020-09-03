// 打印菱形
public class PrintLintDemo {
    public static void main(String[] args) {
        printLint(2);
    }
    // 打印函数
    public static void printLint(int size){
        // 计算菱形大小
        if (size % 2 ==0)
            size++;

        // 打印上半部分,同行内先空白再*号
        for (int i=0;i < size/2+1;i++)
        {
            // 打印空白
            for (int j=size/2+1; j>i; j--){
            System.out.print(" ");
        }
            // 打印*
            for (int j=0;j <2*i+1;j++){
                System.out.print("*");
            }
            // 换行
            System.out.println();
        }

        // 打印下半部分
        for (int i = size/2+1; i< size; i++){
            // 空白部分
             for (int j = 0; j < i-size/2+1 ;j++){
                 System.out.print(" ");;
             }
            // *部分
            for (int j = 0;j < 2*size -1-2*i; j++)
                System.out.print("*");
            // 换行
            System.out.println();
        }
    }
}
