package basic.abstraction;

public class Rectangle extends Shape {

    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    float area() {
        return length * width;
    }

    public static void main(String[] args) {
        Shape shape = new Rectangle(10, 20);
        shape.draw();
        System.out.println(shape.area());
    }
}
