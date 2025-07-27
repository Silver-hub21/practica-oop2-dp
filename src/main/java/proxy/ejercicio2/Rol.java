package proxy.ejercicio2;

public enum Rol {
    ADMINISTRADOR("Administrador"),
    USUARIO("Usuario");

    private final String descripcion;

    Rol(String descripcion) {
        this.descripcion = descripcion;
    }

    public String descripcion() {
        return descripcion;
    }
}
