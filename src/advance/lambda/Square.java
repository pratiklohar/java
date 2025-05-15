package advance.lambda;
/**
 <h1>Functional Interface</hh1>
 <p>Functional interface has exactly one abstract method..
 <p>Functional interface can have multiple default and static methods but only one abstract method.
 <p>Functional interface is also known as SAM (Single Abstract Method) interface.
 <p>{@code @FunctionalInterface} annotation is used to ensure that the functional interface can’t have more than one abstract method.
 <p>If we try to add more than one abstract methods to an interface annotated with @FunctionalInterface, the compiler flags an ‘Unexpected @FunctionalInterface annotation’ message.
 <p>However, it is not mandatory to use this annotation if an interface contains only one abstract method, it is considered as functional interface by the compiler.
 <br>

 <h1>Lambda Expression</h1>
 <p>We can write lambda expression only for functional interface.
 <p>Lambda expression provides implementation of SAM method in clear and concise way. This eliminates need of an implementation class.
 <p>Functional interface object holds lambda expression.
 <p>Functional interface object calls the SAM.
 <p>Since Java SE 1.8 onwards, many interfaces converted to functional interfaces.
 <table>
 <tr>
   <th>Functional Interface</th>
   <th>SAM</th>
 </tr>
 <tr>
   <td>Runnable</td>
   <td>run();</td>
 </tr>
 <td>Callable</td>
 <td>call();</td>
 </tr>
 <tr>
   <td>Comparable</td>
   <td>compareTo();</td>
 </tr>
 <tr>
 <td>Comparator</td>
 <td>compare();</td>
 </tr>
 </table>
 <br>

 <p>Java SE 8 included four main functional interfaces often use with streams they are:
 <table>
 <tr>
 <th>Functional Interface</th>
 <th>SAM</th>
 </tr>
 <td>Predicate<T></td>
 <td>boolean test(T t)</td>
 </tr>
 <tr>
 <td>Function<T, R></td>
 <td>R  apply(T t);</td>
 </tr>
 <tr>
 <td>Consumer<T></td>
 <td>void  accept(T t);</td>
 </tr>
 <tr>
 <td>Supplier<T></td>
 <td>T  get();</td>
 </tr>
 </table>

 * */
@FunctionalInterface
public interface Square {
    int findSquare(int n);
}
