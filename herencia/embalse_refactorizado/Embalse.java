

public abstract class Embalse {
    private String nombre;
    private int anioEntrada;
    protected double capacidadMAX;/*me faltan los atributos protected -mirar-
    los atributos que se usan en el hijo son atributos protected*/
    protected double aguaEmbalsada;
    private Uso uso;
    //uso


    public Embalse(String nombre, int anioEntrada, double capacidadMAX, Uso uso) {
        this.nombre = nombre;
        this.anioEntrada = anioEntrada;
        this.capacidadMAX = capacidadMAX;
        this.aguaEmbalsada = 0;
        this.uso = uso;
    }

    public boolean consumir(double cantidad){
        boolean sePuede = false;
        if(cantidad<=aguaEmbalsada){
            sePuede = true;
            this.aguaEmbalsada -= cantidad;
        }

        return sePuede;
    }


    public boolean aportar(double cantidad){
        boolean sePuede = false;
        if(capacidadMAX >= cantidad + aguaEmbalsada){
            aguaEmbalsada += cantidad;
            sePuede = true;
        }
        return sePuede; 
    }

    public boolean trasvasar(Embalse otroEmbalse, double cantidad){
        boolean sePuede = false;
        if(this.aguaEmbalsada>=cantidad && otroEmbalse.capacidadMAX>= otroEmbalse.aguaEmbalsada + cantidad){
            /**tego que comprobar la capacidad de agua que tiene el otro embalse */
            sePuede = this.consumir(cantidad) && otroEmbalse.aportar(cantidad);
            /*this.cantidadAgua -= cantidad; reutiliza consumir y aportar, 
            está mal por que no se reutilizan los métodos anteriores
            otroEmbalse.cantidadAgua += cantidad;
            sePuede = true;*/
        }
        return sePuede;
    }

    public abstract double vaciar();

    @Override
    public String toString() {
        return nombre + " anio:" + anioEntrada + " maximo:" + String.format("%.2f",capacidadMAX)
                + " hm3 embalsado:" + String.format("%.2f",aguaEmbalsada) + " hm3";
    }

    public Uso getUso() {
        return uso;
    }

    public void setUso(Uso uso) {
        this.uso = uso;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + anioEntrada;
        long temp;
        temp = Double.doubleToLongBits(capacidadMAX);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(aguaEmbalsada);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Embalse other = (Embalse) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (anioEntrada != other.anioEntrada)
            return false;
        if (Double.doubleToLongBits(capacidadMAX) != Double.doubleToLongBits(other.capacidadMAX))
            return false;
        if (Double.doubleToLongBits(aguaEmbalsada) != Double.doubleToLongBits(other.aguaEmbalsada))
            return false;
        return true;
    }

    
    
    

    
    
}
