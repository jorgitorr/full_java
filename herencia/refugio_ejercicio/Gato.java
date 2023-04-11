package refugio_ejercicio;


public class Gato extends Animal{

    
    public Gato(String nombre, char sexo) {
        super(nombre, sexo);
    }

    @Override
    public String nombre() {
        return super.getNombre();
    }

}
