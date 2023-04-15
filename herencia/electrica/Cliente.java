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
        double costeTerminoFijo = 1;

        if(potenciaContratada<3.4)
            costeTerminoFijo = 5;
        else if(potenciaContratada<=6.4 && potenciaContratada>=3.4)
            costeTerminoFijo = 7;
        else if(potenciaContratada>6.4)
            costeTerminoFijo = 6.4;

        return costeTerminoFijo + energiaConsumida * potenciaContratada;
    }
}
