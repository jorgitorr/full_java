import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Empresa {
    private String nombre;
    private List<Embalse> embalses;/**tengo que hacer un set y copiarlo en una lista
    para poder compararlo */


    
    public Empresa(String nombre) {
        this.nombre = nombre;
        embalses = new LinkedList<>();
    }


    public String getNombre() {
        return nombre;
    }

    /**
     * agrega un embalse al conjunto de embalses
     * @param un embalse
     */
    public void agregaEmbalse(Embalse embalse){
        if(!embalses.contains(embalse))
            embalses.add(embalse);
    }

    public void informeAguaEmbalsadaUnUso(Uso uso){
        double totalAguaEmbalsada = 0;
        double porcentajeAguaEmbalsada = 0;
        double capacidadMaxTotal = 0;

        System.out.println("************************************");
        System.out.println("*INFORME AGUA EMBALSADA PARA UN USO*");
        System.out.println("************************************");

        for(Embalse embalse: embalses){
            if(embalse.getUso().equals(uso)){
                totalAguaEmbalsada += embalse.aguaEmbalsada;
                capacidadMaxTotal += embalse.capacidadMAX;
            }
        }

        System.out.println("Cantidad maxima para abastecimiento: " + capacidadMaxTotal + " hm3");
        double porcentaje = totalAguaEmbalsada/capacidadMaxTotal*100;/*cuidado */
        System.out.println("Embalsado para abastecimiento: " + totalAguaEmbalsada + " hm3 (" 
        + porcentaje + "%)");

    }


    public void informeEmbalses(){
        /**tengo que hacer copia de el set en una lista y ordenarla*/
        Collections.sort(embalses,new OrdenacionEmbalses());
        System.out.println("******************");
        System.out.println("*INFORME EMBALSES*");
        System.out.println("******************");
        for(Embalse embalse: embalses)
            System.out.println(embalse);

    }

    /**
     * imprimeun informe 
     */
    public void informePendientellenado(){

        int cantidadEmbalseSuperficie = 0;
        int cantidadEmbalseSubterraneo = 0;
        System.out.println("******************");
        System.out.println("INFORME PENDIENTES");
        System.out.println("******************");
        for(Embalse embalse: embalses){
            if(embalse instanceof EmbalseSuperficie)
                cantidadEmbalseSuperficie += embalse.capacidadMAX - embalse.aguaEmbalsada;
            else if(embalse instanceof EmbalseSubterraneo)
                cantidadEmbalseSubterraneo += embalse.capacidadMAX - embalse.aguaEmbalsada;
        }

        System.out.println("Pendiente en embalses de superficie: " + cantidadEmbalseSuperficie + " hm3.");
        System.out.print("Pendiente en embalses subterraneos: " + cantidadEmbalseSubterraneo+ " hm3.");

    }


}
