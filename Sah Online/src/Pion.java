
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;


import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Pion extends JLabel implements Pozitie{
	private int x,y;
	private int q,w,c,d;
	private String directia_orizontala;
	private String directia_verticala;
	private String directia;
	private String culoare;
	private Point punct;
	private Point punct_actual;
	private int xi,yi;
	Pion(int a, int b, String culoare){
		this.x=a;
		this.y=b;
		this.culoare=culoare;
		
		punct= new Point(x,y);
		setBounds(x, y, 50, 50);
		if(culoare=="Alb") {
			setIcon(new ImageIcon("C:\\Users\\Radu\\eclipse-workspace\\Sah Online\\Pion.png"));
			}
		else {
			setIcon(new ImageIcon("C:\\Users\\Radu\\eclipse-workspace\\Sah Online\\PionN.png"));
		}
		
		
        addMouseMotionListener(new MouseMotionAdapter(){
            public void mouseDragged(MouseEvent e){
                setLocation(e.getX() - q + getLocation().x, e.getY() - w+ getLocation().y);
               	
            }
            
        });
        addMouseListener(new MouseAdapter(){
        	public void mousePressed(MouseEvent e){
                q = e.getX();
                w = e.getY();
                xi=x;
                yi=y;
            }
        	
            public void mouseReleased(MouseEvent e){
            	c=e.getX() - q + getLocation().x;
                d=e.getY() - w+ getLocation().y;
                System.out.println(c+" "+d);
                
            	if(c<x-25) {
                	directia_orizontala="Stanga";
                }
                else {
                	
                		 if(c>x+25) {
                         	directia_orizontala="Dreapta";
                         }
                		 else {
                			 directia_orizontala="X";
                		 }
                	
                }
               
                
                if(d>y+25) {
                	directia_verticala="Jos";
                }
                else {
                	if(d<y-25) {
                		directia_verticala="Sus";
                	}
                	else {
                		directia_verticala="X";
                	}
                }
                directia=directia_orizontala+directia_verticala;
            	switch(directia) {
            	case"XJos":{
            		if(culoare=="Alb" && y<350) {
            			
            		y=y+50;
            		setLocation(x,y);
            		punct= new Point(x,y);
            		
            		}
            		else {
            		setLocation(x,y);
            		}
            		break;
            	}
            	case"StangaJos":{
            		setLocation(x,y);
            		break;
            	}
            	case"DreaptaJos":{
            		setLocation(x,y);
            		break;
            	}
            	case"XSus":{
            		if(culoare=="Negru" && y>0) {
            			
                		y=y-50;
                		setLocation(x,y);
                		punct= new Point(x,y);
                		
                		}
                		else {
                		setLocation(x,y);
                		}
            		break;
            	}
            	case"StangaSus":{
            		setLocation(x,y);
            		break;
            	}
            	case"DreaptaSus":{
            		setLocation(x,y);
            		break;
            	}
            	default:{
            		setLocation(x,y);
            		break;
            	}
            	}
            }
            });
    
	}

	@Override
	public String culoare() {
		return culoare;
	}

	@Override
	public Point pozitie() {
		return punct;
	}

	@Override
	public void reactualizare_pozitie(int a, int b) {
		x=a;
		y=b;
		punct=new Point(x,y);
		setLocation(x,y);
		
	}

	@Override
	public void pozitie_initiala() {
		this.x=xi;
		this.y=yi;
		punct=new Point(x,y);
		setLocation(x,y);
		
	}
	@Override
	public Point pozitie_actuala() {
		punct_actual=new Point(xi,yi);
		return punct_actual;
	}

	@Override
	public void eliminare() {
		x=1000;
		y=1000;
		punct=new Point(x,y);
		setLocation(x,y);
	}
	
	private Point piesa_eliminata;
	private int r,t;
	public Point eliminare_piesa() {
		r=xi;
		t=yi;
		switch(directia) {
		case"StangaJos":{if(culoare=="Alb") {
				r=xi-50;
				t=yi+50;
				}
		break;
		
		}
		case"DreaptaJos":{
			if(culoare=="Alb") {
				r=xi+50;
				t=yi+50;
				}
		break;
			
		}
		case"StangaSus":{if(culoare=="Negru") {
			r=xi-50;
			t=yi-50;
			}
		break;
	
		}
		case"DreaptaSus":{
			if(culoare=="Negru") {
			r=xi+50;
			t=yi-50;
			}
			break;
		
		}
		}
		piesa_eliminata=new Point(r,t);
		return piesa_eliminata;
	}
	
}
