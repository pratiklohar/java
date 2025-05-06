package basic.inheritance;

public class IPhonePro extends IPhone{

    private String motionSensor;

    public String getMotionSensor() {
        return motionSensor;
    }

    public void setMotionSensor(String motionSensor) {
        this.motionSensor = motionSensor;
    }

    public static void main(String[] args) {

        IPhonePro iPhonePro = new IPhonePro();

        iPhonePro.setProductId("IP15PRO256GB");
        iPhonePro.setRam("16GB");
        iPhonePro.setResolution("50MP");
        iPhonePro.setPrice(80000);
        iPhonePro.setMotionSensor("Real Time Motion Sensor");

        System.out.println(iPhonePro.getProductId());
        System.out.println(iPhonePro.getRam());
        System.out.println(iPhonePro.getResolution());
        System.out.println(iPhonePro.getPrice());
        System.out.println(iPhonePro.getMotionSensor());

    }
}
