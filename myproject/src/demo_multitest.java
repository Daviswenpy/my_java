public class demo_multitest {
    public static void main(String[] args) {
        show(new Cat()); // Cat对象调用show方法
        show(new Dog()); // Dog对象调用show方法

        Animal a = new Cat();
        a.eat();
        Cat c = new Cat();
        c.work();
    }

    public static void show(Animal a) {
        a.eat();
        // 类型判断
        if (a instanceof Cat) { // 猫做的事情
            Cat c = (Cat)a;
            c.work();
        }else if (a instanceof Dog) { //狗做的事情
            Dog c = (Dog)a;
            c.work();
        }
    }
}
// 父类
abstract class Animal{
    abstract void eat();
}
// Cat类
class Cat extends Animal {
    public void eat(){
        System.out.println("吃鱼");
    }
    public void work(){
        System.out.println("抓老鼠");
    }
}
// Dog类
class  Dog extends Animal {
    public void eat() {
        System.out.println("吃骨头");
    }
    public void work() {
        System.out.println("看家");
    }
}
