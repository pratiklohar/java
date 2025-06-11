package basic.constructor;

/**
 * <h1>Constructor</h1>
 * <p>Constructor  is a special method used to initialize objects.
 * <p>Constructors must have the same name as the class within which it is defined.
 * <p>Constructor is called when an object of a class is created.
 * <p>It is called constructor because it constructs the values at the time of object creation.
 * <p>It is not necessary to write a constructor for a class because java compiler creates a default constructor (nor-arg constructor) if your class doesn't have any.
 * <p>Every time an object is created using the new() keyword, at least one constructor is called.
 * <br>
 *
 * <h1>How Java Constructors are Different From Java Methods?</h1>
 * <p>Constructors do not have return type, it does not return any value as while methods have the return type.
 * <p>Constructors are called only once at the time of object creation while methods can be called any number of times.
 * <p>Constructors cannot be abstract, static, final, and synchronized.
 * <p>We can use access modifiers while declaring a constructor. It controls the object creation. In other words, we can have private, protected, public or default constructor in Java.
 * <br>
 *
 * <h1>Types of Constructors</h1>
 * <ol>
 * <li>Default Constructor also known as No-Arg Constructor (Constructor with no arguments)</li>
 * <li>Parameterised Constructor (Constructor with arguments)</li>
 * </ol>
 * <br>
 *
 * <h1>Default Constructor</h1
 * <p>Default constructor doesn't have any argument.
 * <p>Object is initialized with values provided by default constructor.
 * <p>If there are no constructors in a class, compiler automatically creates a default constructor.
 * <br>
 *
 * <h1>Parameterised Constructor</h1>
 * <p>Parameterised constructor has arguments.
 * <p>The parameterised constructor is used to provide different values to distinct objects. However, you can provide the same values also.
 * <br>
 *
 * <h1>Constructor Overloading</h1>
 * <p>Constructor is just like a method but without return type. It can also be overloaded like Java methods.
 * <p>Constructor overloading in Java is a technique of having more than one constructor with different parameter lists.
 * <p>They are arranged in a way that each constructor performs a different task.
 * <p>They are differentiated by the compiler by the number of parameters in the list and their types.
 * <br>
 **/

public class DefaultConstructor {

    private int version;
    private String language;

    DefaultConstructor() { // If you don't define any constructor, compiler will create a default constructor for you with version = 0 and language = null
        version = 21;
        language = "Java";
    }

    void show() {
        System.out.println("This is " + language + " " + version);
    }

    public static void main(String[] args) {
        DefaultConstructor defaultConstructor = new DefaultConstructor(); // Object will get initialize with version = 21 and language = Java
        defaultConstructor.show();
    }
}
