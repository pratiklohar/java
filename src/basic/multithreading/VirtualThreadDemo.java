package basic.multithreading;

import java.util.concurrent.*;

public class VirtualThreadDemo {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        // 1st way : via executor service.
        ExecutorService executorService = Executors.newVirtualThreadPerTaskExecutor();

        executorService.submit(() -> {
            try {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        // 2nd way : via thread class.
        Thread.startVirtualThread(() -> {
            try {
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread.sleep(3000);
        System.out.println(Thread.currentThread().getName());
    }
}
