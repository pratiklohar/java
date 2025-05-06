package basic.overrriding;

public class Dog extends Animal{
    @Override
    void sound() {
        System.out.println("Bow Bow");
    }

    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.sound();
    }
}
