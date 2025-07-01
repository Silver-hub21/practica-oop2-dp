package composite.ejercicio1;

import java.util.List;

public interface Componente {
    double calcularPeso();

    void agregar(Componente componente);

    void eliminar(Componente componente);

    Componente hijo(int index);

    List<Componente> hijos();
}
