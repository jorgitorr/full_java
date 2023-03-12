/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras_geometricas;

/**
 *
 * @author jorge
 */
public class Punto {
    private int x;
    private int y;

    public Punto() {
        this(0,0);
    }

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return  "(" + x + "," + y + ')';
    }
   
    public double distancia(){
        return distancia(0,0);
    }
    
    public double distancia(int x, int y){
        int xDiff = this.x - x;
        int yDiff = this.y - y;
            
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }
    
    public double distancia (Punto otroPunto){
        return distancia(otroPunto.getX(),otroPunto.getY());
    }
    
    public static void main(String[] args) {
        // Test program to test all constructors and public methods
        Punto p1 = new Punto();                     // Test constructor
        System.out.println(p1);                     // Test toString()
        p1.setX(8);                                 // Test setters
        p1.setY(6);
        System.out.println("x is: " + p1.getX());   // Test getters
        System.out.println("y is: " + p1.getY());
        p1.setX(3);                                 // Test setters
        p1.setY(0);                           
        System.out.println(p1);                     // Test toString()

        Punto p2 = new Punto(0, 4);                 // Test another constructor
        System.out.println(p2);
        
        // Testing the overloaded methods distance()
        System.out.println("diatancia: " + p1.distancia(p2));   
        System.out.println("diatancia: " + p2.distancia(p1));   
        System.out.println("diatancia: " + p1.distancia(5, 6));  
        System.out.println("diatancia: " + p1.distancia());      
    }
}
