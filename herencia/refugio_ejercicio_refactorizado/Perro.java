package refugio_ejercicio_refactorizado;


public class Perro extends Animal{


    public Perro(String nombre, char sexo) {
        super(nombre, sexo);
    }

    @Override
    public String nombre() {
        return "Perro: " + super.toString();
    }


}
