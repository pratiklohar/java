package basic.multithreading;
/**
 * This class demonstrates the use of {@code sleep()} and {@code join()} functions of Thread class.
 */
public class SleepJoinDemo {

    public static void main(String[] args) throws InterruptedException {

        // Creating thread using lambda.
        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        // Starts thread asynchronously.
        t1.start();
        t2.start();

        // Main thread waits for t1 to finish.
        t1.join();

        System.out.println(Thread.currentThread().getName());

    }
}
