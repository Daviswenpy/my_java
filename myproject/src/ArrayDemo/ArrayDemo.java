// 数组的使用

import java.lang.reflect.Array;
import java.util.*;

public class ArrayDemo {
    public static void main(String[] args) throws Exception {
        // 排序及元素查找
        int array[] = {2,5,-8,-9,0,4,-7,5,1};
        Arrays.sort(array);
        printArray("数组排序结果是: ",array);
        int index = Arrays.binarySearch(array,2);
        System.out.println("元素2的位置: " + index);

        // 数组反转
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("E");
        arrayList.add("F");
        System.out.println("反转前排序: " + arrayList);
        Collections.reverse(arrayList);
        System.out.println("反转后排序: " + arrayList);

        // 获取最值
        Integer[] numbers = { 8, 2, 7, 1, 4, 9, 5};
        int min = (int) Collections.min(Arrays.asList(numbers));
        int max = (int) Collections.max(Arrays.asList(numbers));
        System.out.println("最小值: " + min);
        System.out.println("最大值: " + max);

        //数组合并
        String a[] = { "A", "E", "I" };
        String b[] = { "O", "U" };
        List list = new ArrayList(Arrays.asList(a));
        list.addAll(Arrays.asList(b));
        Object[] c = list.toArray();
        System.out.println(Arrays.toString(c));

        //数组填充  也可以用来改变某位置的值
        int array1[] = new int[6];
        Arrays.fill(array1, 100);
        for (int i=0, n=array1.length; i < n; i++) {
            System.out.println(array1[i]);
        }
        System.out.println();
        Arrays.fill(array1, 5, 6, 50);
        for (int i=0, n=array1.length; i< n; i++) {
            System.out.println(array1[i]);
        }

        // 数组扩容  先声明，扩的部分加元素，再用arraycopy
        String[] names = new String[] { "A", "B", "C" };
        String[] extended = new String[5];
        extended[3] = "D";
        extended[4] = "E";
        System.arraycopy(names, 0, extended, 0, names.length);
        for (String str : extended){
            System.out.println(str);
        }

        // 重复元素

        int[] my_array = {1, 5, 5, 2, 6, 6, 7, 2, 9, 2};
        findDupicateInArray(my_array);

        // 数组删除元素
        /*
         * 思路，
         * 1.由于数组长度固定，可以声明数量减少的数组，同时声明那个元素删除的位置position
         * 2.遍历旧赋给新，同时避开删除元素，
         * 3.最后新数组赋值给旧数组
         */
        int[] oldarray = new int[] {3, 4, 5, 6, 7};// 原始数组
        int num = 2;   // 删除索引为 2 的元素，即删除第三个元素 5
        int[] newArray = new int[oldarray.length-1];// 新数组，长度为原始数组减去 1

        for(int i=0;i<newArray.length; i++) {
            // 判断元素是否越界
            if (num < 0 || num >= oldarray.length) {
                throw new RuntimeException("元素越界... ");
            }
            //
            if(i<num) {
                newArray[i] = oldarray[i];
            }
            else {
                newArray[i] = oldarray[i+1];
            }
        }
        // 打印输出数组内容
        System.out.println(Arrays.toString(oldarray));
        oldarray = newArray;
        System.out.println(Arrays.toString(oldarray));

        // 数组的交并差集，其中并集用到set

        // 查找特定元素 .contains(ele/arraylist)

        // 判断数组是否相等 Arrays.equals(obj1,obj2)
    }

    public static void printArray(String message,int array[]) {
        System.out.println(message+"[length: "+array.length+"]");
        for (int i=0;i < array.length;i++){
            if (i != 0){
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
        System.out.println();
    }

    // 重复元素
    public static void findDupicateInArray(int[] a) {
        int count=0;
        for(int j=0;j<a.length;j++) {
            for(int k =j+1;k<a.length;k++) {
                if(a[j]==a[k]) {
                    count++;
                }
            }
            if(count==1)
                System.out.println( "重复元素 : " +  a[j] );
            count = 0;
        }
    }


}
