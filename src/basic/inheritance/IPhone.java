package basic.inheritance;

public class IPhone extends Apple{

    private String ram;
    private String resolution;

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public static void main(String[] args) {

        IPhone iPhone = new IPhone();
        iPhone.setProductId("IP15X128GB");
        iPhone.setRam("8GB");
        iPhone.setResolution("48MP");
        iPhone.setPrice(50000);

        System.out.println(iPhone.getProductId());
        System.out.println(iPhone.getRam());
        System.out.println(iPhone.getResolution());
        System.out.println(iPhone.getPrice());

    }
}
