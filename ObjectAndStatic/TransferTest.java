/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ObjectAndStatic;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author jorge
 */
public class TransferTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account a1 = new Account(1);
        Account a2 = new Account(2);
        String respuesta;
        
        a1.setBalance(20);
        a2.setBalance(40);
        
        /*
        while(true){
            System.out.println("Deseas transferir de la cuenta1 a la cuenta2: (Y/N)");
            respuesta = sc.nextLine();
            if(respuesta.equalsIgnoreCase("N"))
                break;
            else if(respuesta.equalsIgnoreCase("Y")){
                System.out.println("¿Cuanto deseas transferir?");
            int cantidad = sc.nextInt();
                a1.transfer(a2, cantidad);
                System.out.println("nuevo balance de a1: " + a2.getBalance());
            }
            sc.nextLine();
        }
        */
        System.out.println("-------version static--------");
        
        a1.setBalance(40);
        
        Account.transfer(a1, a2, 20);
        
        System.out.println("a1 balance: " + a1.getBalance());
        System.out.println("a2 balance: " + a2.getBalance());
        
    }
    
}
