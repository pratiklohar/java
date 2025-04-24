package collection;

import java.util.*;
import java.util.Map.*;

public class HashMaps {
    public static void main(String[] args) {

        Map map1 = new HashMap<>();                      // non-generic
        Map<Integer,String> map2 = new HashMap<>();      // generic

        HashMap<Integer,String> map = new HashMap<>();

        map.put(1,"Alice");       // adding element to map
        map.put(2,"Bob");
        map.put(3,"Cesar");


        map.remove(3);      // removing element from map

        map.forEach((key,value)-> System.out.println(key + " " + value)); // iterating map using forEach

        for (Entry entry : map.entrySet()) // iterating map using enhanced for loop
        {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        for (int key : map.keySet())  // iterating over keys
        {
            System.out.println(key);
        }

        for (String val : map.values()) // iterating over values
        {
            System.out.println(val);
        }

        Iterator itr = map.entrySet().iterator();   // using iterator
        while(itr.hasNext()){

            Entry entry=(Entry)itr.next();

            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println("Initial Mappings are: " + map);

        System.out.println("The Value is: " + map.get(5));

        System.out.println("The collection is: " + map.values());
    }
}