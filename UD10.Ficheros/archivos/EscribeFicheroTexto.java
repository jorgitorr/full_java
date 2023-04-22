

import java.io.FileWriter;
import java.io.IOException;

public class EscribeFicheroTexto {
    public static void main(String[] args) {
        //Crea el String con la cadena XML
        String texto = "<Libros><Libro><Titulo>El Capote</Titulo></Libro></Libros>";

        //Guarda en la variable nombre el nombre del archivo que se creará
        String nombre = "libros.xml";
        FileWriter os = null;

        try {
            os = new FileWriter(nombre,true);
            os.write(texto + "\n");
        } catch (IOException e) {
            System.err.println("Error al acceder al fichero");
        }finally{
            try {
                //da igual lo que pase antes que siempre se va a hacer el finally
                //el close() puede dar anomalía
                os.close();
            } catch (IOException e) {
                System.err.println("Error al acceder al cerrar el fichero");
            }
        }


    }
}
