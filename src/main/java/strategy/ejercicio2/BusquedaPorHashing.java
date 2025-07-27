package strategy.ejercicio2;

import java.util.HashMap;

public class BusquedaPorHashing implements BusquedaStrategy {
    @Override
    public int buscar(int[] arreglo, int valorBuscado) {
        //agregar un timer que mida el tiempo de ejecución:
        long inicio = System.nanoTime();

        // Crear un mapa hash para almacenar los índices de los elementos
        HashMap<Integer, Integer> mapa = new HashMap<>();

        // Llenar el mapa con los elementos del arreglo
        for (int i = 0; i < arreglo.length; i++) {
            mapa.put(arreglo[i], i);
        }

        // Buscar el valor en el mapa
        int posicion = mapa.getOrDefault(valorBuscado, -1); // Retorna -1 si no se encuentra
        long fin = System.nanoTime();
        System.out.println(fin - inicio + " nanosegundos");
        return posicion;
    }
}
