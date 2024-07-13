package src.main.Java.devices;

public class Camera {
    private boolean ligada;

    public Camera() {
        this.ligada = false; // Inicialmente desligada
    }

    public void ligar() {
        this.ligada = true;
        System.out.println("Câmera ligada.");
    }

    public void desligar() {
        this.ligada = false;
        System.out.println("Câmera desligada.");
    }

    public void iniciarGravacao() {
        if (ligada) {
            System.out.println("Iniciando gravação...");
            // Lógica para iniciar a gravação em vídeo
        } else {
            System.out.println("Câmera não está ligada. Não é possível iniciar gravação.");
        }
    }

    public boolean isLigada() {
        return ligada;
    }
}
