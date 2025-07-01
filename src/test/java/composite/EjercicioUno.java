package composite;

import composite.ejercicio1.Archivo;
import composite.ejercicio1.Carpeta;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EjercicioUno {
    @Test
    public void documentosTest() {
        var carpeta1 = new Carpeta("Documentos");
        var archivo1 = new Archivo("informe.pdf", 500.0);
        carpeta1.agregar(archivo1);
        var subCarpeta1 = new Carpeta("Imagenes");
        var achivo2 = new Archivo("foto1.jpg", 200.0);
        var archivo3 = new Archivo("foto2.jpg", 350.0);
        subCarpeta1.agregar(achivo2);
        subCarpeta1.agregar(archivo3);
        carpeta1.agregar(subCarpeta1);
        assertEquals(1050.0, carpeta1.calcularPeso(), 0.01);
    }

    @Test
    public void documentosTest2() { //corrobora que el peso se ajuste dinamicamente
        var carpeta1 = new Carpeta("Documentos");
        var archivo1 = new Archivo("informe.pdf", 500.0);
        carpeta1.agregar(archivo1);
        var subCarpeta1 = new Carpeta("Imagenes");
        var achivo2 = new Archivo("foto1.jpg", 200.0);
        var archivo3 = new Archivo("foto2.jpg", 350.0);
        subCarpeta1.agregar(achivo2);
        subCarpeta1.agregar(archivo3);
        carpeta1.agregar(subCarpeta1);
        double primerPeso = carpeta1.calcularPeso();
        var subCarpeta2 = new Carpeta("Videos");
        var archivo4 = new Archivo("video1.mp4", 1500.0);
        subCarpeta2.agregar(archivo4);
        carpeta1.agregar(subCarpeta2);
        double segundoPeso = carpeta1.calcularPeso();
        carpeta1.eliminar(subCarpeta2);
        carpeta1.eliminar(subCarpeta1);
        double tercerPeso = carpeta1.calcularPeso();

        assertEquals(1050.0, primerPeso, 0.01);
        assertEquals(2550.0, segundoPeso, 0.01);
        assertEquals(500.0, tercerPeso, 0.01);
    }
}
