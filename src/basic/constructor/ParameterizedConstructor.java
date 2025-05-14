package basic.constructor;

public class ParameterizedConstructor {

    int a;
    String s;
    ParameterizedConstructor(int a, String s){ // Parameterized Constructor
        this.a = a;
        this.s = s;
    }

    void show(){
        System.out.println("This is "+s+" "+a);
    }
    public static void main(String[] args) {
        ParameterizedConstructor parameterizedConstructor = new ParameterizedConstructor(21,"Java");
        parameterizedConstructor.show();

    }
}
