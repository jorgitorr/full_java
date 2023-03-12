/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrices_de_nuevo;

import java.util.Random;

/**
 *
 * @author jorge
 */
public class E3 {
    private int[][]matriz;
    private int max;
    private int min;

    public E3() {
        this.matriz = new int[6][10];
        this.max = Integer.MIN_VALUE;
        this.min = Integer.MAX_VALUE;
    }
    
    
    private void setMatriz(){
        Random rnd = new Random();
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[0].length; j++){
                matriz[i][j] = rnd.nextInt(1000);
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
        int max = 0, min = 0;
        E3 e = new E3();
        e.setMatriz();
        e.imprimirMatriz();
        max = e.max();
        min = e.min();
        e.printPos(max);
        e.printPos(min);
    }
    
}
