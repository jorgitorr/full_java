import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;

public class Sombrero {
    private Set<Estudiante>estudiantes;
    private Set<String[]>respuestasPreguntas;
    

    public Sombrero() {
        estudiantes = new LinkedHashSet<>();
        respuestasPreguntas = new LinkedHashSet<>();
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
                Estudiante estudiante = new Estudiante(datos[0]);
                estudiante.setRespuestas(respuestasEstudiante);
                estudiantes.add(estudiante);
            }

            //lee preguntas y respuestas
            while((cadena=br2.readLine())!=null){
                datos = cadena.split(":");
                String[]r = datos[1].split(";");
                
                respuestasPreguntas.add(r);
            }

            puntosEstudiante();

        } catch (IOException e) {
            System.err.println("Error al leer ficheros");
        }

    }

    /**
     * 
     * @param respuesta
     * @param puntos
     */
    public void puntosEstudiante(){
        for(Estudiante estudiante: estudiantes){//mira en cada estudiante
            int puntoXEstudiante = 0;
            Set<String>respuestasEstudiante = estudiante.getRespuestas();
            for(String resEstudiante:respuestasEstudiante){//cada respuesta del estudiante
                for(String[]resPregunta:respuestasPreguntas){
                    for(int i=0; i<resPregunta.length; i++){
                        if(resPregunta[i].equals(resEstudiante)){
                            puntoXEstudiante += i+1;
                        }
                    }
                    continue;
                }
            }

            casaEstudiante(estudiante, puntoXEstudiante);
            imprimir(estudiante, puntoXEstudiante);
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


    private void imprimir(Estudiante estudiante, int puntos){
        System.out.println(estudiante.getNombre() + " con " + puntos + " es de la casa " + estudiante.getCasa().getNombre());
    }




    public static void main(String[] args){
        Sombrero sombrero = new Sombrero();
        if(args.length==2)
            sombrero.cargarEstudiantes(args[0], args[1]);
    }
}
