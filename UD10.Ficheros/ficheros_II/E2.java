package ficheros_II;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**2. Desarrolla una aplicación que pida 2 ficheros por teclado el programa 
 * leerá el contenido del primer fichero y lo escribirá en el segundo. 
 * Si el fichero existe se sobrescribirá. */
public class E2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un fichero");
        String fichero = sc.nextLine();
        System.out.println("Introduce un segundo fichero");
        String fichero2 = sc.nextLine();
        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            br = new BufferedReader(new FileReader("UD10.Ficheros\\"+fichero));
            bw = new BufferedWriter(new FileWriter("UD10.Ficheros\\"+fichero2));

            String lineas;

            while((lineas=br.readLine())!=null)
                bw.write(lineas);

        } catch (FileNotFoundException e) {
            System.err.println("Fichero no encontrado");
        } catch (IOException e) {
            System.err.println("Error de E/S");
        }finally{
            try {
                if(br!=null)
                    br.close();
                if(bw!=null)
                    bw.close();
            } catch (IOException e) {
                System.err.println("Error al cerrar los ficheros");
            }
        }

    }
}
