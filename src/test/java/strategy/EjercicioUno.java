package strategy;

import org.junit.jupiter.api.Test;
import strategy.ejercicio1.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EjercicioUno {
    @Test
    public void testCalculoPrecioConIVA() {
        ImpuestoStrategy impuestoIVA = new ImpuestoIVA();
        ImpuestoStrategy impuestoIVAReducido = new ImpuestoIVAReducido();
        ImpuestoStrategy impuestoExpo = new ImpuestoExportacion();

        Producto producto = new Producto(100.0, "Producto A", impuestoIVA);
        Producto productoIVAReducido = new Producto(100.0, "Producto B", impuestoIVAReducido);
        Producto productoExportacion = new Producto(100.0, "Producto C", impuestoExpo);

        assertEquals(121.0, producto.calcularPrecio(), 0.01);
        assertEquals(110.0, productoIVAReducido.calcularPrecio(), 0.01);
        assertEquals(115.0, productoExportacion.calcularPrecio(), 0.01);
    }
}
