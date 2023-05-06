import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class GestionAparcabicicletas {
    private static Map<String,Set<Aparcabicicletas>>mapa;
    
    
    public GestionAparcabicicletas() {
        mapa = new TreeMap<>();
    }

    public static void main(String[] args) throws LineasComandosException {
        if(args.length==1)
            cargaDatos(args);
        else
            throw new LineasComandosException("No has pasado el archivo");//escepcion que se lanza
    }


    public void anadirAlMapa(String barrio, Aparcabicicletas aparcabicicletas){
        if(!mapa.containsKey(barrio))
            mapa.put(barrio, new TreeSet<>(new ComparadorAparcaBicicletasId()));
        mapa.get(barrio).add(aparcabicicletas);
    }


    public Aparcabicicletas buscaAparcabicicletas(Aparcabicicletas a){
        Aparcabicicletas aparcabicicletas = a;
        for(String nombre: mapa.keySet()){
            if(mapa.get(nombre).equals(a)){
                aparcabicicletas = a;
            }
        }
        return aparcabicicletas;
    }

    private int numAparcabicicletas(String barrio){
        int cont = 0;
        for(String b: mapa.keySet()){
            if(mapa.get(b).equals(barrio)){
                cont = mapa.get(barrio).size();
            }
        }
        return cont;
    }


    public void imprimirBarrio(){
        for(String barrio: mapa.keySet()){
            System.out.println(barrio + ":" + mapa.get(barrio) 
            + "\nnum aparcabicicletas:" + numAparcabicicletas(barrio));
        }
    }

    public void imprimirXId(){
        Set<Aparcabicicletas>aparcabicicletas = new TreeSet<>(new ComparadorAparcaBicicletasId());
        for(String nombre: mapa.keySet())
            aparcabicicletas.addAll(mapa.get(nombre));
        
        System.out.println(aparcabicicletas);
    }
    

    private static void cargaDatos(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader(args[0]))) {
            String cadena;
            GestionAparcabicicletas g = new GestionAparcabicicletas();
            while((cadena=br.readLine())!=null){
                String[]cadenas = cadena.split(",");
                double x = Double.parseDouble(cadenas[0]);
                double y = Double.parseDouble(cadenas[1]);
                int id = Integer.parseInt(cadenas[2]);
                String barrio = cadenas[3];
                int aros = Integer.parseInt(cadenas[4]);
                boolean instalado = cadenas[5].equals("SI");

                Aparcabicicletas a = new Aparcabicicletas(x, y, id, barrio, aros, instalado);
                a = g.buscaAparcabicicletas(a);//si ya existe el aparcabicicletas no crea uno nueva
                g.anadirAlMapa(barrio, a);
            }

            System.out.println("***********ORDENADO POR NOMBRE DE BARRIO*****************");
            g.imprimirBarrio();
            System.out.println("*************ORDENADO POR ID*******************");
            g.imprimirXId();
        } catch (IOException e) {
            System.err.println("Error al leer fichero");
        }
    }

    
    
}
