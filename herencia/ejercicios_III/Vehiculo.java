package ejercicios_III;

public abstract class Vehiculo{
    private String matricula;
    private int duracion;

    public Vehiculo(String matricula, int duracion) {
        this.matricula = matricula;
        this.duracion = duracion;
    }

    public Vehiculo() {
        this("",1);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public abstract double alquiler();

    @Override
    public String toString() {
        return "matricula=" + matricula +
        "\nduracion=" + duracion;
    }

    

}