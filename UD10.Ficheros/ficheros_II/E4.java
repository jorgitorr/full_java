package ficheros_II;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * 4. Desarrolla una aplicación que pida 2 ficheros por teclado. 
 * Además preguntará si desea copiarlo todo en mayúsculas o todo en minúsculas. 
 * El programa leerá el contenido del primer fichero y lo escribirá en el segundo 
 * en mayúsculas o minúsculas según se haya indicado. Si el fichero existe se sobrescribirá.
 */
public class E4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer fichero: ");
        String fichero1 = sc.nextLine();
        System.out.println("Introduce el segundo fichero: ");
        String fichero2 = sc.nextLine();
        System.out.println("Deseas copiarlo todo en mayus o minus");
        String tamanio = sc.nextLine();
        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            br = new BufferedReader(new FileReader("UD10.Ficheros\\"+fichero1));
            bw = new BufferedWriter(new FileWriter("UD10.Ficheros\\"+fichero2));
            
            String cadena;
            while((cadena=br.readLine())!=null){
                if(tamanio.equals("mayus"))
                    bw.write(cadena.toUpperCase() + "\n");
                else if(tamanio.equals("minus"))
                    bw.write(cadena.toLowerCase() + "\n");
            }
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
                System.err.println("Error al cerrar ficheros");
            }
        }
    }
}
