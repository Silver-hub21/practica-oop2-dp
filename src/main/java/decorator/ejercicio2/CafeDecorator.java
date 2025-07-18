package decorator.ejercicio2;

public abstract class CafeDecorator implements Cafe {
    protected Cafe cafe;

    public CafeDecorator(Cafe cafe) {
        this.cafe = cafe;
    }

}
