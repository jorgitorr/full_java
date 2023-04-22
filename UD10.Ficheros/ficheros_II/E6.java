package ficheros_II;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class E6 {

    /**6. Desarrolla una aplicación que pida 3 ficheros por teclado y un entero. 
     * El programa leerá el las líneas pares en el primer fichero y las impares 
     * en el segundo, y las escribirá en el tercero. Si el tercer fichero existe 
     * se sobrescribirá. */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce fichero 1: ");
        String fichero1 = sc.nextLine();
        System.out.println("Introduce fichero 2: ");
        String fichero2 = sc.nextLine();
        System.out.println("Introduce fichero 3: ");
        String fichero3 = sc.nextLine();
        System.out.println("Introduce un entero: ");
        int entero = sc.nextInt();

        BufferedReader br1 = null;
        BufferedReader br2 = null;

        BufferedWriter bw = null;

        String cadena;
        
        try {
            br1 = new BufferedReader(new FileReader("UD10.Ficheros\\"+fichero1));
            br2 = new BufferedReader(new FileReader("UD10.Ficheros\\"+fichero2));
            bw = new BufferedWriter(new FileWriter("UD10.Ficheros\\"+fichero3));
            
            String lineasFichero1 = "";
            String lineasFichero2 = "";
            int contLineasFichero1 = 1, contLineasFichero2=1;
            while((lineasFichero1=br1.readLine())!=null||(lineasFichero2=br2.readLine())!=null){
                if(contLineasFichero1%2==0)
                    if(lineasFichero1!=null)
                        bw.write(lineasFichero1 + "\n");
                else
                    if(lineasFichero2!=null)
                        bw.write(lineasFichero2 + "\n");
                contLineasFichero1++;
            }
           

        } catch (FileNotFoundException e) {
            System.err.println("Fichero no encontrado");
        } catch (IOException e) {
            System.err.println("Error en fichero E/S");
        }finally{
            try {
                if(br1!=null)
                    br1.close();
                if(br2!=null)
                    br2.close();
                if(bw!=null)
                    bw.close();
            } catch (IOException e) {
                System.err.println("Error al cerrar archivos");
            }
        }


    }
}
