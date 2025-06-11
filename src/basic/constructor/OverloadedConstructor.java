package basic.constructor;

public class OverloadedConstructor {

    private int version;
    private String language;

    OverloadedConstructor(int version) {
        this.version = version;
    }

    OverloadedConstructor(String language) { // constructor overloading
        this.language = language;
    }

    OverloadedConstructor(int version, String language) { // constructor overloading
        this.language = language;
        this.version = version;
    }

    void show() {
        System.out.println("This is " + language + " " + version);
    }

    public static void main(String[] args) {

        OverloadedConstructor overloadedConstructor = new OverloadedConstructor(5);
        overloadedConstructor.show();

        OverloadedConstructor overloadedConstructor2 = new OverloadedConstructor("Java");
        overloadedConstructor2.show();

        OverloadedConstructor overloadedConstructor3 = new OverloadedConstructor(21, "Java");
        overloadedConstructor3.show();
    }
}
