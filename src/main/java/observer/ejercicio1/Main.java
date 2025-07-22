package observer.ejercicio1;

public class Main {
    public static void main(String[] args) {
        Subasta subasta = new SubastaConcreta();
        Cliente c1 = new Cliente("Tomas", "Acosta", "tomsacosta19@gmail.com");
        Cliente c2 = new Cliente("Samantha", "Fernandez", "fdzsam@gmail.com");
        Auditor a1 = new Auditor("Juan", "Perez", "auditor@auditoria.com");
        Observer stats = new ServicioEstadisticas();
        subasta.agregarInteresado(c1);
        subasta.agregarInteresado(c2);
        subasta.agregarInteresado(a1);
        subasta.agregarInteresado(stats);
        subasta.agregarOferta(new Oferta(c1, "Oferta 1", 100.0));
        subasta.agregarOferta(new Oferta(c2, "Oferta 2", 200.0));
        subasta.agregarOferta(new Oferta(c1, "Oferta 3", 300.0));
        subasta.agregarOferta(new Oferta(c2, "Oferta 4", 400.0));


    }
}
