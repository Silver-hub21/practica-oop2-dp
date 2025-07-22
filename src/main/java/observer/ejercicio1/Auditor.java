package observer.ejercicio1;

public class Auditor implements Observer {
    private String nombre;
    private String apellido;
    private String email;

    public Auditor(String nombre, String apellido, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }

    @Override
    public void update(String descripcion, double precio) {
        System.out.println("Nueva oferta registrada. Notificando al auditor: "
                + nombre + " " + apellido + " (" + email + "). " +
                "Oferta: " + descripcion + " a " + precio + "$");
    }
}
