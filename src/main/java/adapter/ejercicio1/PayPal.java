package adapter.ejercicio1;

public class PayPal implements PayPalPayment{

    @Override
    public void realizarPago(String email, double cantidad) {
        System.out.println("Realizando pago de " + cantidad + " a través de PayPal al email: " + email);
    }
}
