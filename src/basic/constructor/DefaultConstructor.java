package basic.constructor;

public class DefaultConstructor
{
    int a;
    String s;

    DefaultConstructor(){               // If we remove the default basic.constructor here the compiler will automatically create default basic.constructor and assign 0  to a and null to s.
        a=5;                            // Newly created object will get initialize with a=5 and s=Pratik
        s="Pratik";
    }

    void show(){
        System.out.println("a :"+a);
        System.out.println("s :"+s);
    }

    public static void main(String[] args) {
        DefaultConstructor defaultConstructor = new DefaultConstructor();
        defaultConstructor.show();
    }
}
