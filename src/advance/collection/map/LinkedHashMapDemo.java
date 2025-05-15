package advance.collection.map;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> linkedHashMap = new LinkedHashMap<>(); // LinkedHashMap preserves insertion order of elements.

        linkedHashMap.put("One", 1); // Adding elements to the map
        linkedHashMap.put("Two", 2);
        linkedHashMap.put("Three", 3);
        linkedHashMap.put("Four", 4);
        linkedHashMap.put("Five", 5);

        System.out.println(linkedHashMap);
    }
}
