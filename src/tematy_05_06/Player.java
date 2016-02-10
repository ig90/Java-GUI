package Zjazd3;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

public class Player implements Runnable {

	public Player(String string, String string2) {
	
	}

	public int Losuj(){
		
		Random losowanie = new Random();
		
	//	for (int i=1; i<=100; i++){
			//System.out.println(losowanie.nextInt(100));
			return losowanie.nextInt(100);
		//}
			
		}
		public void Zapis() throws FileNotFoundException {
			
			
			      PrintWriter zapis = new PrintWriter("plik.txt");
			   
			      zapis.println(Losuj());
			      
			      zapis.close();
			  }

		@Override
		public void run() {
	
			
			//System.out.println(Losuj());
			Losuj();
		
			
		}
		
	
	
}
