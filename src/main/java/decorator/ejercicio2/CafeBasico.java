package decorator.ejercicio2;

public class CafeBasico implements Cafe {
    private String descripcion;
    private double costo;

    public CafeBasico(String descripcion, double costo) {

        this.descripcion = descripcion;
        this.costo = costo;
    }

    @Override
    public String descripcion() {
        return descripcion;
    }

    @Override
    public double costo() {
        return costo;
    }
}
