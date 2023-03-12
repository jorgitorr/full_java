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
public class e15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena1 = "", cadena2 = "";
        boolean mayor = false;
        
        System.out.println("Introduce una cadena");
        cadena1 = sc.nextLine();
        System.out.println("Introduce otra cadena");
        cadena2 = sc.nextLine();
        
        for(int i=0; i<cadena1.length(); i++){
            if(cadena1.toLowerCase().charAt(i)<cadena2.toLowerCase().charAt(i)){
                mayor = true;
                break;
            }else{
                mayor = false;
                break;
            }
        }
        
        //considerando las mayus
        System.out.println("Sin considerar las mayus");
        if(mayor)
            System.out.print(cadena1 + " es la primera");
        else
            System.out.print(cadena2 + " es la primera");
        
        //sin considerar las mayus
        for(int i=0; i<cadena1.length(); i++){
            if(cadena1.charAt(i)<cadena2.charAt(i)){
                mayor = true;
                break;
            }else{
                mayor = false;
                break;
            }
        }
        
        System.out.println("considerando las mayus");
        if(mayor)
            System.out.print(cadena1 + " es la primera");
        else
            System.out.print(cadena2 + " es la segunda");
    }
    
}
