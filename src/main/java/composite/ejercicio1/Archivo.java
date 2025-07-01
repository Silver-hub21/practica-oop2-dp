package composite.ejercicio1;

import java.util.List;

public class Archivo implements Componente {
    private String nombre;
    private double peso;

    public Archivo(String nombre, double peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    @Override
    public double calcularPeso() {
        return peso;
    }

    @Override
    public void agregar(Componente componente) {
    }

    @Override
    public void eliminar(Componente componente) {
    }

    @Override //analizar la lógica, no me gusta que devuelva null
    public Componente hijo(int index) {
        return null;
    }

    @Override
    public List<Componente> hijos() {
        return List.of();
    }
}
