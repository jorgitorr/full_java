/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_2_ev;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/**
 *
 * @author jorge
 */
public class Usuario {
    private String nombre;
    private List<Grupo>grupos;
    private Fecha fecha;
    private Set<Usuario>amigos;

    public Usuario(String nombre, List<Grupo>grupos, Fecha fecha) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.grupos = grupos;
        this.amigos = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(List<Grupo> grupos) {
        this.grupos = grupos;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public Set<Usuario> getAmigos() {
        return amigos;
    }

    public void setAmigos(Set<Usuario> amigos) {
        this.amigos = amigos;
    }
    
    public void addAmigo(Usuario usuario){
        if(usuario.getNombre()!=this.getNombre()){
            if(!amigos.equals(usuario))
                amigos.add(usuario);
        }
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
        return Objects.equals(this.amigos, other.amigos);
    }
    
}
