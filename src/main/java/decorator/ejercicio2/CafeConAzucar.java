package decorator.ejercicio2;

public class CafeConAzucar extends CafeDecorator {
    private static final double PRECIO_AZUCAR = 0.50;

    public CafeConAzucar(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String descripcion() {
        return cafe.descripcion() + ", con azucar";
    }

    @Override
    public double costo() {
        return cafe.costo() + PRECIO_AZUCAR;
    }
}
