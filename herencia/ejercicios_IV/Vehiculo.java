package herencia.ejercicios_IV;

public abstract class Vehiculo {
    private int velocidadActual;

    public Vehiculo(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public Vehiculo() {
        this(0);
    }

    public abstract void acelerar();

    public abstract void frenar();

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }
    

}
