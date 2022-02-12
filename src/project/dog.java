/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.geom.Rectangle2D;
import java.net.URL;
import java.util.Random;

/**
 *
 * @author pan_d
 */
public class dog {
    	Image img;
        Random rand = new Random();
        public static int random(int min, int max) {
        return (int)(Math.random() * (max - min + 1)) + min;
        }
	int x =  random(500, 600);
	public int y = 600;
	public int count = 0;
	dog(){
            
                String imageLocation = "dog5.png";
                URL imageURL = this.getClass().getResource(imageLocation);
		img = Toolkit.getDefaultToolkit().getImage(imageURL);
	}
	
	public Image getImage(){
            return img;
	}
	
	public int getX(){
            return x;
	}
	public int getY(){
            return y;
	}
        
	public Rectangle2D getbound(){
    	    return (new Rectangle2D.Double(x,y,80,80));
	}
}
