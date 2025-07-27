package proxy.ejercicio1;

public class Main {
    public static void main(String[] args) {
        AccesoImagen imagenManager = new ImagenManager();
        AccesoImagen imagenProxy = new ImagenProxy(imagenManager);
        String URL = "https://example.com/imagen.jpg";
        // Mostrar imagen usando el manager
        imagenManager.mostrarImagen(URL);
        // Mostrar imagen usando el proxy
        imagenProxy.mostrarImagen(URL);
        // Mostrar imagen usando el proxy nuevamente para verificar la caché
        imagenProxy.mostrarImagen(URL);
        // Mostrar imagen con una URL diferente para verificar el acceso al manager
        String nuevaURL = "https://example.com/otra-imagen.jpg";
        imagenProxy.mostrarImagen(nuevaURL);
        // Mostrar imagen esperando 5 minutos para verificar el acceso al manager
        try {
            Thread.sleep(300000); // Espera 5 minutos (300000 milisegundos)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Mostrar imagen nuevamente después de 5 minutos
        imagenProxy.mostrarImagen(URL);
    }
}
