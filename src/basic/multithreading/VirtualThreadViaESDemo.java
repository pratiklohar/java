package basic.multithreading;

import java.util.concurrent.Executors;

public class VirtualThreadViaESDemo {
    public static void main(String[] args) throws InterruptedException {

        var executorService = Executors.newVirtualThreadPerTaskExecutor();

        executorService.submit(()-> {
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().threadId());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        executorService.submit(()-> {
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().threadId());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        executorService.submit(()-> {
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().threadId());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });


        System.out.println(Thread.currentThread().getName());

    }
}
