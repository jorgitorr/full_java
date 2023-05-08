import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;

public class Sombrero {
    private Set<Estudiante>estudiantes;
    

    public Sombrero() {
        estudiantes = new LinkedHashSet<>();
    }



    public void cargarEstudiantes(String args1,String args2){
        try (BufferedReader br1 = new BufferedReader(new FileReader(args1));
        BufferedReader br2 = new BufferedReader(new FileReader(args2))) {
            String cadena; 
            Set<String>respuestasEstudiante;
            String[]datos;
            String[]respuestas;
            //lee respuestas estudiantes
            while((cadena=br1.readLine())!=null){
                datos = cadena.split(":");
                respuestas = datos[1].split(";");
                respuestasEstudiante = new LinkedHashSet<>();
                for(String respuesta: respuestas){
                    respuestasEstudiante.add(respuesta);
                }
                Estudiante estudiante = new Estudiante(datos[0],respuestasEstudiante);
                estudiantes.add(estudiante);
            }

            //lee preguntas y respuestas
            while((cadena=br2.readLine())!=null){
                datos = cadena.split(":");
                respuestas = datos[1].split(";");
                
                
            }

        } catch (IOException e) {
            System.err.println("Error al leer ficheros");
        }

    }


    public void puntosEstudiante(){
        for(Estudiante estudiante: estudiantes){
            
        }
    }

    public void casaEstudiante(){
        /*if(puntajeAlumno<=20){
            casaAlumno = "Hufflepuff";
        }else if(puntajeAlumno >= 21 && puntajeAlumno<29){
            casaAlumno = "Ravenclaw";
        }else if(puntajeAlumno >= 29 && puntajeAlumno<37){
            casaAlumno = "Gryffindor";
        }else{
            casaAlumno = "Slytherin";
        }*/
    }




    public static void main(String[] args){
        Sombrero sombrero = new Sombrero();
        if(args.length==2)
            sombrero.cargarEstudiantes(args[0], args[1]);
        else
            try {
                throw new ComandosHogwartsException("Error");
            } catch (ComandosHogwartsException e) {
                System.err.println("Error");
            }
    }
}
