/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package radio_station;

/**
 *
 * @author jorgearru
 */
public class OwnAudio extends AudioElement{
    private String fichero;
    
    public OwnAudio(String nombre, String fichero) {
        super(nombre);
        this.fichero = fichero;
    }

    @Override
    public String toString() {
        return super.toString() + ", fichero=" + fichero;
    }

    @Override
    public int profit() {
        return 0;
    }

    @Override
    public void play() {
        AudioTools.play(fichero);
    }

    @Override
    public int duration() {
        return AudioTools.getDuration(fichero);
    }

    
    
}
