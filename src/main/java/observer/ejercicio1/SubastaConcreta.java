package observer.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class SubastaConcreta implements Subasta {
    private List<Observer> interesados;
    private List<Oferta> ofertas;

    public SubastaConcreta() {
        this.interesados = new ArrayList<>();
        this.ofertas = new ArrayList<>();
    }

    @Override
    public void agregarOferta(Oferta oferta) {
        ofertas.add(oferta);
        notificarInteresados(oferta.descripcion(), oferta.precio());
    }

    @Override
    public void agregarInteresado(Observer interesado) {
        if (!interesados.contains(interesado)) {
            interesados.add(interesado);
        }
    }

    @Override
    public void eliminarInteresado(Observer interesado) {
        interesados.remove(interesado);
    }

    @Override
    public void notificarInteresados(String descripcion, double precio) {
        for (Observer interesado : interesados) {
            interesado.update(descripcion, precio);
        }
    }
}
