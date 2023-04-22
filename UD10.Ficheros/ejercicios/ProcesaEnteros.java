package ejercicios;

import java.util.Scanner;

public class ProcesaEnteros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numeros;
        int suma = 0;
        int[]enteros;

        numeros = sc.nextLine();
        String[]num = numeros.split(" ");
        enteros = new int[num.length];

        try{

            for(int i=0; i<num.length; i++){
                enteros[i] = Integer.parseInt(num[i]);
                suma += enteros[i];
            }

            System.out.println(suma);
        }catch(NumberFormatException e){
            System.err.println("Que hase? No es un entero");
        }finally{
            System.out.println("EEEE, a que estoy wapo");
        }


    }
}
