package abstraction;

public class Circle extends Shape {

    private float radious = 10;
    private float pi = 3.14f;

    @Override
    float area() {
        return pi * (float)(Math.pow(radious,2));
    }
    public static void main(String[] args) {
        Shape shape = new Circle();
        System.out.println(shape.area());
    }
}
