import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Alarme {
    private String localizacao;
    private LocalDateTime horarioAtivacao;
    private String motivo;
    private DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

    public Alarme(String localizacao, LocalDateTime horarioAtivacao, String motivo) {
        this.localizacao = localizacao;
        this.horarioAtivacao = horarioAtivacao;
        this.motivo = motivo;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public String getHorarioAtivacaoFormatado() {
        return horarioAtivacao.format(dateFormatter) + " " + horarioAtivacao.format(timeFormatter);
    }

    public String getMotivo() {
        return motivo;
    }
}
