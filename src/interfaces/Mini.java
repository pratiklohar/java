package interfaces;

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
