package e1;

public class AdaptadorAntiguo implements Reproductor {
    private ReproductorAntiguo reproductorAntiguo;

    public AdaptadorAntiguo(ReproductorAntiguo reproductorAntiguo) {
        this.reproductorAntiguo = reproductorAntiguo;
    }

    @Override
    public String reproducir(String archivo) {

        return reproductorAntiguo.playMp3(archivo);
    }
}
