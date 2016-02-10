package tematy_8_9;

import java.awt.BorderLayout;

import javax.swing.*;
import java.awt.*;

public class ProstyEdytor extends JFrame{

	static String fontFace = "Dialog";
    static int fontSize = 16;
    static int fontColorR = 255, fontColorG = 255, fontColorB =255;
    static int backgroundColorR=255, backgroundColorG=0, backgroundColorB=0;
	public ProstyEdytor(String args[]){
			
		
		JTextArea edytor;
		
		setTitle("Prosty Edytor");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		setLocation(400, 200);
		
		edytor = new JTextArea();
		JScrollPane scrollPane = new JScrollPane(edytor);
		scrollPane.setBounds(20, 20, 3000, 300);
		add(edytor);
		
		edytor.setFont(new Font(fontFace, 0, fontSize));
        edytor.setForeground(new Color(fontColorR, fontColorB, fontColorG));
        edytor.setBackground(new Color(backgroundColorR, backgroundColorG,
                backgroundColorB));
		
	}
	
	
	public static void main(String[] args) {
	
		ProstyEdytor pr = new ProstyEdytor(args);
		pr.setVisible(true);
	
		
		
	}

}
