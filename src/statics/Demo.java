package statics;

public class Demo {

    static int a = 10;          //static variable
    int b = 100;

    static void m1(){           // static method
        System.out.println(a);
        //b=200;                // error because static method cannot access non-static members.

    }

    void m2(){                  // normal method
        System.out.println(a);
    }


    static {                    // static block

        System.out.println("Inside static block");
    }

}
class  Test {
    public static void main(String[] args) {

        Demo.m1();              // calling static method m1() without creating object.
        Demo d1 = new Demo();
        Demo d2 = new Demo();
        d1.m2();
        d2.m2();
        Demo.a = 20;            // changing static variable value.
        d1.m2();
        d2.m2();
    }
}
