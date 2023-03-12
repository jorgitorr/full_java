/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrices_de_nuevo;

import java.util.Arrays;
import static java.util.Arrays.asList;
import java.util.Random;

/**
 *
 * @author jorge
 */
public class E4 {

    private static int[][]matriz;
    private int max;
    private int min;

    public E4() {
        this.matriz = new int[6][10];
        this.max = Integer.MIN_VALUE;
        this.min = Integer.MAX_VALUE;
    }
    
    
    private void setMatriz(){
        Random rnd = new Random();
        int num;
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[0].length; j++){
                do{
                    num = rnd.nextInt(1000);
                    matriz[i][j] = num;
                }while(asList(matriz).contains(num));
            }
        }
    }
    
    private void imprimirMatriz(){
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[0].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    
    private int max(){
        String pos = "";
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[0].length; j++){
                if(max<matriz[i][j])
                    max = matriz[i][j];
                    pos = i + " " + j;
            }
        }
        
        return max;
    }
    
    private int min(){
        String pos = "";
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[0].length; j++){
                if(min>matriz[i][j])
                    min = matriz[i][j];
            }
        }
        return min;
    }
    
    
    private void printPos(int m){
        for(int i=0;i<matriz.length; i++){
            for(int j=0; j<matriz[0].length; j++){
                if(matriz[i][j]==m)
                    System.out.println("La pos de " + m + " es: " + (i+1) + " " + (j+1));
            }
        }
    }
    
    
    public static void main(String[] args) {
        E4 e = new E4();
        e.setMatriz();
        e.imprimirMatriz();
        
        
    }
    
}
