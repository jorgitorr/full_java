import java.util.Set;

public class Estudiante {
    private String nombre;
    private Set<String>respuestas;
    private Casa casa;


    public void setCasa(Casa casa) {
        this.casa = casa;
    }

    public Casa getCasa() {
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
