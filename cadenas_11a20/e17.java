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
public class e17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena;
        char letra;
        int apariciones = 0;
        
        System.out.println("Introduce una cadena");
        cadena = sc.nextLine();
        System.out.println("Introduce la letra");
        letra = sc.nextLine().charAt(0);
        
        System.out.println("la letra aparece por primera vez en la posicion " + cadena.indexOf(letra));
        
        for(int i=0; i<cadena.length(); i++){
            if(cadena.charAt(i)==letra){
                apariciones++;
            }
        }
        
        System.out.println("con una aparicion de " + apariciones);
        
    }
    
}
