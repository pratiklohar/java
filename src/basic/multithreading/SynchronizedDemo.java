package basic.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;

/**
 * This class demonstrates the use of the synchronized keyword.
 * The {@code synchronized } keyword in Java is used to prevent concurrent access to critical sections of code by multiple threads. It ensures that only one thread can execute a block of code or method at a time, providing thread safety.
 */
public class SynchronizedDemo {

    private int counter = 0;

    public synchronized void increment() {
        counter++;
    }
    public static void main(String[] args) throws InterruptedException {

        SynchronizedDemo synchronizedDemo = new SynchronizedDemo();

        var executorService = Executors.newFixedThreadPool(10);

        List<Callable<Void>> tasks = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            tasks.add(() -> {
                for (int j = 0; j < 1000; j++) {
                    synchronizedDemo.increment();
                }
                return null;
            });
        }

        // invokeAll() blocks main thread until all tasks complete.
        executorService.invokeAll(tasks);

        executorService.shutdown();

        System.out.println(synchronizedDemo.counter);
    }
}
