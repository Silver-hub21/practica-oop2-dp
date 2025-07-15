package adapter.ejercicio1;

public class Stripe implements StripePayment {

    @Override
    public void charge(double amount, String cardToken) {
        System.out.println("Charging " + amount + " using Stripe with card token: " + cardToken);
    }
}
