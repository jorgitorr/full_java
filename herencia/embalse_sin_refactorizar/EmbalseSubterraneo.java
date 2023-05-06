package embalse;

public class EmbalseSubterraneo extends Embalse{
    private double cantidadMinima;//porcentaje de la capacidadMax del embalse

    public EmbalseSubterraneo(String nombre, int anioEntrada, double capacidadMAX, Uso uso) {
        super(nombre, anioEntrada, capacidadMAX, uso);
    }

    @Override
    public boolean trasvasar(Embalse otroEmbalse, double cantidad) {
        boolean sePuede = false;
        if(cantidad>cantidadMinima){
            sePuede = true;
            super.trasvasar(otroEmbalse, cantidad);
        }
        return sePuede;
    }

    public double getCantidadMinima() {
        return cantidadMinima;
    }

    public void setCantidadMinima(double cantidadMinima) {
        this.cantidadMinima = cantidadMinima;
    }

    @Override
    public double getCantidadAgua() {
        return super.getCantidadAgua();
    }

    @Override
    public void setCantidadAgua(double cantidadAgua) {
        super.setCantidadAgua(cantidadAgua);
    }

    /**
     * vacía el embalse y devuelve la cantidad de agua.
     */
    @Override
    public double vaciar() {
        setCantidadAgua(cantidadMinima);
        return getCantidadAgua();
    }

    @Override
    public String toString() {
        return super.toString() + " minimo:" + cantidadMinima + " hm3";
    }

    
    
}
