import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

public class Tabla extends JPanel{
	private List<Pion> pioni_alb =new ArrayList<Pion>();
	private List<Tura> ture_alb =new ArrayList<Tura>();
	private List<Cal> cai_alb =new ArrayList<Cal>();
	private List<Nebun> nebuni_alb=new ArrayList<Nebun>();
	private List<Pion> pioni_negru =new ArrayList<Pion>();
	private List<Tura> ture_negru =new ArrayList<Tura>();
	private List<Cal> cai_negru =new ArrayList<Cal>();
	private List<Nebun> nebuni_negru=new ArrayList<Nebun>();
	private Rege rege_a=new Rege(150,0, "Alb");
	private Regina regina_a=new Regina(200,0,"Alb");
	private Rege rege_n=new Rege(150,350, "Negru");
	private Regina regina_n=new Regina(200,350,"Negru");
	
		Tabla(){
			setSize(400,400);
			setBackground(new Color(255,255,255));
			setLayout(null);
			
			Pion pion_a1=new Pion(0,50,"Alb");
			add(pion_a1);
			Pion pion_a2=new Pion(50,50,"Alb");			
			add(pion_a2);
			Pion pion_a3=new Pion(100,50,"Alb");
			add(pion_a3);	
			Pion pion_a4=new Pion(150,50,"Alb");
			add(pion_a4);
			Pion pion_a5=new Pion(200,50,"Alb");
			add(pion_a5);	
			Pion pion_a6=new Pion(250,50,"Alb");
			add(pion_a6);
			Pion pion_a7=new Pion(300,50,"Alb");
			add(pion_a7);
			Pion pion_a8=new Pion(350,50,"Alb");
			add(pion_a8);
			Tura tura_a1=new Tura(0,0,"Alb");
			add(tura_a1);
			Tura tura_a2=new Tura(350,0,"Alb");
			add(tura_a2);
			Cal  cal_a1=new Cal(50,0,"Alb");
			add(cal_a1);
			Cal  cal_a2=new Cal(300,0,"Alb");
			add(cal_a2);
			Nebun nebun_a1=new Nebun(100,0,"Alb");
			add(nebun_a1);
			Nebun nebun_a2=new Nebun(250,0,"Alb");
			add(nebun_a2);

			add(rege_a);

			add(regina_a);
			
			
			Pion pion_n1=new Pion(0,300,"Negru");
			add(pion_n1);
			Pion pion_n2=new Pion(50,300,"Negru");
			add(pion_n2);
			Pion pion_n3=new Pion(100,300,"Negru");
			add(pion_n3);
			Pion pion_n4=new Pion(150,300,"Negru");
			add(pion_n4);
			Pion pion_n5=new Pion(200,300,"Negru");
			add(pion_n5);
			Pion pion_n6=new Pion(250,300,"Negru");
			add(pion_n6);
			Pion pion_n7=new Pion(300,300,"Negru");
			add(pion_n7);
			Pion pion_n8=new Pion(350,300,"Negru");
			add(pion_n8);
			Tura tura_n1=new Tura(0,350,"Negru");
			add(tura_n1);
			Tura tura_n2=new Tura(350,350,"Negru");
			add(tura_n2);
			Cal  cal_n1=new Cal(50,350,"Negru");
			add(cal_n1);
			Cal  cal_n2=new Cal(300,350,"Negru");
			add(cal_n2);
			Nebun nebun_n1=new Nebun(100,350,"Negru");
			add(nebun_n1);
			Nebun nebun_n2=new Nebun(250,350,"Negru");
			add(nebun_n2);

			add(rege_n);

			add(regina_n); 
			
			pioni_alb.add(pion_a1);
			pioni_alb.add(pion_a2);
			pioni_alb.add(pion_a3);
			pioni_alb.add(pion_a4);
			pioni_alb.add(pion_a5);
			pioni_alb.add(pion_a6);
			pioni_alb.add(pion_a7);
			pioni_alb.add(pion_a8);
			
			pioni_negru.add(pion_n1);
			pioni_negru.add(pion_n2);
			pioni_negru.add(pion_n3);
			pioni_negru.add(pion_n4);
			pioni_negru.add(pion_n5);
			pioni_negru.add(pion_n6);
			pioni_negru.add(pion_n7);
			pioni_negru.add(pion_n8);

			ture_alb.add(tura_a1);
			ture_alb.add(tura_a2);
			
			ture_negru.add(tura_n1);
			ture_negru.add(tura_n2);
			
			cai_alb.add(cal_a1);
			cai_alb.add(cal_a2);
			
			cai_negru.add(cal_n1);
			cai_negru.add(cal_n2);
			
			nebuni_alb.add(nebun_a1);
			nebuni_alb.add(nebun_a2);
			
			nebuni_negru.add(nebun_n1);
			nebuni_negru.add(nebun_n2);
			
			MouseAdapter listener_cal=new MouseAdapter() {
				  public void mouseReleased(MouseEvent e){
					  Cal cal=(Cal) e.getSource();
					  if(cal.culoare()=="Alb") {
					  for(Pion i:pioni_alb) {
						  if(i.pozitie().equals(cal.pozitie())) {
							  cal.pozitie_initiala();
						  }
					  }
					  for(Tura i:ture_alb) {
						  if(i.pozitie().equals(cal.pozitie())) {
							  cal.pozitie_initiala();
						  }
					  }
					  for(Nebun i:nebuni_alb) {
						  if(i.pozitie().equals(cal.pozitie())) {
							  cal.pozitie_initiala();
						  }
					  }
					  if(rege_a.pozitie().equals(cal.pozitie())) {
						  cal.pozitie_initiala();
					  }
					  
					  if(regina_a.pozitie().equals(cal.pozitie())) {
						  cal.pozitie_initiala();
					  }
					  cai_alb.remove(cal);
					  for(Cal i:cai_alb) {
						  if(i.pozitie().equals(cal.pozitie())) {
							  cal.pozitie_initiala();
						  }
					  }
					  cai_alb.add(cal);
					  
					  for (Pion i:pioni_negru) {
						  if(i.pozitie().equals(cal.pozitie())) {
							  i.eliminare();
						  }
					  }
					  
					  for (Cal i:cai_negru) {
						  if(i.pozitie().equals(cal.pozitie())) {
							  i.eliminare();
						  }
					  }
					  for (Nebun i:nebuni_negru) {
						  if(i.pozitie().equals(cal.pozitie())) {
							  i.eliminare();
						  }
					  }
					  for (Tura i:ture_negru) {
						  if(i.pozitie().equals(cal.pozitie())) {
							  i.eliminare();
						  }
					  }
					  
					  if(regina_n.pozitie().equals(cal.pozitie())) {
						  regina_n.eliminare();
					  }
					  }
					  else {
						  for(Pion i:pioni_negru) {
							  if(i.pozitie().equals(cal.pozitie())) {
								  cal.pozitie_initiala();
							  }
						  }
						  for(Tura i:ture_negru) {
							  if(i.pozitie().equals(cal.pozitie())) {
								  cal.pozitie_initiala();
							  }
						  }
						  for(Nebun i:nebuni_negru) {
							  if(i.pozitie().equals(cal.pozitie())) {
								  cal.pozitie_initiala();
							  }
						  }
						  if(rege_n.pozitie().equals(cal.pozitie())) {
							  cal.pozitie_initiala();
						  }
						  
						  if(regina_n.pozitie().equals(cal.pozitie())) {
							  cal.pozitie_initiala();
						  }
						  cai_negru.remove(cal);
						  for(Cal i:cai_negru) {
							  if(i.pozitie().equals(cal.pozitie())) {
								  cal.pozitie_initiala();
							  }
						  }
						  cai_negru.add(cal);
						  
						  for (Pion i:pioni_alb) {
							  if(i.pozitie().equals(cal.pozitie())) {
								  i.eliminare();
							  }
						  }
						  
						  for (Cal i:cai_alb) {
							  if(i.pozitie().equals(cal.pozitie())) {
								  i.eliminare();
							  }
						  }
						  for (Nebun i:nebuni_alb) {
							  if(i.pozitie().equals(cal.pozitie())) {
								  i.eliminare();
							  }
						  }
						  for (Tura i:ture_alb) {
							  if(i.pozitie().equals(cal.pozitie())) {
								  i.eliminare();
							  }
						  }
						  
						  if(regina_a.pozitie().equals(cal.pozitie())) {
							  regina_a.eliminare();
						  }
					  }
				  }
			};
			
			MouseAdapter listener_nebun=new MouseAdapter() {
				  public void mouseReleased(MouseEvent e){
					  Nebun nebun=(Nebun) e.getSource();
					  if(nebun.culoare()=="Alb") {
					  for(Pion i:pioni_alb) {
						  if(i.pozitie().equals(nebun.pozitie())) {
							  nebun.pozitie_initiala();
						  }
					  }
					  for(Tura i:ture_alb) {
						  if(i.pozitie().equals(nebun.pozitie())) {
							  nebun.pozitie_initiala();
						  }
					  }
					  for(Cal i:cai_alb) {
						  if(i.pozitie().equals(nebun.pozitie())) {
							  nebun.pozitie_initiala();
						  }
					  }
					  if(rege_a.pozitie().equals(nebun.pozitie())) {
						  nebun.pozitie_initiala();
					  }
					  
					  if(regina_a.pozitie().equals(nebun.pozitie())) {
						  nebun.pozitie_initiala();
					  }
					  nebuni_alb.remove(nebun);
					  for(Nebun i:nebuni_alb) {
						  if(i.pozitie().equals(nebun.pozitie())) {
							  nebun.pozitie_initiala();
						  }
					  }
					  nebuni_alb.add(nebun);
					  
					  for (Pion i:pioni_negru) {
						  if(i.pozitie().equals(nebun.pozitie())) {
							  i.eliminare();
						  }
					  }
					  
					  for (Cal i:cai_negru) {
						  if(i.pozitie().equals(nebun.pozitie())) {
							  i.eliminare();
						  }
					  }
					  for (Nebun i:nebuni_negru) {
						  if(i.pozitie().equals(nebun.pozitie())) {
							  i.eliminare();
						  }
					  }
					  for (Tura i:ture_negru) {
						  if(i.pozitie().equals(nebun.pozitie())) {
							  i.eliminare();
						  }
					  }
					  
					  if(regina_n.pozitie().equals(nebun.pozitie())) {
						  regina_n.eliminare();
					  }
					  }
					  else {
						  for(Pion i:pioni_negru) {
							  if(i.pozitie().equals(nebun.pozitie())) {
								  nebun.pozitie_initiala();
							  }
						  }
						  for(Tura i:ture_negru) {
							  if(i.pozitie().equals(nebun.pozitie())) {
								  nebun.pozitie_initiala();
							  }
						  }
						  for(Cal i:cai_negru) {
							  if(i.pozitie().equals(nebun.pozitie())) {
								  nebun.pozitie_initiala();
							  }
						  }
						  if(rege_n.pozitie().equals(nebun.pozitie())) {
							  nebun.pozitie_initiala();
						  }
						  
						  if(regina_n.pozitie().equals(nebun.pozitie())) {
							  nebun.pozitie_initiala();
						  }
						  nebuni_negru.remove(nebun);
						  for(Nebun i:nebuni_negru) {
							  if(i.pozitie().equals(nebun.pozitie())) {
								  nebun.pozitie_initiala();
							  }
						  }
						  nebuni_negru.add(nebun);
						  
						  for (Pion i:pioni_alb) {
							  if(i.pozitie().equals(nebun.pozitie())) {
								  i.eliminare();
							  }
						  }
						  
						  for (Cal i:cai_alb) {
							  if(i.pozitie().equals(nebun.pozitie())) {
								  i.eliminare();
							  }
						  }
						  for (Nebun i:nebuni_alb) {
							  if(i.pozitie().equals(nebun.pozitie())) {
								  i.eliminare();
							  }
						  }
						  for (Tura i:ture_alb) {
							  if(i.pozitie().equals(nebun.pozitie())) {
								  i.eliminare();
							  }
						  }
						  
						  if(regina_a.pozitie().equals(nebun.pozitie())) {
							  regina_a.eliminare();
						  }
					  }
				  }
			};

			MouseAdapter listener_tura=new MouseAdapter() {
				  public void mouseReleased(MouseEvent e){
					  Tura tura=(Tura) e.getSource();
					  if(tura.culoare()=="Alb") {
					  for(Pion i:pioni_alb) {
						  if(i.pozitie().equals(tura.pozitie())) {
							  tura.pozitie_initiala();
						  }
					  }
					  for(Nebun i:nebuni_alb) {
						  if(i.pozitie().equals(tura.pozitie())) {
							  tura.pozitie_initiala();
						  }
					  }
					  for(Cal i:cai_alb) {
						  if(i.pozitie().equals(tura.pozitie())) {
							  tura.pozitie_initiala();
						  }
					  }
					  if(rege_a.pozitie().equals(tura.pozitie())) {
						  tura.pozitie_initiala();
					  }
					  
					  if(regina_a.pozitie().equals(tura.pozitie())) {
						  tura.pozitie_initiala();
					  }
					  ture_alb.remove(tura);
					  for(Tura i:ture_alb) {
						  if(i.pozitie().equals(tura.pozitie())) {
							  tura.pozitie_initiala();
						  }
					  }
					  ture_alb.add(tura);
					  
					  for (Pion i:pioni_negru) {
						  if(i.pozitie().equals(tura.pozitie())) {
							  i.eliminare();
						  }
					  }
					  
					  for (Cal i:cai_negru) {
						  if(i.pozitie().equals(tura.pozitie())) {
							  i.eliminare();
						  }
					  }
					  for (Nebun i:nebuni_negru) {
						  if(i.pozitie().equals(tura.pozitie())) {
							  i.eliminare();
						  }
					  }
					  for (Tura i:ture_negru) {
						  if(i.pozitie().equals(tura.pozitie())) {
							  i.eliminare();
						  }
					  }
					  
					  if(regina_n.pozitie().equals(tura.pozitie())) {
						  regina_n.eliminare();
					  }
					  }
					  else {
						  for(Pion i:pioni_negru) {
							  if(i.pozitie().equals(tura.pozitie())) {
								  tura.pozitie_initiala();
							  }
						  }
						  for(Nebun i:nebuni_negru) {
							  if(i.pozitie().equals(tura.pozitie())) {
								  tura.pozitie_initiala();
							  }
						  }
						  for(Cal i:cai_negru) {
							  if(i.pozitie().equals(tura.pozitie())) {
								  tura.pozitie_initiala();
							  }
						  }
						  if(rege_n.pozitie().equals(tura.pozitie())) {
							  tura.pozitie_initiala();
						  }
						  
						  if(regina_n.pozitie().equals(tura.pozitie())) {
							  tura.pozitie_initiala();
						  }
						  ture_negru.remove(tura);
						  for(Tura i:ture_negru) {
							  if(i.pozitie().equals(tura.pozitie())) {
								  tura.pozitie_initiala();
							  }
						  }
						  ture_negru.add(tura);
						  
						  for (Pion i:pioni_alb) {
							  if(i.pozitie().equals(tura.pozitie())) {
								  i.eliminare();
							  }
						  }
						  
						  for (Cal i:cai_alb) {
							  if(i.pozitie().equals(tura.pozitie())) {
								  i.eliminare();
							  }
						  }
						  for (Nebun i:nebuni_alb) {
							  if(i.pozitie().equals(tura.pozitie())) {
								  i.eliminare();
							  }
						  }
						  for (Tura i:ture_alb) {
							  if(i.pozitie().equals(tura.pozitie())) {
								  i.eliminare();
							  }
						  }
						  
						  if(regina_a.pozitie().equals(tura.pozitie())) {
							  regina_a.eliminare();
						  }
					  }
				  }
			};
			
			MouseAdapter listener_rege=new MouseAdapter() {
				  public void mouseReleased(MouseEvent e){
					  Rege rege=(Rege) e.getSource();
					  if(rege.culoare()=="Alb") {
					  for(Pion i:pioni_alb) {
						  if(i.pozitie().equals(rege.pozitie())) {
							  rege.pozitie_initiala();
						  }
					  }
					  for(Nebun i:nebuni_alb) {
						  if(i.pozitie().equals(rege.pozitie())) {
							  rege.pozitie_initiala();
						  }
					  }
					  for(Cal i:cai_alb) {
						  if(i.pozitie().equals(rege.pozitie())) {
							  rege.pozitie_initiala();
						  }
					  }
					  
					  
					  if(regina_a.pozitie().equals(rege.pozitie())) {
						  rege.pozitie_initiala();
					  }

					  for(Tura i:ture_alb) {
						  if(i.pozitie().equals(rege.pozitie())) {
							  rege.pozitie_initiala();
						  }
					  }

					  
					  for (Pion i:pioni_negru) {
						  if(i.pozitie().equals(rege.pozitie())) {
							  i.eliminare();
						  }
					  }
					  
					  for (Cal i:cai_negru) {
						  if(i.pozitie().equals(rege.pozitie())) {
							  i.eliminare();
						  }
					  }
					  for (Nebun i:nebuni_negru) {
						  if(i.pozitie().equals(rege.pozitie())) {
							  i.eliminare();
						  }
					  }
					  for (Tura i:ture_negru) {
						  if(i.pozitie().equals(rege.pozitie())) {
							  i.eliminare();
						  }
					  }
					  
					  if(regina_n.pozitie().equals(rege.pozitie())) {
						  regina_n.eliminare();
					  }
					  }
					  else {
						  for(Pion i:pioni_negru) {
							  if(i.pozitie().equals(rege.pozitie())) {
								  rege.pozitie_initiala();
							  }
						  }
						  for(Nebun i:nebuni_negru) {
							  if(i.pozitie().equals(rege.pozitie())) {
								  rege.pozitie_initiala();
							  }
						  }
						  for(Cal i:cai_negru) {
							  if(i.pozitie().equals(rege.pozitie())) {
								  rege.pozitie_initiala();
							  }
						  }

						  if(regina_n.pozitie().equals(rege.pozitie())) {
							  rege.pozitie_initiala();
						  }

						  for(Tura i:ture_negru) {
							  if(i.pozitie().equals(rege.pozitie())) {
								  rege.pozitie_initiala();
							  }
						  }

						  
						  for (Pion i:pioni_alb) {
							  if(i.pozitie().equals(rege.pozitie())) {
								  i.eliminare();
							  }
						  }
						  
						  for (Cal i:cai_alb) {
							  if(i.pozitie().equals(rege.pozitie())) {
								  i.eliminare();
							  }
						  }
						  for (Nebun i:nebuni_alb) {
							  if(i.pozitie().equals(rege.pozitie())) {
								  i.eliminare();
							  }
						  }
						  for (Tura i:ture_alb) {
							  if(i.pozitie().equals(rege.pozitie())) {
								  i.eliminare();
							  }
						  }
						  
						  if(regina_a.pozitie().equals(rege.pozitie())) {
							  regina_a.eliminare();
						  }
					  }
				  }
			};
			
			MouseAdapter listener_regina=new MouseAdapter() {
				  public void mouseReleased(MouseEvent e){
					  Regina regina=(Regina) e.getSource();
					  if(regina.culoare()=="Alb") {
					  for(Pion i:pioni_alb) {
						  if(i.pozitie().equals(regina.pozitie())) {
							  regina.pozitie_initiala();
						  }
					  }
					  for(Nebun i:nebuni_alb) {
						  if(i.pozitie().equals(regina.pozitie())) {
							  regina.pozitie_initiala();
						  }
					  }
					  for(Cal i:cai_alb) {
						  if(i.pozitie().equals(regina.pozitie())) {
							  regina.pozitie_initiala();
						  }
					  }
					  
					  
					  if(rege_a.pozitie().equals(regina.pozitie())) {
						  regina.pozitie_initiala();
					  }

					  for(Tura i:ture_alb) {
						  if(i.pozitie().equals(regina.pozitie())) {
							  regina.pozitie_initiala();
						  }
					  }

					  
					  for (Pion i:pioni_negru) {
						  if(i.pozitie().equals(regina.pozitie())) {
							  i.eliminare();
						  }
					  }
					  
					  for (Cal i:cai_negru) {
						  if(i.pozitie().equals(regina.pozitie())) {
							  i.eliminare();
						  }
					  }
					  for (Nebun i:nebuni_negru) {
						  if(i.pozitie().equals(regina.pozitie())) {
							  i.eliminare();
						  }
					  }
					  for (Tura i:ture_negru) {
						  if(i.pozitie().equals(regina.pozitie())) {
							  i.eliminare();
						  }
					  }
					  
					  if(regina_n.pozitie().equals(regina.pozitie())) {
						  regina_n.eliminare();
					  }
					  }
					  else {
						  for(Pion i:pioni_negru) {
							  if(i.pozitie().equals(regina.pozitie())) {
								  regina.pozitie_initiala();
							  }
						  }
						  for(Nebun i:nebuni_negru) {
							  if(i.pozitie().equals(regina.pozitie())) {
								  regina.pozitie_initiala();
							  }
						  }
						  for(Cal i:cai_negru) {
							  if(i.pozitie().equals(regina.pozitie())) {
								  regina.pozitie_initiala();
							  }
						  }

						  if(rege_n.pozitie().equals(regina.pozitie())) {
							  regina.pozitie_initiala();
						  }

						  for(Tura i:ture_negru) {
							  if(i.pozitie().equals(regina.pozitie())) {
								  regina.pozitie_initiala();
							  }
						  }

						  
						  for (Pion i:pioni_alb) {
							  if(i.pozitie().equals(regina.pozitie())) {
								  i.eliminare();
							  }
						  }
						  
						  for (Cal i:cai_alb) {
							  if(i.pozitie().equals(regina.pozitie())) {
								  i.eliminare();
							  }
						  }
						  for (Nebun i:nebuni_alb) {
							  if(i.pozitie().equals(regina.pozitie())) {
								  i.eliminare();
							  }
						  }
						  for (Tura i:ture_alb) {
							  if(i.pozitie().equals(regina.pozitie())) {
								  i.eliminare();
							  }
						  }
						  
						  if(regina_a.pozitie().equals(regina.pozitie())) {
							  regina_a.eliminare();
						  }
					  }
				  }
			};
			
			MouseAdapter listener_pion=new MouseAdapter() {
				  public void mouseReleased(MouseEvent e){
					  Pion pion=(Pion) e.getSource();
					  
					  if(pion.culoare()=="Alb") {
						  
					  pioni_alb.remove(pion);
					  for(Pion i:pioni_alb) {
						  if(i.pozitie().equals(pion.pozitie())) {
							  pion.pozitie_initiala();
						  }
					  }
					  pioni_alb.add(pion);
					  
					  for(Nebun i:nebuni_alb) {
						  if(i.pozitie().equals(pion.pozitie())) {
							  pion.pozitie_initiala();
						  }
					  }
					  
					  for(Cal i:cai_alb) {
						  if(i.pozitie().equals(pion.pozitie())) {
							  pion.pozitie_initiala();
						  }
					  }
					  
					  for(Tura i:ture_alb) {
						  if(i.pozitie().equals(pion.pozitie())) {
							  pion.pozitie_initiala();
						  }
					  }

					  if(regina_a.pozitie().equals(pion.pozitie())) {
						  pion.pozitie_initiala();
					  }
					  
					  if(rege_a.pozitie().equals(pion.pozitie())) {
						  pion.pozitie_initiala();
					  }

					  for (Pion i:pioni_negru) {
						  if(i.pozitie().equals(pion.pozitie())) {
							  pion.pozitie_initiala();
						  }
					  }
					  
					  for (Cal i:cai_negru) {
						  if(i.pozitie().equals(pion.pozitie())) {
							  pion.pozitie_initiala();
						  }
					  }
					  for (Nebun i:nebuni_negru) {
						  if(i.pozitie().equals(pion.pozitie())) {
							  pion.pozitie_initiala();
						  }
					  }
					  for (Tura i:ture_negru) {
						  if(i.pozitie().equals(pion.pozitie())) {
							  pion.pozitie_initiala();
						  }
					  }
					  
					  if(regina_n.pozitie().equals(pion.pozitie())) {
						  pion.pozitie_initiala();
					  }
					  
					  if(rege_n.pozitie().equals(pion.pozitie())) {
						  pion.pozitie_initiala();
					  }
					  
					  
					  for (Pion i:pioni_negru) {
						  if(i.pozitie().equals(pion.eliminare_piesa())) {
							  pion.reactualizare_pozitie((int)i.pozitie().getX(),(int) i.pozitie().getY());
							  i.eliminare();
						  }
					  }
					  
					  for (Cal i:cai_negru) {
						  if(i.pozitie().equals(pion.eliminare_piesa())) {
							  pion.reactualizare_pozitie((int)i.pozitie().getX(),(int) i.pozitie().getY());
							  i.eliminare();
						  }
					  }
					  for (Nebun i:nebuni_negru) {
						  if(i.pozitie().equals(pion.eliminare_piesa())) {
							  pion.reactualizare_pozitie((int)i.pozitie().getX(),(int) i.pozitie().getY());
							  i.eliminare();
						  }
					  }
					  for (Tura i:ture_negru) {
						  if(i.pozitie().equals(pion.eliminare_piesa())) {
							  pion.reactualizare_pozitie((int)i.pozitie().getX(),(int) i.pozitie().getY());
							  i.eliminare();
						  }
					  }
					  
					  if(regina_n.pozitie().equals(pion.eliminare_piesa())) {
						  pion.reactualizare_pozitie((int)regina_n.pozitie().getX(),(int) regina_n.pozitie().getY());
						  regina_n.eliminare();
					  }
					  
					  if(pion.pozitie().getY()==(350)) {
					
						  Point eliminat=new Point(1000,1000);
						  if(regina_a.pozitie().equals(eliminat)) {
							  regina_a.reactualizare_pozitie((int)pion.pozitie().getX(), (int)pion.pozitie().getY());
							  pion.eliminare();
						  }
						  
						  for(Tura i:ture_alb) {
							  if(i.pozitie().equals(eliminat)) 
							  {
								  i.reactualizare_pozitie((int)pion.pozitie().getX(), (int)pion.pozitie().getY());
								  pion.eliminare();
							  }
						  }
						  
						  for(Nebun i:nebuni_alb) {
							  if(i.pozitie().equals(eliminat)) 
							  {
								  i.reactualizare_pozitie((int)pion.pozitie().getX(), (int)pion.pozitie().getY());
								  pion.eliminare();
							  }
						  }
						  
						  for(Cal i:cai_alb) {
							  if(i.pozitie().equals(eliminat)) 
							  {
								  i.reactualizare_pozitie((int)pion.pozitie().getX(), (int)pion.pozitie().getY());
								  pion.eliminare();
							  }
						  }
						  
					  }
					  
					  }
					  
					  else {
						  
						  pioni_negru.remove(pion);
						  for(Pion i:pioni_negru) {
							  if(i.pozitie().equals(pion.pozitie())) {
								  pion.pozitie_initiala();
							  }
						  }
						  pioni_negru.add(pion);
						  
						  for(Nebun i:nebuni_negru) {
							  if(i.pozitie().equals(pion.pozitie())) {
								  pion.pozitie_initiala();
							  }
						  }
						  
						  for(Cal i:cai_negru) {
							  if(i.pozitie().equals(pion.pozitie())) {
								  pion.pozitie_initiala();
							  }
						  }
						  
						  for(Tura i:ture_negru) {
							  if(i.pozitie().equals(pion.pozitie())) {
								  pion.pozitie_initiala();
							  }
						  }

						  if(regina_n.pozitie().equals(pion.pozitie())) {
							  pion.pozitie_initiala();
						  }
						  
						  if(rege_n.pozitie().equals(pion.pozitie())) {
							  pion.pozitie_initiala();
						  }
						  
						  for (Pion i:pioni_alb) {
							  if(i.pozitie().equals(pion.pozitie())) {
								  pion.pozitie_initiala();
							  }
						  }
						  
						  for (Cal i:cai_alb) {
							  if(i.pozitie().equals(pion.pozitie())) {
								  pion.pozitie_initiala();
							  }
						  }
						  for (Nebun i:nebuni_alb) {
							  if(i.pozitie().equals(pion.pozitie())) {
								  pion.pozitie_initiala();
							  }
						  }
						  for (Tura i:ture_alb) {
							  if(i.pozitie().equals(pion.pozitie())) {
								  pion.pozitie_initiala();
							  }
						  }
						  
						  if(regina_a.pozitie().equals(pion.pozitie())) {
							  pion.pozitie_initiala();
						  }
						  
						  if(rege_a.pozitie().equals(pion.pozitie())) {
							  pion.pozitie_initiala();
						  }
						  
						  
						  for (Pion i:pioni_alb) {
							  if(i.pozitie().equals(pion.eliminare_piesa())) {
								  pion.reactualizare_pozitie((int)i.pozitie().getX(),(int) i.pozitie().getY());
								  i.eliminare();
							  }
						  }
						  
						  for (Cal i:cai_alb) {
							  if(i.pozitie().equals(pion.eliminare_piesa())) {
								  pion.reactualizare_pozitie((int)i.pozitie().getX(),(int) i.pozitie().getY());
								  i.eliminare();
							  }
						  }
						  
						  for (Nebun i:nebuni_alb) {
							  if(i.pozitie().equals(pion.eliminare_piesa())) {
								  pion.reactualizare_pozitie((int)i.pozitie().getX(),(int) i.pozitie().getY());
								  i.eliminare();
							  }
						  }
						  
						  for (Tura i:ture_alb) {
							  if(i.pozitie().equals(pion.eliminare_piesa())) {
								  System.out.println(i.pozitie());
								  System.out.println(pion.eliminare_piesa());
								  pion.reactualizare_pozitie((int)i.pozitie().getX(),(int) i.pozitie().getY());
								  i.eliminare();
							  }
						  }
						  
						  if(regina_a.pozitie().equals(pion.eliminare_piesa())) {
							  pion.reactualizare_pozitie((int)regina_a.pozitie().getX(),(int) regina_a.pozitie().getY());
							  regina_a.eliminare();
						  }
						  if(pion.pozitie().getY()==(0)) {
								
							  Point eliminat=new Point(1000,1000);
							  if(regina_n.pozitie().equals(eliminat)) {
								  regina_n.reactualizare_pozitie((int)pion.pozitie().getX(), (int)pion.pozitie().getY());
								  pion.eliminare();
							  }
							  
							  for(Tura i:ture_negru) {
								  if(i.pozitie().equals(eliminat)) 
								  {
									  i.reactualizare_pozitie((int)pion.pozitie().getX(), (int)pion.pozitie().getY());
									  pion.eliminare();
								  }
							  }
							  
							  for(Nebun i:nebuni_negru) {
								  if(i.pozitie().equals(eliminat)) 
								  {
									  i.reactualizare_pozitie((int)pion.pozitie().getX(), (int)pion.pozitie().getY());
									  pion.eliminare();
								  }
							  }
							  
							  for(Cal i:cai_negru) {
								  if(i.pozitie().equals(eliminat)) 
								  {
									  i.reactualizare_pozitie((int)pion.pozitie().getX(), (int)pion.pozitie().getY());
									  pion.eliminare();
								  }
							  }
							  
						  }
					  }
					  
				  }
			}; 

			cal_a1.addMouseListener(listener_cal);
			cal_a2.addMouseListener(listener_cal);
			cal_n1.addMouseListener(listener_cal);
			cal_n2.addMouseListener(listener_cal);

			nebun_a1.addMouseListener(listener_nebun);
			nebun_a2.addMouseListener(listener_nebun);
			nebun_n1.addMouseListener(listener_nebun);
			nebun_n2.addMouseListener(listener_nebun);
			
			tura_a1.addMouseListener(listener_tura);
			tura_a2.addMouseListener(listener_tura);
			tura_n1.addMouseListener(listener_tura);
			tura_n2.addMouseListener(listener_tura);
			
			rege_a.addMouseListener(listener_rege);
			rege_n.addMouseListener(listener_rege);
			
			regina_a.addMouseListener(listener_regina);
			regina_n.addMouseListener(listener_regina);
			

			for(Pion i:pioni_alb) {
				i.addMouseListener(listener_pion);
			}
			
			pion_n1.addMouseListener(listener_pion);
			pion_n2.addMouseListener(listener_pion);
			pion_n3.addMouseListener(listener_pion);
			pion_n4.addMouseListener(listener_pion);
			pion_n5.addMouseListener(listener_pion);
			pion_n6.addMouseListener(listener_pion);
			pion_n7.addMouseListener(listener_pion);
			pion_n8.addMouseListener(listener_pion);
			
		}	
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			for (int x=0;x<400;x=x+50) {
				for(int y=0; y<400; y=y+50) {
					if (x==y || x==y-100 || x==y-200 || x==y-300 ||x==y+100 || x==y+200 || x==y+300){
					 g.setColor(Color.GRAY);
					 g.fillRect(x, y, 50, 50);
					}
				}
					
			}  
	    }
		
		public void reseteaza_pozitii() {
			int x=0,y=50;
			
			for(Pion i:pioni_alb) {
				i.reactualizare_pozitie(x, y);
				x=x+50;
			}
			 x=0;
			 y=300;
			for(Pion i:pioni_negru) {
				y=300;
				i.reactualizare_pozitie(x, y);
				x=x+50;
			}
			 x=0;
			 y=0;
			for(Tura i:ture_alb) {

				i.reactualizare_pozitie(x, y);
				x=x+350;
			}
			
			 x=0;
			 y=350;
			for(Tura i:ture_negru) {
				i.reactualizare_pozitie(x, y);
				x=x+350;
			}
			
			x=50;
			y=0;
			for(Cal i:cai_alb) {
				i.reactualizare_pozitie(x, y);
				x=x+250;
			}
			
			x=50;
			y=350;
			for(Cal i:cai_negru) {
				i.reactualizare_pozitie(x, y);
				x=x+250;
			}
			
			x=100;
			y=0;
			for(Nebun i:nebuni_alb) {
				i.reactualizare_pozitie(x, y);
				x=x+150;
			}
			
			x=100;
			y=350;
			for(Nebun i:nebuni_negru) {
				i.reactualizare_pozitie(x, y);
				x=x+150;
			}
			
			rege_a.reactualizare_pozitie(150, 0);
			regina_a.reactualizare_pozitie(200, 0);
			rege_n.reactualizare_pozitie(150, 350);
			regina_n.reactualizare_pozitie(200, 350);
		}
		
		
}
