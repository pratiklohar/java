package basic.multithreading;

class Counter {

    private int count = 0;

    public int getCount() {
        return count;
    }

    public synchronized void increaseCount() {
        for (int i = 0; i < 1000; i++) {
            count++;
        }
    }
}
