package ejercicios_IV;

public class BicicletaTandem extends Bicicleta{
    private int suspension;
    private int numAsientos;
    
    public BicicletaTandem(int velocidadActual, int platoActual, int pinionActual, int suspension, int numAsientos) {
        super(velocidadActual, platoActual, pinionActual);
        this.suspension = suspension;
        this.numAsientos = numAsientos;
    }
    public BicicletaTandem(int suspension, int numAsientos) {
        super();
        this.suspension = suspension;
        this.numAsientos = numAsientos;
    }

    public void acelerarT() {
        super.setVelocidadActual(super.getVelocidadActual()*4);
    }
    @Override
    public String toString() {
        return super.toString() + ", suspension=" + suspension + ", numAsientos=" + numAsientos;
    }

    public void mensaje(){
        System.out.println("Mensaje");
    }
    

}
