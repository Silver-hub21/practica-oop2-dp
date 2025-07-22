package observer.ejercicio2;

public class Main {
    public static void main(String[] args) {
        MonitorCPU monitor = new MonitorCPU();
        Observer dashboardWeb = new DashboardWeb();
        Observer email = new Email();
        Observer LogDeEventos = new LogDeEventos();

        //el log de eventos se agrega a todos los tipos de observadores

        monitor.agregarObservadorInfo(LogDeEventos);

        monitor.agregarObservadorAdvertencia(dashboardWeb);
        monitor.agregarObservadorAdvertencia(LogDeEventos);

        monitor.agregarObservadorCritica(email);
        monitor.agregarObservadorCritica(LogDeEventos);

        // Simulando la emisión de alertas
        monitor.actualizarPorcentajeUso(10.0); // Porcentaje de uso bajo
        monitor.actualizarPorcentajeUso(40.0); // Porcentaje de uso en advertencia
        monitor.actualizarPorcentajeUso(85.0); // Porcentaje de uso crítico

    }
}
