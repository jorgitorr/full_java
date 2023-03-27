/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actidad_12;

/**
 *
 * @author jorgearru
 */
public class Circle implements Shape{
    protected double radius;

    public Circle() {
        this(1);
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return (2*Math.PI) * radius;
    }

    @Override
    public String toString() {
        return "radius=" + radius + '}';
    }
    
}
