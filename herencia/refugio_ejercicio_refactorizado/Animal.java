package refugio_ejercicio_refactorizado;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

public abstract class Animal {
    private String nombre;
    private char sexo;//m o h
    private LocalDateTime fecha;
    private static int id;
    private Set<Dosis>vacunas;//para que no se repitan

    public Animal(String nombre, char sexo) {
        id=0;//cuando entra al refugio se le pone el id
        this.nombre = nombre;
        this.sexo = sexo;
        this.fecha = LocalDateTime.now();
        this.vacunas = new HashSet<>();
    }


    public abstract String nombre();


    public String getNombre() {
        return nombre;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }


    @Override
    public String toString() {
        return nombre;
    }


    public static int getId() {
        return id;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + sexo;
        result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Animal other = (Animal) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (sexo != other.sexo)
            return false;
        if (fecha == null) {
            if (other.fecha != null)
                return false;
        } else if (!fecha.equals(other.fecha))
            return false;
        return true;
    }


    public char getSexo() {
        return sexo;
    }


    public Set<Dosis> getVacunas() {
        return vacunas;
    }


    public void setDosis(Dosis dosis){
        vacunas.add(dosis);
    }


}
