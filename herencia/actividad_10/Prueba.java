/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad_10;

/**
 *
 * @author jorgearru
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Shape s1 = new Circle(5.5,"RED",false);
        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        
        Circle c1 = (Circle)s1;//convertiendo figura a círculo
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());
        
        //las clases abstractas no pueden ser instanciadas
        //por eso no puedo hacer un new Figura()
        
        //Figura f1 = new Cuadrado() -> solo coge los metodos que comparte cuadrado
        //con figura
        
        
        
    }
    
}
