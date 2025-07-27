package proxy.ejercicio2;

public class DataBaseProxy implements DataBase {
    private DataBase dataBaseConcreta;
    private Usuario usuario;

    public DataBaseProxy(DataBase dataBaseConcreta, Usuario usuario) {
        this.dataBaseConcreta = dataBaseConcreta;
        this.usuario = usuario;
    }

    @Override
    public void insertar(String nombre, String apellido, String email) {
        if (usuario.rol().equals(Rol.ADMINISTRADOR.descripcion())) {
            dataBaseConcreta.insertar(nombre, apellido, email);
        } else {
            throw new UnsupportedOperationException("El usuario no tiene permisos para insertar datos.");
        }
    }

    @Override
    public void eliminar(String email) {
        if (usuario.rol().equals(Rol.ADMINISTRADOR.descripcion())) {
            dataBaseConcreta.eliminar(email);
        } else {
            throw new UnsupportedOperationException("El usuario no tiene permisos para eliminar datos.");
        }
    }

    @Override
    public void actualizar(String email, String nuevoNombre, String nuevoApellido) {
        if (usuario.rol().equals(Rol.ADMINISTRADOR.descripcion())) {
            dataBaseConcreta.actualizar(email, nuevoNombre, nuevoApellido);
        } else {
            throw new UnsupportedOperationException("El usuario no tiene permisos para actualizar datos.");
        }
    }

    @Override
    public void consultar(String email) {
        dataBaseConcreta.consultar(email);
    }

    @Override
    public void listar() {
        dataBaseConcreta.listar();
    }
}
