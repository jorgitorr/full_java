package ejercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejemplo {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(new File("test.in"));
        } catch (FileNotFoundException e) {
            System.out.println("AAAAAHHHHHHH SYNTAX ERROR");
            //e.printStackTrace();
        }

    }
    
}
