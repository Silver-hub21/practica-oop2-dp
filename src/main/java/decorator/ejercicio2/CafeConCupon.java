package decorator.ejercicio2;

public class CafeConCupon extends CafeDecorator {
    private static final double DESCUENTO_CLIENTE = 3.50;

    public CafeConCupon(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String descripcion() {
        return cafe.descripcion() + ", con cupon de descuento de: " + DESCUENTO_CLIENTE;
    }

    @Override
    public double costo() {
        return cafe.costo() - DESCUENTO_CLIENTE;
    }
}
