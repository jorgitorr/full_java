package electrica;

import java.util.HashSet;
import java.util.Set;

public class Electrica {
    private Set<Cliente>clientes;

    public Electrica() {
        this.clientes = new HashSet<>();
    }

    public void agregaCliente(Cliente nuevoCliente){
        clientes.add(nuevoCliente);
    }

    public int getCantidadClientesPaneles(){
        int clientesConPaneles = 0;
        for(Cliente c: clientes){
            if(c instanceof ClientePaneles)
                clientesConPaneles++;
        }
        return clientesConPaneles;
    }

    public double getFacturacionTotal(){
        double importeTotal = 0;
        for(Cliente c: clientes)
            importeTotal += c.importeFactura();

        return importeTotal;
    }
}
