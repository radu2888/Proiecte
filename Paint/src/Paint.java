
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


@SuppressWarnings("serial")
public class Paint extends JFrame {
	private Panou desen=new Panou();
	private JButton incarcare_imagine=new JButton("Incarca Imagine");
	private JLabel text_culoare=new JLabel("Culoarea:");
	private String[] culori= {"Negru","Rosu","Verde","Albastru","Alb"};
	private JComboBox<String> selectare_culoare=new JComboBox<String>(culori);
	private JLabel text_forma_linie=new JLabel("Forma liniei:");
	private String[] linii= {"Continua","Punctata", "Intrerupta"};
	private JComboBox<String> forma_linie=new JComboBox<String>(linii);
	private JLabel text_mod_desen=new JLabel("Mod desen:");
	private String[] moduri= {"Linie", "Dreptunghi","Cerc","Text","Imagine"};
	private JComboBox<String> moduri_desen=new JComboBox<String>(moduri);
	private JLabel text_text=new JLabel("Text desen:");
	private JTextField text =new JTextField();
	private JLabel text_grosime_linie=new JLabel("Grosime linie:");
	private JTextField grosime_linie=new JTextField();
	private JLabel text_font=new JLabel("Font:");
	private String[] fonturi= {"Arial", "Arial Black","Bradley Hand ITC","Comic Sans MS","Times New Roman"};
	private JComboBox<String> font=new JComboBox<String>(fonturi);
	private JLabel text_marime_caracter=new JLabel("Marime caracter:");
	private JTextField marime_caracter=new JTextField();
	private JButton sterge_tot=new JButton("Sterge tot");
	private JButton grayscale_imagine=new JButton("Grayscale Imagine");
	private JButton grayscale_desen=new JButton("Grayscale Desen");
	private JButton salvare=new JButton("Salveaza");
	private JLabel text_culoare_speciala= new JLabel("Culoare speciala");
	private JLabel red= new JLabel("R:");
	private JTextField r=new JTextField();
	private JLabel green= new JLabel("G:");
	private JTextField g=new JTextField();
	private JLabel blue= new JLabel("B:");
	private JTextField b=new JTextField();
	private JButton aplica_culoarea=new JButton("Aplica Culoarea");
Paint(){
	super("Paint");
	setLayout(null);
	
	desen.setBounds(20, 20, desen.getWidth(), desen.getHeight());
	
	add(desen);

	incarcare_imagine.setBounds(20, 540, 150, 50);
	incarcare_imagine.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			desen.incarcare_imagine();
			moduri_desen.setSelectedItem("Imagine");
			
		}
	});
	add(incarcare_imagine);
	
	text_culoare.setBounds(200, 540, 150, 50);
	add(text_culoare);
	
	selectare_culoare.setBounds(270, 540, 150, 50);
	selectare_culoare.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			desen.modificare_culoare(selectare_culoare.getSelectedItem().toString());
			
		}
		
	});
	add(selectare_culoare);
	
	text_forma_linie.setBounds(690, 540, 150, 50);
	add(text_forma_linie);
	
	forma_linie.setBounds(770,540,150,50);
	forma_linie.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			desen.modificare_stil_linie(forma_linie.getSelectedItem().toString());
			
		}
		
	});
	add(forma_linie);
	
	text_mod_desen.setBounds(440,540,150,50);
	add(text_mod_desen);
	
	moduri_desen.setBounds(520,540,150,50);
	moduri_desen.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			desen.modificare_mod_desen(moduri_desen.getSelectedItem().toString());
			
		}
		
	});
	add(moduri_desen);
	
	text_text.setBounds(200, 600, 150, 50);
	add(text_text);
	
	text.setBounds(270,600,150,50);
	add(text);
	
	text_grosime_linie.setBounds(20, 600, 150, 50);
	add(text_grosime_linie);
	
	grosime_linie.setBounds(120,600,50,50);
	add(grosime_linie);
	grosime_linie.setText("5");
	
	text_font.setBounds(450,600,150,50);
	add(text_font);
	
	font.setBounds(520, 600, 150, 50);
	font.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			desen.actualizare_font(font.getSelectedItem().toString());
		}
		
	});
	
	add(font);
	
	text_marime_caracter.setBounds(690,600,150,50);
	add(text_marime_caracter);
	
	marime_caracter.setBounds(810, 600, 50, 50);
	marime_caracter.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			desen.actualizare_marime_caracter(marime_caracter.getText());
		}
		
	});
	marime_caracter.setText("20");
	add(marime_caracter);
	
	sterge_tot.setBounds(20, 660, 150, 50);
	sterge_tot.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			desen.stergere_totala();
			repaint();
		}
		
	});
	add(sterge_tot);
	
	grayscale_imagine.setBounds(190, 660, 230, 50);
	grayscale_imagine.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			desen.imagine_grayscale();
			repaint();
		}
	});
	add(grayscale_imagine);
	
	grayscale_desen.setBounds(440, 660, 230, 50);
	grayscale_desen.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			desen.desen_grayscale();
			repaint();
		}
	});
	add(grayscale_desen);
	
	salvare.setBounds(690, 660, 230, 50);
	salvare.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			desen.save();
		}
	});
	add(salvare);
	
	text_culoare_speciala.setBounds(20, 720,150,50);
	add(text_culoare_speciala);
	
	red.setBounds(190,720,150,50);
	add(red);
	r.setBounds(205, 720, 50, 50);
	add(r);
	
	green.setBounds(260,720,150,50);
	add(green);
	g.setBounds(275, 720, 50, 50);
	add(g);
	
	blue.setBounds(330,720,150,50);
	add(blue);
	b.setBounds(350, 720, 50, 50);
	add(b);
	
	r.setText("0");
	g.setText("0");
	b.setText("0");
	
	aplica_culoarea.setBounds(440, 720, 230, 50);
	aplica_culoarea.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			int x=Integer.parseInt(r.getText());
			int y=Integer.parseInt(g.getText());
			int z=Integer.parseInt(b.getText());
			
			if(x>=0 && y>=0 && z>=0 && x<255 && y<255 && z<255) {
			aplica_culoarea.setText("Aplica Culoarea");
			desen.culoare_speciala(r.getText(), g.getText(), b.getText());
			}
			else {
				aplica_culoarea.setText("INTRODUCETI VALORI RGB");
			}
		}
		
	});
	add(aplica_culoarea);
	
	MouseAdapter mouse=new MouseAdapter(){
		   
			public void mousePressed(MouseEvent e){
				desen.inceput_linie(e.getPoint());
				desen.actualizare_text(text.getText());
				desen.actualizare_grosime(grosime_linie.getText());
				
			}
			
			
			public void mouseReleased(MouseEvent e) {
				desen.sfarsit_linie(e.getPoint());
				desen.desenul();
				repaint();
			}
		   
	};
	
	
	
	desen.addMouseListener(mouse);
	
	
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setSize(1000,840);
}

}
