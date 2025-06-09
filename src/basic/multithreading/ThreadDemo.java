package basic.multithreading;

/**
 * This class demonstrates the use of the {@code Thread} class to create a thread.
 */
public class ThreadDemo extends Thread {

    @Override
    public void run() {
        // task : print name of the running thread.
        System.out.println(Thread.currentThread().getName());
    }
    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName());

        ThreadDemo thread = new ThreadDemo(); // create an object of a class that extends the Thread class

        thread.start(); // starts the new thread
    }
}
