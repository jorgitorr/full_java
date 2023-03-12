/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ObjectAndStatic;

/**
 *
 * @author jorge
 */
public class Account {
    private int accountNumber;
    private double balance;
    private String name;
    private static int numAccounts;

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        numAccounts++;
    }

    public Account(int accountNumber) {
        this(accountNumber, 0);
        numAccounts++;
    }
    
    

    public static int getNumAccounts() {
        //le tengo que restar uno para que no te cuente la clase que usa
        //el método
        return numAccounts-1;
    }

    
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public void credit(double amount){
        balance += amount;
    }
    
    public void debit(double amount){
        if(balance>=amount)
            balance -= amount;
        else
            System.out.println("Amount witthdrawn exceeds "
                    + "the current balance!");
    }

    @Override
    public String toString() {
        return "A/C no:" + accountNumber + ", balance=$" + balance;
    }
    
    
    
    public void close(){
        numAccounts--;
        name += "CLOSED";
        setBalance(0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
    public static Account consolidate(Account a1, Account a2){
        if(!a1.getName().equals(a2.getName()) && a1.getAccountNumber()!=a2.getAccountNumber()){
            Account a3 = new Account(3,a1.getBalance()+a2.getBalance());
            return a3;
        }
        return null;
    }
    
    public void transfer(Account acct, double amount){
        acct.balance += amount;
        this.balance -= amount;
    }
    
    public static void transfer(Account acct1, Account acct2, double amount){
        acct1.balance -= amount;
        acct2.balance += amount;
    }
    
}
