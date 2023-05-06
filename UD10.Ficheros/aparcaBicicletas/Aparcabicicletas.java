public class Aparcabicicletas {
    private double x;
    private double y;
    private int id;
    private String barrio;
    private int aros;
    private boolean instalado;

    
    public Aparcabicicletas(double x, double y, int id, String barrio, int aros, boolean instalado) {
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
        result = prime * result + id;
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
        if (id != other.id)
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



    @Override
    public String toString() {
        return "\nid=" + id + "\n" +
        " barrio=" + barrio + "\n" +
        " aros=" + aros + "\n" +
        " instalado=" + instalado + "\n" +
        " x=" + x + "\n" +
        " y=" + y ;
    }



    public boolean isInstalado() {
        return instalado;
    }

    

    


}
