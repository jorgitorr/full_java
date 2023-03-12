/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cadenas_11a20;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class e19 {

    
    public boolean getTerminar(String cadena, String cadenaTerminar){
        if(cadena.endsWith(cadenaTerminar))
            return true;
        return false;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena, cadenaTerminar;
        System.out.println("Introduce una cadena");
        cadena = sc.nextLine();
        System.out.println("Introduce la cadena con la que debe terminar");
        cadenaTerminar = sc.nextLine();
        
        
        e19 nuevo = new e19();
        System.out.println(nuevo.getTerminar(cadena, cadenaTerminar));
    }
    
}
