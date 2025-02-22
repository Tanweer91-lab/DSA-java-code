package HashMap;
import java.util.HashMap;
public class DemoHashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        //insertion
        map.put("a",23);
        map.put("b",90);
        map.put("c",100);
        //Searching
        System.out.println(map.containsKey("a"));
        System.out.println(map.containsKey("d"));
        //size
        System.out.println(map.size());
        //remove
        map.remove("a");
        //System.out.println(map.size());
        //traversing
        for(String key: map.keySet()){
            System.out.println(key+" "+map.get(key));
        }
        System.out.println(map);
        System.out.println(map.get("b"));
        System.out.println(map.get("c"));
        System.out.println(map.containsValue(100));
        System.out.println(map.containsValue(1000));
    }
}
