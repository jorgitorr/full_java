/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package objetos.ejercicios_III.tiempo;

/**
 *
 * @author jorge
 */
public class PruebaPrediccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dia dia1 = new Dia(10,30,'n');
        Dia dia2 = new Dia(2,20,'s');
        Dia dia3 = new Dia();
        
        
        Prediccion prediccion = new Prediccion(dia1, dia2, dia3);
        prediccion.modificarPrevisionDia(3);
        
        System.out.println(dia1.getMinTemp() + " " + dia1.getMaxTemp());
        prediccion.mostrarDia(1);
        prediccion.mostrarDia(2);
        prediccion.mostrarDia(3);
        
        System.out.println("Temperatura actual del día 1: ");
        prediccion.modificarActual(1);
        prediccion.mostrarPrediccion();
    }
    
}
