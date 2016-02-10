package tematy_10_11;


import java.awt.*;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Zadanie21 extends JFrame implements ChangeListener{
	
	private int colorValR, colorValG, colorValB;
	private JSlider slider1, slider2, slider3;
	Color oColor = new Color(colorValR, colorValG, colorValB);
	JLabel etykietaR, etykietaG, etykietaB;
	Graphics g;
	
  public static void main(String[] args) {
    new Zadanie21();

  }

  public Zadanie21() {
    super("JSlider");

    Container content = getContentPane();
    content.setBackground(Color.white);
    
    slider1 = new JSlider(0,255,0);
   // slider1.setBorder(BorderFactory.createTitledBorder("JSlider 1"));
    slider1.setBackground(Color.RED);
    slider1.addChangeListener(this);
    content.add(slider1, BorderLayout.NORTH);
    
    slider2 = new JSlider(JSlider.VERTICAL, 0,255,0);
  //  slider2.setBorder(BorderFactory.createTitledBorder("JSlider 2"));
   // slider2.setMajorTickSpacing(20);
   // slider2.setMinorTickSpacing(5);
    slider2.setPaintTicks(true);
    slider2.setBackground(Color.GREEN);
    slider2.addChangeListener(this);
    content.add(slider2, BorderLayout.WEST);
    
    
    JPanel jpc = new JPanel(){
    	   public void paint(Graphics g) {
    	       super.paint(g);
    	       
    	       int width = getWidth();
    	       int height = getHeight();
    	       
    	       g.setColor(oColor);
    	       g.fillOval(10,10,width-20,height-20);
    	       
    	       repaint();

    	   }
    	   
    	};
    
    	content.add(jpc, BorderLayout.CENTER);
    

    slider3 = new JSlider(JSlider.VERTICAL, 0,255,0);
    slider3.setPaintTicks(true);
    slider3.setPaintLabels(true);
    slider3.setBackground(Color.BLUE);
    slider3.addChangeListener(this);
    content.add(slider3, BorderLayout.EAST);
    
    
    setPreferredSize(new Dimension(300, 300));
    setVisible(true);
    setLocationRelativeTo(null);
    pack();
    
    etykietaR = new JLabel("<html><font color = red> Red = </font>"+ colorValR + "<font color = Green> Green =  </font>"+ colorValG + "<font color = blue> Blue =  </font>"+ colorValB +"</html>");
  //  etykietaR.setForeground(Color.RED);
    etykietaR.setHorizontalAlignment(JLabel.CENTER);
    add(etykietaR, BorderLayout.SOUTH);
    /*etykietaG = new JLabel("Green = ");
    etykietaG.setForeground(Color.GREEN);
    etykietaG.setHorizontalAlignment(JLabel.CENTER);
    add(etykietaG, BorderLayout.SOUTH);
    etykietaB = new JLabel("Blue = ");
    etykietaB.setForeground(Color.BLUE);
    etykietaB.setHorizontalAlignment(JLabel.RIGHT);
    add(etykietaB, BorderLayout.SOUTH);*/
    
  }

@Override
public void stateChanged(ChangeEvent e) {
	
	colorValR = slider1.getValue(); 
	colorValG = slider2.getValue(); 
	colorValB = slider3.getValue(); 
	
	etykietaR.setText("<html><font color = red> Red = "+ colorValR+"</font>" + "<font color = Green> Green = " + colorValG+"</font>" + "<font color = blue> Blue =  "+ colorValB +"</font></html>"); 
	//etykietaG.setText("Green = "+ colorValG); 
	//etykietaB.setText("Blue = "+ colorValB); 
	
	oColor = new Color(colorValR, colorValG, colorValB);
	
	g.setColor(oColor);


}
  
}