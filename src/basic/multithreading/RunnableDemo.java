package basic.multithreading;

 /**
 * This class demonstrates the use of the Runnable interface to create a thread.
 */
public class RunnableDemo implements Runnable {

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

        // Create an object of Thread class and pass the object of class that implements Runnable interface
        Thread t1 = new Thread(new RunnableDemo());

        // Starts the new thread asynchronously
        t1.start();

        // Main thread does not wait for other threads to finish
        // Main thread prints and exits almost immediately
        System.out.println(Thread.currentThread().getName());

    }
}
