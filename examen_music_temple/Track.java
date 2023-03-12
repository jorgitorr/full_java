/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_music_temple;

/**
 *
 * @author alumno
 */
public class Track {
    private String songName;
    private Artist artist;
    private int songLength;
    private int playCount;
    private static int numTracks;

    public Track(String songName, Artist artist, int songLength) {
        this.songName = songName;
        this.artist = artist;
        this.songLength = songLength;
        this.playCount = 0;
        numTracks++;
    }

    public String getSongName() {
        return songName;
    }

    public Artist getArtist() {
        return artist;
    }

    public int getSongLength() {
        return songLength;
    }

    public int getPlayCount() {
        return playCount;
    }

    public static int getNumTracks() {
        return numTracks;
    }
    
    public void play(){
        playCount++;
    }

    @Override
    public String toString() {
        return artist + "-" + songName;
    }
    
    
    public String toStringFull(){
        return "song=" + songName + " " + " - artist=" + artist + " - " + songLength + "sg";
    }
}
