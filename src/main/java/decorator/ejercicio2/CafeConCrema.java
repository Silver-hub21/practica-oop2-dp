package decorator.ejercicio2;

public class CafeConCrema extends CafeDecorator {
    private static final double PRECIO_CREMA = 2.00;

    public CafeConCrema(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String descripcion() {
        return cafe.descripcion() + ", con crema";
    }

    @Override
    public double costo() {
        return cafe.costo() + PRECIO_CREMA;
    }
}
