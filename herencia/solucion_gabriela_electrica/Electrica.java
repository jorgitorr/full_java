package solucion_gabriela_electrica;

import java.util.HashSet;
import java.util.Set;

public class Electrica { 
    private Set<Cliente> clientes;

    public Electrica() {
        this.clientes = new HashSet<>();
    }
    
    public void agregaCliente(Cliente nuevoCliente){
        clientes.add(nuevoCliente);
    }
    
    public int getCantidadClientePaneles(){
        int i = 0;
        for (Cliente c: clientes)
            if (c instanceof ClientePaneles)
                i++;
        return i;
    }
    
    public double getFacturacionTotal(){
        double total = 0;
        for (Cliente c: clientes)
            total += c.importe();
        return total;
    }
}
