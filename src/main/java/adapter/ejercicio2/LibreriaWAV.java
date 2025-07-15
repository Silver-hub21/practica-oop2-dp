package adapter.ejercicio2;

public class LibreriaWAV implements BibliotecaWAV {
    @Override
    public void playWAV(String filename) {
        System.out.println("Reproduciendo archivo WAV: " + filename);
    }
}
