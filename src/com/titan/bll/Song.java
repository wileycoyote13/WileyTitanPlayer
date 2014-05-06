package com.titan.bll;

import java.util.Objects;

public class Song {

  private final String title;
  private final String artist;

  public Song( String newTitle, String newArtist ) {
    title = newTitle;
    artist = newArtist;
  }
  
  public String getTitle() {
    return title;
  }
  
  public String getArtist() {
    return artist;
  }
  
  @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Song other = (Song) obj;
        if ((this.title == null) ? (other.title != null) : !this.title.equals(other.title)) {
            return false;
        }
        if (!((this.artist == null) ? (other.artist != null) : !this.artist.equals(other.artist))) {
        } else {
            return false;
      }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.title);
        hash = 61 * hash + Objects.hashCode(this.artist);
        return hash;
    }

}
