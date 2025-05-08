package advance.collection.utitlity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(30);
        list.add(20);
        list.add(40);
        list.add(50);

        Collections.sort(list); // Sort the list in ascending order

        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder()); // Sort the list in descending order;

        System.out.println(list);

        System.out.println(Collections.binarySearch(list, 30)); // Search for an element in the list

        System.out.println(Collections.max(list)); // Get the maximum element in the list

        System.out.println(Collections.min(list)); // Get the minimum element in the list

        Collections.reverse(list); // Reverse the order of the list

        System.out.println(list);

        Collections.shuffle(list); // Shuffle the elements in the list

        System.out.println(list);

        List<Integer> list2 = new ArrayList<>();
        list2.add(60);
        list2.add(70);

        Collections.copy(list, list2); // Copy elements from one list to another

        System.out.println(list);

        Collections.fill(list, 100); // Fill the list with a specific value

        System.out.println(list);

        Collections.swap(list, 0, 1); // Swap two elements in the list

        System.out.println(list);


    }
}
