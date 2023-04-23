package ficheros_II;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class E8 {
    /*
     * 8. Crea una clase Fichero que contenga los siguientes métodos para leer y escribir en ficheros: 
     * (la clase no tiene atributos y los flujos se abren y cierran en cada método)
            • int tamanioFichero(String) devuelve el tamaño del fichero indicado como parámetro.
            • String contenidoFichero(String) devuelve un string con el contenido del fichero indicado por parámetro.
            • int lineasFichero(String) devuelve el número de líneas de un fichero
            • int escribeFichero(fichero, texto, modo) escribe en fichero el contenido de texto, modo es un boleano que valdrá true para añadir al final o false para sobreescribir.
            • int copiaFichero(origen, destino)
     */


    public static int tamanioFichero(String fichero){
        int tamanioArchivo = 0;
        FileReader br = null;
        try {
            br = new FileReader("UD10.Ficheros\\"+fichero);
            int numC;

            while((numC=br.read())!=-1)
                tamanioArchivo++;
        } catch (FileNotFoundException e) {
            System.err.println("Error al leer el archivo");
        } catch (IOException e) {
            System.err.println("Error E/S");
        }finally{
            try {
                if(br!=null)
                    br.close();
            } catch (IOException e) {
                System.err.println("Error E/S");
            }
        }
        return tamanioArchivo;
    }


    public static int lineasFichero(String fichero){
        int tamanioArchivo = 0;
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("UD10.Ficheros\\"+fichero));
            String cadena;

            while((cadena=br.readLine())!=null)
                tamanioArchivo++;
        } catch (FileNotFoundException e) {
            System.err.println("Error al leer el archivo");
        } catch (IOException e) {
            System.err.println("Error E/S");
        }finally{
            try {
                if(br!=null)
                    br.close();
            } catch (IOException e) {
                System.err.println("Error E/S");
            }
        }
        return tamanioArchivo;
    }

    public static String contenidoFichero(String fichero){
        String cadenaResultante = "";
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("UD10.Ficheros\\"+fichero));
            String cadena;

            while((cadena=br.readLine())!=null)
                cadenaResultante+=cadena + "\n";
        } catch (FileNotFoundException e) {
            System.err.println("Error al leer el archivo");
        } catch (IOException e) {
            System.err.println("Error E/S");
        }finally{
            try {
                if(br!=null)
                    br.close();
            } catch (IOException e) {
                System.err.println("Error E/S");
            }
        }

        return cadenaResultante;
    }

    public static int escribeFichero(String fichero, String texto, boolean modo){
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter("UD10.Ficheros\\"+fichero,modo));
            bw.write(texto);
        } catch (IOException e) {
            System.err.println("Error al leer archivo");
        }finally{
            
            try {
                if(bw!=null)
                    bw.close();
            } catch (IOException e) {
                System.err.println("Error");
            }
        }
        return 0;
    }


    public static int copiaFichero(String origen, String destino){
        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            br = new BufferedReader(new FileReader("UD10.Ficheros\\"+origen));
            bw = new BufferedWriter(new FileWriter("UD10.Ficheros\\"+destino));

            String cadena;
            while((cadena=br.readLine())!=null)
                bw.write(cadena + "\n");
        } catch (FileNotFoundException e) {
            System.err.println("Error no se encuentra el archivo");
        } catch (IOException e) {
            System.err.println("Error E/S");
        }finally{
            try {
                if(br!=null)
                    br.close();
                if(bw!=null)
                    bw.close();
            } catch (IOException e) {
                System.err.println("Error");
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        E8.copiaFichero("fichero_texto.txt", "Fichero_copia.txt");
    }
}
