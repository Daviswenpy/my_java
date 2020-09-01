import java.io.*;
public class Employee {
    // 实例变量，子类可见
    public String name;
    // 私有变量 该类可见
    private double salary;
    // salary 静态的私有变量
    private static double salary01;
    // DEPARTMENT 常量
    public static final String DEPARTMENT = "开发人员";
    // 构造器中对name赋值
    public Employee (String empName){
        name = empName;
    }
    // 设定salary的值
    public void setSalary(double empSal){
        salary =empSal;
    }
    // 打印信息
    public void printEmp(){
        System.out.println("名字: "+ name);
        System.out.println("薪水: "+ salary);
    }
    public static void main(String[] args){
        Employee empOne = new Employee("Davis");
        empOne.setSalary(10000);
        empOne.printEmp();
        salary01 = 20000;
        System.out.println(DEPARTMENT+"平均工资"+salary01);
    }
}
