package objetos;

import java.awt.Color;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class AplicacionGrafica extends JFrame {

	// Atributos
	private Imagenes imagenes;
	private Teclado teclado;
	private Menu menu;
	private Pistas pistas;
	private Palabra palabra;
	

	// Constructores
	public AplicacionGrafica() {
		
		// Creamos la ventana
		setTitle("Ahorcado");
		setBounds(400, 200, 1069, 725);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		getContentPane().setLayout(null);
		
		imagenes = new Imagenes();
		imagenes.setBounds(659, 30, 381, 590);
		getContentPane().add(imagenes);
		
		teclado = new Teclado();
		teclado.setBounds(10, 367, 594, 275);
		Border bordeTeclado = new TitledBorder(new EtchedBorder(), "Teclado");
		teclado.setBorder(bordeTeclado);
		getContentPane().add(teclado);
		
		menu = new Menu();
		menu.setBounds(10, 11, 594, 121);
		Border bordeMenu = new TitledBorder(new EtchedBorder(), "Menu");
		menu.setBorder(bordeMenu);
		getContentPane().add(menu);
		
		pistas = new Pistas();
		pistas.setBounds(12, 141, 589, 215);
		Border bordePista = new LineBorder(Color.black);
		pistas.setBorder(bordePista);
		getContentPane().add(pistas);
		
		palabra = new Palabra();
		palabra.setBounds(10, 134, 569, 70);
		pistas.add(palabra);
		Border bordePalabra = new TitledBorder(new EtchedBorder(), "Palabra secreta");
		palabra.setBorder(bordePalabra);
		
		teclado.llamarPalabra(palabra);
		
	}
	
}
