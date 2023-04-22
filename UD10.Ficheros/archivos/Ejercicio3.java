

import java.io.File;
import java.io.IOException;

public class Ejercicio3 {
    public static void main(String[] args) {
        File direccion = new File("archivos/fichero/ficherosub");
        File file1 = new File(direccion,"archivo1.txt");
        File file2 = new File(direccion,"archivo2.txt");

        direccion.mkdir();
        
        try {
            if(file1.createNewFile())
                System.out.println("Nuevo fichero creado");
            if(file2.createNewFile())
                System.out.println("Nuevo fichero creado");
            if(file1.renameTo(new File(direccion, "nuevoArchivo.txt")))
                System.out.println("Fichero 1 renombrado");
            if(file2.createNewFile())
                System.out.println("Nuevo fichero creado");
            if(file2.delete())//elimina el file2
                System.out.println("Archivo eliminado");
            System.out.println(file2.exists()?"El fichero 2 existe":"El fichero no existe");
        } catch (IOException e) {
            System.err.println("Error");
        }
        

    }
}
