import java.util.HashSet;
import java.util.Set;

public class Usuario implements Comparable<Usuario>{
    private String nombreReal;
    private String nombreUsuario;
    private Set<Usuario>amigos;
    private Set<Grupo>grupos;
    private Fecha fecha;
    
    public Usuario(String nombreReal, String nombreUsuario, Fecha fecha) {
        this.nombreReal = nombreReal;
        this.nombreUsuario = nombreUsuario;
        this.fecha = fecha;
        this.amigos = new HashSet<>();
        this.grupos = new HashSet<>();
    }

    public void agregaGrupo(Grupo grupo) {
        grupos.add(grupo);
    }



    public void agregarAmigo(Usuario usuario){
        amigos.add(usuario);
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public int getNumeroAmigos(){
        return amigos.size();
    }

    @Override
    public String toString() {
        return nombreReal + " " + nombreUsuario;
    }

    public Set<Grupo> getGrupos() {
        return grupos;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombreReal == null) ? 0 : nombreReal.hashCode());
        result = prime * result + ((nombreUsuario == null) ? 0 : nombreUsuario.hashCode());
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
        Usuario other = (Usuario) obj;
        if (nombreReal == null) {
            if (other.nombreReal != null)
                return false;
        } else if (!nombreReal.equals(other.nombreReal))
            return false;
        if (nombreUsuario == null) {
            if (other.nombreUsuario != null)
                return false;
        } else if (!nombreUsuario.equals(other.nombreUsuario))
            return false;
        return true;
    }

    @Override
    public int compareTo(Usuario o) {
        return this.nombreReal.compareTo(o.nombreReal);
    }



    

    

}
