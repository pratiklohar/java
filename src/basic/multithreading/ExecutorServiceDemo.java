package basic.multithreading;

import java.util.concurrent.Executors;

public class ExecutorServiceDemo {


    public static void main(String[] args) {

        var executorService = Executors.newFixedThreadPool(2);

        executorService.submit(()-> {
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        executorService.submit(()-> {
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        executorService.submit(()-> {
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        executorService.shutdown();

        System.out.println(Thread.currentThread().getName());
    }
}

