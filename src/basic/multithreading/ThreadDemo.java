package basic.multithreading;

/**
 * This class demonstrates the use of the {@code Thread} class to create a thread.
 */
public class ThreadDemo extends Thread {

    @Override
    public void run() {
        // Task
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {

        // Prints the name of the current thread.
        System.out.println(Thread.currentThread().getName());

        // Create an object of a class that extends the Thread class.
        ThreadDemo thread = new ThreadDemo();

        // Starts the new thread.
        thread.start();
    }
}
