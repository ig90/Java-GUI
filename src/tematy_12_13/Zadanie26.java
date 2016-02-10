package tematy_12_13;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.*;

import java.awt.*;

public class Zadanie26 extends JFrame implements ActionListener{
	
	public static int x;
	public static int y;
	public static int i;
	private JLabel statusBar = new JLabel("wybór: ");
	Graphics graphics;
	Color choosedColor;
	

	public static void main(String args[]) 
	{
		new Zadanie26();
		
	}

	Zadanie26(){
		
		init();
		
		setSize(500, 400);
		setTitle("Simple Draw");
		
		MyJPanel panel = new MyJPanel();
		add(panel);
		panel.setBackground(Color.WHITE);
		Container container = getContentPane();
		container.add(panel);	  
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);

		
	}

	public class MyJPanel extends JPanel implements MouseListener, MouseMotionListener {	

		MyJPanel(){
			
	    addMouseListener(this);
	    addMouseMotionListener(this);
	  }
		
	 	Point point,prpoint;
		public void Board() {
		point=null; 
		prpoint=null;
		
	//	this.addMouseListener(this);
		//this.addMouseMotionListener(this);
		}
		
	  public void paintComponent(Graphics graphics){	
		  
		  int r= (int)Math.round((Math.random()*255));
	      int g= (int)Math.round((Math.random()*255));
	      int b= (int)Math.round((Math.random()*255));
		  
		  switch (i){
		  
		  case 1:
		  		  
	      graphics.setColor(new Color(r,g,b));
	      graphics.fillOval(x,y,40,40);
		  
		  break;
		  
		  case 2:
			  
			  graphics.setColor(new Color(r,g,b));
			  graphics.fillRect(x,y,40,40);
			  
			  
			  break;
			
		  case 3:
		  
			  //	graphics.setColor(Color.RED);
			  graphics.setColor(choosedColor);
		    	if(point!=null)
		    	{
		    	graphics.drawLine(prpoint.x,prpoint.y,point.x,point.y);
		    	}
		  break;
		  default:  i = 0;
		
	  }		  		  
	      
	  }

	  public void mousePressed(MouseEvent e) {
		  
		  switch (i){
		  case 1: 
			x = e.getX();
		    y = e.getY();
		    repaint();
		    
		    break;
		  case 2:
			  x = e.getX();
			  y = e.getY();
			  repaint();
			  
			  break;
		  case 3:
		    point=e.getPoint();
		    break;
		  }
		  
	  }
	  
	  public void mouseReleased(MouseEvent e)
	  {
		  point=null;
	  }
	  
	  public void mouseEntered(MouseEvent e) 
	  {}
	  
	  public void mouseExited(MouseEvent e) 
	  {}
	  
	  public void mouseClicked(MouseEvent e) 
	  {}
	@Override
	public void mouseDragged(MouseEvent e) {
		prpoint=point;
    	point=e.getPoint();
    	repaint();
		
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		
	}
	}
    
    public void init() {
  	
        JMenuBar menubar = new JMenuBar();

        JMenu main = new JMenu("Main");
        main.setMnemonic(KeyEvent.VK_M);
        
        JMenu draw = new JMenu("Draw");
        draw.setMnemonic(KeyEvent.VK_D);
        
        JMenu figure = new JMenu("Figure");
        figure.setMnemonic(KeyEvent.VK_F);
        
        JMenuItem color = new JMenuItem("Color");
        color.setMnemonic(KeyEvent.VK_C);
        color.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.ALT_MASK + ActionEvent.SHIFT_MASK));       
        
        JMenuItem circle = new JMenuItem("Circle");
        circle.setMnemonic(KeyEvent.VK_C);
        circle.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
        
        circle.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                
            	i = 1;
            	
            }
        });
      
        
        JMenuItem rectangle = new JMenuItem("Rectangle");
        rectangle.setMnemonic(KeyEvent.VK_R);
        rectangle.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
        
        rectangle.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                
            	i = 2;
            	
            }
        });
        
        JMenuItem Freehand = new JMenuItem("Freehand");
        Freehand.setMnemonic(KeyEvent.VK_F);
        Freehand.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, ActionEvent.CTRL_MASK));
              
        Freehand.addActionListener(new ActionListener() {
        	
			public void actionPerformed(ActionEvent e) {
										
				i = 3;
				
			}       
        });
        
        draw.add(figure);
        draw.addSeparator();
        draw.add(color);
        figure.add(circle);
        figure.add(rectangle);
        figure.add(Freehand);
        
        color.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {				
				
				Color choosedColor = JColorChooser.showDialog(null, "wybór koloru", Color.BLACK);
				
				//graphics.setColor(choosedColor);
			}
		});
        
        
        JMenuItem ClearAll = new JMenuItem("Clear All");
        ClearAll.setMnemonic(KeyEvent.VK_C);
        ClearAll.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.SHIFT_MASK));
        
        ClearAll.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                
                 clearAll();
            	
            }
        });

        JMenuItem Exit = new JMenuItem("Exit");
        Exit.setMnemonic(KeyEvent.VK_X);
        Exit.setToolTipText("Exit application");
        Exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));

        Exit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                System.exit(0);
            }

        });

        main.add(ClearAll);
        main.addSeparator();
        main.add(Exit);

        menubar.add(main);
        menubar.add(draw);

        setJMenuBar(menubar);
        
        add(statusBar, BorderLayout.SOUTH);
                          
    
    }
    
    
public void clearAll(){

	setForeground(Color.WHITE);
	repaint();
   
}

@Override
public void actionPerformed(ActionEvent e) {

	 statusBar.setText(e.getActionCommand());
	
}

}


