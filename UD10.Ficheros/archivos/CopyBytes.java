import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream("ravenclaw.jpg");
            fos = new FileOutputStream("donald.jpg");
            int valor = 1;
            while((valor=fis.read())!=-1)
                fos.write(valor);

        } catch (IOException e) {
            System.err.println("Error al acceder al archivo");
        }finally{
            try{
                if(fis!=null)
                    fis.close();
                if(fos!=null)
                    fos.close();
            }catch(IOException e){
                System.err.println("Error al cerrar el fichero");
            }
        }
    }
    
}
