package composite.ejercicio2;

import java.util.List;

public class Consultor implements ComponenteEmpresa {
    private String nombre;
    private double tarifaPorHora;
    private int horasTrabajadas;

    public Consultor(String nombre, double tarifaPorHora, int horasTrabajadas) {
        this.nombre = nombre;
        this.tarifaPorHora = tarifaPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularPresupuesto() {
        return tarifaPorHora * horasTrabajadas;
    }

    @Override
    public void agregar(ComponenteEmpresa componente) {
        // No se puede agregar a un consultor
    }

    @Override
    public void eliminar(ComponenteEmpresa componente) {
        // No se puede eliminar de un consultor
    }

    @Override
    public ComponenteEmpresa hijo(int index) {
        return null; // No tiene hijos
    }

    @Override
    public List<ComponenteEmpresa> hijos() {
        return List.of(); // No tiene hijos
    }
}
