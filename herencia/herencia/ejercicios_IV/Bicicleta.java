package herencia.ejercicios_IV;

public class Bicicleta extends Vehiculo implements Imprimible {
    private int platoActual;
    private int pinionActual;

    
    public Bicicleta(int velocidadActual, int platoActual, int pinionActual) {
        super(velocidadActual);
        this.platoActual = platoActual;
        this.pinionActual = pinionActual;
    }

    public Bicicleta() {
        this(0,1,1);
    }

    public void acelerar(){
        setVelocidadActual(getVelocidadActual()*2);
    }

    public void frenar(){
        setVelocidadActual(getVelocidadActual()/2);
    }

    public void cambiarPlato(int plato){
        this.platoActual = plato;
    }

    public void cambiarPinion(int pinion){
        this.pinionActual = pinion;
    }

    public void cambiarPlato(){
        platoActual = 1;
    }

    public void cambiarPinion(){
        pinionActual = 1;
    }

    public int getVelocidadActual() {
        return super.getVelocidadActual();
    }

    public void setVelocidadActual(int velocidadActual) {
        super.setVelocidadActual(velocidadActual);
    }

    public int getPlatoActual() {
        return platoActual;
    }

    public void setPlatoActual(int platoActual) {
        this.platoActual = platoActual;
    }

    public int getPinionActual() {
        return pinionActual;
    }

    public void setPinionActual(int pinionActual) {
        this.pinionActual = pinionActual;
    }

    @Override
    public String toString() {
        return "velocidadActual=" + getVelocidadActual() + ", platoActual=" + platoActual + ", pinionActual="
                + pinionActual;
    }

    @Override
    public void imprime() {
        System.out.println("va: " + getVelocidadActual());
        System.out.println("pa: " + pinionActual);
        System.out.println("pa: " + platoActual);
    }

    public static void main(String[] args) {
        Bicicleta miBicicleta = new Bicicleta(20,2,2);
        Bicicleta tuBicicleta = new Bicicleta();

        miBicicleta.cambiarPinion();
        miBicicleta.acelerar();

        System.out.println(miBicicleta);

        miBicicleta.cambiarPinion(3);
        miBicicleta.frenar();

        System.out.println(miBicicleta);

        
    }

    @Override
    public void getAtributos() {
        System.out.println("va: " +this.getVelocidadActual());
        System.out.println("piniona: " + this.pinionActual);
        System.out.println("platoa: " + this.platoActual);
    }

}