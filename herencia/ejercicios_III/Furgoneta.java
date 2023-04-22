package ejercicios_III;

public class Furgoneta extends VehiculoCarga{


    public Furgoneta(String matricula, int duracion, int tara) {
        super(matricula, duracion, tara);
    }

    public Furgoneta(int tara) {
        super(tara);
    }

    @Override
    public double alquiler() {
        return 50*getDuracion()+20*getTara();
    }

    @Override
    public String toString() {
        return 
        "-----------------\n"+
        "FURGONETA\n" +
        "-----------------\n" +
        super.toString() + alquiler();
    }

}
