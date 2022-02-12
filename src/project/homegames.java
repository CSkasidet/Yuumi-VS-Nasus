package project;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;


public class homegames extends JPanel{
        private ImageIcon feild = new ImageIcon(this.getClass().getResource("bgmain1.png"));
	private ImageIcon cat = new ImageIcon(this.getClass().getResource("cat.png"));
	private ImageIcon exit = new ImageIcon(this.getClass().getResource("butex.png"));
	private ImageIcon starts = new ImageIcon(this.getClass().getResource("butst.png"));
        private ImageIcon dog = new ImageIcon(this.getClass().getResource("dog5.png"));
	public JButton BStart = new JButton(starts);
	public JButton BExit1  = new JButton(exit);
	homegames(){
            setLayout(null);
            BExit1.setBounds(350, 600, 300,70);
            add(BExit1);
            BStart.setBounds(350,500,300,70);
            add(BStart);
	}
	public void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawImage(exit.getImage(),300,400,150,90,this);
            g.drawImage(feild.getImage(),0,0,1000,800,this);
            g.drawImage(cat.getImage(), -100, 450, 400, 400, this);
            g.drawImage(dog.getImage(), 700, 450, 400, 400, this);
            g.setFont(new Font("2005_iannnnnTKO",Font.CENTER_BASELINE,40));
            g.drawString("Exit",350,550);
            g.setColor(Color.ORANGE);
            g.setFont(new Font("2005_iannnnnTKO",Font.CENTER_BASELINE,90));		
            g.drawString("Yuumi VS Nasus",175,200);
	}
}