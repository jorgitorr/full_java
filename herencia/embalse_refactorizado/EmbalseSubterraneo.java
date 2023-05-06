

public class EmbalseSubterraneo extends Embalse{
    private double porcentajeMinimo;//porcentaje de la capacidadMax del embalse

    public EmbalseSubterraneo(String nombre, int anioEntrada, double capacidadMAX, Uso uso, double minimo) {
        super(nombre, anioEntrada, capacidadMAX, uso);
        porcentajeMinimo = minimo;
    }

    @Override
    public boolean trasvasar(Embalse otroEmbalse, double cantidad) {
        boolean sePuede = false;
        if(cantidad>porcentajeMinimo){
            sePuede = true;
            super.trasvasar(otroEmbalse, cantidad);
        }
        return sePuede;
    }

    public double cantidadMinima() {
        return porcentajeMinimo*capacidadMAX/100;
    }

    /**
     * vacía el embalse y devuelve la cantidad de agua.
     */
    @Override
    public double vaciar() {
        double vaciada = aguaEmbalsada - cantidadMinima();//toda el agua del embalse menos la cantidad mínima obligatoria que debe tener
        consumir(vaciada);
        return vaciada;
    }

    @Override
    public String toString() {
        return super.toString() + " minimo:" + String.format("%.2f",porcentajeMinimo) + " hm3";
    }

    @Override
    public boolean consumir(double cantidad) {
        boolean sePuede = false;
        if(cantidadMinima()<=(aguaEmbalsada-cantidad))
            sePuede = super.consumir(cantidad);
        return sePuede;
    }

    

    
    
}
