package ficheros_II;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una cadena: ");
        String cadena = sc.nextLine();
        System.out.println("Introduce un fichero: ");
        String fichero = sc.nextLine();
        BufferedWriter bw =null;

        try {
            //el true es para que cuando el archivo exista no se sobreescriba sino que se ponga acontinuación
            bw = new BufferedWriter(new FileWriter("UD10.Ficheros\\"+fichero,true));
            bw.write(cadena);
        } catch (IOException e) {
            System.err.println("Error al leer el archivo");
        }finally{
            try {
                if(bw!=null)
                    bw.close();
            } catch (IOException e) {
                System.err.println("Error al cerrar fichero");
            }
        }

    }
}
