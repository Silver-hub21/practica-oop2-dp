package adapter.ejercicio1;

public class StripeAdapter implements ProcesadorPago {
    private StripePayment stripe;
    private String token;

    public StripeAdapter(StripePayment stripe, String token) {
        this.stripe = stripe;
        this.token = token;
    }

    @Override
    public void procesarPago(double monto, String tarjeta) {
        this.stripe.charge(monto, this.token);
    }
}
