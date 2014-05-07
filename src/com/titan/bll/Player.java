package com.titan.bll;

import java.io.BufferedInputStream;
import java.io.FileInputStream;


public class Player {

  private final Playlist songlist;
  private Player player;
  private int songlistIndex;
  private boolean isPlaying;
  private String fileName;

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
    try
        {  
            FileInputStream fis = new FileInputStream(fileName);  
            BufferedInputStream bis = new BufferedInputStream(fis);
            player.play();
            
        }  
        catch (Exception e) 
        {  
            System.out.println("Sorry, there is an error playing" + fileName + "!" );  
            System.out.println(e);  
        }
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

    public void rewind() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}