/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia_interfaces;

/**
 *
 * @author jorgearru
 */
public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        super();
        this.radius = radius;
    }
    
    public Circle() {
        this(0);
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
    
    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return (2*Math.PI) * radius;
    }

    @Override
    public String toString() {
        return "radius=" + radius;
    }
    
    
    
}
