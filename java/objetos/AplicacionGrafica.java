package objetos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
		
		iniciarImagenes();
		
		iniciarTeclado();
		
		iniciarMenu();
		
		iniciarPistas();
		
		iniciarPalabra();
		
		teclado.llamarObjetos(palabra, imagenes);
		
		menu.getBtnInicio().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reiniciar();
			}
		});
		
	}
	
	// Metodos	
	public void iniciarImagenes() {
		imagenes = new Imagenes();
		imagenes.setBounds(637, 30, 381, 590);
		getContentPane().add(imagenes);
	}
	
	public void iniciarTeclado() {
		teclado = new Teclado();
		teclado.setBounds(10, 367, 594, 275);
		Border bordeTeclado = new TitledBorder(new EtchedBorder(), "Teclado");
		teclado.setBorder(bordeTeclado);
		getContentPane().add(teclado);
	}
	
	public void iniciarMenu() {
		menu = new Menu();
		menu.setBounds(10, 11, 594, 121);
		Border bordeMenu = new TitledBorder(new EtchedBorder(), "Menu");
		menu.setBorder(bordeMenu);
		getContentPane().add(menu);
	}
	
	public void iniciarPistas() {
		pistas = new Pistas();
		pistas.setBounds(12, 141, 589, 215);
		Border bordePista = new LineBorder(Color.black);
		pistas.setBorder(bordePista);
		getContentPane().add(pistas);
	}

	public void iniciarPalabra() {
		palabra = new Palabra();
		palabra.setBounds(10, 134, 569, 70);
		pistas.add(palabra);
		Border bordePalabra = new TitledBorder(new EtchedBorder(), "Palabra secreta");
		palabra.setBorder(bordePalabra);
	}
	
	public void reiniciar() {
		imagenes.reiniciarImagen();
		teclado.reiniciarTeclado();
		palabra = null;
		iniciarPalabra();
		
		pistas.getBtnPista().setEnabled(true);
		pistas.setVida(5);
		
	}	
}
