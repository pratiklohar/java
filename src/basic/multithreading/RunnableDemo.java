package basic.multithreading;

public class RunnableDemo implements Runnable {
    long num;

    RunnableDemo(long num) {
        this.num = num + 1;
    }

    // logic to compute first largest prime than given number
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
        RunnableDemo runnable = new RunnableDemo(31);
        Thread thread = new Thread(runnable);

        //Thread thread = new Thread(new PrimeRunnable(31));

        thread.start();

        //new Thread(primeRunnable).start();

        //new Thread(new PrimeRunnable(31)).start();
    }
}
