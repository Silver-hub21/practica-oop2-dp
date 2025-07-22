package strategy.ejercicio1;

public class ImpuestoIVA implements ImpuestoStrategy {
    private static final double IVA = 0.21; // 21% de IVA

    @Override
    public double precioConImpuesto(double precioBase) {
        return precioBase + (precioBase * IVA);
    }

}
