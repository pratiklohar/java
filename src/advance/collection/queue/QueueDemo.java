package advance.collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {

        // head = front = first = start
        // tail = rear = last = end

        Queue<Integer> queue = new LinkedList<>();

        queue.add(10); // Add element from rear, default behaviour (Enqueue)
        queue.add(20);
        queue.add(30);
        System.out.println(queue);

        System.out.println(queue.element());

        System.out.println(queue.peek()); // Returns front element without removing it

        queue.remove(); // Removes element from the front, default behaviour (Dequeue)
        System.out.println(queue);


    }
}
