package advance.lambda.functionalinterfaces;

import advance.lambda.Square;
/**
 <h1>Lambda Expression</h1>
 <p>Lambda expression is an anonymous function.
 <ol>
 <li>Not having any access modifier</li>
 <li>Not having any return type</li>
 <li>Not having any name</li>
 </ol>
 <p>Lambda Expression syntax: {@code (arguments) -> {body}}
 <p>Steps to make any function as lambda expression are:
 <ol>
 <li>Remove access modifier</li>
 <li>Remove return type</li>
 <li>Remove method name</li>
 <li>Place arrow (->)</li>
 </ol>
 <pre>
 {@code
 public int getStringLength(String str){
    System.out.print(str.length());
 }
 }
 </pre>
 <p>Lambda expression of above function:
 <pre>
 {@code
     (String str) -> {
         System.out.print(str.length());
     }
 }
 </pre>
 <p>If body has just one statement we can remove curly brackets. When there is more than one statement, then these must be enclosed in curly brackets.
 <pre>
 {@code
 (String str) -> return str.length();
 }
 </pre>
 <p>Use type inference, compiler guess the situation or context. i.e. no need to specify the data type of function argument.
 <pre>
 {@code
 (str) -> return str.length();
 }
 </pre>
 <p>No need of return keyword.
 <pre>
 {@code
 (str) -> str.length();
 }
 </pre>
 <p>If function takes only one argument; you can remove round bracket.
 <pre>
 {@code
 str -> str.length();
 }
 </pre>
 <p>Functional Interface object holds lambda expression.
 <pre>
 {@code
 FunctionInterface obj = str -> str.length();
 }
 </pre>

 @apiNote
 <p>With curly braces it is mandatory to use return statement if you wish to return something.
 <p>Without curly braces compiler will return value automatically.
 <p>Without curly braces you cannot use return keyword.
 */



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
