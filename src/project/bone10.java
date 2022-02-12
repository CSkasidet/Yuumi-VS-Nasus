/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.awt.geom.Rectangle2D;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class bone10 extends JPanel{
    public ImageIcon[] bone = new ImageIcon[3];
    public int y = 530;
    public int x = 150;
    public int count=0;
    public int n; 
    bone10(int n){
        for(int i=0;i<bone.length;i++){
            String imageLocation = "fishbone"+(i+1)+".png";
            bone[i] = new ImageIcon(this.getClass().getResource(imageLocation));
	}
            this.n=n;
    }
    public void move(){

        if (count<=n){
            this.y=y-3;
            this.x=x+3;
            count =count+1;
            }
        else if(count>n && count <=n*2){                    
            this.y=y+3;
            this.x=x+3;                    
        }          
    }
    public Rectangle2D getbound(){
    	return (new Rectangle2D.Double(x,y,25,25));
    }
}