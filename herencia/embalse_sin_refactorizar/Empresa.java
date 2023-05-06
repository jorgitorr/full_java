package embalse;


import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Empresa {
    private String nombre;
    private List<Embalse> embalses;


    
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
                totalAguaEmbalsada += embalse.getCantidadAgua();
                capacidadMaxTotal += embalse.getCapacidadMAX();
                if(embalse instanceof EmbalseSuperficie){//ya que solo los acuiferos tienen porcentaje de perdida
                    porcentajeAguaEmbalsada += ((EmbalseSuperficie)embalse).getPorcentajePerdida();
                }
            }
        }

        System.out.println("Cantidad maxima para abastecimiento: " + capacidadMaxTotal + " hm3");
        System.out.println("Embalsado para abastecimiento: " + totalAguaEmbalsada + " hm3 (" 
        + porcentajeAguaEmbalsada + "%)");

    }


    public void informeEmbalses(){
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
                cantidadEmbalseSuperficie += embalse.getCapacidadMAX() - embalse.getCantidadAgua();
            else if(embalse instanceof EmbalseSubterraneo)
                cantidadEmbalseSubterraneo += embalse.getCapacidadMAX() - embalse.getCantidadAgua();
        }

        System.out.println("Pendiente en embalses de superficie: " + cantidadEmbalseSuperficie+ " hm3.");
        System.out.print("Pendiente en embalses subterraneos: " + cantidadEmbalseSubterraneo + " hm3.");

    }


}
