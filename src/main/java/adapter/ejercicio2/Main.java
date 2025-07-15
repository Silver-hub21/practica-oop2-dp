package adapter.ejercicio2;

public class Main {
    public static void main(String[] args) {
        ReproductorAudio reproductor = new Reproductor();
        BibliotecaMP3 bibliotecaMP3 = new Biblioteca();
        BibliotecaWAV archivosWAV = new LibreriaWAV();
        reproductor.reproducir("cancion.mp3");

        BibliotecasAdapter bibliotecasAdapter = new BibliotecasAdapter(bibliotecaMP3, archivosWAV);
        bibliotecasAdapter.reproducir("cancion.mp3");
        bibliotecasAdapter.reproducirWAV("cancion.wav");
        bibliotecasAdapter.detener();
        System.out.println("Reproducción finalizada.");

    }
}
