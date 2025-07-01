package composite;

import composite.ejercicio2.Consultor;
import composite.ejercicio2.Empleado;
import org.junit.jupiter.api.Test;
import composite.ejercicio2.Departamento;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EjercicioDos {
    @Test
    public void empresaTest() {
        var depto = new Departamento("Tecnología");
        var empleado = new Empleado("Tomas Acosta", 1000.0);
        var empleado2 = new Empleado("Samantha Fernandez", 1500.0);
        var consultor = new Consultor("Lucas Perez", 200.0, 20);
        depto.agregar(empleado);
        depto.agregar(empleado2);
        depto.agregar(consultor);
        assertEquals(6500.0, depto.calcularPresupuesto(), 0.01);
    }
}
