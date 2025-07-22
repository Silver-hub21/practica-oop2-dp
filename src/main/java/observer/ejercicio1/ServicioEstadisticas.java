package observer.ejercicio1;

public class ServicioEstadisticas implements Observer {
    private int totalOfertas;
    private double precioAcumulado;
    private double ofertaMasAlta;

    @Override
    public void update(String descripcion, double precio) {
        totalOfertas++;
        precioAcumulado += precio;
        if (precio > ofertaMasAlta) {
            ofertaMasAlta = precio;
        }

        System.out.println("Estadísticas actualizadas: " +
                "Total ofertas: " + totalOfertas + ", " +
                "Precio acumulado: " + precioAcumulado + "$, " +
                "Oferta más alta: " + ofertaMasAlta + "$");
    }
}
