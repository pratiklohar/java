package basic.multithreading;

class Counter {

    private int count = 0;

    public void increaseCount() {
        for (int i = 0; i < 5000; i++) {
            count++;
        }
    }

    public int getCount() {
        return count;
    }
}
