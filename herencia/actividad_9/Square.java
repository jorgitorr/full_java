/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad_9;

/**
 *
 * @author jorgearru
 */
public class Square extends Rectangle{

    public Square() {
        super();
    }
    
    public Square(double side){
        super(side,side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }
    
    public void setSide(double side){
        /*si usara el del hijo llamaría a setSide y estaría
        en un bucle continuo (desbordamiento de pila (StackOverFlow))*/
        super.setWidth(side);
        super.setLength(side);
    }
    
    public double getSide(){
        return getLength();
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public String toString() {
        return "Un cuadrado con lado=" + getSide() + ", que es subclase"
                + " de " + super.toString();
    }
    
    public static void main(String[] args) {
        
    }
    
}
