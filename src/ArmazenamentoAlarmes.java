import java.util.ArrayList;
import java.util.List;

public class ArmazenamentoAlarmes {
    private List<Alarme> listaAlarmes;
    private Camera camera;

    public ArmazenamentoAlarmes(Camera camera) {
        this.listaAlarmes = new ArrayList<>();
        this.camera = camera;
    }

    public void adicionarAlarme(Alarme alarme) {
        listaAlarmes.add(alarme);
        System.out.println("Alarme ativado em " + alarme.getLocalizacao() + " às " + alarme.getHorarioAtivacaoFormatado() +
                ". Motivo: " + alarme.getMotivo());

        camera.capturarImagem();
    }

    public List<Alarme> getListaAlarmes() {
        return listaAlarmes;
    }
}
