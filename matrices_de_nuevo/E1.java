/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrices_de_nuevo;

import cadenas_11a20.e12;
import java.util.Random;

/**
 *
 * @author jorge
 */
public class E1 {
    private int[][]matriz;

    public E1() {
        this.matriz = new int[5][5];
    }
    
    
    public void setMatriz(){
        Random rnd = new Random();
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[0].length; j++){
                matriz[i][j] = rnd.nextInt(25)+1;
            }
        }
    }

    public void getMatriz() {
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[0].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
    
    public static void main(String[] args) {
        E1 e = new E1();
        e.setMatriz();
        e.getMatriz();
    }
    
}
