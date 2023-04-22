package ejercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejemplo1 {

    public void leeArchivo() throws FileNotFoundException{
        Scanner in = new Scanner(new File("test.in"));
    }
    public static void main(String[] args){
        Ejemplo1 e = new Ejemplo1();

        try {
            e.leeArchivo();
        } catch (FileNotFoundException e1) {
            System.err.println("No hay archivo");
        }finally{
            System.err.println("UWU");
        }
    }
    
}
