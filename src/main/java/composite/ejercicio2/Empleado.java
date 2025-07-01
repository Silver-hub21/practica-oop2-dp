package composite.ejercicio2;

import java.util.List;

public class Empleado implements ComponenteEmpresa {
    private String nombre;
    private double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    @Override
    public double calcularPresupuesto() {
        return salario;
    }

    @Override
    public void agregar(ComponenteEmpresa componente) {

    }

    @Override
    public void eliminar(ComponenteEmpresa componente) {

    }

    @Override
    public ComponenteEmpresa hijo(int index) {
        return null;
    }

    @Override
    public List<ComponenteEmpresa> hijos() {
        return List.of();
    }
}
