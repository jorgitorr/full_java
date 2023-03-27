package herencia.ejercicios_III;

public class Coche extends VehiculoTransporte{

    
    public Coche(String matricula, int duracion, int plazas) {
        super(matricula, duracion, plazas);
    }

    public Coche() {
        super();
    }

    @Override
    public double alquiler() {
        return 50*getDuracion()+1.5*getPlazas()*getDuracion();
    }

    @Override
    public String toString() {
        return 
        "----------\n" +
        "COCHE\n" +
        "----------\n" + 
        super.toString() + alquiler();
    }

    
    
}
