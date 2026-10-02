package e1;

public class MainReproductor {
    public static void main(String[] args) {
        // Reproductor moderno directo
        Reproductor moderno = new ReproductorModerno(90.0);
        System.out.println(moderno.reproducir("Sol y Luna - Akash.flac"));

        // Adaptando el reproductor antiguo
        ReproductorAntiguo antiguo = new ReproductorAntiguo("MP3");
        Reproductor adaptador = new AdaptadorAntiguo(antiguo);
        System.out.println(adaptador.reproducir("Rock of Ages - Def Leppard.mp3"));
    }
}