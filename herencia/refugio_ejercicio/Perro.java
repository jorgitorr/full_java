package refugio_ejercicio;


public class Perro extends Animal{


    public Perro(String nombre, char sexo) {
        super(nombre, sexo);
    }

    @Override
    public String nombre() {
        return super.getNombre();
    }


}
