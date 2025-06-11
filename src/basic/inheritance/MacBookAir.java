package basic.inheritance;

public class MacBookAir extends MacBook {
    public static void main(String[] args) {

        MacBookAir macBookAir = new MacBookAir();

        macBookAir.setBrand("Apple");
        macBookAir.setModel("MacBook Air");
        macBookAir.setRam("8GB");
        macBookAir.setStorage("256GB SSD");
        macBookAir.setProcessor("Apple M4");
        macBookAir.setCamera("12MP FaceTime HD Camera");
        macBookAir.setBattery("18 hours");
        macBookAir.setPrice(999);


        System.out.println("Brand: " + macBookAir.getBrand());
        System.out.println("Model: " + macBookAir.getModel());
        System.out.println("RAM: " + macBookAir.getRam());
        System.out.println("Storage: " + macBookAir.getStorage());
        System.out.println("Processor: " + macBookAir.getProcessor());
        System.out.println("Battery: " + macBookAir.getBattery());
        System.out.println("Camera: " + macBookAir.getCamera());
        System.out.println("Price($): " + macBookAir.getPrice());

    }
}
