
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;


class Butoane extends JFrame implements WindowListener {
	private JCheckBox checkbox1=new JCheckBox("CheckBox 1");
	private JCheckBox checkbox2=new JCheckBox("CheckBox 2");
	private JCheckBox checkbox3=new JCheckBox("CheckBox 3");
	
	private JRadioButton buton1=new JRadioButton("Buton 1");
	private JRadioButton buton2=new JRadioButton("Buton 2");
	private JRadioButton buton3=new JRadioButton("Buton 3");
	
	String[] a= {"1","2","3"};
	private JComboBox<String> box1=new JComboBox<String>(a);
	private JComboBox<String> box2=new JComboBox<String>(a);
	private JComboBox<String> box3=new JComboBox<String>(a);
	
	private JLabel label=new JLabel("Operatiile executate : ");
	
	Butoane(){
		super("Butoane");
		setLayout(null);
		checkbox1.setBounds(20, 50, 100, 20);
		this.add(checkbox1);
		checkbox1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(checkbox1.isSelected()) {
				 label.setText( "CheckBox 1 a fost bifat ");
				
				}
				if(!checkbox1.isSelected()) {
					 label.setText("CheckBox 1 a fost debifat ");
					
					}
				
			}
			
		}
		);
		
		checkbox2.setBounds(120, 50, 100, 20);
		this.add(checkbox2);
		checkbox2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(checkbox2.isSelected()) {
				 label.setText("CheckBox 2 a fost bifat");
				
				}
				if(!checkbox2.isSelected()) {
					 label.setText("CheckBox 2 a fost debifat");
					
					}
				
			}
			
		}
		);
		
		checkbox3.setBounds(220, 50, 100, 20);
		this.add(checkbox3);
		checkbox3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(checkbox3.isSelected()) {
				 label.setText("CheckBox 3 a fost bifat");
			
				}
				if(!checkbox3.isSelected()) {
					 label.setText("CheckBox 3 a fost debifat");
					
					}
				
			}
			
		}
		);
		
		buton1.setBounds(20, 100, 100, 20);
		this.add(buton1);
		buton1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(buton1.isSelected()) {
				 label.setText("Butonul 1 a fost apasat");
			
				}
				if(!buton1.isSelected()) {
					 label.setText("Butonul 2 a fost debifat");
					
					}
				
			}
			
		}
		);
		
		buton2.setBounds(120, 100, 100, 20);
		this.add(buton2);
		buton2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(buton2.isSelected()) {
				 label.setText("Butonul 2 a fost apasat");
			
				}
				if(!buton2.isSelected()) {
					 label.setText("Butonul 2 a fost debifat");
					
					}
				
			}
			
		});
		
		buton3.setBounds(220, 100, 100, 20);
		this.add(buton3);
		buton3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(buton3.isSelected()) {
				 label.setText("Butonul 3 a fost apasat");
			
				}
				if(!buton3.isSelected()) {
					 label.setText("Butonul 3 a fost debifat");
					
					}
				
			}
			
		});
		
		box1.setBounds(20, 150, 100, 20);
		this.add(box1);
		box1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(box1.isEnabled()) {
					label.setText("A fost selectat: "+(String) box1.getSelectedItem());
				}
				
			}
			
		});

		box2.setBounds(130, 150, 100, 20);
		this.add(box2);
		box2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(box2.isEnabled()) {
					label.setText("A fost selectat: "+(String) box2.getSelectedItem());
				}
				
			}
			
		});
		
		box3.setBounds(240, 150, 100, 20);
		this.add(box3);
		box3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(box3.isEnabled()) {
					label.setText("A fost selectat: "+(String) box3.getSelectedItem());
				}
				
			}
			
		});
		
		label.setBounds(20, 200, 200, 100);
		this.add(label);
		
		this.setSize(500, 500);
		addWindowListener(this);
	}

	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
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
	
}

public class Main {
	public static void main(String[] args) {
		Butoane x=new Butoane();
		x.setVisible(true);
	}
}
