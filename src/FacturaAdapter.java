
public class FacturaAdapter implements FacturaService {
    private LegacyBillingSystem legacy;

    public FacturaAdapter(LegacyBillingSystem legacy){
        this.legacy = legacy;
    }

    @Override
    public void emitirFactura(double Monto, String cliente) {
        legacy.abrirConeccion();

        legacy.generarFactura(cliente,Monto);

        System.out.println("Factura generada con exito para el cliente:" + cliente + " por un monto de:" + Monto);
    }
}
