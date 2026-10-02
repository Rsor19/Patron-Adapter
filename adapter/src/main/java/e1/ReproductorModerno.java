package e1;

public class ReproductorModerno implements Reproductor {
    private double volumen;

    public ReproductorModerno() {
        this.volumen = 80.0; // Volumen por defecto
    }

    public ReproductorModerno(double volumen) {
        this.volumen = volumen;
    }

    @Override
    public String reproducir(String archivo) {
        return "Reproduciendo archivo moderno '" + archivo + "' al volumen: " + volumen + "%";
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }
}
