public class LegacyBillingSystem {
    //Metodos Meramente Referenciales
    public void abrirConeccion(){
        System.out.println("[Legacy]Abriendo Coneccion");
    }

    public void generarFactura(String nombre, double val){
        System.out.println("[Legacy]Creando registro para: " + nombre + " con valor: " + val);
    }
}
