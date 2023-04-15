package electrica;

public class ClienteSmart extends Cliente{
    private double porcentajeDescuento;
    
    public ClienteSmart(String dni, double potenciaContratada, int porcentajeDescuento) {
        super(dni, potenciaContratada);
        this.porcentajeDescuento = porcentajeDescuento;
    }

    
    @Override
    public double getEnergiaConsumida() {
        return super.getEnergiaConsumida();
    }


    @Override
    public void actualizaEnergiaConsumida(double nuevaLecturaContador) {
        super.actualizaEnergiaConsumida(nuevaLecturaContador);
    }


    @Override
    public double importeFactura() {
        return super.importeFactura()-(porcentajeDescuento*getEnergiaConsumida()/100);
    }


    
}
