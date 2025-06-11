package basic.inheritance;

public class IPhonePro extends IPhone{
    public static void main(String[] args) {

        IPhonePro iPhonePro = new IPhonePro();

        iPhonePro.setBrand("Apple");
        iPhonePro.setModel("iPhonePro 16");
        iPhonePro.setRam("8GB");
        iPhonePro.setStorage("256GB");
        iPhonePro.setProcessor("A17 Bionic");
        iPhonePro.setBattery("3500mAh");
        iPhonePro.setFrontCamera("12MP");
        iPhonePro.setRearCamera("48MP");
        iPhonePro.setPrice(999);

        System.out.println("Brand: " + iPhonePro.getBrand());
        System.out.println("Model: " + iPhonePro.getModel());
        System.out.println("RAM: " + iPhonePro.getRam());
        System.out.println("Storage: " + iPhonePro.getStorage());
        System.out.println("Processor: " + iPhonePro.getProcessor());
        System.out.println("Battery: " + iPhonePro.getBattery());
        System.out.println("Front Camera: " + iPhonePro.getFrontCamera());
        System.out.println("Rear Camera: " + iPhonePro.getRearCamera());
        System.out.println("Price($): " + iPhonePro.getPrice());
    }
}
