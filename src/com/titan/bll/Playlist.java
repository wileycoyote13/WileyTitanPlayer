package com.titan.bll;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Playlist {
     
    public Playlist() {
        playlistSongList = new ArrayList<>();
    }
    
    private final List<Song> playlistSongList;

    public List<Song> getPlaylistSongList() {
        return playlistSongList;
    }
    
    private String playlistName;

    public String getPlaylistName() {
        return playlistName;
    }

    public int songCount() {
        return playlistSongList.size();
    }

    public void addSong(Song songAdded) {
        playlistSongList.add(songAdded);
    }

    public void removeSong(Song songRemoved) {
        playlistSongList.remove(songRemoved);
    }

    public Collection<Song> getAllSongs() {
        return Collections.unmodifiableCollection(playlistSongList);
    }

    Song get(int playlistIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
