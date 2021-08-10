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
	private int palabraAnterior;
	

	// Constructores
	public AplicacionGrafica() {
		
		// Creamos la ventana
		setTitle("AdriAhorcado");
		setBounds(400, 200, 1069, 725);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		getContentPane().setLayout(null);
		
		iniciarImagenes();
		
		iniciarTeclado();
		
		iniciarMenu();
		
		iniciarPistas();
		
		iniciarPalabra(-1);
		
		teclado.setObjetos(palabra, imagenes);
		menu.setObjetos(imagenes, teclado, palabra, pistas);
		pistas.setObjetos(palabra, menu);
		imagenes.setObjetos(menu);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menuMenu = new JMenu("Ayuda");
		menuBar.add(menuMenu);
		
		JMenuItem itemMenuJugar = new JMenuItem("Como jugar");
		itemMenuJugar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Proximamente");
			}
		});
		menuMenu.add(itemMenuJugar);
		
		JMenuItem itemMenuAbout = new JMenuItem("About");
		itemMenuAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "AdriAhorcado\nVersion: 0.7\n\nCreadores:\nJordi Cunillera\nJose Luis Padilla\nMarius Toader");
			}
		});
		menuMenu.add(itemMenuAbout);
		
		menu.getBtnInicio().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menu.reiniciar();
				palabraAnterior = palabra.getnRnd();
				palabra = null;
				iniciarPalabra(palabraAnterior);
			}
		});
		
	}
	
	// 	Los metodos de AplicacionGrafica seran para asignar todos los demas objetos dentro de esta ventana principal y mostrarlos en pantalla.
	
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
		pistas.getBtnPista().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		pistas.setBounds(12, 141, 589, 215);
		Border bordePista = new LineBorder(Color.black);
		pistas.setBorder(bordePista);
		getContentPane().add(pistas);
	}

	public void iniciarPalabra(int numAnterior) {
		palabra = new Palabra(numAnterior);
		palabra.setBounds(10, 134, 569, 70);
		pistas.add(palabra);
		Border bordePalabra = new TitledBorder(new EtchedBorder(), "Palabra secreta");
		palabra.setBorder(bordePalabra);
		palabra.getObjetos(menu, teclado);
	}
}
