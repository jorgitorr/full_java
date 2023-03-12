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
public class E2 {

    int[][]matriz;

    public E2() {
        this.matriz = new int[10][10];
    }
    
    private void setMatriz(){
        Random rnd = new Random();
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[0].length; j++){
                matriz[i][j] = rnd.nextInt(10)+1;
            }
        }
    }
    
    
    private void imprimeMatriz(){
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[0].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    private void buscaNumero(int numero){
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[0].length; j++){
                if(matriz[i][j]==numero)
                    System.out.print("fil: " + (i+1) + " col: " + (j+1) + "\n");
            }
        }
    }
    

    public static void main(String[] args) {
        E2 e = new E2();
        e.setMatriz();
        e.imprimeMatriz();
        e.buscaNumero(5);
    }
    
}
