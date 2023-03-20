
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alumno
 */
public class Usuario {
    private String nombreUsuario;
    private String nombreReal;
    private Fecha registro;
    private Set<Usuario>amigos;
    private Set<Grupo>grupos;


    public Usuario(String nombreUsuario, String nombreReal) {
        this.nombreUsuario = nombreUsuario;
        this.nombreReal = nombreReal;
        this.registro = new Fecha(1,11,2000);
        this.amigos = new HashSet<>();
        this.grupos = new HashSet<>();
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getNombreReal() {
        return nombreReal;
    }

    public void setNombreReal(String nombreReal) {
        this.nombreReal = nombreReal;
    }

    public Fecha getRegistro() {
        return registro;
    }

    public void setRegistro(Fecha registro) {
        this.registro = registro;
    }

    public Set<Usuario> getAmigos() {
        return amigos;
    }

    public void setAmigos(Set<Usuario> amigos) {
        this.amigos = amigos;
    }

    public Set<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(Set<Grupo> grupos) {
        this.grupos = grupos;
    }
    
    
    
    public void actualizarGrupo(Grupo grupo){
        grupos.add(grupo);
    }
    
    public void agregarAmigo(Usuario amigo){
        if(amigos == null)
            amigos = new HashSet<>();
        amigos.add(amigo);
    }

    @Override
    public String toString() {
        return nombreUsuario + " (" +nombreReal + ')';
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.nombreUsuario, other.nombreUsuario)) {
            return false;
        }
        if (!Objects.equals(this.nombreReal, other.nombreReal)) {
            return false;
        }
        return Objects.equals(this.registro, other.registro);
    }

    
}
