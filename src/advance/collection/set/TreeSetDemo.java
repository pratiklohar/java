package advance.collection.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {

        Set<Integer> set = new TreeSet<>(); // TreeSet is a sorted set.

        set.add(10); // Add elements to the set
        set.add(30);
        set.add(20);
        set.add(40);
        set.add(50);

        System.out.println(set);


    }
}
