

public class Aparcabicicletas {
    private double x;
    private double y;
    private int id;
    private String barrio;
    private int aros;
    private String instalado;

    
    public Aparcabicicletas(double x, double y, int id, String barrio, int aros, String instalado) {
        this.x = x;
        this.y = y;
        this.id = id;
        this.barrio = barrio;
        this.aros = aros;
        this.instalado = instalado;
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
        result = prime * result + ((instalado == null) ? 0 : instalado.hashCode());
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
        if (instalado == null) {
            if (other.instalado != null)
                return false;
        } else if (!instalado.equals(other.instalado))
            return false;
        return true;
    }


    public double getX() {
        return x;
    }


    public double getY() {
        return y;
    }


    public int getId() {
        return id;
    }


    public String getBarrio() {
        return barrio;
    }


    public int getAros() {
        return aros;
    }


    public String getInstalado() {
        return instalado;
    }


    @Override
    public String toString() {
        return "Barrio=" + barrio + 
        ", id=" + id +
        "x=" + x + 
        ", y=" + y + 
        ", aros=" + aros +
        ", instalado=" + instalado;
    }


    public String toStringId() {
        return "id=" + id + 
        "barrio=" + barrio 
        + "aros=" + aros
        + "instalado=" + instalado +
        "x=" + x + 
        ", y=" + y;
    }

    

    


}
