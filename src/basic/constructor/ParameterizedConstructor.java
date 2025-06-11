package basic.constructor;

public class ParameterizedConstructor {

    private int version;
    private String language;

    public ParameterizedConstructor(int version, String language) {
        this.version = version;
        this.language = language;
    }

    void show() {
        System.out.println("This is " + language + " " + version);
    }

    public static void main(String[] args) {
        ParameterizedConstructor parameterizedConstructor = new ParameterizedConstructor(21, "Java");
        parameterizedConstructor.show();

    }
}
