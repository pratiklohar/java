package advance.collection.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();   // Building a priority queue as min heap.

        priorityQueue.offer(20); // Add elements to the priority queue
        priorityQueue.offer(30);
        priorityQueue.offer(50);
        priorityQueue.offer(10);
        priorityQueue.offer(40);

        System.out.println(priorityQueue);

        priorityQueue.poll(); // Remove element at the head/front of the priority queue.

        System.out.println(priorityQueue);

        priorityQueue.offer(25);

        System.out.println(priorityQueue);

        System.out.println(priorityQueue.peek()); // Get element at the front of the priority queue.

        System.out.println(priorityQueue.isEmpty()); // Check if the priority queue is empty

        System.out.println(priorityQueue.contains(20)); // Check if the priority queue contains an element

        System.out.println(priorityQueue.size()); // Get the size of the priority queue

        priorityQueue.clear(); // Clear the priority queue

        System.out.println(priorityQueue);

        PriorityQueue<Integer> priorityQueueMax = new PriorityQueue<>(Comparator.reverseOrder()); // Builds priority queue as max heap.


    }
}
