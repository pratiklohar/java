package advance.collection.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>(); // TreeMap is a sorted map based on key.

        map.put("One", 1); // Adding elements to the map
        map.put("Two", 2);
        map.put("Three", 3);
        map.put("Four", 4);
        map.put("Five", 5);

        System.out.println(map);
    }
}
