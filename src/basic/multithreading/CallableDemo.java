package basic.multithreading;

import java.util.concurrent.Callable;

public class CallableDemo implements Callable {

    @Override
    public Object call() throws Exception {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return Thread.currentThread().getName();
    }
    public static void main(String[] args) throws Exception {


    }
}
