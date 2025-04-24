package overrriding;

public class Cat extends Animal{
    @Override
    void sound() {
        System.out.println("Meow Meow");
    }
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.sound();

    }
}
