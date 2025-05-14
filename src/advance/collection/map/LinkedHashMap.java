package advance.collection.map;

public class LinkedHashMap {
    public static void main(String[] args) {
        java.util.LinkedHashMap<String, Integer> linkedHashMap = new java.util.LinkedHashMap<>(); // LinkedHashMap preserves insertion order of elements.

        linkedHashMap.put("One", 1); // Adding elements to the map
        linkedHashMap.put("Two", 2);
        linkedHashMap.put("Three", 3);
        linkedHashMap.put("Four", 4);
        linkedHashMap.put("Five", 5);

        System.out.println(linkedHashMap);
    }
}
