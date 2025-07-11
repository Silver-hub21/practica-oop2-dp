package template.ejercicio1;

public class ProcesadorJSON extends ProcesadorArchivos {

    @Override
    public String leerDatos(String archivo) {
        return "Leyendo datos del archivo JSON: " + archivo;
    }

    @Override
    public void procesarDatos(String datos) {
        System.out.println("Procesando datos del archivo JSON: " + datos);
        // Aquí se pueden agregar más lógicas específicas para procesar los datos del JSON
        System.out.println("Datos procesados correctamente.");
    }
}
