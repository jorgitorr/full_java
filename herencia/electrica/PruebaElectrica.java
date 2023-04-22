package electrica;

public class PruebaElectrica {
    public static void main(String[] args) {
        //creación electrica
        Electrica electrica = new Electrica();

        //creación 3 clientes
        Cliente c1 = new Cliente("23423949A", 6.5);
        Cliente c2 = new ClientePaneles("5676523B", 5);
        Cliente c3 = new ClienteSmart("43892308F", 3, 5);

        //agrego clientes a electrica
        electrica.agregaCliente(c1);
        electrica.agregaCliente(c2);
        electrica.agregaCliente(c3);

        //actualizo la energia consumida
        c1.actualizaEnergiaConsumida(200);
        c2.actualizaEnergiaConsumida(500);
        c3.actualizaEnergiaConsumida(100);

        //Casteo c2 para poder acceder a los métodos de Cliente Paneles
        ClientePaneles c2Paneles = (ClientePaneles)c2;

        //actualizo la energia inyectada 
        c2Paneles.actualizaEnergiaInyectada(200);

        //cantidad clientes con paneles
        System.out.println("cantidad clientes con paneles en la electrica: " + electrica.getCantidadClientesPaneles());

        //facturación total de la eléctrica
        System.out.println("facturación total de la electrica: " + Math.round(electrica.getFacturacionTotal()*100.0)/100.0);

        //imprimir clientes de la eléctrica
        System.out.println("**********CLIENTES ELECTRICA*************");
        int contadorClientes = 1;
        for(Cliente c: electrica.getClientes()){
            System.out.println("Cliente " + contadorClientes + ": " + c);
            contadorClientes++;
        }

        System.out.println("*****************************************");



        Cliente clienteNormal1 = new Cliente("99999999D",3.4);
        clienteNormal1.actualizaEnergiaConsumida(275);
        Cliente clienteNormal2 = new Cliente("88888888G",7.3);
        clienteNormal2.actualizaEnergiaConsumida(370);
        Cliente clientePaneles1 = new ClientePaneles("77777777F",5.75);
        clientePaneles1.actualizaEnergiaConsumida(100);
        Cliente clientePaneles2 = new ClientePaneles("66666666H",4.6);
        clientePaneles2.actualizaEnergiaConsumida(80);
        Cliente clienteSmart = new ClienteSmart("55555555K",3.45,10);
        clienteSmart.actualizaEnergiaConsumida(210);

        Electrica electrica2 = new Electrica();
        electrica2.agregaCliente(clienteNormal1);
        electrica2.agregaCliente(clienteNormal2);
        electrica2.agregaCliente(clientePaneles1);
        electrica2.agregaCliente(clientePaneles2);
        electrica2.agregaCliente(clienteSmart);

        System.out.println("Cantidad de clientes con paneles: " + electrica2.getCantidadClientesPaneles());
        System.out.println(String.format("Facturación total: %.2f",electrica2.getFacturacionTotal()));
    }
}
