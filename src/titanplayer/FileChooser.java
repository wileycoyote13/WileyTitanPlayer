
package titanplayer;

import java.io.File;
import javax.swing.*;


public class FileChooser extends JFrame {

    public FileChooser() {
	
        JFileChooser fc = new JFileChooser();
        fc.addChoosableFileFilter(new mp3Filter());
        int returnVal = fc.showOpenDialog(this);
        
        File selectedFile = null;
        
        if(returnVal == JFileChooser.APPROVE_OPTION) {
            selectedFile = fc.getSelectedFile();
        }  
    }
}
