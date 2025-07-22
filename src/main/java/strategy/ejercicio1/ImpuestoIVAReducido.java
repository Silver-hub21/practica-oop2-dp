package strategy.ejercicio1;

public class ImpuestoIVAReducido implements ImpuestoStrategy {
    private static final double IVA_REDUCIDO = 0.1; // 10% de IVA reducido

    @Override
    public double precioConImpuesto(double precioBase) {
        return precioBase + (precioBase * IVA_REDUCIDO);
    }
}
