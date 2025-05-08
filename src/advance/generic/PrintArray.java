
/*

- T is formal type parameter
- Generics allow us to pass some type i.e<T> information to our classes or basic.interfaces so that they can be used with different types of data.
- Basically it allow our classes, basic.interfaces or methods to parameterized with type information.
- It's not necessary to use T over here you can use ay alphabet. It's just a convention that is good to follow.

*/

package advance.generic;
public class PrintArray<T> {
    public void print(T[] arr)
    {
        for (T value: arr)
        {
            System.out.println(value);
        }
    }
}