// package src.main.Java.sensors;

public class SensorDeTemperatura extends Sensor {
    private double temperatura;

    public SensorDeTemperatura(String id) {
        super(id);
        this.temperatura = 0.0;
    }

    public double lerTemperatura() {
        // Simulação de leitura de temperatura
        this.temperatura = Math.random() * 100; // Exemplo simples
        return temperatura;
    }
}
