package tematy_8_9;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


class Kalkulator extends JFrame implements ActionListener{

	JTextArea ta = new JTextArea();
	
	JButton c = new JButton(" C");
	JButton dziesietne = new JButton(" . ");
	JButton dzielenie = new JButton(" / ");
	JButton mnozenie = new JButton(" * ");
	JButton siedem = new JButton(" 7 ");
	JButton osiem = new JButton(" 8 ");
	JButton dziewiec = new JButton(" 9 ");
	JButton minus = new JButton(" - ");
	JButton cztery = new JButton(" 4 ");
	JButton piec = new JButton(" 5 ");
	JButton szesc = new JButton(" 6 ");
	JButton plus = new JButton(" + ");
	JButton jeden = new JButton(" 1 ");
	JButton dwa = new JButton(" 2 ");
	JButton trzy = new JButton(" 3 ");
	JButton wynik = new JButton(" = ");
	JButton zero = new JButton(" 0 ");
	JButton plusMinus = new JButton("+/-");
	
	Double number1, number2, result;
	int plusC = 0, minusC = 0, mnozenieC = 0, dzielenieC = 0 ; 
	
	public Kalkulator(){
	
	JPanel panel = new JPanel();
    panel.setPreferredSize(new Dimension(250, 230));

    panel.setLayout(new BorderLayout());

    JPanel txtPanel = new JPanel();
    txtPanel.setLayout(new BorderLayout(2, 2));
    
    ta.setFont(new Font("Serif",Font.PLAIN,20));
    txtPanel.add(ta, BorderLayout.CENTER);

    JPanel keypanel = new JPanel();
    keypanel.setLayout(new GridBagLayout());
    GridBagConstraints con = new GridBagConstraints();
    con.anchor = GridBagConstraints.PAGE_START;
    con.fill = GridBagConstraints.BOTH;
    con.weightx = 1.0;
    con.weighty = 1.0;
    con.insets = new Insets(2, 2, 2, 2); 

    c.setBackground(Color.red);
    c.addActionListener(this);

    con.gridx = 1;
    con.gridy = 1;
    con.gridwidth = 1;
    con.gridheight = 1;

    keypanel.add(c, con);

   // JButton dziesietne = new JButton(".");
    con.gridx = 2;
    con.gridy = 1;
    con.gridwidth = 1;
    con.gridheight = 1;
    keypanel.add(dziesietne, con);
    dziesietne.addActionListener(this);

   // JButton dzielenie = new JButton("/");
    con.gridx = 3;
    con.gridy = 1;
    con.gridwidth = 1;
    con.gridheight = 1;
    keypanel.add(dzielenie, con);
    dzielenie.addActionListener(this);

   // JButton mnozenie = new JButton("*");
    con.gridx = 4;
    con.gridy = 1;
    con.gridwidth = 1;
    con.gridheight = 1;
    keypanel.add(mnozenie, con);
    mnozenie.addActionListener(this);

   // JButton siedem = new JButton("7");
    con.gridx = 1;
    con.gridy = 2;
    con.gridwidth = 1;
    con.gridheight = 1;
    keypanel.add(siedem, con);
    siedem.addActionListener(this);

   // JButton osiems = new JButton("8");
    con.gridx = 2;
    con.gridy = 2;
    con.gridwidth = 1;
    con.gridheight = 1;
    keypanel.add(osiem, con);
    osiem.addActionListener(this);

   // JButton dziewiec = new JButton("9");
    con.gridx = 3;
    con.gridy = 2;
    con.gridwidth = 1;
    con.gridheight = 1;
    keypanel.add(dziewiec, con);
    dziewiec.addActionListener(this);

  //  JButton minus = new JButton("-");
    con.gridx = 4;
    con.gridy = 2;
    keypanel.add(minus, con);
    minus.addActionListener(this);

  //  JButton cztery = new JButton("4");
    con.gridx = 1;
    con.gridy = 3;
    con.gridwidth = 1;
    con.gridheight = 1;
    keypanel.add(cztery, con);
    cztery.addActionListener(this);

   // JButton piec = new JButton("5");
    con.gridx = 2;
    con.gridy = 3;
    con.gridwidth = 1;
    con.gridheight = 1;
    keypanel.add(piec, con);
    piec.addActionListener(this);

   // JButton szesc = new JButton("6");
    con.gridx = 3;
    con.gridy = 3;
    con.gridwidth = 1;
    con.gridheight = 1;
    keypanel.add(szesc, con);
    szesc.addActionListener(this);

   // JButton plus = new JButton("+");
    con.gridx = 4;
    con.gridy = 3;
    con.gridwidth = 1;
    con.gridheight = 1;
    keypanel.add(plus, con);
    plus.addActionListener(this);

   // JButton jeden = new JButton("1");
    con.gridx = 1;
    con.gridy = 4;
    con.gridwidth = 1;
    con.gridheight = 1;
    keypanel.add(jeden, con);
    jeden.addActionListener(this);

   // JButton dwa = new JButton("2");
    con.gridx = 2;
    con.gridy = 4;
    con.gridwidth = 1;
    con.gridheight = 1;
    keypanel.add(dwa, con);
    dwa.addActionListener(this);

  //  JButton trzy = new JButton("3");
    con.gridx = 3;
    con.gridy = 4;
    con.gridwidth = 1;
    con.gridheight = 1;
    keypanel.add(trzy, con);
    trzy.addActionListener(this);

   // JButton wynik = new JButton("=");
    con.gridx = 4;
    con.gridy = 4;
    con.gridwidth = 1;
    con.gridheight = 2;
    keypanel.add(wynik, con);
    wynik.addActionListener(this);

   // JButton zero = new JButton("0");
    con.gridx = 1;
    con.gridy = 5;
    con.gridwidth = 2;
    con.gridheight = 1;
    keypanel.add(zero, con);
    zero.addActionListener(this);

   // JButton plusMinus = new JButton("+/-");
    con.gridx = 3;
    con.gridy = 5;
    con.gridwidth = 1;
    con.gridheight = 1;
    keypanel.add(plusMinus, con);
    plusMinus.addActionListener(this);
  

    panel.add(txtPanel, BorderLayout.NORTH);
    panel.add(keypanel, BorderLayout.CENTER);

    
    this.setContentPane(panel);
    this.pack();
    this.setContentPane(panel);
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setVisible(true);
	
	}
	
    public static void main(String[] args) {
        
        Kalkulator calc = new Kalkulator();	
		calc.setVisible(true);
        calc.setTitle("Kalkulator");
               
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		Object source = e.getSource();
		
		if (source == jeden){
			
			ta.append("1");
		}
		if (source == dwa){			
	
			ta.append("2");
		}
		if (source == trzy){			
			
			ta.append("3");
		}
		if (source == cztery){		
			
			ta.append("4");
		}
		if (source == piec){			
			
			ta.append("5");
		}
		if (source == szesc){			
			
			ta.append("6");
		}
		if (source == siedem){			
			
			ta.append("7");
		}
		if (source == osiem){
						
			ta.append("8");
		}
		if (source == dziewiec){			
			
			ta.append("9");
		}
		if (source == zero){
						
			ta.append("0");
		}
		if (source == plus){
			
			number1=numberReader();
			ta.setText("");
			plusC = 1;
			
		}
		if (source == minus){
		
			number1=numberReader();
			ta.setText("");
			minusC = 1;
		}
		if (source == mnozenie){
			
			number1=numberReader();
			ta.setText("");
			mnozenieC = 1;
		}
		if (source == dzielenie){
	
			number1=numberReader();
			ta.setText("");
			dzielenieC = 1;
		}	
		/*if (source == dziesietne){
			
			number1=numberReader();
			ta.setText("");
			
		}	*/
		/*if (source == plusMinus){
			
			
		}	*/
		if (source == wynik){
			
			number2=numberReader();
			if (plusC > 0){
				
				result = number1 + number2;
				ta.setText(Double.toString(result));			
			}
			if (minusC > 0){
				
				result = number1 - number2;
				ta.setText(Double.toString(result));			
			}
			if (mnozenieC > 0){
				
				result = number1 * number2;
				ta.setText(Double.toString(result));			
			}
			if (dzielenieC > 0){
				
				result = number1 / number2;
				ta.setText(Double.toString(result));		
				if (number2 == 0){
					ta.setText("Błąd! Dzielenie przez 0! ");
				}
			}		
			
		}
		if (source == c){
			
			number1= 0.0;
			number2= 0.0;
			ta.setText(" ");
			
		}
					
	}
	
	public double numberReader(){
		
		double num1;
		String s;
		s = ta.getText();
		num1 = Double.valueOf(s);
		
		return  num1;
		
	}
	
	
	

}