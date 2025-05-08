package advance.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("One", 1); // Adding elements to the map
        map.put("Two", 2);
        map.put("Three", 3);
        map.put("Four", 4);
        map.put("Five", 5);
        map.put("Three", 5); // Duplicate key, will overwrite the value.

        System.out.println(map);

        map.remove("Three");    // removing element from map

        System.out.println(map);

        System.out.println(map.containsKey("Two")); // Check if the map contains a key

        System.out.println(map.containsValue(3)); // Check if the map contains a value

        System.out.println(map.isEmpty()); // Check if the map is empty

        System.out.println(map.size()); // Get the size of the map

        map.putIfAbsent("Three", 3); // Add a key-value pair if the key is not already present

        System.out.println(map);

        map.forEach((key, value) -> System.out.println(key + " " + value));   // Access elements of map using forEach method

        for (Entry<String, Integer> entry : map.entrySet()) {    // Access elements of map using for-each loop
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        for (String key : map.keySet()) {   // Access keys of map using for-each loop
            System.out.println(key);
        }

        for (Integer val : map.values()) {  // Access values of map using for-each loop
            System.out.println(val);
        }

        Iterator<Entry<String, Integer>> iterator = map.entrySet().iterator();   // Access elements of map using iterator

        while (iterator.hasNext()) {
            Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        map.clear(); // Clear the map

        System.out.println(map);
    }
}