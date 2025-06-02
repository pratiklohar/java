package basic.multithreading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        var executorService = Executors.newCachedThreadPool();

        Future<Object> future = executorService.submit(() -> {
            Thread.sleep(1000);
            return Thread.currentThread().getName();
        });


        // get() blocks the main thread, hence this approach is not suggested instead use CompletableFuture.
        System.out.println(future.get());

        executorService.shutdown();

        System.out.println(Thread.currentThread().getName());

    }

}
