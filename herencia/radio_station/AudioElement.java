/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package radio_station;

/**
 *
 * @author jorgearru
 */
public abstract class AudioElement extends AudioTools{
    private String nombre;

    public AudioElement(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    
    public abstract void play();//no se puede reproducir un elemento que no se sabe de que tipo es


    public abstract int duration();

    public abstract int profit();

    @Override
    public String toString() {
        return "\nnombre=" + nombre + "(" +getDuration(nombre) + ")";
    }
    
    
    
}
