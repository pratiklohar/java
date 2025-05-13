package advance.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println(list.get(2)); // Access element at index 0.

        list.remove(1); // Removes element at index 1.
        System.out.println(list);

        list.set(1, 100);   // Replaces element at index 1 with 100.
        System.out.println(list);

        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(200);
        arrayList2.add(300);



        list.addAll(arrayList2); // Adds all elements of list2 to list.
        System.out.println(list);

        System.out.println(list.contains(100)); // Checks if list contains 100.

        list.clear();   // Removes all elements from list.

        System.out.println(list);

        System.out.println(list.isEmpty()); // Check if the stack is empty

        list.forEach(System.out::print); // Accessing elements of list using forEach method.

        for (int i = 0; i < list.size(); i++) { // Access elements of list using for loop
            System.out.print(list.get(i));
        }

        for (Integer integer: list){    // Access elements of list using for-each loop
            System.out.print(integer);
        }

        Iterator<Integer> it = list.iterator(); // Access elements of list using iterator
        while (it.hasNext()) {
            System.out.print(it.next());
        }
    }
}
