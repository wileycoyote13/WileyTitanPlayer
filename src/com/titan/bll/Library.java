package com.titan.bll;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Library {
    
    public static List<Song> songList;    
    
    public Library() {
        songList = new ArrayList<>();        
    }
    
    public void addSong(Song songAdded) {
        songList.add(songAdded);
    }    
    
    public int songCount() {
        return songList.size();        
    }
    
    public void removeSong(Song songRemoved) {
        songList.remove(songRemoved);
    }
    
    public void containsSong(Song songInList) {
        songList.contains(songInList);
    }

    public List getAllSongs() {
        return Collections.unmodifiableList(songList);
    }
    
    public void sortByTitle() {
        Collections.sort(songList, new TitleSorter());
    }
    
    public void sortByArtist () {
        Collections.sort(songList, new ArtistSorter());
    }
}