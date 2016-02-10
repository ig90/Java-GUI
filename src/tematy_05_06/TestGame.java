package Zjazd3;

public class TestGame {
    
    public static void main(String[] args)
    {
        Player p1 = new Player("ppj", "ppj.txt");                            // tworzenie gracza ze swoim identyfikatorem oraz plikiem,
        Player p2 = new Player("gui", "gui.txt");                            // z założeniem, że wszystkie pliki pochodzą z tego samego katalogu, np. katalogu głównego projektu
        
        Referee ref = new Referee(10, new Player[]{p1,p2});       //  arbiter ustala czas gry (w sekundach), "rejestruje" tablicę graczy
                            
        p1.run();
        p2.run();
        
        ref.startGame();                                                                   // arbiter startuje swój wątek: mierzy czas oraz daje sygnał startu graczom
        
          
        //    try {
				ref.join();
		//	} catch (InterruptedException e) {
				
			//	e.printStackTrace();
		//	}                                                                        // czekamy, aż wątek arbitra zakończy swoją pracę, tzn. po upływie określonego czasu przerywa pracę wątków wszystkich graczy
            

        ref.result();                                                                         // arbiter ogłasza wynik gry
    }
}











