package Zadanie23;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Frame extends JFrame  {  
   
	JButton button, buttonTime;  
    Panel p;  
    
    Thread obraz;  
    
    boolean clicked=false;
      
    public Frame(String title)  
    {  
        super(title);  
        add(new Panel());
        
    }  
      
    public void budujOkno()  
    {  
        addWindowListener(new WindowAdapter()  
        {  
            @Override  
            public void windowClosing(WindowEvent e)  
            {                  
                if(obraz != null)  
                    obraz.interrupt();  
                  
                System.exit(0);  
            }  
        });  
          
        setSize(300,460);  
        setLayout(null);  
        setVisible(true);  
        setResizable(false);
        setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          
        button = new JButton("Start");  
        button.setLocation(120,405);  
        button.setSize(150,20);  
        button.setVisible(true);   
        add(button);  
        
        buttonTime = new JButton("Level");
        buttonTime.setLocation(10, 405);
        buttonTime.setSize(100, 20);
        buttonTime.setVisible(true);
        add(buttonTime);
        
        p = new Panel();  
        p.setSize(300, 400);
        p.setVisible(true);  
        p.setBackground(Color.white);  
        add(p);
          
       obraz = new Thread(new Runnable()  
        {  
            @Override  
            public void run()  
            {  
                try  
                {  
                    while(true)  
                    {  
                        p.repaint();  
                        Thread.sleep(1100);  
                    }  
                }  
                catch(InterruptedException e)  
                
                {  
                }  
            }  
        });       
		
		button.addActionListener(new ActionListener(){		
		
			public void actionPerformed (ActionEvent e)
			{
				
				if(clicked)
	            {
	                clicked = false; 
	                obraz.interrupt();
	                button.setText("Start");
	             //   System.out.println("Liczba trafień: " + Panel.counter);
	                JOptionPane.showMessageDialog(null, "Liczba trafień: " + Panel.counter);
	                
	            }
	            else
	            {
	                clicked = true;
	                button.setText("Stop");
	                startGame();
	                
	                
	            }								
		}});      
		
		
		buttonTime.addActionListener(new ActionListener(){		
			
			public void actionPerformed (ActionEvent e)
			{
							
				
	                buttonTime.setText("Level 1");
	                try {
						Thread.sleep(2000);
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					} 
	                             
				
	               buttonTime.setText("Level 2");                
	               try {
						Thread.sleep(1000);
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					} 	              
				
		}});      
		
		
		
		
	 
    }
	 public void startGame()
	    {
	        while (clicked)
	        {
	        	obraz.start();
	        }
 
} 
    
}  

