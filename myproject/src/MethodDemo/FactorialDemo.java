// package MethodDemo;
// 阶乘实现
public class FactorialDemo {
    public static void main(String[] args) {
        for (int counter = 0;counter <= 10;counter++){
            System.out.printf("%4d! = %d \n",counter,factorial(counter));

        }
    }
    // factorial
    public static long factorial(long number){
        if (number <= 1)
            return 1;
        else
            return number * factorial(number-1);
    }

}
