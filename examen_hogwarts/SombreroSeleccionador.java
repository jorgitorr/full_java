import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class SombreroSeleccionador {
    private Map<String,Set<String>>alumnosRespuestas;
    private Map<String,Set<String>>preguntasRespuestas;
    private Map<String,Integer>casaNumeroEstudiantes;
    
    
    public SombreroSeleccionador() {
        this.alumnosRespuestas = new LinkedHashMap<>();
        this.preguntasRespuestas = new LinkedHashMap<>();
        this.casaNumeroEstudiantes = new TreeMap<>();
    }

    /**
     * agrega alumno con sus respuestas una a una
     * @param nombre
     * @param respuesta
     */
    private void agregarAlumno(String nombre, String respuesta){
        if(!alumnosRespuestas.containsKey(nombre))
            alumnosRespuestas.put(nombre, new LinkedHashSet<>());
        alumnosRespuestas.get(nombre).add(respuesta);
    }

    /**
     * agregar pregunta y sus posibles respuestas
     * @param pregunta
     * @param respuesta
     */
    private void agregarPreguntaRespuesta(String pregunta, String respuesta){
        if(!preguntasRespuestas.containsKey(pregunta))
            preguntasRespuestas.put(pregunta, new LinkedHashSet<>());
        preguntasRespuestas.get(pregunta).add(respuesta);
    }

    /**
     * agrega a cada casa el numero de estudiantes
     * @param casa
     * @param numeroEstudiantes
     */
    private void agregarCasaNumeroEstudiantes(String casa, int numeroEstudiantes){
        if(!casaNumeroEstudiantes.containsKey(casa))
            casaNumeroEstudiantes.put(casa, 1);
        else
            casaNumeroEstudiantes.put(casa, casaNumeroEstudiantes.get(casa)+1);
    }

    /**
     * @return alumnos totales 
     */
    private int alumnosTotales(){
        int total = 0;
        for(String casa: casaNumeroEstudiantes.keySet()){
            total += casaNumeroEstudiantes.get(casa);
        }
        return total;
    }

    /**
     * imprime casas con su numero estudiantes y su porcentaje
     */
    private void imprimirCasaEstudiantes(){
        int totalAlumnos = alumnosTotales();
        for(String casa: casaNumeroEstudiantes.keySet()){
            double porcentaje = (100.0*casaNumeroEstudiantes.get(casa))/totalAlumnos;
            System.out.println(casa + ": " + casaNumeroEstudiantes.get(casa) + " (" + String.format("%.2f",porcentaje) + "%)");
        }
    }

    /**
     * carga, obtiene datos y realiza funciones principales del programa
     * @param f1 contiene las respuestas de los estudiantes
     * @param f2 contiene las preguntas con sus posibles respuestas
     */
    public void cargarDatos(String f1, String f2){
        SombreroSeleccionador sombrero = new SombreroSeleccionador();
        try (BufferedReader br = new BufferedReader(new FileReader("examen/"+f1));
        BufferedReader br2 = new BufferedReader(new FileReader("examen/"+f2))) {
            String cadenas;
            String[]datos;
            String[]respuestas;

            
            //lee los alumnos con sus respuestas
            while((cadenas=br.readLine())!=null){
                datos = cadenas.split(":");
                respuestas = datos[1].split(";");

                String nombreAlumno = datos[0];
                //agrega el estudiante al alumnoRespuestas del sombrero y sus respuestas una a una
                for(String r: respuestas)
                    sombrero.agregarAlumno(nombreAlumno,r);
            }

            //lee las preguntas con sus respuestas
            while((cadenas=br2.readLine())!=null){
                datos = cadenas.split(":");//la pregunta de la respuesta se separa por dos puntos
                respuestas = datos[1].split(";");
                
                String pregunta = datos[0];
                
                for(String r: respuestas)//agrega a la pregunta cada respuesta en orden de entrada
                    sombrero.agregarPreguntaRespuesta(pregunta,r);
            }

            //obtiene el alumno con su puntaje en un mapa
            Map<String,Integer>alumnosPuntaje = sombrero.calculoPuntajeAlumnos();

            for(String nombre: alumnosPuntaje.keySet()){
                int puntajeAlumno = alumnosPuntaje.get(nombre);
                String casaAlumno;
                if(puntajeAlumno<=20){
                    casaAlumno = "Hufflepuff";
                }else if(puntajeAlumno >= 21 && puntajeAlumno<29){
                    casaAlumno = "Ravenclaw";
                }else if(puntajeAlumno >= 29 && puntajeAlumno<37){
                    casaAlumno = "Gryffindor";
                }else{
                    casaAlumno = "Slytherin";
                }
                sombrero.agregarCasaNumeroEstudiantes(casaAlumno, puntajeAlumno);//agrega +1 a la casa

                System.out.println("Oh! Tenemos a " + nombre + " bajo el sombrero seleccionador. ¡" + nombre + ", obtuviste " + alumnosPuntaje.get(nombre)
                 + " puntos, eres un " + casaAlumno + "!");

            }

            System.out.println("\n\nEstudiantes clasificados por casa: ");
                System.out.println("-----------------------------------------");

            sombrero.imprimirCasaEstudiantes();
            

        } catch (IOException e) {
            System.err.println("No se encuentra el fichero");
        }
    }

    /**
     * 
     * @return todos los estudiantes con sus puntos
     */
    public Map<String,Integer> calculoPuntajeAlumnos(){
        //recorro cada respuesta del estudiante
        String[]respuestas;
        Map<String,Integer>estudiantePuntos = new LinkedHashMap<>();
        int puntajeEstudiante;
        for(String nombreEstudiante: alumnosRespuestas.keySet()){
            puntajeEstudiante = 0; //en cada estudiante el valor empieza en 0
            for(String respuestaEstudiante: alumnosRespuestas.get(nombreEstudiante)){
                for(String preguntas:preguntasRespuestas.keySet()){
                    int i = 0;
                    respuestas = new String[10];
                    for(String r: preguntasRespuestas.get(preguntas)){
                        respuestas[i] = r;
                        i++;
                    }
                    //en cada pregunta compruebo si la respuesta del estudiante está
                    for(int punto=0; punto<respuestas.length-1; punto++){
                        if(respuestaEstudiante.equals(respuestas[punto])){
                            puntajeEstudiante += punto+1;//se le suman los puntos que vale la pregunta
                        }
                    }
                }
            }
            estudiantePuntos.put(nombreEstudiante, puntajeEstudiante);
        }
        return estudiantePuntos;
    }

    public static void main(String[] args) {
        SombreroSeleccionador sombrero = new SombreroSeleccionador();
        System.out.println("Hola y bienvenidos al programa del sombrero seleccionador de la casa Hogwarts!");
        // cargarDatos("respuestas_estudiantes.txt","respuestas_preguntas.txt");


        if(args.length==2)
            sombrero.cargarDatos(args[0],args[1]);
        else
            try {
                throw new ComandosHogwartsException("Error");
            } catch (ComandosHogwartsException e) {
                e.printStackTrace();
            }
    }
    
}
