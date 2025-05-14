package basic.interfaces;

/**
 <h1> Implementation Class
 <p>A class can implement an interface using "implements" keyword.
 <p>Interface is the blueprint of the behaviour for a class implementing it. This means class that implements an interface must implement all the methods declared in the interface.
 <p>A class can implement multiple interfaces.
 <p>Multiple inheritance is not supported in the case of class because of ambiguity. However, it is supported in case of an interface because there is no ambiguity.
*/
public class Mini implements Fare{

    @Override
    public float calculateFare(float distance, float fare) {
        return distance*fare;
    }

    public static void main(String[] args) {
        Fare fare = new Mini();
        System.out.println(fare.calculateFare(10,20));
    }
}
