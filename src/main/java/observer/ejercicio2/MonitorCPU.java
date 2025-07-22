package observer.ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class MonitorCPU implements Monitor {
    private String infoCPU;
    private double porcentajeUso;
    private List<Observer> alertaInfo;
    private List<Observer> alertaAdvertencia;
    private List<Observer> alertaCritica;

    public MonitorCPU() {
        this.porcentajeUso = 3.0; // Porcentaje de uso inicial
        this.infoCPU = "El sistema está apenas inicializando, el porcentaje de uso es de 3%";
        this.alertaInfo = new ArrayList<>();
        this.alertaAdvertencia = new ArrayList<>();
        this.alertaCritica = new ArrayList<>();
    }

    public void actualizarPorcentajeUso(double nuevoPorcentaje) {
        this.porcentajeUso = nuevoPorcentaje;
        this.infoCPU = "El porcentaje de uso de la CPU es de " + nuevoPorcentaje + "%";
        emitirAlerta(infoCPU);
    }

    private void verificarTipoDeAlerta(double nuevoPorcentaje) {
        if (nuevoPorcentaje >= 80) {
            for (Observer a : alertaCritica) {
                a.update(infoCPU);
            }
        }
        if (nuevoPorcentaje >= 35 && nuevoPorcentaje < 80) {
            for (Observer a : alertaAdvertencia) {
                a.update(infoCPU);
            }
        }
        if (nuevoPorcentaje < 20) {
            for (Observer a : alertaInfo) {
                a.update(infoCPU);
            }
        }
    }

    @Override
    public void emitirAlerta(String infoCPU) {
        System.out.println("--Emitiendo alerta--");
        verificarTipoDeAlerta(porcentajeUso);
    }

    @Override
    public void agregarObservadorInfo(Observer observador) {
        alertaInfo.add(observador);
    }

    @Override
    public void agregarObservadorAdvertencia(Observer observador) {
        alertaAdvertencia.add(observador);
    }

    @Override
    public void agregarObservadorCritica(Observer observador) {
        alertaCritica.add(observador);
    }

    @Override
    public void eliminarObservador(Observer observador) {
        alertaInfo.remove(observador);
        alertaAdvertencia.remove(observador);
        alertaCritica.remove(observador);
    }
}
