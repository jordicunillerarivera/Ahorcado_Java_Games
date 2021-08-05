package objetos;

import javax.swing.*;

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
		setBounds(400, 200, 1293, 817);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		getContentPane().setLayout(null);
		
		imagenes = new Imagenes();
		imagenes.setBounds(701, 11, 436, 743);
		getContentPane().add(imagenes);
		
		teclado = new Teclado();
		teclado.setBounds(10, 381, 594, 268);
		getContentPane().add(teclado);
		
		menu = new Menu();
		menu.setBounds(10, 11, 594, 108);
		getContentPane().add(menu);
		
		pistas = new Pistas();
		pistas.setBounds(10, 130, 634, 123);
		getContentPane().add(pistas);
		
		imagenes = new Imagenes();
		getContentPane().add(imagenes);
				
		palabra = new Palabra();
		palabra.setBounds(10, 264, 594, 97);
		getContentPane().add(palabra);
		
	}
}
