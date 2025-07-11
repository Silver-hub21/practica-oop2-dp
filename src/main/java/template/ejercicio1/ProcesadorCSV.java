package template.ejercicio1;

public class ProcesadorCSV extends ProcesadorArchivos {

    @Override
    public String leerDatos(String archivo) {
        return "Leyendo datos del archivo CSV: " + archivo;
    }

    @Override
    public void procesarDatos(String datos) {
        System.out.println("Procesando datos del archivo CSV: " + datos);
        // Aquí se pueden agregar más lógicas específicas para procesar los datos del CSV
        System.out.println("Datos procesados correctamente.");
    }
}
