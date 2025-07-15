package adapter.ejercicio1;

public interface StripePayment {
    void charge(double amount, String cardToken);
}
