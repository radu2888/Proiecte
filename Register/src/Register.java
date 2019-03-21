import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JComboBox;


public class Register {
	public static void main(String[] args) {
		Pagina x=new Pagina();
		x.setVisible(true);
	}
}

class Pagina extends Frame implements WindowListener, ItemListener{
	Label label=new Label("Introduceti Datele");
	Label label_nume= new Label("Nume*: ");
	Label label_prenume= new Label("Prenume*: ");
	Label label_an=new Label("An studii*: ");
	Label label_facultate=new Label("Facultate*: ");
	Label label_finantare=new Label("Finantare*: ");
	Label label_curs=new Label("Curs*: ");
	TextField nume=new TextField(20);
	TextField prenume=new TextField(20);
	String[]ani= {"","I","II","III","IV"};
	JComboBox<String> an=new JComboBox<String>(ani);
	String[] facult= {"","Facultatea de Automatica si Calculatoare",
			"Facultatea de Electronica, Telecomunicatii si Tehnologia Informatiei","Facultatea de Instalatii"};
	JComboBox<String> facultate=new JComboBox<String>(facult);
	Checkbox buget =new Checkbox("Buget");
	Checkbox taxa =new Checkbox("Taxa");
	String[]cursul= {"","Programare Java","Programare C/C++"};
	JComboBox<String> curs=new JComboBox<String>(cursul);
	Button inregistrare= new Button("Inregistrare");
	TextArea afisare =new TextArea();
	Pagina(){
		super("Curs ONLINE");
		setLayout(null);
		
		label.setBounds( 250 , 20, 100, 50 );
		this.add(label);
		
		label_nume.setBounds( 20 , 80, 80, 10 );
		this.add(label_nume);
		
		label_prenume.setBounds( 20 , 110, 80, 10 );
		this.add(label_prenume);
		
		label_an.setBounds( 20 , 140, 80, 10 );
		this.add(label_an);
		
		label_facultate.setBounds( 20 , 170, 80, 10 );
		this.add(label_facultate);
		
		label_finantare.setBounds( 20 , 200, 80, 10 );
		this.add(label_finantare);
		
		label_curs.setBounds( 20 , 230, 80, 10 );
		this.add(label_curs);
		
		nume.setBounds(100, 75, 100, 20);
		this.add(nume);
		
		prenume.setBounds(100, 105, 100, 20);
		this.add(prenume);
		
		an.setBounds(100, 135, 50, 20);
		this.add(an);
		
		facultate.setBounds(100, 165, 400, 20);
		this.add(facultate);
		
		buget.setBounds(100, 195, 50, 20);
		this.add(buget);
		
		taxa.setBounds(160, 195, 100, 20);
		this.add(taxa);
		
		buget.addItemListener(this);
		taxa.addItemListener(this);
		
		curs.setBounds(100, 225, 150, 20);
		this.add(curs);
		
		inregistrare.setBounds(250, 275, 100, 20);
		this.add(inregistrare);
		
		inregistrare.addActionListener(new ActionListener() {

			  public void actionPerformed(ActionEvent event) {
				String x;
				if(buget.getState()) {
					x="Buget";
				}
				else {
					x="Taxa";
				}
			    afisare.setText(" Nume: "+ nume.getText()+"\n Prenume: "+prenume.getText()+"\n An: "+an.getSelectedItem()
			    +"\n Facultate: "+facultate.getSelectedItem()+"\n Finantare: "+x+"\n Curs: "+curs.getSelectedItem());
			    
			    
			  }

			});
		afisare.setBounds(100, 305, 400, 250);
		this.add(afisare);
		
		this.setSize(600, 600);
		addWindowListener(this);
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
	public void itemStateChanged(ItemEvent e) {
		if(e.getStateChange()==ItemEvent.SELECTED) {
			if (taxa.getState()) {
				buget.setState(false);
			}
			if (buget.getState()) {
				taxa.setState(false);
			}
		}
		
	}

	
}