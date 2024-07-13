package src.main.Java.sensors;

public class SensorDeMovimento extends Sensor {
    public SensorDeMovimento(String id) {
        super(id);
    }

    public void detectarMovimento() {
        System.out.println("Movimento detectado no sensor " + getId());
    }
}
