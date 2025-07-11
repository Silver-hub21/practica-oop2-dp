package template.ejercicio1;

public abstract class ProcesadorArchivos {
    public final void procesar(String archivo) {
        System.out.println("Abriendo archivo: " + archivo);
        String datos = leerDatos(archivo);
        procesarDatos(datos);
        System.out.println("Generando reporte");
    }

    public abstract String leerDatos(String archivo);

    public abstract void procesarDatos(String datos);
}
