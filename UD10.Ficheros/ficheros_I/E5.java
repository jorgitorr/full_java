import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class E5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre de un fichero: ");
        String fichero = sc.nextLine();
        System.out.println("Introduce el numero de lineas: ");
        int lineas = sc.nextInt();
        
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("UD10.Ficheros\\"+fichero));
            String cadena;
            String cadenaCompleta = "";
            int lineasFichero = 0;
            while((cadena=br.readLine())!=null){
                if(lineas==lineasFichero)
                    break;
                lineasFichero++;
                cadenaCompleta += cadena;
            }

            if(lineas>lineasFichero)
                System.out.println("El fichero es demasiado pequenio");
            else
                System.out.println(cadenaCompleta);


        } catch (FileNotFoundException e) {
            System.err.println("Error al leer fichero");
        } catch (IOException e) {
            System.err.println("Error E/S");
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
