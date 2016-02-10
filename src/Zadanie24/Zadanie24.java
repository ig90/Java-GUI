package Zadanie24;


import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;

public class Zadanie24 extends JFrame implements HyperlinkListener, 
                                               ActionListener {
  public static void main(String[] args) {

      new Zadanie24("http://www.onet.pl");

  }

  private JTextField urlField;
  private JEditorPane htmlPane;
  private String initialURL;

  public Zadanie24(String initialURL) {
    super("Przeglądarka");
    this.initialURL = initialURL;

    JPanel topPanel = new JPanel();
    topPanel.setBackground(Color.GRAY);
    JLabel urlLabel = new JLabel("URL:");
    urlField = new JTextField(30);
    urlField.setText(initialURL);
    urlField.addActionListener(this);
    topPanel.add(urlLabel);
    topPanel.add(urlField);
    add(topPanel, BorderLayout.NORTH);

        try {
			htmlPane = new JEditorPane(initialURL);
		} catch (IOException e) {

			e.printStackTrace();
		}
        htmlPane.setEditable(false);
        htmlPane.addHyperlinkListener(this);
        JScrollPane scrollPane = new JScrollPane(htmlPane);
        add(scrollPane, BorderLayout.CENTER);

    setSize(800, 640);
    setVisible(true);
  }

  public void actionPerformed(ActionEvent event) {
    String url;
    if (event.getSource() == urlField) 
      url = urlField.getText();
   else 
     url = initialURL;

      try {
		htmlPane.setPage(new URL(url));
	} catch (MalformedURLException e) {

		e.printStackTrace();
	} catch (IOException e) {

		e.printStackTrace();
	}
      urlField.setText(url);
  }

  public void hyperlinkUpdate(HyperlinkEvent event) {
    if (event.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {

        try {
			htmlPane.setPage(event.getURL());
		} catch (IOException e) {
			e.printStackTrace();
		}
     
    }
  }
}