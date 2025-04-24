package constructor;

public class OverloadedConstructor {

    int a ;
    String s;
    OverloadedConstructor(int a ){
        this.a = a;
    }
    OverloadedConstructor(String s){                // constructor overloading
        this.s = s;
    }
    OverloadedConstructor(int a , String s){        // constructor overloading
        this.a = a;
        this.s = s;
    }

    void show(){
        System.out.println("a :"+a);
        System.out.println("s :"+s);
    }
    public static void main(String[] args) {
        OverloadedConstructor overloadedConstructor = new OverloadedConstructor(5);
        overloadedConstructor.show();
        OverloadedConstructor overloadedConstructor2 = new OverloadedConstructor("Pratik");
        overloadedConstructor2.show();
        OverloadedConstructor overloadedConstructor3 = new OverloadedConstructor(5,"Pratik");
        overloadedConstructor3.show();
    }
}
