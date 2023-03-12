/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ObjectAndStatic;

/**
 *
 * @author jorge
 */
public class TestAccounts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Account a1 = new Account(1,5);
        Account a2 = new Account(2,7);
        System.out.println(Account.getNumAccounts());
        
        Account account;
        int num=3;
        for (int i = 0; i < 10; i++) {
            account = new Account(num,100);
            num++;
        }
        
        System.out.println(Account.getNumAccounts());
        
        a1.setName("down");
        a2.setName("fall");
        Account a3 = Account.consolidate(a1, a2);
        System.out.println("a3 balance: " + a3.getBalance());
        
        Account a5 = new Account(13,100);
        System.out.println("a5 balance: " + a5.getBalance());
        a5.transfer(a3, 20);
        System.out.println("a3 balance despues de transferencia de 20: " + a3.getBalance());
        System.out.println("a5 balance despues de transferencia de 20: " + a5.getBalance());
    }
    
}
