package observer.ejercicio1;

public class Oferta {
    private Cliente cliente;
    private String descripcion;
    private double precio;

    public Oferta(Cliente cliente, String descripcion, double precio) {
        this.cliente = cliente;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String descripcion() {
        return descripcion;
    }

    public double precio() {
        return precio;
    }

    public Cliente cliente() {
        return cliente;
    }


}
