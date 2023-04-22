package solucion_gabriela_electrica;

import java.util.Objects;

public class Cliente {
    private double contadorEnergia; //última lectura contador
    private double energiaConsumidaMes;
    private double potenciaContratada;
    private String dni;

    public Cliente(String dni, double potenciaContratada) {
        this.potenciaContratada = potenciaContratada;
        this.dni = dni;
        this.energiaConsumidaMes = 0;
        this.contadorEnergia = 0;
    }
        
    public void actualizarEnergiaConsumida(double nuevaLectura){
        energiaConsumidaMes = nuevaLectura - contadorEnergia;
        contadorEnergia = nuevaLectura;
    }
    
    public double importe(){
        double importe = 0;
        if (potenciaContratada < 3.4)
            importe = 5 + energiaConsumidaMes*0.00138;  //Usar constantes
        else if (potenciaContratada >= 3.4 && potenciaContratada<6.4)
            importe = 7 + energiaConsumidaMes*0.000276;            
        else if (potenciaContratada > 6.4)
            importe = 9 + energiaConsumidaMes*0.01104;             
        return importe;
     
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        return Objects.equals(this.dni, other.dni);
    }
    
    
}   
