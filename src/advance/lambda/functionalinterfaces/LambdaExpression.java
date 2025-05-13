package advance.lambda.functionalinterfaces;

import advance.lambda.Square;

public class LambdaExpression {
    public static void main(String[] args) {

        // Implementation of SAM (findSquare(int n)) of the functional interface Square through lambda expression
        // Functional interface object is used to hold the lambda expression
        Square square = n -> n * n;


        // Functional interface object is used invoke the lambda expression (to call the SAM)
        System.out.println(square.findSquare(10));


        // Implementation of SAM (run()) of the functional interface Runnable through lambda expression
        Runnable runnable = () -> System.out.println("Hello from thread 1");
        Thread thread = new Thread(runnable);
        thread.start();

        Thread thread2 = new Thread(() -> {
            System.out.println("Hello from thread 2");
        });
        thread2.start();






    }
}
