package ficheros_II;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**5. Desarrolla una aplicación que lea una cadena por teclado y la escriba 
 * en un fichero, también leído por teclado. Si el fichero existe se añadirá 
 * la cadena leída al final del mismo. Además al escribir la cadena en el fichero, 
 * las vocales se escribirán en mayúsculas y las consonantes en minúsculas. */
public class E5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una cadena: ");
        String cadena = sc.nextLine();
        System.out.println("Introduce un fichero: ");
        String fichero = sc.nextLine();
        BufferedWriter bw = null;

        try{
            bw = new BufferedWriter(new FileWriter("UD10.Ficheros\\"+fichero,true));
            char[]caracteres = cadena.toCharArray();
            
            //importante
            for(char letra:caracteres){
                if(letra>=(char)65 && letra<=(char)90)
                    if(letra!=(char)65 && letra!=(char)69 && letra!=(char)73 && letra!=(char)79 && letra!=(char)85)
                        letra=(char)(letra+32);
                if(letra==(char)97 || letra==(char)101 || letra==(char)105 || letra==(char)111 || letra==(char)117)
                    letra=(char)(letra-32);
                bw.write(letra);
            }
            
        } catch (IOException e) {
            System.err.println("Error lectura archivo");
        }finally{
            try {
                if(bw!=null)
                    bw.close();
            } catch (IOException e) {
                System.err.println("Error E/S");
            }
        }

    }
}
