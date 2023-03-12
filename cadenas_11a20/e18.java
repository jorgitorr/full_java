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
public class e18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena = "", palabra = "";
        boolean contiene = false;
        int apariciones = 0, letras = 0;
        
        System.out.println("Introduce una cadena");
        cadena = sc.nextLine();
        System.out.println("Introduce la palabra que contiene");
        palabra = sc.nextLine();
        
        
        if(cadena.contains(palabra))
            contiene = true;
        
        if(contiene){
            int i = 0;
            int j = 0;
            while(i<cadena.length()-1){
                if(palabra.charAt(j) == cadena.charAt(i)){
                    letras++;
                    j++;
                }else{
                    i++;
                }
                
                if(letras==palabra.length()){
                    apariciones++;
                    letras = 0;
                    j = 0;
                }
            }
            
        }else
            System.out.println("La cadena no contiene la palabra");
        
        System.out.println(palabra + " aparece " + apariciones + " veces en \"" + cadena + "\"");
    }
    
}
