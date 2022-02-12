package project;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JFrame;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class PlayGames1 extends JFrame implements ActionListener{  
	homegames homegames1 = new homegames();
        public ArrayList<bone10> ba1 = new ArrayList<>();
        playstate1 state1 = new playstate1();
	public PlayGames1(){
		this.setSize(1000,800);
		this.add(homegames1);
                homegames1.BExit1.addActionListener(this);
                homegames1.BStart.addActionListener(this);
                state1.BExithome.addActionListener(this);
                state1.BPause.addActionListener(this);
                state1.Bresum.addActionListener(this);
                state1.Bclick.addActionListener(this);
                state1.Bstarts.addActionListener(this);

                
	}
	public void actionPerformed(ActionEvent e) {
            if(e.getSource()== homegames1.BStart){
		this.setLocationRelativeTo(null);
		this.remove(homegames1);
                this.setSize(1000,800);
                this.add(state1);
                state1.requestFocusInWindow();
		state1.timestart = false;
		state1.hpcat =5;
		state1.times = 100;
                state1.timestart=false;
            }
           else if(e.getSource() == state1.Bstarts){
                this.setLocationRelativeTo(null);
		this.remove(homegames1);
                this.setSize(1000,800);
                this.add(state1);
                state1.requestFocusInWindow();
		state1.timestart = false;
		state1.hpcat =5;
		state1.times = 100;
                state1.timestart=false;
           }

            else if(e.getSource() == state1.BExithome){
		System.exit(0);
            }else if(e.getSource() == homegames1.BExit1){
		System.exit(0);
            }else if(e.getSource() == state1.BPause){
		this.setLocationRelativeTo(null);
		this.setSize(1000,800);
		this.add(state1);
		state1.requestFocusInWindow();
		state1.time.suspend();
            }

            else if(e.getSource() == state1.Bresum){
		this.setLocationRelativeTo(null);
		this.setSize(1000,800);
		this.add(state1);
		state1.requestFocusInWindow();
		state1.time.resume();

            }
            this.validate();
            this.repaint();
	
	}
        
     public static void main(String[] args) {
            JFrame jf = new PlayGames1();
            jf.setSize(1000,800);
            jf.setTitle("Yuumi VS Nasus");
            jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
            jf.setVisible(true);
            jf.setLocationRelativeTo(null);
    }    


	
}
