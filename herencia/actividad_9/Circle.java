/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package actividad_9;

/**
 *
 * @author jorgearru
 */
public class Circle extends Shape{
    private double radius;

    
    public Circle(double radius) {
        super();//hereda
        this.radius = radius;
    }
    
    public Circle() {
        this(1.0);
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getArea(){
        return Math.PI*Math.pow(radius, 2);
    }
    
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {//cambiar toString() + "" + radius
        return "Un circulo con radio=" + radius + ", que es subclase de " 
                + super.toString();
    }

}
