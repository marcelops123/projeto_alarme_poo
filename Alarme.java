// package src.main.Java.alarms;

public class Alarme {
    private String mensagem;

    public Alarme(String mensagem) {
        this.mensagem = mensagem;
    }

    public void disparar() {
        System.out.println("Alarme disparado: " + mensagem);
    }
}
