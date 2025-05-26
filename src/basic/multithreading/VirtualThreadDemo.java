package basic.multithreading;

public class VirtualThreadDemo {

    public static void main(String[] args) throws InterruptedException {

        // Creating thread using lambda.
        Thread.startVirtualThread(() -> {
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

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
