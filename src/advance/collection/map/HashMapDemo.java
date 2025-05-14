package advance.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("Ten", 10); // Adds elements to the map
        map.put("Twenty", 20);
        map.put("Thirty", 30);
        map.put("Forty", 40);
        map.put("Fifty", 50);
        map.put("Fifty", 60); // Duplicate key, will overwrite the value

        System.out.println(map);

        map.remove("Three"); // Removes element from map

        System.out.println(map);

        System.out.println(map.containsKey("Two")); // Check if the map contains a key

        System.out.println(map.containsValue(3)); // Check if the map contains a value

        System.out.println(map.isEmpty()); // Check if the map is empty

        System.out.println(map.size()); // Get the size of the map

        map.putIfAbsent("Three", 3); // Adds a key-value pair if the key is not already present

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

        map.clear(); // Clears the map

    }
}