/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos.ejercicios_III.tiempo;

/**
 *
 * @author jorgearru
 */
public class Hora {
    private int hora;
    private int minuto;
    private int segundo;

    public Hora(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public Hora() {
        this(0,0,0);
    }

    @Override
    public String toString() {
        return "Hora{" + "hora=" + hora + ", minuto=" + minuto + ", segundo=" + segundo + '}';
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        while(hora>24){
            hora-=24;
        }
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        while(minuto>60){
            hora++;
            minuto -= 60;
        }
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        while(segundo>60){
            minuto++;
            segundo -= 60;
        }
        this.segundo = segundo;
    }
    
    
    public void mostrarHora24(){
        while(hora>24){
            hora-=24;
        }
        
        while(minuto>60){
            hora++;
            minuto -= 60;
        }
        
        while(segundo>60){
            minuto++;
            segundo = 0;
        }
        
        if(hora>12 && hora<19){
            System.out.println("Son las " + hora + " horas " 
                + minuto + " minutos y " + segundo + " segundos de la tarde" );
        }else{
            System.out.println("Son las " + hora + " horas " 
                + minuto + " minutos y " + segundo + " segundos de la mañana" );
        }
    }
    
    public void mostrarHora12(){
        while(hora>12){
            hora-=12;
        }
        
        while(minuto>60){
            hora++;
            minuto -= 60;
        }
        
        while(segundo>60){
            minuto++;
            segundo = 0;
        }
        
        if(hora>0 && hora<7){
            System.out.println("Son las " + hora + " horas " + minuto + 
                " minutos y " + segundo + " segundos de la mañana");
        }else{
            System.out.println("Son las " + hora + " horas " + minuto + 
                " minutos y " + segundo + " segundos de la tarde");
        }
    }
    
    
    
}
