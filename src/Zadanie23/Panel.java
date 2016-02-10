package Zadanie23;

import java.awt.Color;  
import java.awt.Graphics;  
import java.awt.Graphics2D;  
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;  
  
public class Panel extends JPanel implements MouseListener
{  
	public static int x;
	public static int y;
	
	boolean czyTrafione = false;
	
	public static int r;
	
	public static int counter = 0;
	
    public Panel()  
    {  
    	addMouseListener(this);
    	
    }       
    @Override  
    public void paintComponent(Graphics g)  
    {  
        super.paintComponent(g);  
          
        Graphics2D g2d = (Graphics2D)g;  
        
          int red= (int)Math.round((Math.random()*255));
	      int green= (int)Math.round((Math.random()*255));
	      int blue= (int)Math.round((Math.random()*255));
	      
	      x = (int)(Math.round(Math.random() * getWidth()));
	      y = (int)(Math.round(Math.random() * getHeight()));
	      
	      r = 20;
	      
          g2d.setColor(new Color(red,green,blue));
          g2d.fillOval(x,y, r,r);
                    
          if (czyTrafione == true){        	  
        	  
        	g2d.setColor(Color.BLACK);
  			g2d.drawString("Trafione!", x, y);
        	czyTrafione = false;       	  
        	  
          }        

    }
	@Override
	public void mouseClicked(MouseEvent e) {
		
		if ((e.getX() <= x+r && e.getX() >= x-r) && (e.getY() <= y+r && e.getY() >= y-r)){
			
			czyTrafione = true;
			counter++;


		}  		
	}
	@Override
	public void mousePressed(MouseEvent e) {	
	}
	@Override
	public void mouseReleased(MouseEvent e) {	
	}
	@Override
	public void mouseEntered(MouseEvent e) {					
	}
	@Override
	public void mouseExited(MouseEvent e) {	
	}  
}  
