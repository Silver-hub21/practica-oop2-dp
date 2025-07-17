package decorator.ejercicio1;

public class NotificacionCifrada extends NotificacionDecorator {

    public NotificacionCifrada(Notificador notificador) {
        super(notificador);
    }

    @Override
    public void notificar(String msj) {
        String msjCifrado = cifrar(msj);
        notificador.notificar(msjCifrado);
    }

    private String cifrar(String mensaje) {
        return new StringBuilder(mensaje).reverse().toString();
    }

}
