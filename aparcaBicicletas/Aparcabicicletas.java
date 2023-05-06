

public class Aparcabicicletas {
    double x;
    double y;
    int id;
    String barrio;
    int aros;
    boolean instalado;

    

    public Aparcabicicletas(double x, double y, int id, String barrio, int aros, boolean instalado) {
        this.x = x;
        this.y = y;
        this.id = id;
        this.barrio = barrio;
        this.aros = aros;
        this.instalado = instalado;
    }



    public String getBarrio() {
        return barrio;
    }



    @Override
    public String toString() {
        return "id: "+ id 
        + "\nnombre barrio: " + barrio 
        + "\naros: " + aros 
        + "\ninstalado: " + instalado 
        + "\ncoordenada x: " + x
        + "\ncoordenada y: " + y + "\n";
    }



    public boolean isInstalado() {
        return instalado;
    }



    public int getId() {
        return id;
    }



    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(x);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(y);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + id;
        result = prime * result + ((barrio == null) ? 0 : barrio.hashCode());
        result = prime * result + aros;
        result = prime * result + (instalado ? 1231 : 1237);
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
        Aparcabicicletas other = (Aparcabicicletas) obj;
        if (Double.doubleToLongBits(x) != Double.doubleToLongBits(other.x))
            return false;
        if (Double.doubleToLongBits(y) != Double.doubleToLongBits(other.y))
            return false;
        if (id != other.id)
            return false;
        if (barrio == null) {
            if (other.barrio != null)
                return false;
        } else if (!barrio.equals(other.barrio))
            return false;
        if (aros != other.aros)
            return false;
        if (instalado != other.instalado)
            return false;
        return true;
    }

    


    
    
}
