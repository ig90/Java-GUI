
public class Prostokat extends Figura implements Obliczenie{

	protected int szer, wys; 
	protected String fig = "Prostokąt"; 
	
	public Prostokat(int x, int y, int s, int w){
		
		super(x,y);
		szer = s;
		wys = w;
	}

	public void pozycja(int x, int y) {
		 String s = "Punkt (" + x + ", " + y + ") znajduje się ";

	        if (x < this.x || x > this.x + szer || y < this.y || y > this.y - wys) {
	            
	        	s += "na zewnątrz prostokąta";
	        }
	        else {
	            
	        	s += "wewnątrz prostokąta";
	        }

	        System.out.println(s);

	}
	public String toString(){
		
		return fig + super.toString() + "\n Szerokość: " + szer +", Wysokość: "+ wys;
	}
	
	
	public void obliczObwod() {
		
        System.out.println("Obwód prostokąta: " + (2 * szer + 2 * wys));
    }

    public void obliczPole() {
    	
        System.out.println("Pole prostokąta:  " + (szer * wys));
    }
	
	
	

}
