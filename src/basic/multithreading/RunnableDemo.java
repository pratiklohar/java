package basic.multithreading;

/**
 * This class demonstrates the use of the {@code Runnable} interface to create a thread.
 */
public class RunnableDemo implements Runnable {

    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName()); // task : print name of the running thread.
    }
    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName());

        Runnable task = new RunnableDemo(); // create an object of a class that implements the Runnable interface.

        Thread thread = new Thread(task); // create an object of Thread class and pass runnable object to Its constructor.

        thread.start(); // starts the new thread.
    }
}
