package composite.ejercicio2;

import java.util.List;

public interface ComponenteEmpresa {
    double calcularPresupuesto();

    void agregar(ComponenteEmpresa componente);

    void eliminar(ComponenteEmpresa componente);

    ComponenteEmpresa hijo(int index);

    List<ComponenteEmpresa> hijos();

}
