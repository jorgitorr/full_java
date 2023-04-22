

import java.io.File;

public class Ejercicio {
    public static void main(String[] args) {
        File f = new File("archivos/fichero/libro.txt"); 
        //File f2 = new File(f.getAbsolutePath());   
        System.out.println("Nombre: " + f.getName());
        System.out.println("Ruta relativa: " + f.getPath());
        System.out.println("Ruta absoluta: " + f.getAbsolutePath());
        
        System.out.println(f.canRead() ? "Se puede leer":"No se puede leer");
        System.out.println(f.canWrite() ? "Se puede escribir":"No se puede escribir");
        System.out.println("el tamanio es: " + f.length());

        System.out.println(f.isFile() ? "es fichero: ":"No es un fichero");
        System.out.println(f.isDirectory() ? "Es directorio: ": "No es un directorio");
        /* 
        System.out.println(f.exists());
        System.out.println(f2.exists());*/
    }
    
    
}
