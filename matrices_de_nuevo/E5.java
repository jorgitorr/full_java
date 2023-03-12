/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrices_de_nuevo;

import static java.util.Arrays.asList;
import java.util.Random;

/**
 *
 * @author jorge
 */
public class E5 {

    private static int[][]matriz;
    private static int[][]matrizTranspuesta;
    private int max;
    private int min;

    public E5() {
        this.matriz = new int[6][10];
        this.matrizTranspuesta = new int[10][6];
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
    
    private void imprimirMatriz(int[][]matriz){
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[0].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    
    private void rellenaTranspuesta(){
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[0].length; j++){
                matrizTranspuesta[j][i] = matriz[i][j];
            }
        }
    }
    

    public static void main(String[] args) {
        E5 e = new E5();
        e.setMatriz();
        e.rellenaTranspuesta();
        e.imprimirMatriz(matriz);
        System.out.println();
        e.imprimirMatriz(matrizTranspuesta);
        
    }
    
}
