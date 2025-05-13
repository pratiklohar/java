package basic.multithreading;

/**
 * This class demonstrates the use of the Thread class to create a thread.
 * It computes the first largest prime number greater than a given number.
 */
public class ThreadClassDemo extends Thread {

    long num;

    ThreadClassDemo(long num) {
        this.num = num + 1;
    }

    // Logic to compute first largest prime than given num
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
        ThreadClassDemo threadClassDemo = new ThreadClassDemo(13);

        // Threads begin execution asynchronously
        threadClassDemo.start();

        
    }
}
