package refugio_ejercicio_refactorizado;


public class Gato extends Animal{

    
    public Gato(String nombre, char sexo) {
        super(nombre, sexo);
    }

    @Override
    public String nombre() {
        return "Gato: " + super.toString();
    }

}
