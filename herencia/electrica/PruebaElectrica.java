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

        //actualiza la energia inyectada de c2
        ClientePaneles c2Paneles = (ClientePaneles)c2;
        c2Paneles.setContadorEnergiaInyectada(400);
        c2Paneles.actualizaEnergiaInyectada(200);

        //cantidad clientes con paneles
        System.out.println("cantidad clientes con paneles en la electrica: " + electrica.getCantidadClientesPaneles());

        //facturación total
        System.out.println("facturación total de la electrica: " + Math.round(electrica.getFacturacionTotal()*100.0)/100.0);
    }
}
