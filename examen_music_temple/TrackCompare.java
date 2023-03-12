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
public class TrackCompare implements Comparator<Track>{

    @Override
    public int compare(Track t, Track t1) {
        int position = 0;
        if(t.getPlayCount()==t1.getPlayCount()){
            if(t.getArtist().fullName().equals(t1.getArtist().fullName()))
                position = t.getSongName().compareTo(t1.getSongName());
            else
                position = t.getArtist().fullName().compareTo(t1.getArtist().fullName());     
        }else
            position = t1.getPlayCount() - t.getPlayCount();
        
        return position;
    }

    
    
}
