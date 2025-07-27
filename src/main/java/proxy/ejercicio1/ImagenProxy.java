package proxy.ejercicio1;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ImagenProxy implements AccesoImagen {
    private AccesoImagen imagenManager;
    private String URLRemota;
    private LocalDateTime ultimoAcceso;
    private List<LocalDateTime> accesos;

    public ImagenProxy(AccesoImagen imagenManager) {
        this.imagenManager = imagenManager;
        accesos = new ArrayList<>();
    }

    @Override
    public void mostrarImagen(String URL) {
        if (URLRemota == null || !URLRemota.equals(URL) || ultimoAcceso.isBefore(LocalDateTime.now().minusMinutes(5))) {
            this.URLRemota = URL;
            imagenManager.mostrarImagen(URL);
            ultimoAcceso = LocalDateTime.now();
            accesos.add(ultimoAcceso);
        } else {
            System.out.println("Mostrando imagen desde la caché: " + URLRemota);
            ultimoAcceso = LocalDateTime.now();
            accesos.add(ultimoAcceso);
        }
    }
}
