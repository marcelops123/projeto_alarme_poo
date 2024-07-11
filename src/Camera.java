public class Camera {
    private String localizacao;

    public Camera(String localizacao) {
        this.localizacao = localizacao;
    }

    public void capturarImagem() {
        System.out.println("Capturando imagem na câmera em " + localizacao);
    }
}
