package ficheros_IV;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/*
 * Crea una aplicación que copie un fichero binario a otra localización. En lugar de
leer y escribir byte a byte, crea un array de bytes con el tamaño del fichero de
origen (utiliza el método available()), copia el contenido del fichero a este array
y escribe a partir de este array.
Recuerda que debes controlar las excepciones que puedan aparecer. En caso
de error, mostrar una ventana de dialogo con información del error.
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        byte[]fichero;
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce el fichero que se va a copiar: ");
        String nombreFichero = sc.nextLine();
        System.out.println("Introduce el fichero al que se va a copiar: ");
        String nombreFichero2 = sc.nextLine();

        try (FileInputStream fis = new FileInputStream("UD10.Ficheros/"+nombreFichero);
        FileOutputStream fos = new FileOutputStream("UD10.Ficheros/"+nombreFichero2);) {
            int b = 0;
            fichero = new byte[fis.available()];//devuelve el tamanio de los bytes

            int i=0;
            while((b=fis.read())!=-1){
                fichero[i] = (byte) b;
                i++;
            }

            if(fichero.length>0){
                for(byte a: fichero){//recorro el array y le voy introduciendo los bytes
                    fos.write(a);
                }
            }
                
        } catch (IOException e) {
            System.err.println("Error");
        }
    }
}
