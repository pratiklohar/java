package advance.collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {

        // head = front = first = start
        // tail = rear = last = end

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(10);    // Add elements to the queue
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);

        System.out.println(queue);

        queue.poll(); // Remove element at the front of the queue

        System.out.println(queue.peek()); // Get element at the front of the queue

        System.out.println(queue.isEmpty()); // Check if the queue is empty

        System.out.println(queue.contains(20)); // Check if the queue contains an element

        System.out.println(queue.size()); // Get the size of the queue

        queue.clear(); // Clear the queue

        System.out.println(queue);
    }
}
