package observer.ejercicio1;

public class Cliente implements Observer {
    private String nombre;
    private String apellido;
    private String email;

    public Cliente(String nombre, String apellido, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }


    @Override
    public void update(String descripcion, double precio) {
        System.out.println("Notificando nueva oferta a "
                + nombre + " " + apellido + " (" + email + "). " +
                "Oferta: " + descripcion + " a " + precio + "$");
    }


}
