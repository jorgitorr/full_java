package solucion_gabriela_electrica;

public class ClientePaneles extends Cliente{

    private double energiaInyectadaMes;
    private double contadorEnergiaInyectada;

    public ClientePaneles(String dni, double potenciaContratada) {
        super(dni,potenciaContratada);
        this.energiaInyectadaMes = 0;
        this.contadorEnergiaInyectada = 0;
    }
    
    public void actualizarEnergiaInyectada(double nuevaLectura){
        energiaInyectadaMes = nuevaLectura - contadorEnergiaInyectada;
        contadorEnergiaInyectada = nuevaLectura;      
    }
    
    
    @Override
    /**
     * La energia inyectada se resta del importa a pagar
     */
    public double importe(){
        return super.importe()-energiaInyectadaMes*0.0034;
    }
}
