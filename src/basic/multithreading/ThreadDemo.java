package basic.multithreading;

/**
 * This class demonstrates the use of the Thread class to create a thread.
 */
public class ThreadDemo extends Thread {

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {

        // Create an object of Thread class and pass the object of class that implements Runnable interface.
        ThreadDemo t1 = new ThreadDemo();

        // Starts the new thread asynchronously
        t1.start();


        // Main thread does not wait for other threads to finish
        // Main thread prints and exits almost immediately
        System.out.println(Thread.currentThread().getName());
        
    }
}
