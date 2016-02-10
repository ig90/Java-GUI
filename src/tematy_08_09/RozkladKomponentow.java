package tematy_8_9;

import java.awt.*;
import javax.swing.*;

public class RozkladKomponentow {

	public static void main(String[] args) {
        char input;

        while (true) {
            try {
                input = JOptionPane.showInputDialog("Wprowadź typ rozkładu (a-g): ").charAt(0);
             
                JFrame frame = new JFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setPreferredSize(new Dimension(400, 400));
                frame.setLocation(400, 400);
                
                frame.getContentPane().add(new JButton("Przycisk 1 "));
                frame.getContentPane().add(new JButton("Przycisk 2 "));
                frame.getContentPane().add(new JButton("Przycisk 3 "));
                frame.getContentPane().add(new JButton("Przycisk 4 "));
                frame.getContentPane().add(new JButton("Przycisk 5 "));
                
                frame.pack();
                frame.setVisible(true);

                if (input == 'a') {
                    frame.setTitle("a w układzie BorderLayout");
                    frame.setLayout(new BorderLayout());
                } else if (input == 'b') {
                    frame.setTitle("b w układzie FlowLayout");
                    frame.setLayout(new FlowLayout());
                } else if (input == 'c') {
                    frame.setTitle("c w układzie FlowLayout z wyrównaniem do lewej");
                    frame.setLayout(new FlowLayout(FlowLayout.LEFT));
                } else if (input == 'd') {
                    frame.setTitle("d w układzie FlowLayout z wyrównaniem do prawej");
                    frame.setLayout(new FlowLayout(FlowLayout.RIGHT));
                } else if (input == 'e') {
                    frame.setTitle("e w układzie GridLayout jako jeden wiersz");
                    frame.setLayout(new GridLayout(1, 0, 1, 1));
                } else if (input == 'f') {
                    frame.setTitle("f jako jedną kolumnę");
                    frame.setLayout(new GridLayout(0, 1, 1, 1));
                } else if (input == 'g') {
                    frame.setTitle("g jako tablice (2, 3)");
                    frame.setLayout(new GridLayout(2, 3, 1, 1));
                } else {
                    throw new Exception("Nieprawidłowy parametr wejściowy");
                }

               break;
            } catch (Exception e) {
           
            }
        }
    }
}