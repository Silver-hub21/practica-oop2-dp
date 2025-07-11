package template.ejercicio2;

public class ClienteOrdenador {
    public static void main(String[] args) {
        int[] array = {5, 3, 8, 6, 2, 7, 4, 1, 9, 0};

        OrdenadorDeArrays ordenador = new QuickSort();
        ordenador.ordenar(array);

        ordenador = new BubbleSort();
        ordenador.ordenar(array);
    }
}
