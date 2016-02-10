package tematy_12_13;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
//import java.util.ArrayList;
//import java.util.Collections;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Zadanie25 extends JFrame implements KeyListener, ListSelectionListener, ActionListener{
	
	private JList lista;
	
	private DefaultListModel miasta;
	
	private JTextField tf;
	
  public static void main(String[] args) {
    new Zadanie25();

  }

  public Zadanie25() {
 
   
    setTitle("lista");
    setPreferredSize(new Dimension(200, 200));
    setVisible(true);
    setLocationRelativeTo(null);
    //setLayout(null);
    
    pack();
    
    tf = new JTextField("");
    add(tf, BorderLayout.NORTH);
    tf.addKeyListener(this);
    
    miasta  = new DefaultListModel();
    
    miasta.addElement( "Warsaw" );
    miasta.addElement( "Berlin" );
    miasta.addElement( "Moscow" );
    miasta.addElement( "Amsterdam" );
    miasta.addElement( "Barcelona" );
    miasta.addElement( "London" );
    
    
    lista = new JList(miasta);
    
    lista.setVisibleRowCount(4);
    lista.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
    add(new JScrollPane(lista), BorderLayout.CENTER);
    lista.addListSelectionListener(this);
  
    tf.addActionListener(this);
	      
    lista.getSelectionModel().addListSelectionListener(this);
  
  }
  


@Override
public void valueChanged(ListSelectionEvent e) {
	
	
//	miasta.removeElement(lista.getSelectedValue());
	
}

@Override
public void keyTyped(KeyEvent e) {
	
}

@Override
public void keyPressed(KeyEvent e) {
	
	 if(e.getKeyCode() == KeyEvent.VK_ENTER)   {
	
		final String miasto=tf.getText();
	 	miasta.addElement(miasto);
	 	tf.setText("");
	 	
	 	
	 }
	 
	 	lista.repaint();
	 	
		}	

@Override
public void keyReleased(KeyEvent e) {

	
}

@Override
public void actionPerformed(ActionEvent e) {
	
	

}

}

