package basic.multithreading;
public class SynchronizedDemo {
    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        // Create threads to increase the count.
        Thread t1 = new Thread(counter::increaseCount);
        Thread t2 = new Thread(counter::increaseCount);

        // Start t1 and t2 threads asynchronously.
        t1.start();
        t2.start();

        // Main thread waits until the joined thread completes.
        t1.join();
        t2.join();


        System.out.println(counter.getCount());

    }
}
