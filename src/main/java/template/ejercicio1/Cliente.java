package template.ejercicio1;

public class Cliente { //codigo cliente ideal, se mantiene limpio y no depende
    // de las implementaciones concretas, simplemente se elige el tipo de archivo a procesar
    public static void main(String[] args) {
        ProcesadorArchivos procesadorCSV = new ProcesadorCSV();
        procesadorCSV.procesar("datos.csv");

        ProcesadorArchivos procesadorJSON = new ProcesadorJSON();
        procesadorJSON.procesar("datos.json");
    }
}
