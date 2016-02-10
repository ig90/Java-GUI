public class TestFigur {
    
    public static void main(String[] args)
    {        
        Figura fig[] = new Figura[2];
        fig[0] = new Kolo(10, 10, 5);
        fig[1] = new Prostokat(20, 20, 15, 10);
       
            // polimorficzne wywołanie metody toString() z klas Kolo/Prostokat,
            // a nie z klasy Figura
        for (Figura f : fig)   // pętla for-each
        	
            System.out.println(f);    // System.out.println(f.toString());
        
        
        fig[0].pozycja(12, 12);                     
        fig[1].pozycja(25, 30);
        
        
        fig[0].obliczObwod();
        fig[1].obliczObwod();

        fig[0].obliczPole();
        fig[1].obliczPole();
        
        Figura p2 = new Prostokat2(20, 20, 10, 5, '*');        // prostokąt rozmiaru 10 x 5 będzie "rysowany" na konsoli za pomocą znaku '*'
        ((Prostokat2)p2).rysuj();    
        
        Kolo2 k2 = new Kolo2(15, 20, 5);
        
        k2.przesunDo(50, 40);    // przesunięcie środka koła do punktu (50, 40) 
        System.out.println(k2);
                
        k2.powrot();                    // powrót do poprzedniej pozycji środka koła
        System.out.println(k2);
        
        
    }
    
}