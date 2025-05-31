package basic.multithreading;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureDemo {
    public static void main(String[] args) {

        // 1st way
        CompletableFuture.supplyAsync(() -> {
                                    try {
                                        Thread.sleep(1000);
                                        return Thread.currentThread().getName();
                                    } catch (InterruptedException e) {
                                        throw new RuntimeException(e);
                                    }})
                        .thenAccept(System.out::println);

        // 2nd way
        CompletableFuture<Void> cf2 = CompletableFuture.runAsync(() -> {
                                                            System.out.println(Thread.currentThread().getName());
                                                        });


        System.out.println(Thread.currentThread().getName());

    }
}
