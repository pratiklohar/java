package basic.multithreading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newCachedThreadPool();

        executorService.submit(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName());
        });

        // Submitting callable
        Future<Object> future = executorService.submit(() -> {
            Thread.sleep(4000);
            return Thread.currentThread().getName();
        });


        // Blocks the main thread, hence this approach is not suggested instead use CompletableFuture.
        System.out.println(future.get());

        executorService.shutdown();

        System.out.println(Thread.currentThread().getName());

    }

}
