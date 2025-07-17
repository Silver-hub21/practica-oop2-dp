package decorator.ejercicio1;

public abstract class NotificacionDecorator implements Notificador {
    protected Notificador notificador;

    public NotificacionDecorator(Notificador notificador) {
        this.notificador = notificador;
    }

    @Override
    public void notificar(String mensaje) {
        notificador.notificar(mensaje);
    }


}
