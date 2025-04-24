package multithreading;

public class PrimeThread extends Thread {

    long num;

    PrimeThread(long num) {
        this.num = num + 1;
    }

    // logic to compute first largest prime than given num
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
        PrimeThread primeThread = new PrimeThread(13);
        primeThread.start();
    }
}
