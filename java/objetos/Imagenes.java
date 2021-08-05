package objetos;

import javax.swing.*;

public class Imagenes extends JFrame {
	
	// Atributos
	private JPanel contentPane;
	private JLabel labelImagen;
	
	// Constructor
	public Imagenes() {
		
		// Creamos la ventana
		setTitle("Ahorcado");
		setBounds(400, 200, 523, 425);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
			// Creacion del panel
		// Creamos el panel
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		// Creamos el componente para la imagen
		labelImagen=new JLabel();
		labelImagen.setBounds(265,0,242,386);
		labelImagen.setIcon(new ImageIcon(getClass().
		      getResource("/Imagenes/" + 2 + ".PNG")));
		labelImagen.setBorder(javax.swing.BorderFactory.createBevelBorder
		      (javax.swing.border.BevelBorder.RAISED));
		contentPane.add(labelImagen);
	
	}
}
