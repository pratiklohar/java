package advance.collection.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * The PriorityQueue in the Java Collections Framework is a queue-based data structure that stores elements according to their natural ordering (ascending order) or by a custom comparator provided at the time of creation.
 */
public class PriorityQueueDemo {
    public static void main(String[] args) {

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();   // Builds a priority queue as min heap. (default behavior)

        priorityQueue.add(20);
        priorityQueue.add(30);
        priorityQueue.add(50);
        priorityQueue.add(10);
        priorityQueue.add(40);

        System.out.println(priorityQueue);

        PriorityQueue<Integer> priorityQueueMax = new PriorityQueue<>(Comparator.reverseOrder()); // Builds priority queue as max heap.


    }
}
