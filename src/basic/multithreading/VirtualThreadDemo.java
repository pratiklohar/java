package basic.multithreading;

public class VirtualThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        var MAX = 1000000; // Not possible to create one million threads with traditional thread.
        for (int i = 0; i < MAX; i++) {
            Thread.startVirtualThread(() -> {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        }
        Thread.sleep(5000);
        System.out.println("DONE");
    }
}
