package e1;

public class ReproductorAntiguo {
    private String formatoSoportado;

    public ReproductorAntiguo() {
        this.formatoSoportado = "MP3";
    }

    public ReproductorAntiguo(String formatoSoportado) {
        this.formatoSoportado = formatoSoportado;
    }

    public String playMp3(String archivo) {
        return "Reproduciendo mediante legacy player (" + formatoSoportado + "): " + archivo;
    }

    public String getFormatoSoportado() {
        return formatoSoportado;
    }
}
