package basic.overloading;

/**
 <h1>Methode Overloading</h1>
 <p>Allows different methods to have the same name but with different signatures.
 <p>It's not possible to overload method by changing only it's return type.
 <p>Methode Signature can differ in following ways.
 <ol>
    <li>Changing the number of arguments
    <li>Changing the data type of the Arguments
    <li>Mix of above two
    <li>Changing the order of arguments
 </ol>
 <p>Improves the readability of the program.
 <p>Also knows as compile time polymorphism, early binding.
 */

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
