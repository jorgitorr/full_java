import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GestionAparcabicicletas {
    private Set<Aparcabicicletas>coleccionAparcabicicletas;
    
    
    public GestionAparcabicicletas() {
        coleccionAparcabicicletas = new HashSet<>();
    }

    public static void main(String[] args) {
        if(args.length>0){
            cargaDatos(args);
        }
    }

    private void anadirAparcaBicicleta(Aparcabicicletas a){
        coleccionAparcabicicletas.add(a);
    }

    /**
     * Copia las colecciones y las imprime
     */
    private void imprimirListadoNombre(){
        //me queda poner  lo de cantidadAparcabicicleta y lo de aparcaBicicletas Instalados
        List<Aparcabicicletas>copyColeccion = new ArrayList<>(coleccionAparcabicicletas);
        Collections.sort(copyColeccion,new ComparadorAparcaBicicletasBarrio());

        for(Aparcabicicletas a: copyColeccion)
            System.out.println(a);
    }

    /**
     * Copia las colecciones y las imprime
     */
    private void imprimirListadoId(){
        List<Aparcabicicletas>copyColeccion = new ArrayList<>(coleccionAparcabicicletas);
        Collections.sort(copyColeccion,new ComparadorAparcaBicicletasId());

        for(Aparcabicicletas a: copyColeccion)
            System.out.println(a.toStringId());
    }


    private static void cargaDatos(String[] args) {
        System.out.println(args[0]);

        GestionAparcabicicletas gestion = new GestionAparcabicicletas();
        BufferedReader br = null;
        Aparcabicicletas aparcabicicletas = null;
        try {
            br = new BufferedReader(new FileReader(args[0]));
            String cadena;
            String[]palabras;
            
            while((cadena=br.readLine())!=null){
                palabras = cadena.split(",");
                double x = Double.parseDouble(palabras[0]);
                double y = Double.parseDouble(palabras[1]);
                int id = Integer.parseInt(palabras[2]);
                String barrios = palabras[3];
                int aros = Integer.parseInt(palabras[4]);
                String instalado = palabras[5];

                aparcabicicletas = new Aparcabicicletas(x, y, id, barrios, aros, instalado);
                gestion.anadirAparcaBicicleta(aparcabicicletas);  
            }  
            
            System.out.println("*******LISTADO POR NOMBRE***********");
            gestion.imprimirListadoNombre();
            System.out.println("*********LISTADO POR ID***************");
            gestion.imprimirListadoId(); 

        } catch (IOException e) {
            System.err.println("Error");
        }finally{
            try {
                if(br!=null)
                    br.close();
            } catch (IOException e) {
                System.err.println("Error al cerrar fichero");
            }
            
        }
    }
    
}
