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
public class e16 {
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String cadena = "";
        
        System.out.println("Introduce una cadena");
        cadena = sc.nextLine();
        
        for(int i=1; i<9; i++){
            switch(i){
                case 1:
                    System.out.println(ANSI_BLACK + cadena);
                    break;
                case 2:
                    System.out.println(ANSI_RED + cadena);
                    break;
                case 3:
                    System.out.println(ANSI_GREEN + cadena);
                    break;
                case 4:
                    System.out.println(ANSI_YELLOW + cadena);
                    break;
                case 5:
                    System.out.println(ANSI_BLUE + cadena);
                    break;
                case 6:
                    System.out.println(ANSI_PURPLE + cadena);
                    break;
                case 7:
                    System.out.println(ANSI_CYAN + cadena);
                    break;
                case 8:
                    System.out.println(ANSI_WHITE + cadena);
                    break;
            }
        }
    }
    
}
