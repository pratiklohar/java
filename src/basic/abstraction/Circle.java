package basic.abstraction;

public class Circle extends Shape {

    private float radious = 10;
    private float pi = 3.14f;

    public Circle(float radious, float pi) {
        this.radious = radious;
        this.pi = pi;
    }

    @Override
    float area() {
        return pi * (float) (Math.pow(radious, 2));
    }

    public static void main(String[] args) {
        Shape shape = new Circle(10 , 3.14f);
        System.out.println(shape.area());
    }
}
