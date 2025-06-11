package basic.overloading;

/**
 * <h1>Methode Overloading</h1>
 * <p>Allows different methods to have the same name but with different signatures.
 * <p>It's not possible to overload method by changing only it's return type.
 * <p>Methode Signature can differ in following ways.
 * <ol>
 * <li>Changing the number of arguments
 * <li>Changing the data type of the Arguments
 * <li>Mix of above two
 * <li>Changing the order of arguments
 * </ol>
 * <p>Improves the readability of the program.
 * <p>Also knows as compile time polymorphism, early binding.
 */

public class Sum {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static int add(int a, double b) {
        return (int) (a + b);
    }

    public static int add(double a, int b) {
        return (int) (a + b);
    }

    public static void main(String[] args) {
        System.out.println(add(1, 2));
        System.out.println(add(1, 2, 3));
        System.out.println(add(1, 2.2));
        System.out.println(add(1.1, 2));
    }
}
