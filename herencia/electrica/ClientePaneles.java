package electrica;

public class ClientePaneles extends Cliente{
    private double energiaInyectada;
    private double contadorEnergiaInyectada;

    public ClientePaneles(String dni, int potenciaContratada) {
        super(dni, potenciaContratada);
        this.energiaInyectada = 0;
        this.contadorEnergiaInyectada = 0;
    }

    public double getEnergiaInyectada() {
        return energiaInyectada;
    }

    public double getContadorEnergiaInyectada() {
        return contadorEnergiaInyectada;
    }

    public void actualizaEnergiaInyectada(double nuevaLecturaContador){
        this.contadorEnergiaInyectada -= nuevaLecturaContador;
        this.energiaInyectada = nuevaLecturaContador;
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
        return super.importeFactura() - energiaInyectada*0.0034;
    }

    @Override
    public String toString() {
        return super.toString() + " energiaInyectada=" + energiaInyectada + ", contadorEnergiaInyectada="
                + contadorEnergiaInyectada;
    }



}
