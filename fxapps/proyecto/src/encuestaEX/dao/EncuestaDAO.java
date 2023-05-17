package encuestaEX.dao;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import encuesta.Encuesta;

public class EncuestaDAO {
    private String fichero = "src/encuestaEX/encuesta.txt";
    
    public void insertarEnFichero(encuestaEX.model.Encuesta encuesta){
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fichero))) {
            String linea = encuesta.toString();
            bw.write(linea);
        } catch(FileNotFoundException ex){
            System.err.println("Error al leer archivo");
        }catch (IOException e) {
            System.err.println("Error de E/S");
        }

    }
}
