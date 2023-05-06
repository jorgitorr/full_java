package ficheros_IV;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el fichero: ");
        String fichero = sc.nextLine();
        System.out.println("¿Cuantos numeros aleatorios quieres introducir?");
        int num = sc.nextInt();

        Random rnd = new Random();
        
        try(DataOutputStream de = new DataOutputStream(new FileOutputStream("UD10.Ficheros/"+fichero,true));
        DataInputStream di = new DataInputStream(new FileInputStream("UD10.Ficheros/"+fichero));){
            for(int i=0; i<num; i++){
                int numero = rnd.nextInt(101);
                de.writeInt(numero);
            }

            while(di.available()>0){
                int cadena = di.readInt();
                System.out.println(cadena);
            }
        } catch (IOException e) {
            System.err.println("Final del fichero");
        }

        
    }
}
