package com.titan.bll;

public class Player {

  private final Playlist songlist;
  private int songlistIndex;
  private boolean isPlaying;

  public Player( Playlist playlistUse ) {
    songlist = playlistUse;
    songlistIndex = 0;
    isPlaying = false;
  }

  public Song getCurrentSong() {
    return songlist.get( songlistIndex );
  }
  
  public void play() {
    isPlaying = true;
  }

  public void stop() {
    isPlaying = false;
  }
  
  public boolean isPlaying() {
    return isPlaying;
  }
  
  public void skipForward() {
    if ( ( songlistIndex + 1 ) < songlist.size() ) {
      ++songlistIndex;
    }
  }

  public void goBack() {
    if ( ( songlistIndex - 1 ) >= 0 ) {
      --songlistIndex;
    }
  }

  public Playlist getPlaylist() {
    return songlist;
  }

}