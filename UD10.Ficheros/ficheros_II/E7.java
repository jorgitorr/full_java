package ficheros_II;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class E7 {
    /**
     * 7. Desarrolla una aplicación que pida 3 ficheros por teclado y un entero. 
     * El programa leerá el contenido del primer fichero, escribirá tantos caracteres 
     * como indique el entero leído en el segundo fichero y el resto del primer archivo 
     * lo escribe en el tercer fichero. Si los ficheros existen se sobrescribirán.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce fichero 1: ");
        String fichero1 = sc.nextLine();
        System.out.println("Introduce fichero 2: ");
        String fichero2 = sc.nextLine();
        System.out.println("Introduce fichero 3: ");
        String fichero3 = sc.nextLine();
        System.out.println("Introduce un entero: ");
        int entero = sc.nextInt();

        BufferedReader br1 = null;
        BufferedWriter bw1 = null;

        BufferedWriter bw2 = null;

        try {
            br1 = new BufferedReader(new FileReader("UD10.Ficheros\\"+fichero1));
            bw1 = new BufferedWriter(new FileWriter("UD10.Ficheros\\"+fichero2));
            bw2 = new BufferedWriter(new FileWriter("UD10.Ficheros\\"+fichero3));

            String cadena;
            while((cadena=br1.readLine())!=null){
                if(entero>0)
                    bw1.write(cadena + "\n");
                else
                    bw2.write(cadena + "\n");
                entero--;
            }

        } catch (FileNotFoundException e) {
            System.err.println("Error al leer el archivo");
        } catch (IOException e) {
            System.err.println("Error de E/S");
        }finally{
            try {
                if(br1!=null)
                    br1.close();
                if(bw1!=null)
                    bw1.close();
                if(bw2!=null)
                    bw2.close();
            } catch (IOException e) {
                System.err.println("Error al cerrar archivos");
            }
        }

    }
}
