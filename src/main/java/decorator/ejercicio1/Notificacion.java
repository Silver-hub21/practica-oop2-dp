package decorator.ejercicio1;

public class Notificacion implements Notificador {

    @Override
    public void notificar(String mensaje) {
        System.out.println("Notificación: " + mensaje);
    }
}
