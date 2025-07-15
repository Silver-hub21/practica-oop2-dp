package adapter.ejercicio1;

public class PagoService implements ProcesadorPago {

    @Override
    public void procesarPago(double monto, String tarjeta) {
        System.out.println("Procesando el pago de " + monto + " con la tarjeta " + tarjeta);
    }

}
