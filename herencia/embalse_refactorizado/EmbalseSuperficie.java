


public class EmbalseSuperficie extends Embalse{
    private double porcentajePerdida;


    public EmbalseSuperficie(String nombre, int anioEntrada, double capacidadMAX, Uso uso, double perdidas) {
        super(nombre, anioEntrada, capacidadMAX, uso);
        porcentajePerdida = perdidas;/*me faltaba, se introduce en el constructor para añadirlo directamente,
        ya que puedo modificar los constructores desde los hijos*/
    }

    /**
     * a la cantidad a aportar se le resta el porcentaje de esa misma cantidad
     */
    @Override
    public boolean aportar(double cantidad) {
        double cantidadAportar = cantidad-(porcentajePerdida*aguaEmbalsada/100);
        return super.aportar(cantidadAportar);
    }


    @Override
    public double vaciar() {
        double vaciada = aguaEmbalsada;
        aguaEmbalsada = 0;
        return vaciada;
    }

    @Override
    public String toString() {
        return super.toString() + " perdida:" + porcentajePerdida + "%";
    }




    


}
