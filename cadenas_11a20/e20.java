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
public class e20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nCadena = "", cadena = "";
        int dividir;
        
        System.out.println("Introduce la cadena");
        cadena = sc.nextLine();
        System.out.println("En cuantas partes quieres dividir la cadena");
        dividir = sc.nextInt();
        
        for (int i = 0; i < cadena.length(); i++) {
            if(i%dividir==0 && i!=0)
                nCadena+=" ";
            
            nCadena+=cadena.charAt(i);
        }
        
        System.out.println(nCadena);
        
    }
    
}
