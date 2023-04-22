
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopiaFicheroTexto {
    public static void main(String[] args) {

        FileWriter os = null;
        FileReader file = null;
        try {
            file = new FileReader("UD10.Ficheros\\libros.xml");
            os = new FileWriter("UD10.Ficheros\\nuevoArchivo.xml");
            
            //si no lo guardas en una variable 
            //primero hace la condicion y luego la que copia en 
            //el archivo es el siguiente caracter
            //ya que vuelve a hacer un file.read()
            int c;
            while((c=file.read())!=-1)
                os.write(c);
            
        } catch (IOException e) {
            System.err.println("Error de acceso al archivo");
        }finally{
            try {
                if(file!=null)
                    file.close();
                if(os!=null)
                    os.close();
            } catch (IOException e) {
                System.err.println("Error al cerrar los archivo");
            }
        }
        
        

    }
}
