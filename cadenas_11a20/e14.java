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
public class e14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabraHaciaAtras = "", palabraHaciaAlante = "", palabra = "";
        
        System.out.println("Introduce una frase");
        palabra = sc.nextLine();
        
        for(int i=0; i<=palabra.length()-1; i++){
            if(palabra.charAt(i)!=' ')
                palabraHaciaAlante += palabra.charAt(i);
        }
        
        for(int i=palabra.length()-1; i>=0; i--){
            if(palabra.charAt(i)!=' ')
                palabraHaciaAtras += palabra.charAt(i);
        }
        
        if(palabraHaciaAlante.equals(palabraHaciaAtras))
            System.out.println("Iguales");
        else
            System.out.println("Diferentes");
    }
    
}
