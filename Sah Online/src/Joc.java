

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Joc extends JFrame {
	private JButton reset=new JButton("Joc nou");	
	Joc(String s){
		super(s);
		setLayout(null);
		Tabla tabla=new Tabla();
		
		tabla.setBounds(20, 20, tabla.getWidth(), tabla.getHeight());
		add(tabla);
		
		reset.setBounds(450,20,100,50);
		add(reset);
		
		reset.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				tabla.reseteaza_pozitii();
				System.out.println("Da");
			}
			
		});
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1000,1000);
	}
	
}
