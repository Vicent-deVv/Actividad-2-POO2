public class Main {
    public static void main(String[] args) {
        LegacyBillingSystem legacyBillingSystem = new LegacyBillingSystem();

        FacturaAdapter facturaAdapter = new FacturaAdapter(legacyBillingSystem);

        facturaAdapter.emitirFactura(3500,"Vicente");
        System.out.println("---------------------------------------------");
        facturaAdapter.emitirFactura(0,"Roberto Rodriguez");
        System.out.println("---------------------------------------------");
        facturaAdapter.emitirFactura(-100,"Isaac");
        System.out.println("---------------------------------------------");
        facturaAdapter.emitirFactura(10,"Chespirito");
    }
}