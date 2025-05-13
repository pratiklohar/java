package basic.multithreading;

/**
 * This class demonstrates the use of the Runnable interface to create a thread.
 * It computes the first largest prime number greater than a given number.
 */
public class RunnableInterfaceDemo implements Runnable {
    
    long num;

    RunnableInterfaceDemo(long num) {
        this.num = num + 1;
    }

    // Logic to compute first largest prime than given number
    @Override
    public void run() {
        int i = 2;
        while (i <= num / 2) {
            if (num % i == 0) {
                num++;
                i = 1;
            }
            i++;
        }
        System.out.println(num);
    }

    public static void main(String[] args) {
        // Create an object of Thread class and pass the object of RunnableInterfaceDemo
        Thread thread = new Thread(new RunnableInterfaceDemo(31));

        // Threads begin execution asynchronously
        thread.start();
    }
}
