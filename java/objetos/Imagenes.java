package objetos;

import javax.swing.*;

@SuppressWarnings("serial")
public class Imagenes extends JPanel {
	
	// Atributos
	private JLabel labelImagen;
	private int numImagen;
	
	// Constructor
	public Imagenes() {
		
		setLayout(null);
		numImagen = 0;
		
		// Creamos el componente para la imagen
		labelImagen=new JLabel();
		labelImagen.setBounds(0,0,382,591);
		labelImagen.setIcon(new ImageIcon(getClass().
		      getResource("/Imagenes/" + 0 + ".png")));
		labelImagen.setBorder(javax.swing.BorderFactory.createBevelBorder
		      (javax.swing.border.BevelBorder.RAISED));
		add(labelImagen);
	}
	
		// Metodos
	// Suma numImagen
	public void sumaNumIMagen() {
		numImagen++;
		labelImagen.setIcon(new ImageIcon(getClass().
		      getResource("/Imagenes/" + numImagen + ".png")));
	}
	
	public void pistas() {
		numImagen = 10;
		labelImagen.setIcon(new ImageIcon(getClass().
		      getResource("/Imagenes/" + numImagen + ".png")));
	}

	public void reiniciarImagen() {
		this.numImagen = 0;
		labelImagen.setIcon(new ImageIcon(getClass().
			      getResource("/Imagenes/" + numImagen + ".png")));
	}
	
}
