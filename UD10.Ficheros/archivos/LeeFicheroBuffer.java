import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeeFicheroBuffer {
    public static void main(String[] args) {
        BufferedReader bf = null;
        try {
            bf = new BufferedReader(new FileReader("archivos/Archivo.java"));

            String linea;

            while((linea=bf.readLine())!=null)
                System.out.println(linea);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("Error de E/S");
        }finally{
            try {
                if(bf!=null)
                    bf.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }
}
