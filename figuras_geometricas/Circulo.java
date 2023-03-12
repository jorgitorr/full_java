/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras_geometricas;

/**
 *
 * @author jorge
 */
public class Circulo {
    private Punto centro;
    private double radio;

    public Circulo() {
        this(new Punto(0,0),1);
    }

    public Circulo(int x, int y, double radio){
        this(new Punto(x,y),radio);
    }
    
    public Circulo(Punto centro, double radio) {
        this.centro = centro;
        this.radio = radio;
    }

    public Punto getCentro() {
        return centro;
    }

    public void setCentro(Punto centro) {
        this.centro = centro;
    }

    public void setCentro(int x, int y) {
        setCentro(new Punto(x,y));
    }
        
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getArea(){
        return Math.PI*radio*radio;
    }
    
    public double getCircunsferencia(){
        return Math.PI*2*radio;
    }
    public double distancia (Circulo unCirculo){
        return centro.distancia(unCirculo.getCentro()); 
    }
    @Override
    public String toString() {
        return "Circulo{" + "centro=" + centro + ", radio=" + radio + '}';
    }
}
