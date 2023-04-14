package refugio_ejercicio_refactorizado;

import java.time.LocalDateTime;

public class Perro extends Animal{


    public Perro(String nombre, char sexo) {
        super(nombre, sexo);
    }

    @Override
    public String nombre() {
        return "Perro: " + super.toString();
    }

    @Override
    public LocalDateTime getFecha() {
        return super.getFecha();
    }

    

}
