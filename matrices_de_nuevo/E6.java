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
public class E6 {
    private int[][]matriz;
    private int diagIzq;
    private int diagDer;
    
    public E6(int num) {
        this.matriz = new int[num][num];
        diagIzq = 1;
        diagDer = 1;
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
    
    private int multDiagonalIzq(){
        for(int i=0; i<matriz.length; i++){
            diagIzq *= matriz[i][i];
        }
        return diagIzq;
    }
    
    
    private int multDiagonalDer(){
        for(int i=0; i<matriz.length; i++){
            for(int j=matriz.length-1; j>=0; j--){
                diagDer *= matriz[i][j];
            }
        }
        return diagDer;
    }
    
    
    
    
    public static void main(String[] args) {
        E6 e = new E6(4);
        int resultado = 0;
        e.setMatriz();
        e.imprimirMatriz();
        resultado = e.multDiagonalIzq() - e.multDiagonalDer();
        System.out.println(e.diagIzq + "-" + e.diagDer);
        System.out.println(resultado);
    }
    
}
