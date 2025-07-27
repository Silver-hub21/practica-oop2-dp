package strategy.ejercicio2;

public class Main {
    public static void main(String[] args) {
        int[] arreglo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int valorBuscado = 5;

        // Usar búsqueda lineal
        BusquedaStrategy busquedaLineal = new BusquedaLineal();
        int resultadoLineal = busquedaLineal.buscar(arreglo, valorBuscado);
        System.out.println("Resultado Búsqueda Lineal: " + resultadoLineal);

        // Usar búsqueda binaria
        BusquedaStrategy busquedaBinaria = new BusquedaBinaria();
        int resultadoBinaria = busquedaBinaria.buscar(arreglo, valorBuscado);
        System.out.println("Resultado Búsqueda Binaria: " + resultadoBinaria);

        // Usar búsqueda por hashing
        BusquedaStrategy busquedaPorHashing = new BusquedaPorHashing();
        int resultadoHashing = busquedaPorHashing.buscar(arreglo, valorBuscado);
        System.out.println("Resultado Búsqueda por Hashing: " + resultadoHashing);
    }
}
