package basic.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo {

    private int counter = 0;
    private final Lock lock = new ReentrantLock();

    public void increment() {
        lock.lock(); // acquire lock
        try {
            counter++;
        } finally {
            lock.unlock(); // always release lock in finally block
        }
    }

//    public void increment() {
//        try {
//            // Try to acquire lock within 10 milliseconds
//            if (lock.tryLock(10, TimeUnit.MILLISECONDS)) {
//                try {
//                    counter++;
//                } finally {
//                    lock.unlock();
//                }
//            } else {
//                // Could not acquire lock – skip or retry (we skip here)
//                System.out.println(Thread.currentThread().getName() + " could not acquire lock");
//            }
//        } catch (InterruptedException e) {
//            Thread.currentThread().interrupt(); // handle interrupt properly
//        }
//    }

    public static void main(String[] args) throws InterruptedException {

        ReentrantLockDemo reentrantLockDemo = new ReentrantLockDemo();

        var executorService = Executors.newFixedThreadPool(10);

        List<Callable<Void>> tasks = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            tasks.add(() -> {
                for (int j = 0; j < 1000; j++) {
                   reentrantLockDemo.increment();
                }
                return null;
            });
        }

        // invokeAll() blocks main thread until all tasks complete.
        executorService.invokeAll(tasks);

        executorService.shutdown();

        System.out.println(reentrantLockDemo.counter);
    }
}
