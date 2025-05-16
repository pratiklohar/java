package basic.multithreading;

public class SleepJoinDemo {

    public static void main(String[] args) throws InterruptedException {

        // Creating thread using lambda.
        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                Thread.sleep(4000);
                System.out.println(Thread.currentThread().getName());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread t3 = new Thread(() -> {
            try {
                Thread.sleep(6000);
                System.out.println(Thread.currentThread().getName());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        // Threads begin execution asynchronously.
        t1.start();
        t2.start();
        t3.start();

        // Main thread waits for thread t1 and t2 to complete.
        t1.join();
        t2.join();

        System.out.println(Thread.currentThread().getName());

    }
}
