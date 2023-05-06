package embalse;


public class EmbalseSuperficie extends Embalse{
    private double porcentajePerdida;


    public EmbalseSuperficie(String nombre, int anioEntrada, double capacidadMAX, Uso uso) {
        super(nombre, anioEntrada, capacidadMAX, uso);
        porcentajePerdida = 0;
    }

    /**
     * a la cantidad a aportar se le resta el porcentaje de esa misma cantidad
     */
    @Override
    public boolean aportar(double cantidad) {
        double cantidadAportar = cantidad-(porcentajePerdida*cantidad/100);
        return super.aportar(cantidadAportar);
    }

    public double getPorcentajePerdida() {
        return porcentajePerdida;
    }


    public void setPorcentajePerdida(double porcentajePerdida) {
        setCantidadAgua(getCantidadAgua()-(porcentajePerdida*super.getCantidadAgua())/100);
        this.porcentajePerdida = porcentajePerdida;
    }

    @Override
    public double getCantidadAgua() {
        return super.getCantidadAgua();
    }

    @Override
    public void setCantidadAgua(double cantidadAgua) {
        super.setCantidadAgua(cantidadAgua);
    }

    @Override
    public double vaciar() {
        setCantidadAgua(0);
        return 0;
    }

    @Override
    public String toString() {
        return super.toString() + " perdida:" + getPorcentajePerdida() + "%";
    }




    


}
