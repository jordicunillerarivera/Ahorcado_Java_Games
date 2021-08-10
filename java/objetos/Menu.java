package objetos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

@SuppressWarnings("serial")
public class Menu extends JPanel {
	
	// Atributos
	private JButton btnInicio;
	private JButton btnResolver;
	private JTextField inputVidas;
	private Imagenes imagenes;
	private Teclado teclado;
	private Palabra palabra;
	private Pistas pistas;
	
	// Constructor
	public Menu() {
		
	setLayout(null);
	
	btnInicio = new JButton("Iniciar juego");
	btnInicio.setBounds(10, 22, 573, 41);
	add(btnInicio);

	btnResolver = new JButton("Resolver");
	btnResolver.setBounds(10, 70, 277, 41);
	btnResolver.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			palabra.resolver();
		}
	});
	add(btnResolver);
	
	inputVidas = new JTextField();
	inputVidas.setText("5");
	inputVidas.setBounds(306, 70, 277, 41);
	inputVidas.setHorizontalAlignment(JTextField.CENTER);
	add(inputVidas);

	}
	
	// Metodos
	public void reiniciar() {
		imagenes.reiniciarImagen();
		teclado.reiniciarTeclado();
		
//		iniciarPalabra(palabra, pistas);
		
		pistas.reiniciar(Integer.parseInt(inputVidas.getText()));
	}
	
	public void ganar() {

		imagenes.resolver();
		JOptionPane.showMessageDialog(null, "Has ganado!!");
		imagenes.reiniciarImagen();
		teclado.reiniciarTeclado();
	}
	
	public void perder() {
		JOptionPane.showMessageDialog(null, "Has perdido :(");
		reiniciar();
	}
	
	public void getObjetos(Imagenes imagenes, Teclado teclado, Palabra palabra, Pistas pistas) {
		this.imagenes = imagenes;
		this.teclado = teclado;
		this.palabra = palabra;
		this.pistas = pistas;
	}

	// Setters & Getters
	public JButton getBtnInicio() {
		return btnInicio;
	}

	public JButton getBtnResolver() {
		return btnResolver;
	}
}
