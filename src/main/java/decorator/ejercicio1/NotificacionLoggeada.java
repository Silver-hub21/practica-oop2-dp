package decorator.ejercicio1;

import java.time.LocalDateTime;

public class NotificacionLoggeada extends NotificacionDecorator {
    public NotificacionLoggeada(Notificador notificador) {
        super(notificador);
    }

    @Override
    public void notificar(String mensaje) {
        notificador.notificar(mensaje + " Hora exacta del mensaje: " + LocalDateTime.now());
    }

}
