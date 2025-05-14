
package advance.collection.list;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>(); // Creates doubly linked list.

        linkedList.add(20); // Adds node at end of the list. (default)
        linkedList.add(30);
        linkedList.add(30);
        System.out.println(linkedList); // Prints the list

        linkedList.addFirst(10); // Adds node at beginning of the list
        System.out.println(linkedList);

        linkedList.addLast(50); // Adds node at end of the  list
        System.out.println(linkedList);

        linkedList.add(3, 40); // Adds node at the middle of the  list
        System.out.println(linkedList);

        linkedList.removeFirst(); // Removes first node in the list
        System.out.println(linkedList);

        linkedList.removeLast(); // Removes last node in the list
        System.out.println(linkedList);

        linkedList.remove(2); // Removes node at the middle of the list
        System.out.println(linkedList);


        System.out.println(linkedList.size()); // Returns the size of the  list

        System.out.println(linkedList.contains(20)); // Returns true if the node exists in the list. (Search)

        System.out.println(linkedList.get(1)); // Returns the node at the given index

    }
}
