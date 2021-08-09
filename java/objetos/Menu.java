package objetos;

import javax.swing.*;
//import javax.swing.border.Border;
//import javax.swing.border.EtchedBorder;
//import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class Menu extends JPanel {
	
	// Atributos
	private JButton btnInicio;
	private JButton btnResolver;
	private JTextField inputVidas;
	private Imagenes imagenes;
	private Teclado teclado;
//	private Palabra palabra;
	private Pistas pistas;
	
	// Constructor
	public Menu() {
		
	setLayout(null);
	
	btnInicio = new JButton("Iniciar juego");
	btnInicio.setBounds(10, 22, 573, 41);
	add(btnInicio);

	btnResolver = new JButton("Resolver");
	btnResolver.setBounds(10, 70, 277, 41);
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
	
//	public void iniciarPalabra(Palabra palabra, Pistas pistas) {
//		palabra = new Palabra();
//		palabra.setBounds(10, 134, 569, 70);
//		pistas.add(palabra);
//		Border bordePalabra = new TitledBorder(new EtchedBorder(), "Palabra secreta");
//		palabra.setBorder(bordePalabra);
//	}
	
	public void getObjetos(Imagenes imagenes, Teclado teclado, Palabra palabra, Pistas pistas) {
		this.imagenes = imagenes;
		this.teclado = teclado;
//		this.palabra = palabra;
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
