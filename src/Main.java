import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Camera camera1 = new Camera("Sala de Controle");
        Camera camera2 = new Camera("Entrada Principal");
        Camera camera3 = new Camera("Corredor Leste");
        
        ArmazenamentoAlarmes armazenamento1 = new ArmazenamentoAlarmes(camera1);
        ArmazenamentoAlarmes armazenamento2 = new ArmazenamentoAlarmes(camera2);
        ArmazenamentoAlarmes armazenamento3 = new ArmazenamentoAlarmes(camera3);

        LocalDateTime horarioAtivacao = LocalDateTime.now();
        Alarme alarme1 = new Alarme("Sala 1", horarioAtivacao, "Intrusão");
        Alarme alarme2 = new Alarme("Entrada", horarioAtivacao, "Movimento suspeito");
        Alarme alarme3 = new Alarme("Corredor B", horarioAtivacao, "Quebra de vidro");

        armazenamento1.adicionarAlarme(alarme1);
        armazenamento2.adicionarAlarme(alarme2);
        armazenamento3.adicionarAlarme(alarme3);

        sc.close();
    }
}
