
public class Kolo2 extends Kolo implements Transformacja{

	public Kolo2(int x, int y, int r) {
		super(x, y, r);
		
	}
	
	public void przesunDo(int x, int y) {
		
	 this.x = x;
	 this.y = y;
	 
	
	}
	
	int a = x;
	int b = y;
	public void powrot() {
		
		przesunDo(a,b);
	}
	
	

}
