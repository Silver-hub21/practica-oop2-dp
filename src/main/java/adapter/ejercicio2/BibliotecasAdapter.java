package adapter.ejercicio2;

public class BibliotecasAdapter implements ReproductorAudio {
    private BibliotecaMP3 biblioteca;
    private BibliotecaWAV archivosWAV;

    public BibliotecasAdapter(BibliotecaMP3 biblioteca, BibliotecaWAV archivosWAV) {
        this.biblioteca = biblioteca;
        this.archivosWAV = archivosWAV;
    }

    @Override
    public void reproducir(String archivo) {
        biblioteca.cargarArchivo(archivo);
        biblioteca.iniciarReproduccion();
    }

    public void reproducirWAV(String archivo) {
        archivosWAV.playWAV(archivo);
    }

    public void detener() {
        biblioteca.detenerReproduccion();
    }
}
