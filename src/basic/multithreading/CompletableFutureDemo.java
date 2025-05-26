package basic.multithreading;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureDemo {

    public static void main(String[] args) throws InterruptedException {

        CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return Thread.currentThread().getName();

        }).thenAccept(System.out::println);

        System.out.println(Thread.currentThread().getName());

    }
}
