package ficheros_IV;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio1 {

    public static void copiarFicheros(String f1, String f2){
        try (BufferedReader br1 = new BufferedReader(new FileReader("UD10.Ficheros/"+f1));
        BufferedReader br2 = new BufferedReader(new FileReader("UD10.Ficheros/"+f2));
        BufferedWriter bw = new BufferedWriter(new FileWriter("UD10.Ficheros/"+f1.substring(0, 1)+"_"+f2.substring(0, 1) + ".txt"));) {
            String cadena1;
            String cadena2;

            while((cadena1=br1.readLine())!=null)
                bw.write(cadena1);

            while((cadena2=br2.readLine())!=null)
                bw.write(cadena2);


        } catch (IOException e) {
            System.err.println("Error al leer");
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer fichero: ");
        String fichero1 = sc.nextLine();
        System.out.println("Introduce el segundo fichero: ");
        String fichero2 = sc.nextLine();

        Ejercicio1.copiarFicheros(fichero1, fichero2);
    }
}
