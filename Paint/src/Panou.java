
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import java.awt.Point;
import java.awt.Stroke;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;


@SuppressWarnings("serial")
public class Panou extends JPanel {
	
Panou(){
	super();
	
	setBackground(new Color(255,255,255));
	setSize(940, 500);
}



private JFileChooser fisier=new JFileChooser();
private FileNameExtensionFilter filter = new FileNameExtensionFilter("Imagine", "jpg","gif","PNG");
private BufferedImage bi = null;
public void incarcare_imagine() {
	fisier.setFileFilter(filter);
    int butonapasat = fisier.showOpenDialog(this);
    
    if (butonapasat == JFileChooser.APPROVE_OPTION)
    {
        File file = fisier.getSelectedFile();
  
        try {
            bi = ImageIO.read(file);
        } catch(IOException e) {
           e.printStackTrace(); 
        }
    }
}

private String mod_desen="Linie";
public void modificare_mod_desen(String forma) {
	mod_desen=forma;
	System.out.println("Mod desen: " +mod_desen);
}

private Color culoare=new Color(0,0,0);


public void modificare_culoare(String culoarea) {
	
	switch (culoarea){
	case "Negru":{
		culoare=new Color(0,0,0);
	
		break;
	}
	case "Rosu":{
		culoare=new Color(255,0,0);
		
		break;
	}
	case "Verde":{
		culoare=new Color(0,255,0);
		
		break;
	}
	case "Albastru":{
		culoare=new Color(0,0,255);
	
		break;
	}
	case "Alb":{
		culoare=new Color(255,255,255);
		
		break;
	}
	}
	System.out.println("Culoarea: " +culoarea);
}

public void culoare_speciala(String red , String green ,String blue) {
	int r=Integer.parseInt(red);
	int g=Integer.parseInt(green);
	int b=Integer.parseInt(blue);
	culoare=new Color(r,g,b);
}

private String Stil_Linie="Continua";
public void modificare_stil_linie(String linie) {
	Stil_Linie=linie;
	System.out.println("Stil linie: " + Stil_Linie );
}

private String text_introdus;
public void actualizare_text(String text) {
	text_introdus=text;
}

private int grosimelinie_continua=5;
private int grosimelinie_punctata=5;
private int grosimelinie_intrerupta=5;
public void actualizare_grosime(String grosime) {
	grosimelinie_continua=Integer.parseInt(grosime);
	grosimelinie_punctata=Integer.parseInt(grosime);
	grosimelinie_intrerupta=Integer.parseInt(grosime);
}

private String fontul="Arial";
public void actualizare_font(String font) {
	fontul=font;
	System.out.println("Fontul textului:"+fontul);
}
private int marime_text=20;
public void actualizare_marime_caracter( String marime) {
	marime_text=Integer.parseInt(marime);
	System.out.println("Marime caracter:"+marime_text);
}

private ArrayList<Line2D> linie_continua= new ArrayList<Line2D>();
private ArrayList<Integer> grosime_linie_continua= new ArrayList<Integer>();
private ArrayList<Color> culori_linie_continua= new ArrayList<Color>();


private ArrayList<Line2D> linie_punctata= new ArrayList<Line2D>();
private ArrayList<Integer> grosime_linie_punctata= new ArrayList<Integer>();
private ArrayList<Color> culori_linie_punctata= new ArrayList<Color>();


private ArrayList<Line2D> linie_intrerupta= new ArrayList<Line2D>();
private ArrayList<Integer> grosime_linie_intrerupta= new ArrayList<Integer>();
private ArrayList<Color> culori_linie_intrerupta= new ArrayList<Color>();


private ArrayList<Rectangle2D> dreptunghiuri= new ArrayList<Rectangle2D>();
private ArrayList<Color> culori_dreptunghiuri= new ArrayList<Color>();


private ArrayList<Ellipse2D> cercuri= new ArrayList<Ellipse2D>();
private ArrayList<Color> culori_cercuri= new ArrayList<Color>();


private ArrayList<String> texte= new ArrayList<String>();
private ArrayList<Point> coord_text= new ArrayList<Point>();
private ArrayList<String> fonturi =new ArrayList<String>();
private ArrayList<Integer> marime_caracter=new ArrayList<Integer>();
private ArrayList<Color> culori_text= new ArrayList<Color>();

private ArrayList<BufferedImage> imagini=new ArrayList<BufferedImage>();
private ArrayList<Point> inceputimg=new ArrayList<Point>(); 
private ArrayList<Point> sfarsitimg=new ArrayList<Point>(); 

public void desenul() {
	switch(mod_desen) {
	case "Linie":{
			switch(Stil_Linie) {
								case "Continua":{
										Line2D linie =new Line2D.Double(inceput,sfarsit);
										linie_continua.add(linie);
										culori_linie_continua.add(culoare);
										grosime_linie_continua.add(grosimelinie_continua);
										break;
								}
								case "Punctata":{
										Line2D linie =new Line2D.Double(inceput,sfarsit);
										linie_punctata.add(linie);
										culori_linie_punctata.add(culoare);
										grosime_linie_punctata.add(grosimelinie_punctata);
										break;
								}
								case "Intrerupta":{
										Line2D linie =new Line2D.Double(inceput,sfarsit);
										linie_intrerupta.add(linie);
										culori_linie_intrerupta.add(culoare);
										grosime_linie_intrerupta.add(grosimelinie_intrerupta);
										break;
								}
			}
		break;
	}
	
	case "Dreptunghi":{
		Rectangle2D dreptunghi =new Rectangle2D.Double(inceput.x,inceput.y,sfarsit.x-inceput.x,sfarsit.y-inceput.y);
		dreptunghiuri.add(dreptunghi);
		culori_dreptunghiuri.add(culoare);
		break;
	}
	
	case "Cerc": {
		Ellipse2D cerc= new Ellipse2D.Double(inceput.x,inceput.y,sfarsit.x-inceput.x,sfarsit.y-inceput.y);
		cercuri.add(cerc);
		culori_cercuri.add(culoare);
		break;
	}
	
	case "Text": {
		Point punct= new Point(inceput.x,inceput.y);
		String text=new String(text_introdus);
		texte.add(text);
		coord_text.add(punct);
		culori_text.add(culoare);
		fonturi.add(fontul);
		marime_caracter.add(marime_text);
		break;
	}
	
	case"Imagine": {
		imagini.add(bi);
		Point punct =new Point(inceput.x,inceput.y);
		inceputimg.add(punct);
		Point punct_sfarsit=new Point(sfarsit.x,sfarsit.y);
		sfarsitimg.add(punct_sfarsit);
	}
	
	}
}

public void desen_grayscale() {
	for(int i=0; i<culori_linie_continua.size();i++) {
		int x=(int)((culori_linie_continua.get(i).getRed()+culori_linie_continua.get(i).getGreen()+culori_linie_continua.get(i).getBlue())/3);
		culori_linie_continua.set(i, new Color(x,x,x));
		
	}
	for(int i=0; i<culori_linie_punctata.size();i++) {
		int x=(int)((culori_linie_punctata.get(i).getRed()+culori_linie_punctata.get(i).getGreen()+culori_linie_punctata.get(i).getBlue())/3);
		culori_linie_punctata.set(i, new Color(x,x,x));
		
	}
	for(int i=0; i<culori_linie_intrerupta.size();i++) {
		int x=(int)((culori_linie_intrerupta.get(i).getRed()+culori_linie_intrerupta.get(i).getGreen()+culori_linie_intrerupta.get(i).getBlue())/3);
		culori_linie_intrerupta.set(i, new Color(x,x,x));
		
	}
	for(int i=0; i<culori_dreptunghiuri.size();i++) {
		int x=(int)((culori_dreptunghiuri.get(i).getRed()+culori_dreptunghiuri.get(i).getGreen()+culori_dreptunghiuri.get(i).getBlue())/3);
		culori_dreptunghiuri.set(i, new Color(x,x,x));
		
	}
	for(int i=0; i<culori_cercuri.size();i++) {
		int x=(int)((culori_cercuri.get(i).getRed()+culori_cercuri.get(i).getGreen()+culori_cercuri.get(i).getBlue())/3);
		culori_cercuri.set(i, new Color(x,x,x));
	}
	for(int i=0; i<culori_text.size();i++) {
		int x=(int)((culori_text.get(i).getRed()+culori_text.get(i).getGreen()+culori_text.get(i).getBlue())/3);
		culori_text.set(i, new Color(x,x,x));
		
	}
	

}

public void imagine_grayscale()
{	
	for(BufferedImage i:imagini) {
    for (int x = 0; x < i.getWidth(); ++x)
    for (int y = 0; y < i.getHeight(); ++y)
    {
        int rgb = i.getRGB(x, y);
        int r = (rgb >> 16) & 0xFF;
        int g = (rgb >> 8) & 0xFF;
        int b = (rgb & 0xFF);

        int grayLevel = (r + g + b) / 3;
        int gray = (grayLevel << 16) + (grayLevel << 8) + grayLevel; 
        i.setRGB(x, y, gray);
    }
	}
}

public void paintComponent(Graphics g) {
	
    super.paintComponent(g);
    	
    	Graphics2D g2 = (Graphics2D) g ;
    	
    	g2.setColor(culoare);
    		for(BufferedImage i:imagini) {
    			int j=imagini.indexOf(i);
    			
    			g2.drawImage(i, inceputimg.get(j).x, inceputimg.get(j).y, (sfarsitimg.get(j).x-inceputimg.get(j).x), (sfarsitimg.get(j).y-inceputimg.get(j).y), null);
    		
    		}
    		
    		for(Rectangle2D i:dreptunghiuri) {
    			int j= dreptunghiuri.indexOf(i);
    			if(!culori_dreptunghiuri.isEmpty()) {
    			g2.setColor(culori_dreptunghiuri.get(j));
    			}
    			g2.fill(i);
    		}
    						
    		for(Ellipse2D i:cercuri) {
    			int j= cercuri.indexOf(i);
    			if(!culori_cercuri.isEmpty()) {
    			g2.setColor(culori_cercuri.get(j));
    			}
    			g2.fill(i);
    		}
    	
    		for(int i=0;i<texte.size();i++) {
    			if(!culori_text.isEmpty()) {
    			g2.setColor(culori_text.get(i));
    			}
    			g2.setFont(new Font(fonturi.get(i), Font.PLAIN, marime_caracter.get(i)));
    			
    			g2.drawString(texte.get(i), coord_text.get(i).x, coord_text.get(i).y);
    		
    		}
    						
    		for(Line2D i:linie_continua) {
    			
    			int j=linie_continua.indexOf(i);
    			int x=grosime_linie_continua.get(j);
    			g2.setStroke(new BasicStroke(x));
    			if(!culori_linie_continua.isEmpty()) {
    			g2.setColor(culori_linie_continua.get(j));
    			}
    			g2.draw(i);
    			}	
    		
    		for(Line2D i:linie_punctata) {
    		int j=linie_punctata.indexOf(i);
    		Stroke punctata = new BasicStroke(grosime_linie_punctata.get(j), BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[]{5,5}, 0);
        	g2.setStroke(punctata);
        	if(!culori_linie_punctata.isEmpty()) {
    		g2.setColor(culori_linie_punctata.get(j));
        	}
    		g2.draw(i);
    			}
    	
    		for(Line2D i:linie_intrerupta) {
    		int j=linie_intrerupta.indexOf(i);
    		Stroke intrerupta = new BasicStroke(grosime_linie_intrerupta.get(j), BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[]{30,5}, 0);
    		g2.setStroke(intrerupta);
    		if(!culori_linie_intrerupta.isEmpty()) {
    		g2.setColor(culori_linie_intrerupta.get(j));
    		}
    		g2.draw(i);
    		}
}

private Point inceput=new Point(0,0);
private Point sfarsit=new Point(0,0);
public void inceput_linie(Point punct) {
	inceput=punct;
}

public void sfarsit_linie(Point punct) {
	sfarsit=punct;
}

public void stergere_totala() {

	linie_continua.clear();
	grosime_linie_continua.clear();
	culori_linie_continua.clear();
	
	linie_punctata.clear();
	grosime_linie_punctata.clear();
	culori_linie_punctata.clear();
	
	linie_intrerupta.clear();
	grosime_linie_intrerupta.clear();
	culori_linie_intrerupta.clear();
	
	dreptunghiuri.clear();
	culori_dreptunghiuri.clear();
	
	cercuri.clear();
	culori_cercuri.clear();
	
	texte.clear();
	coord_text.clear();
	fonturi.clear();
	marime_caracter.clear();
	culori_text.clear();
	
	imagini.clear();
	inceputimg.clear();
	sfarsitimg.clear();
}



public void save() {
	BufferedImage bi = new BufferedImage ( this.getWidth (), this.getHeight (), BufferedImage.TYPE_INT_ARGB );
    Graphics2D g2d = bi.createGraphics ();
    
    this.paintAll ( g2d );
    g2d.dispose ();
    try
    {
    	JFileChooser fileChooser = new JFileChooser();
    	
        int butonapasat = fileChooser.showSaveDialog(this);
         
        if (butonapasat == JFileChooser.APPROVE_OPTION) {
        	
            File fileToSave = fileChooser.getSelectedFile();
            System.out.println("Fisierul a fost salvat in: " + fileToSave.getAbsolutePath());
            ImageIO.write ( bi, "png", fileToSave );
            
        }
    	
        
    }
    catch ( IOException e )
    {
        e.printStackTrace ();
    }
}
}





