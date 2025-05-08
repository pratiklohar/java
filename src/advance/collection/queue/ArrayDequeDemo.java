package advance.collection.queue;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {

        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        arrayDeque.offer(10); // Add elements to the deque
        arrayDeque.offerFirst(20); // Add element at the front of the deque
        arrayDeque.offerLast(30); // Add element at the rear of the deque
        arrayDeque.offer(40);
        arrayDeque.offer(50);

        System.out.println(arrayDeque);

        arrayDeque.poll(); // Remove element at the front of the deque
        System.out.println(arrayDeque);

        arrayDeque.pollFirst(); // Remove element at the front of the deque
        System.out.println(arrayDeque);

        arrayDeque.pollLast(); // Remove element at the rear of the deque
        System.out.println(arrayDeque);


        System.out.println(arrayDeque.peek()); // Get element at the front of the deque
        System.out.println(arrayDeque.peekFirst()); // Get element at the front of the deque
        System.out.println(arrayDeque.peekLast()); // Get element at the rear of the deque

        System.out.println(arrayDeque.isEmpty()); // Check if the deque is empty

        System.out.println(arrayDeque.contains(20)); // Check if the deque contains an element

        System.out.println(arrayDeque.size()); // Get the size of the deque

        arrayDeque.clear(); // Clear the deque

        System.out.println(arrayDeque);

    }
}
