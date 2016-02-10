package temat7;

import java.awt.*; 	
import javax.swing.*;

public class DrawSwing {
	

    public static void main(String[] args)
    {
    	new DrawSwing();
    }
    
    
    public DrawSwing()
    {
    	SwingUtilities.invokeLater(new Runnable(){
    		
			public void run()
    		{
    			
    			createGUI();
    		}
    	});
    }
    
    protected void createGUI()
    {
    		// utworzenie okna
        JFrame jf = new JFrame();
      
        	// okreslenie tytulu okna
        jf.setTitle("Rysowanie");
      		
      		// obsluga zamkniecia okna JFrame
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        	// okreslenie polozenia okna
        jf.setLocation(50,50);
      //  jf.setLocationRelativeTo(null);
        
        	// uniemo¿liwienie zmiany rozmiarów okna
        jf.setResizable(false);
		
			// utworzenie obszaru rysowania - pulpitu
		MyPanel p = new MyPanel();
		
			// wymiana domyslnego pulpitu na wlasny
        jf.setContentPane(p);	
        
        	// upakowanie okna
        jf.pack( );
        	
        	// wyswietlenie okna
        jf.setVisible(true);   
    }
}

class MyPanel
	extends JPanel {
	
	int r;
	
    	// konstruktor     
    MyPanel()
    {
          // ustalenie rozmiarów poczatkowych
        setPreferredSize(new Dimension(400,400));    
        
        String wejscie = JOptionPane.showInputDialog (" podaj średnicę okręgu: ");

    	r = Integer.parseInt(wejscie);
      
    }
    
    
    public void paintComponent(Graphics g)
    {
          // musi byc jako pierwsza instrukcja
        super.paintComponent(g);
        
          // pobranie aktualnych rozmiarów
        int width = getWidth();
        int height = getHeight();
        int xSrodek=(width/2);
  		int ySrodek=(height/2);
        
        int r=this.r;
	        // TU RYSUJEMY!
        // ........
        
        g.setColor(Color.white);
      //  g.drawRect(50, 50, 300, 300);
        g.fillRect(50, 50, 300, 300);
        
        g.setColor(Color.red);

    	// ........
        
    	int xKolo = xSrodek-r/2;
  		int yKolo = ySrodek-r/2;
  		int srednica = width-(2*xKolo);
  		
  		g.drawOval(xKolo,yKolo,srednica,srednica);
  	    g.fillArc(xKolo,yKolo,srednica,srednica, 0, -180);
  	
        
        
        
        
    }
}
