/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad14;

/**
 *
 * @author jorgearru
 */
public class TestResizableCircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Resizable rs = new ResizableCircle(40);
        System.out.println(rs);
        rs.resize(10);
        System.out.println(rs);
        
        Circle c2 = new ResizableCircle(15);
        System.out.println(c2.getArea());
        System.out.println(c2.getPerimeter());
        ((Resizable)c2).resize(98);
        System.out.println(c2);
    }
    
}
