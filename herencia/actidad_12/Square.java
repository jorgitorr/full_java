/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actidad_12;

/**
 *
 * @author jorgearru
 */
public class Square extends Rectangle{

    public Square() {
        super();
    }

    public Square(double side) {
        super(side,side);
    }

    public double getSide() {
        double side = 0;
        if(width==lenght)
            side = width;
        else
            System.out.println("Error, los valores del cuadrado están mal");
        
        return side;
    }

    public void setSide(double side) {
        this.width = side;
        this.lenght = side;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    
}
