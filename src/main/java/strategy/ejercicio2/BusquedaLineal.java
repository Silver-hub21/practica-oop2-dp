package strategy.ejercicio2;

public class BusquedaLineal implements BusquedaStrategy {

    @Override
    public int buscar(int[] arreglo, int valorBuscado) {
        long inicio = System.nanoTime();
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == valorBuscado) {
                long fin = System.nanoTime();
                System.out.println(fin - inicio + " nanosegundos");
                return i;
            }
        }
        return -1;
    }
}
