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
public class e12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contadorLetras = 0;
        String nCadena = "";
        System.out.println("Introduce una cadena");
        String cadena = sc.nextLine();
        System.out.println("Introduce una letra");
        char letra = sc.nextLine().charAt(0);
        
        
        for(int i=0; i<cadena.length(); i++){
            if(cadena.charAt(i)==letra){
                contadorLetras++;
            }else{
                nCadena += cadena.charAt(i);
            }
        }
        
        System.out.println(nCadena + ", con " + contadorLetras + " " + letra + " repetidas");
        
    }
    
}
