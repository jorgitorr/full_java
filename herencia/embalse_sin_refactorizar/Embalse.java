package embalse;

public abstract class Embalse {
    private String nombre;
    private int anioEntrada;
    private double capacidadMAX;
    private double cantidadAgua;
    private Uso uso;
    //uso


    public Embalse(String nombre, int anioEntrada, double capacidadMAX, Uso uso) {
        this.nombre = nombre;
        this.anioEntrada = anioEntrada;
        this.capacidadMAX = capacidadMAX;
        this.cantidadAgua = 0;
        this.uso = uso;
    }

    public boolean consumir(double cantidad){
        boolean sePuede = false;
        if(cantidad<cantidadAgua){
            sePuede = true;
            this.cantidadAgua -= cantidad;
        }

        return sePuede;
    }


    public boolean aportar(double cantidad){
        boolean sePuede = false;
        if(cantidadAgua<cantidad){
            cantidadAgua += cantidad;
            sePuede = true;
        }
        return sePuede; 
    }

    public boolean trasvasar(Embalse otroEmbalse, double cantidad){
        boolean sePuede = false;
        if(this.cantidadAgua>=cantidad && otroEmbalse.capacidadMAX>cantidad){
            this.cantidadAgua -= cantidad;
            otroEmbalse.cantidadAgua += cantidad;
            sePuede = true;
        }
        return sePuede;
    }

    public abstract double vaciar();

    @Override
    public String toString() {
        return nombre + " anio:" + anioEntrada + " maximo:" + capacidadMAX
                + " hm3 embalsado:" + String.format("%.2f",cantidadAgua) + " hm3";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnioEntrada() {
        return anioEntrada;
    }

    public void setAnioEntrada(int anioEntrada) {
        this.anioEntrada = anioEntrada;
    }

    public double getCapacidadMAX() {
        return capacidadMAX;
    }

    public void setCapacidadMAX(double capacidadMAX) {
        this.capacidadMAX = capacidadMAX;
    }

    public double getCantidadAgua() {
        return cantidadAgua;
    }

    public void setCantidadAgua(double cantidadAgua) {
        this.cantidadAgua = cantidadAgua;
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
        temp = Double.doubleToLongBits(cantidadAgua);
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
        if (Double.doubleToLongBits(cantidadAgua) != Double.doubleToLongBits(other.cantidadAgua))
            return false;
        return true;
    }

    
    
    

    
    
}
