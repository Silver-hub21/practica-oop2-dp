package observer.ejercicio1;

public interface Subasta {
    void agregarOferta(Oferta oferta);

    void agregarInteresado(Observer interesado);

    void eliminarInteresado(Observer interesado);

    void notificarInteresados(String descripcion, double precio);
}
