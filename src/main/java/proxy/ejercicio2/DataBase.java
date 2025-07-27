package proxy.ejercicio2;

public interface DataBase {
    void insertar(String nombre, String apellido, String email);

    void eliminar(String email);

    void actualizar(String email, String nuevoNombre, String nuevoApellido);

    void consultar(String email);

    void listar();
}
