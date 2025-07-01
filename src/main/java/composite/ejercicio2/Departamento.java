package composite.ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Departamento implements ComponenteEmpresa {
    private String nombre;
    private List<ComponenteEmpresa> empleados;
    private double presupuesto;

    public Departamento(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
        this.presupuesto = 0.0; //se calcula dinamicamente
    }

    @Override
    public double calcularPresupuesto() {
        return empleados.stream()
                .mapToDouble(ComponenteEmpresa::calcularPresupuesto)
                .sum();
    }

    @Override
    public void agregar(ComponenteEmpresa componente) {
        empleados.add(componente);
    }

    @Override
    public void eliminar(ComponenteEmpresa componente) {
        empleados.remove(componente);
    }

    @Override
    public ComponenteEmpresa hijo(int index) {
        return empleados.get(index);
    }

    @Override
    public List<ComponenteEmpresa> hijos() {
        return empleados;
    }
}
