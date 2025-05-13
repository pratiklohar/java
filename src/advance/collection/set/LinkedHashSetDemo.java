package advance.collection.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

    public static void main(String[] args) {

        Set<Integer> set = new LinkedHashSet<>(); // LinkedHashSet maintains insertion order.

        set.add(10); // Add elements to the set
        set.add(30);
        set.add(20);
        set.add(40);
        set.add(50);



        System.out.println(set);

    }

}
