package basic.multithreading;
public class Main {
    public static void main(String[] args) {

        Counter counter = new Counter();

        Thread t1 = new Thread(counter::increaseCount);
        Thread t2 = new Thread(counter::increaseCount);
        Thread t3 = new Thread(counter::increaseCount);
        Thread t4 = new Thread(counter::increaseCount);
        Thread t5 = new Thread(counter::increaseCount);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        System.out.println(counter.getCount());

    }
}
