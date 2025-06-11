package basic.overrriding;

/**
 * <h1>Methode Overriding</h1>
 * <p>Overriding occurs when a subclass provides the implementation of method already written in superclass.
 * <p>The method in the subclass must have the same signature as in the superclass.
 * <p>There must be an IS-A relationship (inheritance or interface).
 * <p>Method Overriding is achievable only through Inheritance or Interface.
 * <p>If we don’t want a method to be overridden, we declare it as final.
 * <p>Static methods can not be overridden.
 * <p>Private methods can not be overridden.
 * <p>Also known as runtime time polymorphism, late binding.
 */
public class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Bow Bow");
    }

    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.sound();
    }
}
