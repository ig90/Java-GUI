
public class Kolo extends Figura implements Obliczenie{
	
	private int promien;
	protected String fig = "Koło"; 
	
	public Kolo(int x, int y, int r){
		super(x, y);
		promien = r;
	}
	
	public String toString(){
		
		
		return fig + super.toString() +"\n Promień koła: " + promien;
	}
	

	public void pozycja(int x, int y) {

		 String s = "Punkt (" + x + ", " + y + ") znajduje się ";

	        if (x > this.x + promien || y > this.y + promien) {
	            s += "na zewnątrz koła";
	        } 
	        else {
	            s += "wewnątrz koła";
	        }

	        System.out.println(s);
		
			}
	
	public void obliczObwod() {
		
		System.out.println("Obwód Koła: " +  2*Math.PI*promien);
    }

    public void obliczPole() {
    	
    	System.out.println("Pole koła: "+ Math.PI*promien*promien);
    	
    }
	
	
}
