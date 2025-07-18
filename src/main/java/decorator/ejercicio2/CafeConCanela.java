package decorator.ejercicio2;

public class CafeConCanela extends CafeDecorator {
    private static final double PRECIO_CANELA = 1.50;

    public CafeConCanela(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String descripcion() {
        return cafe.descripcion() + ", con canela";
    }

    @Override
    public double costo() {
        return cafe.costo() + PRECIO_CANELA;
    }
}
