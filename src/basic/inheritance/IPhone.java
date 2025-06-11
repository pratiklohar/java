package basic.inheritance;

public class IPhone extends Apple{

    private String frontCamera;
    private String rearCamera;

    public String getFrontCamera() {
        return frontCamera;
    }

    public void setFrontCamera(String frontCamera) {
        this.frontCamera = frontCamera;
    }

    public String getRearCamera() {
        return rearCamera;
    }

    public void setRearCamera(String rearCamera) {
        this.rearCamera = rearCamera;
    }


    public static void main(String[] args) {

        IPhone iPhone = new IPhone();

        iPhone.setBrand("Apple");
        iPhone.setModel("iPhone 16");
        iPhone.setRam("8GB");
        iPhone.setStorage("256GB");
        iPhone.setProcessor("A17 Bionic");
        iPhone.setBattery("3500mAh");
        iPhone.setFrontCamera("12MP");
        iPhone.setRearCamera("48MP");
        iPhone.setPrice(999);

        System.out.println("Brand: " + iPhone.getBrand());
        System.out.println("Model: " + iPhone.getModel());
        System.out.println("RAM: " + iPhone.getRam());
        System.out.println("Storage: " + iPhone.getStorage());
        System.out.println("Processor: " + iPhone.getProcessor());
        System.out.println("Battery: " + iPhone.getBattery());
        System.out.println("Front Camera: " + iPhone.getFrontCamera());
        System.out.println("Rear Camera: " + iPhone.getRearCamera());
        System.out.println("Price($): " + iPhone.getPrice());
    }
}
