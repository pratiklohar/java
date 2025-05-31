package basic.multithreading;

/**
 * This class demonstrates the use of the {@code Runnable} interface to create a thread.
 */
public class RunnableDemo implements Runnable {

    @Override
    public void run() {

        // Task : To print name of the running thread.
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {

        // Prints the name of the current thread.
        System.out.println(Thread.currentThread().getName());

        // Create an object of a class that implements the Runnable interface.
        Runnable task = new RunnableDemo();

        // Create an object of Thread class and pass runnable object to Its constructor.
        Thread thread = new Thread(task);

        // Starts the new thread.
        thread.start();

    }
}
