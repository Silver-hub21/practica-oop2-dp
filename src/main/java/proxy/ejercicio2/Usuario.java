package proxy.ejercicio2;

public class Usuario {
    private String rol;

    public Usuario(Rol rol) {
        this.rol = rol.descripcion();
    }

    public String rol() {
        return rol;
    }

}
