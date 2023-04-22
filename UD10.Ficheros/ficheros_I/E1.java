import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class E1 {
    public static void main(String[] args) {
        int cadena;

        FileReader br = null;
        FileWriter bw = null;
        try {
            br = new FileReader("UD10.Ficheros\\fichero_texto.txt");
            bw = new FileWriter("UD10.Ficheros\\fichero_copia.txt");

            //si lo hiciera con buffer copiaria todo en una linea

            while((cadena=br.read())!=-1){
                bw.write(cadena);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Fichero no encontrado");
        } catch (IOException e) {
            System.err.println("Error de E/S");
        }finally{
                try {
                    if(br!=null)
                        br.close();
                    if(bw!=null)
                        bw.close();
                } catch (IOException e) {
                    System.err.println("Error al cerrar");
                }
        }
    }
}
