// 使用接口Animal
public class demo_interface_Animal_MannalInt implements demo_interface_Animal {
    public void eat(){
        System.out.println("Mammal eats");
    }
    public void travel(){
        System.out.println("Mamal travel");
    }

    public static void main(String[] args) {
        demo_interface_Animal_MannalInt m = new demo_interface_Animal_MannalInt();
        m.eat();
        m.travel();
    }
}
