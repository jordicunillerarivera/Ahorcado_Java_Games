package objetos;

import javax.swing.*;

@SuppressWarnings("serial")
public class AplicacionGrafica extends JFrame {

	// Atributos
	private Imagenes imagenes;
	private Teclado teclado;
	JScrollPane scrollPane;
	

	// Constructores
	public AplicacionGrafica() {
		
		// Creamos la ventana
		setTitle("Ahorcado");
		setBounds(400, 200, 1293, 817);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		getContentPane().setLayout(null);
		
		imagenes = new Imagenes();
		teclado = new Teclado();
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(28,11,1210,756);
		
		scrollPane.setViewportView(imagenes);
		scrollPane.setViewportView(teclado);
		
		
		
	}
}
