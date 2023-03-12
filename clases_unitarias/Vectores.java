/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases_unitarias;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *
 * @author jorgearru
 */
public class Vectores {
    public static boolean contiene(int[]vector, int num){
        boolean resultado = false;
        
        for(int i=0; i<vector.length; i++){
            if(num==vector[i])
                resultado = true;
        }
        return resultado;
    }
    
    public static int[] copiaDe(int[]array, int newLength){
        array = new int[newLength];
        return array;
    }
    
    public static int busca(int[]vector, int num){
        int pos = -1;
        for(int i= 0; i<vector.length; i++){
            if(vector[i]==num)
                pos = i;
        }
        return pos;
    }
    
    public static boolean iguales(int[]v1, int[]v2){
        boolean iguales = false;
        
        if(Arrays.equals(v1, v2)){
            iguales = true;
        }
        return iguales;
    }
    
    public static int[] copiaDe(int[]array){
        return array;
    }
    
    public static void main(String[] args) {
        Vectores v = new Vectores();
        int[]vector1 = {5,8,3,9};
        int[]vector2 = {5,8,2,9};
        
        System.out.println(busca(vector1, 8));
        System.out.println(contiene(vector1, 0));
        System.out.println(busca(vector1, 2));
        System.out.println("vector 1: " + Arrays.toString(vector1));
        System.out.println("vector 2: " + Arrays.toString(vector2));
        System.out.println("Son iguales vector 1 y 2: " + iguales(vector1, vector2));
        int[]vector3 = copiaDe(vector2);
        System.out.println("vector 3, copia del 2: " + Arrays.toString(vector3));
        int[]vector5 = copiaDe(vector3, 5);//no entiendo para que le pasa un array como parametro
        System.out.println("vector con tamanio 5: " + Arrays.toString(vector5));
        int[]vector4 = Arrays.copyOf(vector3, 5);
        System.out.println("copy of: " + Arrays.toString(vector4));
    }
}
