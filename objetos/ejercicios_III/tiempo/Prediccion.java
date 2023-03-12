/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos.ejercicios_III.tiempo;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Prediccion {
    private Dia dia1;
    private Dia dia2;
    private Dia dia3;

    public Prediccion(Dia dia1, Dia dia2, Dia dia3) {
        this.dia1 = new Dia(dia1.getMinTemp(),dia1.getMaxTemp(),dia1.getEstado());
        this.dia2 = new Dia(dia2.getMinTemp(), dia2.getMaxTemp(), dia2.getEstado());
        this.dia3 = new Dia(dia3.getMinTemp(), dia3.getMaxTemp(), dia3.getEstado());
    }

    @Override
    public String toString() {
        return "Prediccion{" + "dia1=" + dia1 + ", dia2=" + dia2 + ", dia3=" + dia3 + '}';
    }
    
    public void mostrarDia(int dia){
        switch(dia){
            case 1:
                dia1.mostrar_prediccion();
                break;
            case 2:
                dia2.mostrar_prediccion();
                break;
            case 3:
                dia3.mostrar_prediccion();
                break;
        }
    }
    
    public void modificarPrevisionDia(int dia){
        Scanner sc = new Scanner(System.in);
        int temperaturaMin, temperaturaMax;
        char estado;
        
        switch(dia){
            case 1:
                System.out.println("---------DIA 1---------");
                
                System.out.println("Introduce la min temperatura: ");
                temperaturaMin = sc.nextInt();
                dia1.setMinTemp(temperaturaMin);
                
                System.out.println("Introduce la max temperatura: ");
                temperaturaMax = sc.nextInt();
                dia1.setMaxTemp(temperaturaMax);
                sc.nextLine();
                
                System.out.println("Introduce el estado: ");
                estado = sc.nextLine().charAt(0);
                dia1.setEstado(estado);
                break;
            case 2:
                System.out.println("---------DIA 2---------");
            
                System.out.println("Introduce la min temperatura: ");
                temperaturaMin = sc.nextInt();
                dia2.setMinTemp(temperaturaMin);

                System.out.println("Introduce la max temperatura: ");
                temperaturaMax = sc.nextInt();
                dia2.setMaxTemp(temperaturaMax);
                sc.nextLine();
                System.out.println("Introduce el estado: ");
                estado = sc.nextLine().charAt(0);
                dia2.setEstado(estado);
                break;
            case 3:
                System.out.println("---------DIA 3---------");
            
                System.out.println("Introduce la min temperatura: ");
                temperaturaMin = sc.nextInt();
                dia3.setMinTemp(temperaturaMin);

                System.out.println("Introduce la max temperatura: ");
                temperaturaMax = sc.nextInt();
                dia3.setMaxTemp(temperaturaMax);
                sc.nextLine();
                System.out.println("Introduce el estado: ");
                estado = sc.nextLine().charAt(0);
                dia3.setEstado(estado);
                break;
        }
    }
    
    
    public void modificarActual(int dia){
        int temperatura;
        Scanner sc = new Scanner(System.in);
        switch(dia){
            case 1:
                dia1.temperaturaActual();
                break;
            case 2:
                dia2.temperaturaActual();
                break;
            case 3:
                dia3.temperaturaActual();
                break;
        }
    }
    
    
    public void mostrarPrediccion(){
        System.out.println("----DIA 1----");
        dia1.mostrar_prediccion();
        System.out.println("----DIA 2----");
        dia2.mostrar_prediccion();
        System.out.println("----DIA 3----");
        dia3.mostrar_prediccion();
    }

}
