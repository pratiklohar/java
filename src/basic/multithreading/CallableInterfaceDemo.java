package basic.multithreading;

import java.util.concurrent.Callable;

public class CallableInterfaceDemo implements Callable {

    private int num;

    public CallableInterfaceDemo(int num) {
        this.num = num;
    }

    @Override
    public Object call() throws Exception {
        int i = 2;
        while (i <= num / 2) {
            if (num % i == 0) {
                num++;
                i = 1;
            }
            i++;
        }
        return num;
    }

    public static void main(String[] args) throws Exception {
        CallableInterfaceDemo callableInterfaceDemo = new CallableInterfaceDemo(13);
        System.out.println(callableInterfaceDemo.call());

    }

}
