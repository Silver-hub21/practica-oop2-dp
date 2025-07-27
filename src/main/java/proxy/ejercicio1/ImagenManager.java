package proxy.ejercicio1;

public class ImagenManager implements AccesoImagen {
    @Override
    public void mostrarImagen(String URLRemota) {
        //simular proceso de carga de imagen
        try {
            Thread.sleep(2000); // Simula un retraso de 2 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Mostrando imagen desde la URL: " + URLRemota);
    }
}
