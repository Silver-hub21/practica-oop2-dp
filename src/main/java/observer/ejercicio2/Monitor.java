package observer.ejercicio2;

public interface Monitor {
    void emitirAlerta(String infoCPU);

    void agregarObservadorInfo(Observer observador);

    void agregarObservadorAdvertencia(Observer observador);

    void agregarObservadorCritica(Observer observador);

    void eliminarObservador(Observer observador);
}
