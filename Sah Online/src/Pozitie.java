import java.awt.Point;

public interface Pozitie {
	public String culoare();
	public Point pozitie();
	public void reactualizare_pozitie(int a, int b);
	public void pozitie_initiala();
	public Point pozitie_actuala();
	public void eliminare();
}
