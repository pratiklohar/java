package basic.multithreading;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {
    public static void main(String[] args) throws InterruptedException {

        CountDownLatch latch = new CountDownLatch(2); // wait for 2 threads

        new Thread(() -> {
            try {
                Thread.sleep(500);
                System.out.println(Thread.currentThread().getName());
                latch.countDown(); // reduce count by 1
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();

        new Thread(() -> {
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName());
                latch.countDown(); // reduce count by 1
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();

        latch.await(); // main thread wait until count becomes 0

        System.out.println(Thread.currentThread().getName());
    }
}
