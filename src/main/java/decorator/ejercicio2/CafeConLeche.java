package decorator.ejercicio2;

public class CafeConLeche extends CafeDecorator {
    private static final double PRECIO_LECHE = 1.50;

    public CafeConLeche(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String descripcion() {
        return cafe.descripcion() + ", con leche";
    }

    @Override
    public double costo() {
        return cafe.costo() + PRECIO_LECHE;
    }
}
