/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad14;

/**
 *
 * @author jorgearru
 */
public class TestCircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GeometricObject go = new Circle(5);
        System.out.println(go);
        System.out.println(go.getPerimeter());
        System.out.println(go.getArea());

    }
    
}
