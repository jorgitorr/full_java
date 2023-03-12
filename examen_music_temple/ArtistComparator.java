/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_music_temple;

import java.util.Comparator;

/**
 *
 * @author alumno
 */
public class ArtistComparator implements Comparator<Artist>{

    @Override
    public int compare(Artist t, Artist t1) {
        return t.fullName().compareTo(t1.fullName());
    }
    
}
