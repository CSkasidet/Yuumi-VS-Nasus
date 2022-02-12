
package project;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.geom.Rectangle2D;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

class playstate1 extends JPanel implements ActionListener {
    private final ImageIcon imgstate1 = new ImageIcon(this.getClass().getResource("bgmain.jpg"));
    private final ImageIcon imgstate2 = new ImageIcon(this.getClass().getResource("bg2.jpg"));
   
    private final ImageIcon pause = new ImageIcon(this.getClass().getResource("puse.png"));
    private final ImageIcon resum = new ImageIcon(this.getClass().getResource("resum.png"));
    private final ImageIcon back = new ImageIcon(this.getClass().getResource("back.png"));
    private final ImageIcon catdead = new ImageIcon(this.getClass().getResource("catdead.png"));
    private final ImageIcon dog = new ImageIcon(this.getClass().getResource("dog1.png"));
    private final ImageIcon dogdead = new ImageIcon(this.getClass().getResource("dog5.png"));
    private final ImageIcon click = new ImageIcon(this.getClass().getResource("button.png"));
    private final ImageIcon click1 = new ImageIcon(this.getClass().getResource("button.png"));
    private final ImageIcon click2 = new ImageIcon(this.getClass().getResource("button.png"));
    private final ImageIcon click3 = new ImageIcon(this.getClass().getResource("button.png"));
    private final ImageIcon click4 = new ImageIcon(this.getClass().getResource("button.png"));
    private final ImageIcon Bstart = new ImageIcon(this.getClass().getResource("butst.png"));

 

    
    dog dog1 = new dog();
    cat cat1 = new cat();
    floor floor1 = new floor();
    ImageIcon feildover = new ImageIcon(this.getClass().getResource("bgover.jpg"));
    ImageIcon feildwin = new ImageIcon(this.getClass().getResource("bgwin.png"));
    ImageIcon exitover = new ImageIcon(this.getClass().getResource("exit.png"));
    ImageIcon restart = new ImageIcon(this.getClass().getResource("start.jpg"));
    JButton BStartover = new JButton(restart);
    JButton BExitover  = new JButton(exitover);
    
    public ArrayList<bone10> ba1 = new ArrayList<>();
 
        
    private JLabel score = new JLabel(); 
    public JButton BPause  = new JButton(pause);
    public JButton BExithome  = new JButton(back); 
    public JButton Bresum  = new JButton(resum);
    public JButton Bclick  = new JButton(click);
    public JButton Bclick1  = new JButton(click1);
    public JButton Bclick2  = new JButton(click2);
    public JButton Bclick3  = new JButton(click3);
    public JButton Bclick4  = new JButton(click4);
    public JButton Bstarts  = new JButton(Bstart);


    
            
    public int times ;
    
   
    public int hpcat = 5;
    public int hpdog = 8;
    public int hpdog2 = 10;
    public int x=10,y=10;
    int time_paralyze=5;
    boolean paralyze1 = false;
    boolean timestart = true;
    
    Thread time = new Thread(new Runnable(){
        public void run(){
            while(true){
                try{
                    Thread.sleep(10);
                }catch(Exception e){ }
                    
                if(timestart == false){
                    repaint();
                    }
		}
            }
	});
    Thread gate = new Thread(new Runnable(){
        public void run(){
            while(true){
                try{
                    Thread.sleep(10);
                }catch(Exception e){ }
                  
                if(timestart == false){
                    repaint();
                    }
		}
            }
	});
    	Thread paralyze = new Thread(new Runnable(){
            public void run(){
		while (true){
			if(time_paralyze < 1){
                            paralyze1 = false;
                            time_paralyze = 5;
			}
			try{
                            Thread.sleep(5000);
			}catch(InterruptedException e){e.printStackTrace();}
		}
            }
	});
    Thread t = new Thread(new Runnable(){
            public void run() {
		while(true){
                	if(timestart == false){
                            times = (times-1) ;
                            if(paralyze1){
				time_paralyze--;
                            }
			}
			try{
                            Thread.sleep(1000);
			}catch(InterruptedException e)
			{
                            e.printStackTrace();
			}
		}
            }
	});
	
    playstate1(){
		this.setFocusable(true);
		this.setLayout(null);
		BPause.setBounds(850,100,40,40);
		BExithome.setBounds(850,30,40,40);
		Bresum.setBounds(850, 170, 40,40);
                Bclick.setBounds(0, 550, 25, 25);
                Bclick1.setBounds(30, 550, 25, 25);
                Bclick2.setBounds(60, 550, 25, 25);
                Bclick3.setBounds(90, 550, 25, 25);
                Bclick4.setBounds(120, 550, 25, 25);
                Bstarts.setBounds(400, 500, 200, 100);
                
		BPause.addActionListener(this);
		BExithome.addActionListener(this);
		Bresum.addActionListener(this);
		BExithome.addActionListener(this);
                Bclick.addActionListener(this);
                this.add(Bclick);
                this.add(Bclick1);
                this.add(Bclick2);
                this.add(Bclick3);
                this.add(Bclick4);
        
		this.add(BPause);
		this.add(BExithome);
		this.add(score);
		this.add(Bresum);
                time.start();
                Bclick.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        ba1.add(new bone10(40));                        
                    }
                });
                Bclick1.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        ba1.add(new bone10(60));                        
                    }
                });
                Bclick2.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        ba1.add(new bone10(80));                        
                    }
                });
                Bclick3.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        ba1.add(new bone10(100));                        
                    }
                });
                Bclick4.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        ba1.add(new bone10(120));                        
                    }
                });
                t.start();
    }
    public void paintComponent(Graphics g){
            super.paintComponent(g);
            if(hpcat<=0){
                this.remove(BPause);
                this.remove(Bresum);
                this.remove(BExithome);
                this.remove(Bclick);
                this.remove(Bclick1);
                this.remove(Bclick2);
                this.remove(Bclick3);
                this.remove(Bclick4);
                this.setLayout(null);
                g.drawImage(feildover.getImage(),0,0,1000,800,this);
		g.setColor(Color.ORANGE);
                g.setFont(new Font("Hobo Std",Font.HANGING_BASELINE,40));		     
                g.setFont(new Font("Hobo Std",Font.HANGING_BASELINE,70));
                
            }
            else if(hpdog2<=0){
                this.remove(BPause);
                this.remove(Bresum);
                this.remove(BExithome);
                this.remove(Bclick);
                this.remove(Bclick1);
                this.remove(Bclick2);
                this.remove(Bclick3);
                this.remove(Bclick4);
                this.setLayout(null);
                g.drawImage(feildwin.getImage(),0,0,1000,800,this);
		g.setColor(Color.ORANGE);
                g.setFont(new Font("Hobo Std",Font.HANGING_BASELINE,40));		     
                g.setFont(new Font("Hobo Std",Font.HANGING_BASELINE,70));
                
            }
            else if(hpdog<=0){
                {
                this.add(Bclick);
                this.add(Bclick1);
                this.add(Bclick2);
                this.add(Bclick3);
                this.add(Bclick4);
                this.remove(Bstarts);
                g.drawImage(imgstate2.getImage(),0,0,1000,800,this);
                g.drawImage(cat1.getImage(), cat1.x, cat1.y, 100, 100, this);
                g.drawImage(dog1.getImage(), dog1.x, dog1.y, 100, 100, this);
                g.setFont(new Font("2005_iannnnnTKO",Font.CENTER_BASELINE,40));
                g.drawString("Yuumi",0,100);
                g.drawString("Nasus", 770,100);
                for(int i=0;i<ba1.size();i++){
                    bone10 ba = ba1.get(i);
                    
      		    g.drawImage(ba.bone[ba.count%3].getImage(), ba.x, ba.y,50,50, null);
                    ba.move();
            }
                for(int j=0 ; j<ba1.size();j++){
		    	if(Intersect(dog1.getbound(),ba1.get(j).getbound())){
			    ba1.remove(j);
                            hpdog2-=1;
                            dog1.x=dog1.random(700,900);
                            
                            repaint();                                  
			}                        
		    }
                for(int j=0 ; j<ba1.size();j++){
                    if(Intersect(floor1.getbound(),ba1.get(j).getbound())){
                        ba1.remove(j);
                        hpcat-=1;
                    }
                }
                g.setFont(new Font("Hobo Std",Font.HANGING_BASELINE,30));
                g.drawString("Time "+times,335,150);
                g.drawString("HP DOG "+hpdog2,600,200);
                g.drawString("HP CAT "+hpcat,100,200);
                
              
        }
                
            }
            else{
                this.add(Bclick);
                this.add(Bclick1);
                this.add(Bclick2);
                this.add(Bclick3);
                this.add(Bclick4);
                this.remove(Bstarts);
                g.drawImage(imgstate1.getImage(),0,0,1000,800,this);
                g.drawImage(cat1.getImage(), cat1.x, cat1.y, 100, 100, this);
                g.drawImage(dog1.getImage(), dog1.x, dog1.y, 100, 100, this);
                g.setFont(new Font("2005_iannnnnTKO",Font.CENTER_BASELINE,40));
                g.drawString("Yuumi",0,100);
                g.drawString("Nasus", 770,100);
                for(int i=0;i<ba1.size();i++){
                    bone10 ba = ba1.get(i);
                    
      		    g.drawImage(ba.bone[ba.count%3].getImage(), ba.x, ba.y,50,50, null);
                    ba.move();
            }
                for(int j=0 ; j<ba1.size();j++){
		    	if(Intersect(dog1.getbound(),ba1.get(j).getbound())){
			    ba1.remove(j);
                            hpdog-=1;
                            dog1.x=dog1.random(700,900);
                            repaint();                                  
			}                        
		    }
                for(int j=0 ; j<ba1.size();j++){
                    if(Intersect(floor1.getbound(),ba1.get(j).getbound())){
                        ba1.remove(j);
                        hpcat-=1;
                    }
                    else{
                        
                    }
                }
                g.setFont(new Font("Hobo Std",Font.HANGING_BASELINE,30));
                g.drawString("Time "+times,335,150);
                g.drawString("HP DOG "+hpdog,600,200);
                g.drawString("HP CAT "+hpcat,100,200);
              
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
		if(e.getSource()== BStartover){		
                    this.setSize(1000,800);
                    this.setLocation(null);
                    timestart = true;
 
		}else if(e.getSource() == BExitover){
                    System.exit(0);
		}		
	}
    public boolean Intersect(Rectangle2D a, Rectangle2D b){
		return (a.intersects(b));
	}

}
