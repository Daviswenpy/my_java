/* 迭代的几种用法*/

import java.util.*;
// 迭代实现
public class IterDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("world");
        list.add("hahaha");

        // 1. for-each遍历
        for (String str:list){
            System.out.println(str);
        }

        // 2.for init;conditons;increment
        String[] strArray = new String[list.size()];
        list.toArray(strArray);
        for(int i=0;i<strArray.length;i++){
            System.out.println(strArray[i]);
        }

        // 3.使用迭代器 iterator
        Iterator<String> ite = list.iterator();
        while (ite.hasNext()){
            System.out.println(ite.next());
        }

    }
}
