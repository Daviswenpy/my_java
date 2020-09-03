//package MethodDemo;
// a++,++a的区别
public class iPlusPlusDemo {
    public static void main(String[] args) {
        int counter = 0;
        int a,b;
        System.out.println("当次counter："+counter);
        a = counter++; // 先赋值，再自增
        System.out.println("a: "+a);
        System.out.println("counter++后: "+counter);
        b = ++counter; // 先自增，后赋值
        System.out.println("b: "+b);
        System.out.println("++counter后: "+counter);

    }
}
