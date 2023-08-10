import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LearnMap {
    public static void main(String[] args) {
        Map< String,Integer> map = new TreeMap<>();
        map.put("One",1);
        map.put("Two",2);
        map.put("Three",3);
        // if(!map.containsKey("Two")){
        //     map.put("Two",23);
        // }
        // map.putIfAbsent("Two", 21);
        // System.out.println(map);
        for(Map.Entry<String,Integer>e:map.entrySet()){
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        for(Integer value : map.values()){
            System.out.println(value);
        }
        System.out.println(map.containsValue(3));
        // HashMap<String, Integer> hashMap = new HashMap<>();
        // hashMap.put("John", 25);
        // hashMap.put("Jane", 30);
        // hashMap.put("Alice", 35);

        // for (String key : hashMap.keySet()) {
        //     System.out.println(key + " => " + hashMap.get(key));
        // }

    }
}
