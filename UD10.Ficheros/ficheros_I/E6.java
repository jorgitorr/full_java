import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class E6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un fichero: ");
        String fichero = sc.nextLine();
        System.out.println("Introduce la palabra a buscar");
        String palabra = sc.nextLine();

        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader("UD10.Ficheros\\"+fichero));
            String cadena;
            String[]palabras;
            int linea = 0;
            int apariciones = 0;
            String lineas = "";
            while((cadena=br.readLine())!=null){
                linea++;
                palabras = cadena.split(" ");
                for(String p: palabras){
                    if(p.equals(palabra)){
                        apariciones++;
                        lineas += linea + " ";
                    }
                }
            }

            if(apariciones==0)
                System.out.println("la palabra: " + palabra + " no aparece");
            else if(lineas.length()<=2)
                System.out.println("la palabra: " + palabra + " aparece " + apariciones + " vez en la linea: " + lineas);
            else 
                System.out.println("la palabra: " + palabra + " aparece " + apariciones + " vez en las lineas: " + lineas);

        } catch (FileNotFoundException e) {
            System.err.println("Error el archivo no se ha encontrado");
        } catch (IOException e) {
            System.err.println("Error de E/S");
        }finally{
            try {
                if(br!=null)
                    br.close();
            } catch (IOException e) {
                System.err.println("Error al cerrar el archivo");
            }
        }

    }
}
