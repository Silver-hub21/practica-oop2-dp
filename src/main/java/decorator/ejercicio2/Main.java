package decorator.ejercicio2;

public class Main {
    public static void main(String[] args) {
        Cafe cafeCompleto = new CafeConCanela
                (new CafeConCrema
                        (new CafeConAzucar
                                (new CafeConLeche
                                        (new CafeBasico("Café americano", 2.0)))));
        System.out.println("Descripción: " + cafeCompleto.descripcion() + " Costo: $" + cafeCompleto.costo());

        //Si el cliente tiene un cupón de descuento:
        Cafe cafeConCupon = new CafeConCupon(cafeCompleto);
        System.out.println("Descripción: " + cafeConCupon.descripcion() + " Costo: $" + cafeConCupon.costo());

    }
}
