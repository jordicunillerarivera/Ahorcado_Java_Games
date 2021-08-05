package objetos;

import javax.swing.*;

@SuppressWarnings("serial")
public class Imagenes extends JPanel {
	
	// Atributos
	private JLabel labelImagen;
	
	// Constructor
	public Imagenes() {
		
		setLayout(null);
		
		// Creamos el componente para la imagen
		labelImagen=new JLabel();
		labelImagen.setBounds(10,11,421,731);
		labelImagen.setIcon(new ImageIcon(getClass().
		      getResource("/Imagenes/" + 6 + ".png")));
		labelImagen.setBorder(javax.swing.BorderFactory.createBevelBorder
		      (javax.swing.border.BevelBorder.RAISED));
		add(labelImagen);
	}
	
}
