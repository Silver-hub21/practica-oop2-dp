package observer.ejercicio2;

public class Email implements Observer {
    @Override
    public void update(String infoCPU) {
        System.out.println("Email: " + infoCPU);
    }
}
