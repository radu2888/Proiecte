import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

public class Albe {
	private String culoare;
	private List<Point> pozitii_albe =new ArrayList<Point>();
	
	Albe(){
		this.culoare="Alb";
		
	}
	public String culoarea () {
		return culoare;
	}
	public void seteaza_pozitia() {
		
	}
	public Point returneaza_pozitia(int i) {
		
		return pozitii_albe.get(i);
		
	}
	
	public void pozitie(Pion x, int a, int b ) {
		x.setLocation(a,b);
	}
	
}
