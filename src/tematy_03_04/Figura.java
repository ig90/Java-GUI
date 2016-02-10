 public abstract class Figura implements Obliczenie{
    	
    	 protected int x, y;                                                               // położenie figury 
         protected String fig = "Jeszcze nie wiadomo";    
         
        public Figura(){
        	 
         }
         
         public Figura(int x, int y) {
        	 
        	 this.x = x;
        	 this.y = y;
         }
         
         public abstract void pozycja(int x, int y);
        	 
         
        public String toString() {
        	 
        	return  "\n Środek - (" + x + ", " + y + ")";
        }
        
    	
    }