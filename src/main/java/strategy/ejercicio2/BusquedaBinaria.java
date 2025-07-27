package strategy.ejercicio2;

public class BusquedaBinaria implements BusquedaStrategy {

    @Override
    public int buscar(int[] arreglo, int valorBuscado) {
        int izquierda = 0;
        int derecha = arreglo.length - 1;

        while (izquierda <= derecha) {
            long inicio = System.nanoTime();
            int medio = izquierda + (derecha - izquierda) / 2;

            if (arreglo[medio] == valorBuscado) {
                long fin = System.nanoTime();
                System.out.println(fin - inicio + " nanosegundos");
                return medio; // Valor encontrado
            }

            if (arreglo[medio] < valorBuscado) {
                izquierda = medio + 1; // Buscar en la mitad derecha
            } else {
                derecha = medio - 1; // Buscar en la mitad izquierda
            }
        }

        return -1; // Valor no encontrado
    }
}
