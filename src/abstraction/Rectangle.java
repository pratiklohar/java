package abstraction;

public class Rectangle extends Shape {

    private int length;
    private int width;

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    float area() {

        return length*width;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(10);
        rectangle.setWidth(10);
        System.out.println(rectangle.area());
    }
}
