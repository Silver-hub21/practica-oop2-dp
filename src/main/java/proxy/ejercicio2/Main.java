package proxy.ejercicio2;

public class Main {
    public static void main(String[] args) {
        Usuario usuarioAdministrador = new Usuario(Rol.ADMINISTRADOR);
        Usuario usuarioUsuario = new Usuario(Rol.USUARIO);

        System.out.println("Rol del usuario administrador: " + usuarioAdministrador.rol());
        System.out.println("Rol del usuario normal: " + usuarioUsuario.rol());

        DataBase dataBaseConcreta = new DataBaseConcreta();
        DataBase dataBaseProxy = new DataBaseProxy(dataBaseConcreta, usuarioAdministrador);
        DataBase dataBaseProxyUsuario = new DataBaseProxy(dataBaseConcreta, usuarioUsuario);
        //simula la obtención del rol de usuario a partir de la sesión iniciada
        dataBaseProxyUsuario.listar();
        dataBaseProxy.insertar("Juan", "Pérez", "jp@gmail.com");
        dataBaseProxy.actualizar("jp@gmail.com", "Juan", "Gómez");
        dataBaseProxy.eliminar("jp@gmail.com");
        try {
            dataBaseProxyUsuario.insertar("Tomas", "Acosta", "tomsacosta19@gmail.com");
        } catch (UnsupportedOperationException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
