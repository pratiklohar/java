package advance.collection.queue;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 ArrayDeque (short for Array Double Ended Queue) is a resizable array implementation of the Deque interface in Java.
 It allows you to add or remove elements from both ends (head and tail) of the queue efficiently.
 */

public class ArrayDequeDemo {
    public static void main(String[] args) {

        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        arrayDeque.add(10); // Adds element from rear of the queue (default behaviour)
        arrayDeque.add(20);
        arrayDeque.add(30);
        System.out.println(arrayDeque);

        arrayDeque.addFirst(40); // Adds element from front of the queue
        System.out.println(arrayDeque);

        arrayDeque.addLast(50); // Adds element to the queue from rear
        System.out.println(arrayDeque);

        arrayDeque.remove(); // Removes element from the front of the queue (default behaviour)
        System.out.println(arrayDeque);

        arrayDeque.removeFirst(); // Removes element from the front of the queue
        System.out.println(arrayDeque);

        arrayDeque.removeLast(); // Removes element from the rear of the queue
        System.out.println(arrayDeque);


    }
}
