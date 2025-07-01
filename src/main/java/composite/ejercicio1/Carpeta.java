package composite.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Carpeta implements Componente {
    private String nombre;
    private List<Componente> componentes;
    private double peso;

    public Carpeta(String nombre) {
        this.nombre = nombre;
        this.componentes = new ArrayList<>();
        this.peso = 0.0; // El peso se calculará dinámicamente
    }

    @Override
    public double calcularPeso() {
        return componentes.stream()
                .mapToDouble(Componente::calcularPeso)
                .sum();
    }

    @Override
    public void agregar(Componente componente) {
        componentes.add(componente);
    }

    @Override
    public void eliminar(Componente componente) {
        componentes.remove(componente);
    }

    @Override
    public Componente hijo(int index) {
        return componentes.get(index);
    }

    @Override
    public List<Componente> hijos() {
        return componentes;
    }
}
