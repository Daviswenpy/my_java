import java.util.HashMap;

public class MapDemo {
    public static void main(String[] args) {
        // create map
        HashMap<String,String> map = new HashMap<String, String>();

        // put ele
        map.put("HXM","AB");
        map.put("WZ","MYL");
        map.put("DC","SL");
        System.out.println(map);

        // remove
        map.remove("DC");
        System.out.println(map);

        // get
        System.out.println(map.get("WZ"));
    }
}
