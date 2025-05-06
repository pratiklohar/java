package basic.constructor;

public class ParameterizedConstructor {

    int a;
    String s;
    ParameterizedConstructor(int a, String s){      // Parameterized Constructor
        this.a = a;
        this.s = s;
    }

    void show(){
        System.out.println("a :"+a);
        System.out.println("s :"+s);
    }

    public static void main(String[] args) {
        ParameterizedConstructor parameterizedConstructor = new ParameterizedConstructor(5,"Pratik");
        parameterizedConstructor.show();
        ParameterizedConstructor parameterizedConstructor2 = new ParameterizedConstructor(25,"Richa");
        parameterizedConstructor2.show();
    }
}
