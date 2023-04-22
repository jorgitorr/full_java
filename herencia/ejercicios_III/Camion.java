package ejercicios_III;

public class Camion extends VehiculoCarga{

    public Camion(String matricula, int duracion, int tara) {
        super(matricula, duracion, tara);
    }

    public Camion(int tara) {
        super(tara);
    }

    @Override
    public double alquiler() {
        Furgoneta alquilerFurgoneta = new Furgoneta(getMatricula(), getDuracion(), getTara());
        double alquiler = alquilerFurgoneta.alquiler()+40;
        return alquiler;
    }

    @Override
    public String toString() {
        return "-------------\n"+
        "CAMIÓN\n" +
        "-----------------\n" +
        super.toString() + alquiler();
    }
    
    
    
}
