import java.io.FileInputStream;
import java.io.IOException;

public class FicherosBinariosApp{
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("donald.jpg");
            int valor = 1;
            while((valor=fis.read())!=-1)
                System.out.print((char)valor);
        } catch (IOException e) {
            System.err.println("Error al acceder al archivo");
        }finally{
            try{
                fis.close();
            }catch(IOException e){
                System.err.println("Error al cerrar el fichero");
            }
        }
        
    }
}