package src.main.Java.sensors;

public class Sensor {
    private String id;
    private boolean ativo;

    public Sensor(String id) {
        this.id = id;
        this.ativo = false; // Inicialmente desativado
    }

    public void ativar() {
        this.ativo = true;
        System.out.println("Sensor " + id + " ativado.");
    }

    public void desativar() {
        this.ativo = false;
        System.out.println("Sensor " + id + " desativado.");
    }

    public String getId() {
        return id;
    }

    public boolean isAtivo() {
        return ativo;
    }
}
