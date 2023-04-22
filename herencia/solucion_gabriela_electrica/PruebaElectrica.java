package solucion_gabriela_electrica;

public class PruebaElectrica {
    public static void main(String[] args) {
        Cliente clienteNormal1 = new Cliente("99999999D",3.4);
        clienteNormal1.actualizarEnergiaConsumida(275);
        Cliente clienteNormal2 = new Cliente("88888888G",7.3);
        clienteNormal2.actualizarEnergiaConsumida(370);
        Cliente clientePaneles1 = new ClientePaneles("77777777F",5.75);
        clientePaneles1.actualizarEnergiaConsumida(100);
        Cliente clientePaneles2 = new ClientePaneles("66666666H",4.6);
        clientePaneles2.actualizarEnergiaConsumida(80);
        Cliente clienteSmart = new ClienteSmart("55555555K",3.45,10);
        clienteSmart.actualizarEnergiaConsumida(210);
        
        
        Electrica electrica = new Electrica();
        electrica.agregaCliente(clienteNormal1);
        electrica.agregaCliente(clienteNormal2);
        electrica.agregaCliente(clientePaneles1);
        electrica.agregaCliente(clientePaneles2);
        electrica.agregaCliente(clienteSmart);
        
        System.out.println("Cantidad de clientes con paneles: " + electrica.getCantidadClientePaneles());
        System.out.println(String.format("Facturación total: %.2f",electrica.getFacturacionTotal()));
        
    }
}
