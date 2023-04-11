/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package radio_station;

/**
 *
 * @author jorgearru
 */
public class AudioTools {
    
    public static int getDuration(String nombre){
        return (int)(Math.random()*100+1);
    }

    public static void play(String fichero){
        System.out.println("Reproduciendo: " + fichero);
    }
}
