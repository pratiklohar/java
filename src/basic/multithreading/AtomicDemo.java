package basic.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicDemo {

    public static void main(String[] args) throws InterruptedException {

        AtomicInteger counter = new AtomicInteger(0);

        var executorService = Executors.newFixedThreadPool(10);

        List<Callable<Void>> tasks = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            tasks.add(() -> {
                for (int j = 0; j < 1000; j++) {
                    counter.getAndIncrement();
                }
                return null;
            });
        }

        // invokeAll() blocks main thread until all tasks complete.
        executorService.invokeAll(tasks);

        executorService.shutdown();

        System.out.println(counter);
    }
}

