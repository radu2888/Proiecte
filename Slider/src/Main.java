import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/* 3 slidere cu ajutorul carora setam culoarea RGB a unui canvas 
*/
class Fereastra extends Frame implements WindowListener,ChangeListener{
	private JSlider R= new JSlider(JSlider.HORIZONTAL,0,255,100);
	private JSlider G= new JSlider(JSlider.HORIZONTAL,0,255,100);
	private JSlider B= new JSlider(JSlider.HORIZONTAL,0,255,100);
	private Color culoare=new Color(100,100,100);
	private Patrat x=new Patrat(culoare);
	private Label label=new Label("Rosu:"+R.getValue()+" Verde:"+G.getValue()+" Albastru:"+B.getValue());
	Fereastra(){
		super("Slidere");
		setLayout(new FlowLayout());
		Label();
		Slidere();
		add(x);
		add(label);
		
		setSize(300,500);
		addWindowListener(this);
	}
	
	public void Slidere() {
		Font font = new Font("Arial", Font.BOLD, 15);
		
		
			R.setMajorTickSpacing(50);
			R.setMinorTickSpacing(10);
			R.setPaintTicks(true);
	        R.setPaintLabels(true);
			R.setFont(font);
			R.addChangeListener(this);
			add(R);
			
		
			G.setMajorTickSpacing(50);
			G.setMinorTickSpacing(10);
			G.setPaintTicks(true);
			G.setPaintLabels(true);
			G.setFont(font);
			G.addChangeListener(this);
			add(G);
			
		
			B.setMajorTickSpacing(50);
			B.setMinorTickSpacing(10);
			B.setPaintTicks(true);
			B.setPaintLabels(true);
			B.setFont(font);
			B.addChangeListener(this);
			add(B);
			
	}
	
	

	public void Label() {
		Label label1=new Label("Rosu");
		Label label2=new Label("Verde");
		Label label3=new Label("Albastru");
		add(label1);
		add(label2);
		add(label3);
	}
	
	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		System.exit(1);
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		System.out.println(R.getValue()+" "+G.getValue()+" "+B.getValue());
		Color nouaculoare=new Color(R.getValue(),G.getValue(),B.getValue());
		this.culoare=nouaculoare;
		x.recolorare(nouaculoare);
		x.repaint();
		label.setText("Rosu:"+R.getValue()+" Verde:"+G.getValue()+" Albastru:"+B.getValue());
	}
}

class Patrat extends Canvas {
	private Color x;
	Patrat(Color c){
	this.setSize(new Dimension(200, 200));
	this.setBackground(new Color(255, 255, 255));
	this.x=c;
	}
	public void recolorare(Color c) {
		this.x=c;
	}
	public void paint(Graphics g) {
		System.out.println(this.x);
		g.setColor(this.x);
		g.fillRect(0, 0, 200, 200);
		
	}
	
	
}

public class Main {
	public static void main(String[] args) {
		Fereastra x=new Fereastra();
		x.setVisible(true);
	}
}
