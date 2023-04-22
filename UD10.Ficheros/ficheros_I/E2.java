import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        FileReader fr = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero de caracteres: ");
        int numCaracteres = sc.nextInt();
        sc.nextLine();
        System.out.println("Introduce un fichero");
        String fichero = sc.nextLine();

        try {
            fr = new FileReader("UD10.Ficheros\\"+fichero);
            int cadenas = 0;
            String cadenasFichero = "";
            
            while(numCaracteres>=0){
                cadenas=fr.read();
                numCaracteres--;
                if(cadenas==-1){
                    System.out.println("Error, el archivo es demasiado pequenio");
                    break;
                }
                cadenasFichero += (char)cadenas;
            }

            if(cadenas!=-1)
                System.out.println(cadenasFichero);
              
        } catch (FileNotFoundException e) {
            System.err.println("Error al reconocer el archivo");
        } catch (IOException e) {
            System.err.println("Sobrepasado limite");
            e.printStackTrace();
        }finally{
            try {
                if(fr!=null)
                    fr.close();
            } catch (IOException e) {
                System.err.println("Error al intentar cerrar el fichero");
            }
        }
    }
}
