
package titanplayer;

import java.io.File;
import javax.swing.filechooser.FileFilter;


public class mp3Filter extends FileFilter{
    
    @Override
    public boolean accept(File f) {
    if (f.isDirectory())
      return true;
    
    String s = f.getName();
    int i = s.lastIndexOf('.');

    if (i > 0 && i < s.length() - 1)
        if (s.substring(i + 1).toLowerCase().equals("media" ) || s.substring(i + 1).toLowerCase().equals("bs" ))
        return true;

    return false;
    
  }

    @Override
    public String getDescription() {
        return "\\*.mp3";
    }

}
