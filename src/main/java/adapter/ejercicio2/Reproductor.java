package adapter.ejercicio2;

public class Reproductor implements ReproductorAudio {

    @Override
    public void reproducir(String archivo) {
        System.out.println("Reproduciendo el archivo de audio: " + archivo);
    }
}
