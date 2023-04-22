package ejercicios_III;

public abstract class VehiculoCarga extends Vehiculo{
    private int tara;

    
    public VehiculoCarga(String matricula, int duracion, int tara) {
        super(matricula, duracion);
        this.tara = tara;
    }

    public VehiculoCarga(int tara) {
        super();
        this.tara = tara;
    }

    @Override
    public abstract double alquiler();

    @Override
    public String toString() {
        return super.toString() + 
        "\ntara: " + tara + 
        "\nimporte: ";
    }

    public int getTara() {
        return tara;
    }

    public void setTara(int tara) {
        this.tara = tara;
    }

}
