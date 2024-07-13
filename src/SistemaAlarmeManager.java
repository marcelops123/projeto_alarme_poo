import src.main.Java.alarms.*;
import src.main.Java.devices.*;
import src.main.Java.entities.*;
import src.main.Java.logs.*;
import src.main.Java.sensors.*;

public class SistemaAlarmeManager {
    
    private Camera camera;
    private SensorDeTemperatura sensorTemperatura;
    private SensorDeMovimento sensorMovimento;
    private SensorDeFogo sensorFogo;
    private Local local;

    public SistemaAlarmeManager() {
        // Inicializa os componentes do sistema
        camera = new Camera();
        sensorTemperatura = new SensorDeTemperatura("S1");
        sensorMovimento = new SensorDeMovimento("S2");
        sensorFogo = new SensorDeFogo("S3");
        local = new Local("Sala de Reunião");

        // Simula ativação dos sensores
        sensorTemperatura.ativar();
        sensorMovimento.ativar();
        sensorFogo.ativar();
    }

    public void iniciarMonitoramento() {
        // Lógica de monitoramento aqui
        System.out.println("Iniciando monitoramento...");

        // Simula detecção de eventos
        double temperatura = sensorTemperatura.lerTemperatura();
        if (temperatura > 50) {
            dispararAlarme("Temperatura alta detectada: " + temperatura);
        }

        sensorMovimento.detectarMovimento();

        if (sensorFogo.isDetectouFogo()) {
            dispararAlarme("Fogo detectado!");
        }

        // Simula início de gravação pela câmera em caso de detecção
        if (sensorMovimento.isAtivo()) {
            camera.ligar();
            camera.iniciarGravacao();
        }

        // Simula logs de eventos
        Logs.registrarEvento("Evento de monitoramento concluído.");
    }

    private void dispararAlarme(String mensagem) {
        Alarme alarme = new Alarme(mensagem);
        alarme.disparar();
    }

    public static void main(String[] args) {
        SistemaAlarmeManager sistema = new SistemaAlarmeManager();
        sistema.iniciarMonitoramento();
    }
}
