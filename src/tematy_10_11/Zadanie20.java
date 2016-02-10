package tematy_10_11;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.*;
import java.awt.*;

public class Zadanie20 extends JFrame {
	
    public Zadanie20() {
        init();     
    }
    
    public void init() {
  
    	
        JMenuBar menubar = new JMenuBar();

        JMenu file = new JMenu("File");
        file.setMnemonic(KeyEvent.VK_F);
        
        JMenu help = new JMenu("Help");
        help.setMnemonic(KeyEvent.VK_H);
        
        JMenu JavaOnTheWeb = new JMenu("Java on the web");
        JavaOnTheWeb.setMnemonic(KeyEvent.VK_W);
        
        JMenuItem About = new JMenuItem("About");
        About.setMnemonic(KeyEvent.VK_A);
        About.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.CTRL_MASK));
        
        JMenuItem JavaSite = new JMenuItem("Java site");
        JavaSite.setMnemonic(KeyEvent.VK_I);
        JavaSite.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, ActionEvent.SHIFT_MASK));
        
        JavaSite.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                
            	JOptionPane.showMessageDialog(null, "http://docs.oracle.com/javase/7/docs/api/");
            	
            }
        });
        
        JMenuItem FAQ = new JMenuItem("FAQ");
        FAQ.setMnemonic(KeyEvent.VK_Q);
        FAQ.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F1, ActionEvent.CTRL_MASK));
        
        help.add(JavaOnTheWeb);
        help.addSeparator();
        help.add(About);
        JavaOnTheWeb.add(JavaSite);
        JavaOnTheWeb.addSeparator();
        JavaOnTheWeb.add(FAQ);
        
        JMenuItem fileNew = new JMenuItem("New");
        fileNew.setMnemonic(KeyEvent.VK_N);
        fileNew.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
        
        fileNew.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                
                 nowyPlik();
            	
            }
        });

        JMenuItem fileOpen = new JMenuItem("Open");
        fileOpen.setMnemonic(KeyEvent.VK_O);
        fileOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
        
        fileOpen.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                otworzPlik();
            }
        });
        
        JMenuItem fileSave = new JMenuItem("Save");
        fileSave.setMnemonic(KeyEvent.VK_S);
        fileSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));       

        JMenuItem fileExit = new JMenuItem("Exit");
        fileExit.setMnemonic(KeyEvent.VK_X);
        fileExit.setToolTipText("Exit application");
        fileExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));

        fileExit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                System.exit(0);
            }

        });

        file.add(fileNew);
       // file.addSeparator();
        file.add(fileOpen);
     //   file.addSeparator();
        file.add(fileSave);
        file.addSeparator();
        file.add(fileExit);

        menubar.add(file);
        menubar.add(help);

        setJMenuBar(menubar);

        setTitle("Menu");
        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	Zadanie20 zad20 = new Zadanie20();
                zad20.setVisible(true);            
                
            }
        });
    }

    
    
public void nowyPlik(){

   
}
    
public void otworzPlik(){

JFileChooser wybor = new JFileChooser();
int wynik = wybor.showOpenDialog(null);
if (wynik == JFileChooser.APPROVE_OPTION){


}
}
}
