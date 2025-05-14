package advance.collection.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>(); // Creates a resizable array.

        arrayList.add(20); // Adds element at end of the list. (default)
        arrayList.add(30);
        arrayList.add(30);
        System.out.println(arrayList); // Prints the list

        arrayList.addFirst(10); // Adds element at beginning of the list
        System.out.println(arrayList);

        arrayList.addLast(50); // Adds  at end of the  list
        System.out.println(arrayList);

        arrayList.add(3, 40); // Adds element at the middle of the  list
        System.out.println(arrayList);

        arrayList.removeFirst(); // Removes first element in the list
        System.out.println(arrayList);

        arrayList.removeLast(); // Removes last element in the list
        System.out.println(arrayList);

        arrayList.remove(2); // Removes element at the middle of the list
        System.out.println(arrayList);


        System.out.println(arrayList.size()); // Returns the size of the  list

        System.out.println(arrayList.contains(20)); // Returns true if the element exists in the list. (Search)

        System.out.println(arrayList.get(1)); // Returns the element at the given index

        ArrayList <Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(100);
        arrayList2.add(200);
        
        arrayList.addAll(arrayList2); // Adds all elements of arrayList2 to arrayList.
        System.out.println(arrayList);


        arrayList.forEach(System.out::print); // Access elements of arrayList using forEach method.

        for (int i = 0; i < arrayList.size(); i++) { // Access elements of arrayList using for loop
            System.out.print(arrayList.get(i));
        }

        for (Integer integer: arrayList){ // Access elements of arrayList using for-each/enhanced for loop
            System.out.print(integer);
        }

        Iterator<Integer> it = arrayList.iterator(); // Access elements of arrayList using iterator
        while (it.hasNext()) {
            System.out.print(it.next());
        }

        arrayList.clear(); // Removes all elements from arrayList.
    }
}
