package basic.multithreading;

public class SleepJoinDemo {

    // Main thread that creates and starts other threads.
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(5000);
                System.out.println("Thread 1 finished");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                Thread.sleep(3000);
                System.out.println("Thread 2 finished");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread t3 = new Thread(() -> {
            try {
                Thread.sleep(1000);
                System.out.println("Thread 3 finished");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Threads begin execution asynchronously
        t1.start();
        t2.start();
        t3.start();

        // The main thread will wait for Thread t1, t2, t3 to finish before proceeding.
        t1.join();
        t2.join();
        t3.join();

        System.out.println("All threads completed. Main thread ends.");
    }
}
