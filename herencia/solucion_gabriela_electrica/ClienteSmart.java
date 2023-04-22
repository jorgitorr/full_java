package solucion_gabriela_electrica;

public class ClienteSmart extends Cliente{
    private int porcentajeDescuento;

    public ClienteSmart(String dni,double potenciaContratada,int porcentajeDescuento) {
        super(dni,potenciaContratada);
        this.porcentajeDescuento = porcentajeDescuento;
    }
    
    @Override
    public double importe(){
        return super.importe()* (super.importe()-porcentajeDescuento)/100;
    }
    
}
