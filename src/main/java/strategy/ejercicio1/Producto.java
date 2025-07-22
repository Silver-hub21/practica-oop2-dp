package strategy.ejercicio1;

public class Producto {
    private double precioBase;
    private String nombre;
    private ImpuestoStrategy impuestoStrategy;

    public Producto(double precioBase, String nombre, ImpuestoStrategy impuestoStrategy) {
        this.precioBase = precioBase;
        this.nombre = nombre;
        this.impuestoStrategy = impuestoStrategy;
    }

    public double calcularPrecio() {
        return impuestoStrategy.precioConImpuesto(precioBase);
    }

}
