package advance.collection.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {

        TreeSet<Integer> treeSet = new TreeSet<>(); // TreeSet is a sorted set.

        treeSet.add(10); // Add elements to the set
        treeSet.add(30);
        treeSet.add(20);
        treeSet.add(40);
        treeSet.add(50);




        System.out.println(treeSet);

        treeSet.getLast(); // Get the last element of the set


    }
}
