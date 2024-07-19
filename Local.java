// package src.main.Java.entities;

public class Local {
    private String nome;
    private boolean emManutencao;

    public Local(String nome) {
        this.nome = nome;
        this.emManutencao = false; // Inicialmente não está em manutenção
    }

    public String getNome() {
        return nome;
    }

    public boolean isEmManutencao() {
        return emManutencao;
    }

    public void setEmManutencao(boolean emManutencao) {
        this.emManutencao = emManutencao;
    }
}
