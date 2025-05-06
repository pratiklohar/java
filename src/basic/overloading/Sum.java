package basic.overloading;

class Sum {
    static int add(int a, int b) {
        return a + b;
    }

    static int add(double a, double b) {
        return (int) ((int) a + b);
    }
    public static void main(String[] args) {
        System.out.println(Sum.add(10, 20));
        System.out.println(Sum.add(10.10, 20.20));
    }
}
