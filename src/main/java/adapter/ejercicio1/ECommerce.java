package adapter.ejercicio1;

public class ECommerce {
    public static void main(String[] args) {
        PayPalPayment paypal = new PayPal();
        StripePayment stripe = new Stripe();
        ProcesadorPago procesador = new PagoService();

        double monto = 100.0;
        String tarjeta = "1234-5678-9876-5432";
        String email = "tomsacosta19@gmail.com";
        String token = "tok_visa";

        // Usando el servicio de pago
        procesador.procesarPago(monto, tarjeta);
        // Usando PayPal
        ProcesadorPago paypalAdapter = new PayPalAdapter(paypal, email);
        paypalAdapter.procesarPago(monto, tarjeta);
        // Usando Stripe
        ProcesadorPago stripeAdapter = new StripeAdapter(stripe, token);
        stripeAdapter.procesarPago(monto, tarjeta);
    }
}
