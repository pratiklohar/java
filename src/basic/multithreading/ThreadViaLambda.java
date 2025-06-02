package basic.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadViaLambda {
    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName());

        // 1st way
        Runnable task = () -> System.out.println(Thread.currentThread().getName());
        Thread thread = new Thread(task);
        thread.start();

        // 2nd way
        Thread thread2 = new Thread(() -> System.out.println(Thread.currentThread().getName()));
        thread2.start();

        // 3rd way
        new Thread(() -> System.out.println(Thread.currentThread().getName())).start();

        // 4th way
        var executorService = Executors.newSingleThreadExecutor();
        executorService.submit(() -> System.out.println(Thread.currentThread().getName()));
        executorService.shutdown();

        // 5th way
        Thread.startVirtualThread(() -> System.out.println(Thread.currentThread().getName()));

    }
}
