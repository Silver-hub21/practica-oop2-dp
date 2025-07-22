package observer.ejercicio2;

public class DashboardWeb implements Observer {
    @Override
    public void update(String infoCPU) {
        System.out.println("Dashboard Web: " + infoCPU);
    }
}
