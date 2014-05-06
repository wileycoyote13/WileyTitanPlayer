/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package titanplayer;

import com.titan.bll.*;
import com.titanplayer.da.*;
import java.util.List;

/**
 *
 * @author w_coyote13
 */
public class TitanPlayer {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MP3Respository repo = new MP3Respository();
        MP3 song1 = new MP3();
        song1.setTitle("Tongue Tied");
        song1.setArtist("Grouplove");
        song1.setSongLength("3:38");
        repo.addMP3(song1);
    
    List<MP3> allMP3s = (List<MP3>)repo.getMP3();
    
    MP3 someone = repo.findById(allMP3s.get(0).getId());
    }
    
}
