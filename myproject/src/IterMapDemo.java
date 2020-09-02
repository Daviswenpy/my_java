/* 遍历map*/
import java.util.*;

public class IterMapDemo {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String, String>();
        map.put("1","value1");
        map.put("2","value2");
        map.put("3","value3");

        // 1.普遍使用，二次取值
        System.out.println("1.通过Map.keySet遍历：");
        for (String key: map.keySet()){
            System.out.println("key= "+key+" and value= "+map.get(key));
        }

        //2.iterator
        System.out.println("2.通过map.entrySet使用iterator遍历： ");
        Iterator<Map.Entry<String,String>> it = map.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry<String,String>  entry = it.next();
            System.out.println("key= "+ entry.getKey() +" and value= "+entry.getValue());
        }

        // 3.容量大时推荐
        System.out.println("3.通过Map.entrySet遍历k,v: ");
        for (Map.Entry<String,String> entry : map.entrySet()){
            System.out.println("key= "+ entry.getKey() +" and value= "+entry.getValue());
        }

        // 4.与1类似
        System.out.println("4.通过Map.values()遍历value,但不能遍历key: ");
        for (String v : map.values()){
            System.out.println("value = " + v);
        }
    }
}
