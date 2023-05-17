package dao;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import model.Encuesta;

public class Dao {
    private String archivo = "encuesta.txt";

    public void escribir(Encuesta encuesta){
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo,true))) {

            bw.write(encuesta.getProfesion() + ";" + encuesta.getEdad() + ";" + encuesta.getNumHermanos() + ";" + encuesta.obtieneSexoCompleto() + ";" + encuesta.getDeporte().getNombre());

            if(encuesta.getAficcion()!=null){
                bw.write(";");
                for(Double aficcion: encuesta.getAficcion())
                    bw.write(aficcion + ":"); 
            }
            bw.write("\n");
        } catch(FileNotFoundException ex){
            System.err.println("Error de fichero");
        }catch (IOException e) {
            System.err.println("Error de E/S");
        }
    }


    public void escribirObject(Encuesta encuesta){
        try (ObjectOutputStream object = new ObjectOutputStream(new FileOutputStream("encuesta.dao",true))) {
            object.writeObject(encuesta);
        } catch(FileNotFoundException ex){
            System.out.println("Fichero no encontrado");
        }catch (IOException e) {
            
        }
    }

    public void leerObject(){
        try (ObjectInputStream leerObjecto = new ObjectInputStream(new FileInputStream("encuesta.dao"))) {
            String linea = leerObjecto.readUTF();
            if(!linea.equals(null))
                System.out.println(linea);
        } catch(FileNotFoundException ex){
            System.err.println("Fichero no encontrado");
        }catch (IOException e) {
            System.err.println("Error de E/S");
        }
    }
}
