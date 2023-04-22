package ejercicios_III;
public abstract class VehiculoTransporte extends Vehiculo{
    private int plazas;

    public VehiculoTransporte(String matricula, int duracion, int plazas) {
        super(matricula, duracion);
        this.plazas = plazas;
    }

    public VehiculoTransporte(int plazas) {
        super();
        this.plazas = plazas;
    }

    public VehiculoTransporte() {
        this(1);
    }

    @Override
    public abstract double alquiler();

    

    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }

    @Override
    public String toString() {
        return super.toString() + 
        "\nplazas: " + plazas + 
        "\nimporte: ";
    }

    

    
    
}