package adapter.ejercicio1;

public class PayPalAdapter implements ProcesadorPago {
    private PayPalPayment paypal;
    private String email;

    public PayPalAdapter(PayPalPayment paypal, String email) {
        this.paypal = paypal;
        this.email = email;
    }

    @Override
    public void procesarPago(double monto, String tarjeta) {
        this.paypal.realizarPago(this.email, monto);
    }
}
