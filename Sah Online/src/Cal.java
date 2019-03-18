import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Cal extends JLabel implements Pozitie {
	private int x,y;
	private int q,w;
	private int c,d;
	private String directia_orizontala;
	private String directia_verticala;
	private String directia;
	private String culoare;
	private Point punct;
	private Point punct_actual;
	private int xi,yi;
	Cal(int a, int b, String culoare){
		this.x=a;
		this.y=b;
		this.culoare=culoare;
		punct=new Point(x,y);
		setBounds(x, y, 50, 50);
		if(culoare=="Alb") {
		setIcon(new ImageIcon("C:\\Users\\Radu\\eclipse-workspace\\Sah Online\\Cal.png"));
		}
		else {
			setIcon(new ImageIcon("C:\\Users\\Radu\\eclipse-workspace\\Sah Online\\CalN.png"));
		}
		addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e){
                q = e.getX();
                w = e.getY();
                xi=x;
                yi=y;
            }
        });

        addMouseMotionListener(new MouseMotionAdapter(){
            public void mouseDragged(MouseEvent e){
                setLocation(e.getX() - q + getLocation().x, e.getY() - w+ getLocation().y);
                
            }
            
        });
        addMouseListener(new MouseAdapter(){
            public void mouseReleased(MouseEvent e){
            	c=e.getX() - q + getLocation().x;
                d=e.getY() - w+ getLocation().y;
                System.out.println(c+" "+d);
                if(c>x-75 && c<x) {
                	directia_orizontala="StangaMin";
                }
                else {
                	if(c<x-75 && c>x-150) {
                	directia_orizontala="StangaMax";
                	}
                	else {
                		 if(c<x+75 && c>x) {
                         	directia_orizontala="DreaptaMin";
                         }
                         else {
                         	if(c>x+75 && c<x+150) {
                         	directia_orizontala="DreaptaMax";
                         	}
                         	else {
                             	directia_orizontala="X";
                             	}
                         }
                	}
                }
               
                
                if(d>y+25 && d<y+150) {
                	directia_verticala="Jos";
                }
                else {
                	if(d<y-25 && d>y-150) {
                		directia_verticala="Sus";
                	}
                	else {
                		directia_verticala="X";
                	}
                }
                
               directia=directia_orizontala+directia_verticala;
                System.out.println(directia_orizontala+directia_verticala);
                switch(directia) {
                case"XX":{
                	setLocation(x,y);
                	break;
                	}
                case"DreaptaMinX":{
                	setLocation(x,y);
                	break;
                	}
                case"DreaptaMaxX":{
                	setLocation(x,y);
                	break;
                	}
                case"StangaMinX":{
                	setLocation(x,y);
                	break;
                	}
                case"StangaMaxX":{
                	setLocation(x,y);
                	break;
                	}
                case"XJos":{
                	setLocation(x,y);
                	break;
                	}
                case"XSus":{
                	setLocation(x,y);
                	break;
                	}
                case"DreaptaMinJos":{
                	if(x<301 && y<251) {
                	setLocation(x+50,y+100);
                	x=x+50;
                	y=y+100;
                	punct=new Point(x,y);
                	}
                	else {
                	setLocation(x,y);	
                	}
                	break;
                	}
                case"DreaptaMinSus":{
                	if(x<301 && y>99) {
                	setLocation(x+50,y-100);
                	x=x+50;
                	y=y-100;
                	punct=new Point(x,y);
                	}
                	else {
                	setLocation(x,y);	
                	}
                	break;
                	}
                case"DreaptaMaxJos":{
                	if(x<251 && y<301) {
                	setLocation(x+100,y+50);
                	x=x+100;
                	y=y+50;
                	punct=new Point(x,y);
                	}
                	else {
                	setLocation(x,y);
                	}
                	break;
                	}
                case"DreaptaMaxSus":{
                	if(x<251 && y>49) {
                	setLocation(x+100,y-50);
                	x=x+100;
                	y=y-50;
                	punct=new Point(x,y);
                	}
                	else {
                		setLocation(x,y);
                	}
                	break;
                	}
                case"StangaMinJos":{
                	if(x>49 && y<251) {
                	setLocation(x-50,y+100);
                	x=x-50;
                	y=y+100;
                	punct=new Point(x,y);
                	}
                	else {
                		setLocation(x,y);
                	}
                	break;
                	}
                case"StangaMaxJos":{
                	if(x>99 && y<301) {
                	setLocation(x-100,y+50);
                	x=x-100;
                	y=y+50;
                	punct=new Point(x,y);
                	}
                	else {
                		setLocation(x,y);
                	}
                	break;
                	}
                case"StangaMinSus":{
                	if(x>49 && y>99) {
                	setLocation(x-50,y-100);
                	x=x-50;
                	y=y-100;
                	punct=new Point(x,y);
                	}
                	else {
                		setLocation(x,y);
                	}
                	break;
                	}
                case"StangaMaxSus":{
                	if(x>99 && y>49) {
                	setLocation(x-100,y-50);
                	x=x-100;
                	y=y-50;
                	punct=new Point(x,y);
                	}
                	else {
                		setLocation(x,y);
                	}
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
		this.x=a;
		this.y=b;
		punct=new Point(a,b);
		setLocation(a,b);
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
		
}
