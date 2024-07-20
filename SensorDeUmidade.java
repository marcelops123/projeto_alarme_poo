// package src.main.Java.sensors;

public class SensorDeUmidade extends Sensor {
    private boolean detectouUmidade;
    private double umidade;

    public SensorDeUmidade(String id) {
        super(id);
        this.detectouUmidade = false;
    }

    public void detectarUmidade() {
        this.detectouUmidade = true;
        System.out.println("Umidade detectada no sensor " + getId());
    }

    public double lerUmidade() {
        this.umidade = Math.random() * 100;
        return umidade;
    }

    public boolean isDetectouUmidade() {
        return detectouUmidade;
    }
}
