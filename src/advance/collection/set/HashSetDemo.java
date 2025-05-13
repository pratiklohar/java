package advance.collection.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        set.add(10); // Add elements to the set
        set.add(20);
        set.add(30);
        set.add(50);
        set.add(20); // Duplicate element, will not be added.


        System.out.println(set);

        set.remove(50); // Remove element from the set

        System.out.println(set);

        System.out.println(set.contains(30)); // Check if the set contains an element

        System.out.println(set.isEmpty()); // Check if the set is empty

        System.out.println(set.size()); // Get the size of the set

        set.clear(); // Clear the set

        System.out.println(set);




    }
}
