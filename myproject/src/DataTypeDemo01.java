public class DataTypeDemo01 {
    public static void main(String[] args) {
        // 定义 int类型变量i1 和 long类型变量l1
        int i1 = 100;
        long l1 = 200;
        // 定义变量add,保存i1和l1的和,并输出.
        long add = i1 + l1;
        System.out.println("add 的值:"+add);
        // 定义 long类型变量l2 和 float类型变量f2
        long l2 = 1000000;
        float f2 = 0.45F;
        // 定义变量add2,保存l1和f1的和,并输出.
        float add2 = l2 + f2;
        System.out.println("add2的值:"+add2);
        // 定义 int类型变量i3 和 double类型变量d3
        int i3 = 1000000;
        double d3 = 0.45;
        // 定义变量add3,保存i2和d1的和,并输出.
        double add3 = i3 + d3;
        System.out.println("add3的值:"+add3);
        //定义 float类型变量f2 和 double类型变量d2
        float f4 = 1000000.789F;
        double d4 = 0.45;
        //定义变量add4,保存f2和d2的和,并输出
        double add4 = f4 + d4;
        System.out.println("add4的值:"+add4);
    }
}
