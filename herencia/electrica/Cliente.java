package electrica;

public class Cliente {
    private String dni;
    private static double contadorEnergiaConsumida;
    private double potenciaContratada;
    private double energiaConsumida;

    public Cliente(String dni, double potenciaContratada) {
        this.dni = dni;
        this.potenciaContratada = potenciaContratada;
        this.energiaConsumida = 0;
        contadorEnergiaConsumida++;
    }

    public String getDni() {
        return dni;
    }

    public static double getContadorEnergiaConsumida() {
        return contadorEnergiaConsumida;
    }

    public double getPotenciaContratada() {
        return potenciaContratada;
    }

    public double getEnergiaConsumida() {
        return energiaConsumida;
    }

    public void actualizaEnergiaConsumida(double nuevaLecturaContador){
        contadorEnergiaConsumida -= nuevaLecturaContador;
        energiaConsumida = nuevaLecturaContador;
    }


    public double importeFactura(){
        double importe = 0;
        if (potenciaContratada < 3.4)
            importe = 5 + energiaConsumida*0.00138;  //Usar constantes
        else if (potenciaContratada >= 3.4 && potenciaContratada<6.4)
            importe = 7 + energiaConsumida*0.000276;            
        else if (potenciaContratada > 6.4)
            importe = 9 + energiaConsumida*0.01104;             
        return importe;
    }

    @Override
    public String toString() {
        return dni + ", potenciaContratada=" + potenciaContratada + ", energiaConsumida="
                + energiaConsumida;
    }


    
}
