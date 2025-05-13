
package advance.collection.list;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();

        // Add elements to the linkedList

        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);
        
        
        linkedList.addFirst(10); // Add element at the beginning of the linkedList
        linkedList.addLast(50); // Add element at the end of the linkedList
        System.out.println(linkedList);

        System.out.println(linkedList.getFirst()); // Access first element of the linkedList
        System.out.println(linkedList.getLast()); // Access last element of the linkedList

        linkedList.removeFirst(); // Remove first element of the linkedList
        linkedList.removeLast(); // Remove last element of the linkedList

        System.out.println(linkedList.peek()); // retrieve first element of the without removing
        System.out.println(linkedList.peekFirst()); // retrieve first element of the without removing
        System.out.println(linkedList.peekLast()); // retrieve last element of the without removing





    }
}
