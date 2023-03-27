/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad_10;

/**
 *
 * @author jorgearru
 */
public class Rectangle extends Shape{
    protected double width;
    protected double lenght;

    public Rectangle() {
        this(1,1);
    }

    public Rectangle(double width, double lenght) {
        super();
        this.width = width;
        this.lenght = lenght;
    }

    public Rectangle(double width, double lenght, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.lenght = lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }
    
    @Override
    public double getArea() {
        return lenght * width;
    }

    @Override
    public double getPerimeter() {
        return lenght*2+width*2;
    }

    @Override
    public String toString() {
        return super.toString() + "width=" + width + ", lenght=" + lenght;
    }
    
    
    
}
