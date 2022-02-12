package project;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.geom.Rectangle2D;
import java.net.URL;
import javax.swing.ImageIcon;
public class floor {
	Image img;
	public int x = 0;
	public int y;
	public int count = 0;
	floor(){
                String imageLocation = "floor.png";
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
    	    return (new Rectangle2D.Double(0,700,1500,45));
	}
}
