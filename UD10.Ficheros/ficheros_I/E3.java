import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un fichero: ");
        String fichero = sc.nextLine(); 
        System.out.println("Introduce un caracter a buscar: ");
        char caracter = sc.nextLine().charAt(0);
        FileReader fr = null;

        try {
            fr = new FileReader("UD10.Ficheros\\"+fichero);
            int contCaracteres = 0;
            int caracteres;
            while((caracteres=fr.read())!=-1){
                if(caracter==(char)caracteres)
                    contCaracteres++;
            }

            System.out.println("Hay " + contCaracteres + " " + caracter);
        } catch (FileNotFoundException e) {
            System.err.println("Fichero no encontrado");
        } catch (IOException e) {
            System.err.println("Error de entrada/Salida");
        }finally{
            try {
                if(fr!=null)
                    fr.close();
            } catch (IOException e) {
                System.err.println("Error al cerrar el fichero");
            }
        }
    }
}
