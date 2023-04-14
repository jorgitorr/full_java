package refugio_ejercicio_refactorizado;

import java.time.LocalDateTime;

public class Gato extends Animal{

    
    public Gato(String nombre, char sexo) {
        super(nombre, sexo);
    }

    @Override
    public String nombre() {
        return "Gato: " + super.toString();
    }

    @Override
    public LocalDateTime getFecha() {
        return super.getFecha();
    }

    
}
