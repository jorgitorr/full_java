/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_music_temple;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author alumno
 */
public class MusicTemple {
    private List<Track>tracks;

    public MusicTemple() {
        tracks = new ArrayList<>();
    }
    
    public void addTrack(Track t){
        tracks.add(t);
    }

    public List<Track> getTracks() {
        return tracks;
    }
    
    
    List<Track>getByArtist(Artist artist){
        List<Track>getByArtist = null;
        
        if(!tracks.isEmpty()){
            getByArtist = new ArrayList<>();
            for(Track t: tracks)
                if(t.getArtist().equals(artist))
                    getByArtist.add(t);
        }
        
        return getByArtist;
    }
    
    
    List<Track>getBySong(String keyword){
        List<Track>getBySong =null;
        if(!tracks.isEmpty()){
            getBySong = new ArrayList<>();
            for(Track t:tracks)
                if(t.getSongName().contains(keyword))
                    getBySong.add(t);
        }
        return getBySong;
    }
    
    public int numTracks(){
        return tracks.size();
    }
    
    /**
     * sort the list 
     * @return the topSong
     */
    private Track topSong(){
        Track topSong = null;
        if(!tracks.isEmpty()){
            List<Track>orderedTracks = getOrderedTracks();
            topSong = orderedTracks.get(0);
        }

        return topSong;
    }
    
    
    private Map<Artist,List<Track>>artistSongs(){
        Map<Artist,List<Track>>artistSongs= null;
        
        if(artistSongs==null){
            artistSongs= new TreeMap<>(new ArtistComparator());
            for(Track track: tracks){
                if(!artistSongs.containsKey(track.getArtist()))
                    artistSongs.put(track.getArtist(), new ArrayList<>());
                artistSongs.get(track.getArtist()).add(track);
            }
        }

        return artistSongs;
    }
    
    private List<Track>getOrderedTracks(){
        List<Track>orderedTrackList = new LinkedList<>(tracks);
        Collections.sort(orderedTrackList, new TrackComparator());
        return orderedTrackList;
    }
    
    private List<Track>playList(int totalMaxTime){
        List<Track>playList = null;
        Collections.sort(tracks,new TrackComparator());
        if(!tracks.isEmpty()){
            List<Track>orderedTrackList = getOrderedTracks();
            int sumTime = 0;
            playList = new ArrayList<>();
            for(Track track:orderedTrackList){
                sumTime += track.getSongLength();
                if(sumTime<totalMaxTime)
                    playList.add(track);
                else
                    sumTime -= track.getSongLength();
            }
        }
        return playList;
    }
    
    public static void main(String[] args) {
        MusicTemple music = new MusicTemple();
        Artist shakira = new Artist("Shakira");
        Map<Artist,List<Track>>artistSongs= null;
        List<Track>playListTop = new ArrayList<>();
        Track track1 = new Track("Bzrp music sessions, Vol. 53", shakira, 120);
        Track track2 = new Track("Flower", new Artist("Miley", "Cyrus"), 190);
        Track track3 = new Track("TQG", new Artist("Karol", "G"), 185);
        Track track4 = new Track("Te Felicito", shakira, 175);
        Track track5 = new Track("Bzrp music sessions, Vol. 52", new Artist("Quevedo"), 183);
        
        music.addTrack(track1);
        music.addTrack(track2);
        music.addTrack(track3);
        music.addTrack(track4);
        music.addTrack(track5);
        System.out.println("+Adding song: " + track1.toStringFull());
        System.out.println("+Adding song: " + track2.toStringFull());
        System.out.println("+Adding song: " + track3.toStringFull());
        System.out.println("+Adding song: " + track4.toStringFull());
        System.out.println("+Adding song: " + track5.toStringFull());
        
        System.out.println("");
        
        System.out.println("->Play: " + track1.getSongName());
        track1.play();
        System.out.println("->Play: " + track2.getSongName());
        track2.play();
        System.out.println("->Play: " + track3.getSongName());
        track3.play();
        System.out.println("->Play: " + track1.getSongName());
        track1.play();
        System.out.println("->Play: " + track2.getSongName());
        track2.play();
        System.out.println("->Play: " + track4.getSongName());
        track4.play();
        System.out.println("->Play: " + track2.getSongName());
        track2.play();
        System.out.println("->Play: " + track4.getSongName());
        track4.play();
        
        System.out.println("");
        System.out.println("#Top song: " + music.topSong().toStringFull());
        System.out.println("");
        //comprobar la lista ordenada imprimiendola
        
        System.out.println("*****Listing songs by artist: " + shakira);
        
        artistSongs = music.artistSongs();
        music.getByArtist(shakira);
        
        System.out.println("");
        System.out.println("*****Listing songs that include: Bzrp");
        
        System.out.println(music.getBySong("Bzrp"));

        
        System.out.println("");
        System.out.println("Getting playlist of top songs less than 374 seconds");
        playListTop = music.playList(374);
        
        //print the tracks from playListTop
        for(Track track: playListTop)
            System.out.println(track.toStringFull());
        
        System.out.println("");
        track1.play();
        System.out.println("->Play: " + track1.getSongName());
        System.out.println("");
        System.out.println("#Top song: " + music.topSong().toStringFull());
        
        System.out.println("");
        System.out.println("*****All artists and their songs");
        for(Artist artist: artistSongs.keySet()){
            System.out.println(artist + ":" + artistSongs.get(artist));
        }
        
        
        
    }
    
}
