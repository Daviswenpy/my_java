public class LamdaDemo {
    public static void main(String[] args) {
        invokeCook(() -> {
            System.out.println("吃饭了");
        });
    }
    private static void invokeCook(Cook cook){
        cook.makeFood();
    }
}
