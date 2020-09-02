public class eDemo {
    // 泛型
    public static < E > void printArray(E[] inputArray) {
        // 输出数组元素
        for (E element: inputArray){
            System.out.printf("%s, ",element);
        }
        System.out.println();
    }

    // main
    public static void main(String[] args) {
        // 创建3个不同类型数组
        Integer[] intArray = {1,2,3,4,5};
        Double[] doubleArray = {1.2,1.5,2.8};
        Character[] charArray = {'h','e','l','l','o'};

        System.out.println("整形数组: ");
        printArray(intArray);

        System.out.println("双精度数组: ");
        printArray(doubleArray);

        System.out.println("字符数组: ");
        printArray(charArray);


    }
}
