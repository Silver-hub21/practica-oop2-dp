package decorator.ejercicio1;

public class NotificacionHTML extends NotificacionDecorator {

    public NotificacionHTML(Notificador notificador) {
        super(notificador);
    }

    @Override
    public void notificar(String mensaje) {
        notificador.notificar("<html><body>" + mensaje + "</body></html>");
    }
}
