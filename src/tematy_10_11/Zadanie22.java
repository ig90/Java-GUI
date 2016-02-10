package tematy_10_11;

import java.awt.*;

import javax.swing.*;


public class Zadanie22 extends  JFrame{
    
    public Zadanie22() {
        super("wykres");
        
        
        setPreferredSize(new Dimension(200, 200));
        setVisible(true);
        setLocationRelativeTo(null);
        pack();
     
    } 
    
    
    public double fodx (double x) {
    	
        double y;
        
        y= Math.abs(x-3);
        return y;
      
    }
    
    public void paint(Graphics g) {
    	
        g.setColor(new Color(0,0,255));        
        g.drawLine (0, getHeight()/ 2, getWidth(), getHeight() / 2);
        g.drawLine (getWidth()/2, 0, getWidth()/2, getHeight());      
        
        
            int skalaOx , zakres;
            double y1 , y2 ,x1 ,x2;        
            
             zakres = 10;
             skalaOx = 10;         
                                 
                x1=(zakres*-1) * skalaOx + (getWidth() /2 );    
                
                y1=(fodx(zakres*-1)) * skalaOx + (getHeight() / 2);
             
                
                for(int i=zakres*(-1); i <= zakres; i=i+1){
                   
                    y2 =  fodx(i+1)* skalaOx + (getHeight()/2);
                 
                    x2 = i * skalaOx + (getWidth()/2);
                  
                    
                    g.setColor(new Color(255,0,0));
                    g.drawLine((int) x1, (int) y1 ,(int) x2 ,(int) y2);                
                    
                    x1 = x2;
                    y1 = y2;        
                    
                  
                   
        }
                
      
}

public static void main(String[] args) {
    new Zadanie22();
    

  }
}
