package adapter.ejercicio2;

public class Biblioteca implements BibliotecaMP3 {
    @Override
    public void cargarArchivo(String ruta) {
        System.out.println("Cargando el archivo de audio desde la ruta: " + ruta);
    }

    @Override
    public void iniciarReproduccion() {
        System.out.println("Iniciando la reproduccion del archivo de audio.");
    }

    @Override
    public void detenerReproduccion() {
        System.out.println("Deteniendo la reproduccion del archivo de audio.");
    }
}
