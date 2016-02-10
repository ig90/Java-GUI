package tematy_8_9;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Zadanie18 extends JFrame implements ActionListener {
    JButton button1, button2;
    JLabel label;
    int counter;
    public Zadanie18() {
        super("GUI Zadanie 18");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(160, 110));
        setLocation(200, 200);
        setLayout(new GridLayout(3,1,1,1));
        
        JPanel jp1 = new JPanel();
    	add(jp1);
    	jp1.setLayout(new GridLayout());
        
        Font font = new Font("Dialog", Font.PLAIN, 12);
        
        button1 = new JButton("Click!");
        button1.addActionListener(this);
        jp1.add(button1);
         
        JPanel jp2 = new JPanel();
    	add(jp2);
    	jp2.setLayout(new GridLayout());
        label = new JLabel(counter+" times");
        label.setForeground(Color.WHITE);
        jp2.setBackground(new Color(0,0,200));
        label.setHorizontalAlignment(JLabel.CENTER);
        jp2.add(label);
             
        button2 = new JButton("Reset!");
        button2.addActionListener(this);
        add(button2);
        
        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        JButton handler = (JButton) e.getSource();
        
        if (handler == button1){
        counter++;
        label.setText(counter+" times");
        }
        if (handler == button2){
        	counter=0;
        	label.setText(counter+" times");
        }

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Zadanie18();
            }
        });
    }
}






