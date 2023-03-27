package herencia.ejercicios_IV;

public class BicicletaMontania extends Bicicleta{
    private int suspension;
    
    
    public BicicletaMontania(int velocidadActual, int platoActual, int pinionActual, int suspension) {
        super(velocidadActual, platoActual, pinionActual);
        this.suspension = suspension;
    }


    public BicicletaMontania(int suspension) {
        super();
        this.suspension = suspension;
    }


    public void cambiarSuspension(int suspension){
        this.suspension = suspension;
    }

    public void acelerarM() {
        super.setVelocidadActual(super.getVelocidadActual()*3);
    }

    @Override
    public String toString() {
        return super.toString() + ", suspension=" + suspension;
    }


    

    
}

