package src.main.Java.sensors;

public class SensorDeFogo extends Sensor {
    private boolean detectouFogo;

    public SensorDeFogo(String id) {
        super(id);
        this.detectouFogo = false;
    }

    public void detectarFogo() {
        this.detectouFogo = true;
        System.out.println("Fogo detectado no sensor " + getId());
    }

    public boolean isDetectouFogo() {
        return detectouFogo;
    }
}
