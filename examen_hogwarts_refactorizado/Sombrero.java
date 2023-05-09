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
        Sombrero sombrero = new Sombrero();
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
                
                int puntos = 1;
                for(String respuesta:respuestas){
                    sombrero.puntosEstudiante(respuesta,puntos);
                    puntos++;
                }
            }

        } catch (IOException e) {
            System.err.println("Error al leer ficheros");
        }

    }

    /**
     * 
     * @param respuesta
     * @param puntos
     */
    public void puntosEstudiante(String respuesta, int puntos){
        int puntosXEstudiante = 0;
        for(Estudiante estudiante: estudiantes){
            puntosXEstudiante = 0;
            for(String r:estudiante.getRespuestas()){
                if(r.equals(respuesta)){
                   puntosXEstudiante += puntos;
                }
            }
            casaEstudiante(estudiante, puntosXEstudiante);
        }
    }


    /**
     * casa por estudiante
     * @param estudiante
     * @param puntos
     */
    public void casaEstudiante(Estudiante estudiante, int puntos){
        if(puntos<=20){
            estudiante.setCasa(Casa.HUFFLEPUFF);
        }else if(puntos >= 21 && puntos<29){
            estudiante.setCasa(Casa.RAVENCLAW);
        }else if(puntos >= 29 && puntos<37){
            estudiante.setCasa(Casa.GRYFFINDOR);
        }else{
            estudiante.setCasa(Casa.SLYTHERIN);
        }
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
