package ficheros_II;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class E3 {

    /**3. Desarrolla una aplicación que pida 2 ficheros por teclado el programa leerá 
     * el contenido del primer fichero y lo escribirá en el segundo con interlineado doble. 
     * Si el fichero existe se sobrescribirá. */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = null;
        BufferedWriter bw = null;

        System.out.println("Introduce el primer fichero: ");
        String fichero1 = sc.nextLine();
        System.out.println("Introduce el segundo fichero: ");
        String fichero2 = sc.nextLine();

        try {
            br = new BufferedReader(new FileReader("UD10.Ficheros\\"+fichero1));
            bw = new BufferedWriter(new FileWriter("UD10.Ficheros\\"+fichero2));

            String cadena;
            while((cadena=br.readLine())!=null)
                bw.write(cadena + "\n\n");

        } catch (FileNotFoundException e) {
            System.err.println("Fichero no econtrado");
        } catch (IOException e) {
            System.err.println("Error E/S");
        }finally{
            try {
                if(br!=null)
                    br.close();
                if(bw!=null)
                    bw.close();
            } catch (IOException e) {
                System.err.println("Error al cerrar ficheros");
            }
        }
    }
}
