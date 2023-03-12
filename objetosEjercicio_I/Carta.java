/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package objetosEjercicio_I;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Carta {
    private int numero;
    private char palo;

    public Carta(Carta unaCarta) {
        numero = unaCarta.numero;
        palo = unaCarta.palo;
    }

    public Carta() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero() {
        Scanner sc = new Scanner(System.in);
        int num;
        do{
            System.out.println("Introduce un numero(num>0&num<14) ");
            num = sc.nextInt();
        }while(num<1 || num>13);
        this.numero = num;
    }

    public char getPalo() {
        return palo;
    }

    public void setPalo() {
        Scanner sc = new Scanner(System.in);
        char pal;
        do{
            System.out.println("Introduce un palo(c|p|r|t)");
            pal = sc.nextLine().charAt(0);
        }while(pal!='c'&&pal!='p'&&pal!='r'&&pal!='t');
        this.palo = pal;
    }

    @Override
    public String toString() {
        return "Carta{" + "numero=" + numero + ", palo=" + palo + '}';
    }

    public void mostrarCarta(){ 
        System.out.print("es el ");
        switch(numero){
            case 1:
                System.out.print("As");
                break;
            case 11:
                System.out.print("Jack");
                break;
            case 12:
                System.out.print("Reina");
                break;
            case 13:
                System.out.print("Rey");
                break;
            default:
                System.out.print(numero);
                break; 
        }
        
        System.out.print(" de ");
        
        switch(palo){
            case 'c':
                System.out.print("corazones");
                break;
            case 'p':
                System.out.print("picas");
                break;
            case 'r':
                System.out.print("rombos");
                break;
            case 't':
                System.out.print("treboles");
                break;
            default:
                System.out.print(palo);
                break;
        }
        System.out.println();
    }
    
    private int comparar(Carta carta){
        int ganador = 0;
        if(numero>carta.numero){
            ganador = -1;
        }else if(numero<carta.numero){
            ganador = 1;
        }else{
            //comparo el codigo ASCI
            if(palo>carta.palo){
                ganador = -1;
            }else if(palo<carta.palo){
                ganador = 1;
            }
        }
        return ganador;
    }
    
    public void mostrarGanador(Carta carta){
        if(comparar(carta)==-1){
            mostrarCarta();
        }else if(comparar(carta)==1){
            carta.mostrarCarta();
        }else if(comparar(carta)==0){
            System.out.println("Han empatado");
        }
    }
    
    public static void main(String[] args) {
        Carta carta1 = new Carta();
        Carta carta2 = new Carta(carta1);
        carta1.mostrarCarta();
        carta2.mostrarCarta();
        
        carta1.mostrarGanador(carta2);
        
        carta1.setNumero();
        carta1.setPalo();
        
        carta2.setNumero();
        carta2.setPalo();
        
        System.out.print("La carta ganadora es: ");
        carta1.mostrarGanador(carta2);
    }
    
}
