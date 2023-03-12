/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos.ejercicios_III.tiempo;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Dia {
    private int minTemp;
    private int maxTemp;
    private char estado;

    public Dia(int minTemp, int maxTemp, char estado) {
        this.minTemp = minTemp;
        this.maxTemp = maxTemp;
        this.estado = estado;
    }

    public Dia() {
        this(0,0,'s');
    }
    
    public Dia(Dia dia){
        minTemp = dia.minTemp;
        maxTemp = dia.maxTemp;
        estado = dia.estado;
    }

    public int getMinTemp() {
        return minTemp;
    }

    public int getMaxTemp() {
        return maxTemp;
    }

    public char getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return "Dia{" + "minTemp=" + minTemp + ", maxTemp=" + maxTemp + ", estado=" + estado + '}';
    }

    public void setMinTemp(int minTemp) {
        this.minTemp = minTemp;
    }

    public void setMaxTemp(int maxTemp) {
        this.maxTemp = maxTemp;
    }

    public void setEstado(char estado) {
        Scanner sc = new Scanner(System.in);
        while(estado!='s'&&estado!='n'&&estado!='l'){
            System.out.println("Introduce un estado entre(s|n|l)");
            estado = sc.nextLine().charAt(0);
        }
        this.estado = estado;
    }
    
    public void mostrar_prediccion(){
        System.out.println("Se espera un dia " + estado + " con "
        + "temperaturas maximas de " + maxTemp + " y minimas de " 
        + minTemp);
    }
    
    public void temperaturaActual(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la temperatura actual: ");
        int temperaturaActual = sc.nextInt();
        if(temperaturaActual>maxTemp)
            maxTemp = temperaturaActual;
        if(temperaturaActual<minTemp)
            minTemp = temperaturaActual;
    }
    
    
    
    
}
