package observer.ejercicio2;

public class LogDeEventos implements Observer {

    @Override
    public void update(String infoCPU) {
        System.out.println("Log de Eventos: " + infoCPU);
    }
}
