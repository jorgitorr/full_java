/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases_unitarias;

import java.util.Scanner;

/**
 *
 * @author jorgearru
 */
public class PrintArrayInStarts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la cantidad: ");
        int cantidad = sc.nextInt();
        int[]vector = new int[cantidad];
        for(int j=0; j<vector.length; j++){
            System.out.print("Introduce vector");
            vector[j] = sc.nextInt();
        }
        
        
        String caracter = "*";
        int i = 0;
        
        for(int num: vector){
            System.out.println(i + ": " + caracter.repeat(num) 
                    + "(" + num + ")");
            i++;
        }
        
        
        
    }
}
