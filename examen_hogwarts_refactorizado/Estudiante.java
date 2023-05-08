import java.util.Set;

public class Estudiante {
    private String nombre;
    private Set<String>respuestas;
    private Casas casa;


    public void setCasa(Casas casa) {
        this.casa = casa;
    }

    public Casas getCasa() {
        return casa;
    }

    public Estudiante(String nombre, Set<String> respuestas) {
        this.nombre = nombre;
        this.respuestas = respuestas;
    }

    public Set<String> getRespuestas() {
        return respuestas;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
    

}
