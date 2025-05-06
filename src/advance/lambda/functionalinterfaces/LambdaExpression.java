package advance.lambda.functionalinterfaces;

import advance.lambda.Square;

public class LambdaExpression {
    public static void main(String[] args) {

        Square square = n-> n*n;        // basic.multithreading.lambda expression - providing implementation of findSquare(int n) method of functional interface Square.
                                        // Functional Interface object is used to hold the basic.multithreading.lambda expression. i.e. sqaure.

        System.out.println(square.findSquare(10));  // Functional interface object is used invoke the basic.multithreading.lambda expression. i.e call the method of the functional interface.

        Runnable runnable = ()-> System.out.println("Hello World!");  // run() method of functional interface Runnable written using basic.multithreading.lambda expression.
        Thread thread = new Thread(runnable);
        thread.run();
    }
}
