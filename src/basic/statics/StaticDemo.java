package basic.statics;

/**
 * <h1>Static</h1>
 * <p>Variables, Methods, Blocks, Nested Classes can be declared as static.
 * <p>Static variables and methods are allocated memory space only once during the execution of the program.
 * <p>This memory space is shared by all objects of the class, which makes static members useful for maintaining global state or shared functionality.
 * <p>Static members and methods can be access using class name, without the need to create an instance of the class.
 *
 * <br>
 * <h1>Static Variable</h1>
 * <p>Static variables are associated with the class, not with an object of class.
 * <p>This means that changes to a static variables are reflected in all instances of that class.
 * <p>We can define static variables at the class level only.
 * <p>If we define static variable inside any function compiler will throw an error.
 *
 * <br>
 * <h1>Static Method</h1>
 * <p>Static methods cannot access non-static members of a class, as they are not associated with any particular instance of the class.
 * <p>Static methods can be overloaded, However they cannot be overridden, as they are associated with the class rather than with a particular instance of the class.
 *
 * <br>
 * <h1>Static Block</h1>
 * <p>Static block and static variables are executed in the order they are present in a program.
 *
 * <br>
 * <h1>Static Classes</h1>
 * <p>We cannot declare a top-level class as a static modifier but can declare nested classes as static.
 */

public class StaticDemo {

    static int a = 10; //static variable
    int b = 100;

    static void m1() { // static method
        System.out.println(a);
        // b=200; error

    }

    void m2() {                  // normal method
        System.out.println(a);
    }

    static { // static block
        System.out.println("Inside static block");
    }

    public static void main(String[] args) {

        StaticDemo.m1(); // calling static method m1() without creating object.
        StaticDemo d1 = new StaticDemo();
        StaticDemo d2 = new StaticDemo();
        d1.m2();
        d2.m2();
        StaticDemo.a = 20; // changing static variable value.
        d1.m2();
        d2.m2();
    }
}
