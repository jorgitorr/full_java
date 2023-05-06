

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class GestionAparcabicicletas {
    private Map<String, Set<Aparcabicicletas>>mapa;

    

    public GestionAparcabicicletas() {
        this.mapa = new TreeMap<>();//esta ordenando un String entonces no se usa comparador
    }


    public void agregarAparcabicicletas(String barrio, Aparcabicicletas a){
        if(!mapa.containsKey(barrio))
            mapa.put(barrio, new TreeSet<>(new ComparadorId()));
        mapa.get(barrio).add(a);
    }

    private int aparcaBicicletasInstalados(String barrio){
        int instalado = 0;
        for(Aparcabicicletas a: mapa.get(barrio))
            if(a.isInstalado())
                instalado++;
        return instalado;

    }

    public void ordenadoXId(){
        Set<Aparcabicicletas>listado = new TreeSet<>(new ComparadorId());
        for(String barrio: mapa.keySet())
            listado.addAll(mapa.get(barrio));
            
        System.out.println(listado);
    }


    public void imprimirXBarrio(){
        for(String barrio: mapa.keySet()){
            System.out.println(barrio + "" + mapa.get(barrio) + 
            "\ncantidad aparcabicicletas: " + mapa.get(barrio).size() + 
            "\naparcabicicletas instalados: " + aparcaBicicletasInstalados(barrio));
        }
    }

    public static void cargarDatos(String fichero){
        GestionAparcabicicletas g = null;
        try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
            g = new GestionAparcabicicletas();
            String cadena;
        
            while((cadena = br.readLine())!=null){
                String[]datos = cadena.split(",");
                double x = Double.parseDouble(datos[0]);
                double y = Double.parseDouble(datos[1]);
                int id = Integer.parseInt(datos[2]);
                String barrio = datos[3];
                int aros = Integer.parseInt(datos[4]);
                boolean instalado = datos[5].equals("SI");
                Aparcabicicletas aparcabicicletas = new Aparcabicicletas(x, y, id, barrio, aros, instalado);
                g.agregarAparcabicicletas(barrio, aparcabicicletas);
            }

            System.out.println("****ORDENADO POR BARRIO*******");
            g.imprimirXBarrio();
            System.out.println("***ORDENADO POR ID*****");
            g.ordenadoXId();

        } catch (IOException e) {
            System.err.println("Error al buscar el archivo");
        }
    }

    public static void main(String[] args) throws LineaComandosException{
        if(args.length==1)
            cargarDatos(args[0]);
        else 
            throw new LineaComandosException("Error en el fichero");
    }
}
