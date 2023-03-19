/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller_reparaciones;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author jorge
 */
public class Coche {
    private String matricula;
    private String direccionDuenio;
    private List<Reparacion>reparaciones;

    public Coche(String matricula, String direccionDuenio) {
        this.matricula = matricula;
        this.direccionDuenio = direccionDuenio;
        this.reparaciones = new LinkedList<>();
    }
    
    public void anadeReparacion(Reparacion r){
        if(r.getKms()>reparaciones.get(reparaciones.size()-1).getKms()){
            reparaciones.add(r);
        }else
            System.out.println("ERROR");
    }
    
    public Reparacion getUltimaReparacion(){
        Reparacion r = null;
        if(!reparaciones.isEmpty())
            r = reparaciones.get(reparaciones.size()-1);
        
        return r;
    }
    
    
    public List<Reparacion> buscaReparaciones(String keyword){
        List<Reparacion>reparacionesBusqueda = null;
        
        for(Reparacion r: reparaciones){
            if(r.getDescripcion().contains(keyword)){
                if(reparacionesBusqueda==null)
                    reparacionesBusqueda = new LinkedList<>();
                reparacionesBusqueda.add(r);
            }
        }
        
        return reparacionesBusqueda;
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
        final Coche other = (Coche) obj;
        return Objects.equals(this.matricula, other.matricula);
    }

    @Override
    public String toString() {
        return "Coche{" + "matricula=" + matricula + ", direccionDuenio=" + direccionDuenio + ", reparaciones=" + reparaciones + '}';
    }
    
    
    
    
    
    
}
