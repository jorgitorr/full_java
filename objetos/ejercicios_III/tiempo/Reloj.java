/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos.ejercicios_III.tiempo;

import java.util.Scanner;

/**
 *
 * @author jorgearru
 */
public class Reloj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int opcion;
        Hora hora = new Hora(15,87,54);
        do{
            System.out.println("Reloj");
            System.out.println("------");
            System.out.println("1. Mostrar hora 12");
            System.out.println("2. Mostrar horas 24");
            System.out.println("3. Modificar horas");
            System.out.println("4. Modificar minutos");
            System.out.println("5. Modificar segundos");
            System.out.println("6. Salir.");
            opcion = sc.nextInt();
            
            switch(opcion){
                case 1:
                    hora.mostrarHora12();
                    break;
                case 2:
                    hora.mostrarHora24();
                    break;
                case 3:
                    System.out.println("Introduce la hora");
                    int horaI = sc.nextInt();
                    hora.setHora(horaI);
                    break;
                case 4:
                    System.out.println("Introduce los minutos");
                    int minutoI = sc.nextInt();
                    hora.setMinuto(minutoI);
                    break;
                case 5:
                    System.out.println("Introduce los segundos");
                    int segundoI = sc.nextInt();
                    hora.setSegundo(segundoI);
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("El número que has introducido "
                            + "no está disponible");
                    break;
            }
        }while(opcion!=6);
    }
}
