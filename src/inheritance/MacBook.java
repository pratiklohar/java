package inheritance;

public class MacBook extends Apple{

    public static void main(String[] args) {

        IPhone iPhone = new IPhone();
        iPhone.setProductId("MACPRO256GB");
        iPhone.setPrice(100000);
        System.out.println(iPhone.getProductId());
        System.out.println(iPhone.getPrice());

    }
}
