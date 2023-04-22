import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class EscribeFicheroTextoBuff2 {
    public static void main(String[] args) {
        BufferedWriter bw = null;

        try {
            bw = new BufferedWriter(new FileWriter("fichero_texto.txt"));

            for(int i=1; i<11; i++){
                bw.write("Fila número: " + i + "\n");//co printWriter se usaria println()
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if(bw!=null)
                try {
                    bw.close();//tiene que ponerlo siempre
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }
}
