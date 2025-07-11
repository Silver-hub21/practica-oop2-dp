package template.ejercicio2;

public abstract class OrdenadorDeArrays {
    public final void ordenar(int[] array) {
        System.out.println("Iniciando el proceso de ordenamiento del array.");
        int[] copia = copiarArray(array);
        ordenarArray(copia);
        System.out.println("Array ordenado: " + mostrarArray(copia));
    }

    public void validarDatos(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("El array no puede ser nulo o vacío.");
        }
        for (int num : array) {
            if (num < 0) {
                throw new IllegalArgumentException("El array no puede contener números negativos.");
            }
        }
    }

    private int[] copiarArray(int[] array) {
        return array.clone();
    }

    public abstract void ordenarArray(int[] array);

    private String mostrarArray(int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int num : array) {
            sb.append(num).append(" ");
        }
        return sb.toString().trim();
    }
}
