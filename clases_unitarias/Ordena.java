/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases_unitarias;

import java.util.Arrays;
/**
 *
 * @author jorgearru
 */
public class Ordena {
    public static void main(String[] args) {
        double[]numeros = {32.0,45,12.2,28.4,76.3, 2.1, 53, 31.4, 29.5};
        
        System.out.println("Antes de la ordenacion: ");
        System.out.println(Arrays.toString(numeros));
        
        Arrays.sort(numeros);
        
        System.out.println("rellenar el array con 2: ");
        //Arrays.fill(numeros, 2);
        System.out.println(Arrays.toString(numeros));
        System.out.println("Despues de la ordenacion: ");
        System.out.println(Arrays.toString(numeros));
        System.out.println("Index of de arrays: ");
        System.out.println(Arrays.binarySearch(numeros, 5));
    }
}
