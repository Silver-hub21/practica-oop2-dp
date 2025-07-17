package decorator.ejercicio1;

public class Main {
    public static void main(String[] args) {
        // Notificación cifrada
        NotificacionCifrada notificadorCifrado = new NotificacionCifrada(new Notificacion());
        notificadorCifrado.notificar("Mensaje cifrado de prueba");

        // Notificación loggeada
        NotificacionLoggeada notificadorLoggeado = new NotificacionLoggeada(new Notificacion());
        notificadorLoggeado.notificar("Mensaje cifrado de prueba");

        // Notificación HTML
        NotificacionHTML notificadorHTML = new NotificacionHTML(new Notificacion());
        notificadorHTML.notificar("Mensaje HTML de prueba");

        // Notificación cifrada y loggeada
        NotificacionCifrada notificacionCifradaYLoggeada = new NotificacionCifrada(new NotificacionLoggeada(new Notificacion()));
        notificacionCifradaYLoggeada.notificar("Mensaje cifrado y loggeado de prueba");

        // Notificación cifrada, HTML y loggeada
        NotificacionCifrada notificacionCifradaHTMLYLoggeada =
                new NotificacionCifrada(
                        new NotificacionHTML(
                                new NotificacionLoggeada(new Notificacion())));
        notificacionCifradaHTMLYLoggeada.notificar("Mensaje cifrado, HTML y loggeado de prueba");
    }
}




