package strategy.ejercicio1;

public class ImpuestoExportacion implements ImpuestoStrategy {
    private static final double IMPUESTO_EXPORTACION = 0.15; // 15% de impuesto de exportación

    @Override
    public double precioConImpuesto(double precioBase) {
        return precioBase + (precioBase * IMPUESTO_EXPORTACION);
    }
}
