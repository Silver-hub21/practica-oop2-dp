package proxy.ejercicio2;

public class DataBaseConcreta implements DataBase {

    @Override
    public void insertar(String nombre, String apellido, String email) {
        System.out.println("Insertando en la base de datos: " + nombre + " " + apellido + " con email: " + email);
    }

    @Override
    public void eliminar(String email) {
        System.out.println("Eliminando de la base de datos el usuario con email: " + email);
    }

    @Override
    public void actualizar(String email, String nuevoNombre, String nuevoApellido) {
        System.out.println("Actualizando en la base de datos el usuario con email: " + email + " a " + nuevoNombre + " " + nuevoApellido);
    }

    @Override
    public void consultar(String email) {
        System.out.println("Consultando en la base de datos el usuario con email: " + email);
    }

    @Override
    public void listar() {
        System.out.println("Listando todos los usuarios de la base de datos.");
    }
}
