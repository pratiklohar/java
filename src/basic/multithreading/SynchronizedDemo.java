package basic.multithreading;

/**
 * This class demonstrates the use of the synchronized keyword.
 * The {@code synchronized } keyword in Java is used to prevent concurrent access to critical sections of code by multiple threads. It ensures that only one thread can execute a block of code or method at a time, providing thread safety.
 */
public class SynchronizedDemo {

    private static int counter = 0;

    private static synchronized void increment() {
        counter++;
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5000; i++) {
                increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5000; i++) {
                increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(counter); // always 10000
    }
}
