package project;

import project.PlayGames1;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import java.io.File;
import java.io.InputStream;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
/**
 *
 * @author ssp
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         JFrame jf = new PlayGames1();
            jf.setSize(1000,800);
            jf.setTitle("Yuumi VS Nasus ");
            jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
            jf.setVisible(true);
            jf.setLocationRelativeTo(null);
            String filepath="sound.wav";
            sound musicObject =new sound();
            musicObject.playMusic(filepath);
            
    }
    
}
