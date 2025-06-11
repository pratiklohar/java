package basic.inheritance;

/**
 * <p>In Java, Inheritance means creating new classes based on existing ones.
 * <p>An inherited class can reuse the methods and fields of the parent class. In addition, you can add new fields and methods to your current class as well.
 * <p>A class can inherit the other class using "extends" keyword.
 * <p>A class can extend only one class.
 * <p>Java does not support multiple inheritance with classes(to avoid the Diamond Problem), but it does support multiple inheritance with interfaces.
 * <p>If you don't want other classes to inherit from a class, use the final keyword.
 * <p>Inheritance types:
 * <ol>
 * <li>Single
 * <li>Multilevel
 * <li>Hierarchical
 * </ol>
 * <p> Inheritance promotes code reusability.
 */
public class MacBook extends Apple {

    private String camera;

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }
}


