package basic.abstraction;

/**
 * <h1>Abstraction</h1>
 * <p>Abstraction in Java is the process of hiding the implementation details and only showing the essential functionality to the user.
 * <p>Abstraction in java is achieved using abstract classes and abstract interfaces.
 * <p>We can achieve 100% abstraction using interfaces.
 * <p>An abstract keyword is applicable for classes and methods in Java not for variables.
 * <br>
 *
 * <h1>Abstract class</h1>
 * <p>An abstract class must be declared with "abstract" keyword.
 * <p>An abstract class can have abstract methods and non-abstract/concrete methods.
 * <p>An abstract class can extend another class and implement interface.
 * <p>If a class contains at least one abstract method then class must be declared as abstract.
 * <p>Abstract class can’t be instantiated.i.e. We cannot create an object of the abstract class but abstract class object can take the reference of its child class and call its methods or fields.
 * <br>
 *
 * <h1>Abstract Methods</h1>
 * <p>Abstract method must be declared with "abstract" keyword.
 * <p>Abstract methods are declared, they do not have body. Thus, a subclass must override all abstract methods of superclass and provide implementation.
 * <p>Any concrete class that extends an abstract class must override its all abstract methods else the concrete class has to be declared as abstract as well.
 * <br>
 *
 *
 * <h1>Phrases that are used interchangeably</h1>
 * <p>Method definition / Method implementation.
 * <p>Concrete method / Non-abstract method / Normal method / Method with body.
 */
abstract class Shape {
    abstract float area();

    // concrete method
    public void draw() {
        System.out.println("Drawing a shape");
    }
}
