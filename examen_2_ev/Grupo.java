package examen_2_ev;
import java.util.Objects;

public class Grupo implements Comparable<Grupo>{
    private String nombre;
    private boolean publico;
    private String descripcion;

    public Grupo(String nombre) {
        this.nombre = nombre;
        this.descripcion = "";
        this.publico = true;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isPublico() {
        return publico;
    }

    public void setPublico(boolean publico) {
        this.publico = publico;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Grupo other = (Grupo) obj;
        return Objects.equals(this.nombre, other.nombre);
    }
    
    @Override
    public String toString() {
        String esPublico = publico?"Sí":"No";
        return  nombre + ", público: " + esPublico + " " + descripcion;
    }

    @Override
    public int compareTo(Grupo o) {
        return this.getNombre().compareTo(o.getNombre());
    }
    
}
