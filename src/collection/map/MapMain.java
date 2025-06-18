package collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain {
    public static void main(String[] args) {
        Map<String, String> myMap = new HashMap<>();

        myMap.put("name", "Ram");
        myMap.put("college", "TCS");


        myMap.put("name", "Shyam");

        System.out.println(myMap);

        System.out.println(myMap.get("college"));

        Set<Map.Entry<String, String>> entries = myMap.entrySet();

        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        Set<String> keys = myMap.keySet();
        for (String key:keys){
            System.out.println(key + ":" + myMap.get(key));
        }

    }
}
