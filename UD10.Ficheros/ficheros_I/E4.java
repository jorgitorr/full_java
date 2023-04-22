import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class E4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un fichero");
        String fichero = sc.nextLine();
        int contLineas = 0;

        BufferedReader bf = null;

        try {
            bf = new BufferedReader(new FileReader("UD10.Ficheros\\"+fichero));
            while(bf.readLine()!=null){
                contLineas++;
            }

            System.out.println("El archivo tiene " + contLineas + " lineas");
        } catch (FileNotFoundException e) {
            System.err.println("Error de archivo");
        } catch (IOException e) {
            System.err.println("Error de E/S");
        }finally{
            try {
                if(bf!=null)
                    bf.close();
            } catch (IOException e) {
                System.err.println("Error al cerrar el archivo");
            }
        }
    }
}
