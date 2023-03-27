package herencia.ejercicios_III;

public class Bus extends VehiculoTransporte {

    
    public Bus(String matricula, int duracion, int plazas) {
        super(matricula, duracion, plazas);
    }

    public Bus(int plazas) {
        super(plazas);
    }

    public Bus() {
        this(0);
    }

    @Override
    public double alquiler() {
        Coche alquilerCoche = new Coche(getMatricula(),getDuracion(),getPlazas());
        double alquiler = alquilerCoche.alquiler();
        alquiler += 2*getPlazas();

        return alquiler;
    }

    @Override
    public String toString() {
        return "-------------\n"+
        "BUS\n" +
        "-----------------\n" +
        super.toString() + alquiler();
    }

    

    
    
}
