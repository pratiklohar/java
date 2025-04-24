package interfaces;

public class Sedan implements Fare {
    @Override
    public float calculateFare(float distance, float fare) {
        final int comfortCost = 5;
        return distance*fare*comfortCost;
    }

    public static void main(String[] args) {
        Fare fare = new Mini();
        System.out.println(fare.calculateFare(10,20));
    }
}
