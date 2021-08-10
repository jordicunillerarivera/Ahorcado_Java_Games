package objetos;

import javax.swing.*;

import java.awt.Font;
import java.util.Random;

@SuppressWarnings("serial")
public class Palabra extends JPanel {
	
	private String palabras[];
	private Random rnd;
	private String palabra;
	private char caracteres[];
	private char auxCaracteres[];
	private String auxString;
	private JLabel txtPalabra;
	private int nRnd;
	private int contAciertos;
	private Menu menu;
	private Teclado teclado;
	
	// 	Constructores
	public Palabra(int numAnterior) {
	
	crearPalabra(numAnterior);	
		
	}
	
	// 	Metodo para generar una palabra dentro de nuestra lista de palabras.
	
	public void crearPalabra(int numAnterior) {
		
		setLayout(null);
		contAciertos = 0;
		
		rnd=new Random();
		palabras=generarPalabras();
		do {
			nRnd=rnd.nextInt(10);
		} while(nRnd == numAnterior);
		palabra=palabras[nRnd];
		
		caracteres=palabra.toUpperCase().toCharArray();
		auxCaracteres=generarAuxiliar();
		auxString=charToString();
		
		txtPalabra = new JLabel(auxString);
		Font font = new Font("SansSerif", Font.BOLD, 30);
		txtPalabra.setFont(font);
		txtPalabra.setBounds(10,0,560,62);
		add(txtPalabra);
	}
	
//		Metodo para editar el array del Auxiliar, Auxiliar son los caracteres que se mostraran por pantalla, empezaran como _
//	 	cuando se avanze en el juego ira añadiendo letras en las posiciones segun los aciertos y hara un contador de aciertos.
//		cuando el contador de aciertos llegue al numero de caracteres mostrara un mensaje de victoria.
	
	public void editarAuxiliar(char letra, Imagenes imagenes) {
		int cont = 0;
		for(int i=0;i<caracteres.length;i++) {
			if(caracteres[i]==letra) {
				auxCaracteres[i]=letra;
				contAciertos++;
			}else {
				cont++;
			}
		}
		
		auxString = charToString();
		txtPalabra.setText(auxString);
		
		if (contAciertos >= auxCaracteres.length) {
			menu.ganar();
		}
		
		if (cont == palabra.length()) {
			imagenes.sumaNumIMagen();
		}

	}
	
//		Metodo que pasar la palabra generada a caracteres y asignarlos en un array de caracteres que utilizaremos para comparar 
//	 	con el array axiliar e ir editandolo para mostrar el avanze de la partida.
	
	public String charToString() {
		auxString = " ";
		for(int i=0;i<auxCaracteres.length;i++) {
			auxString+=auxCaracteres[i]+" ";
		}
		return auxString;
	}
	
	//	Metodo que reyenar la array de palabras con las palabras que podran ser seleccionadas para ser la palabra secreta.
	
	public String[] generarPalabras() {
	
	String palabras[]=new String[10];
	
	palabras[0]="Armario";
	palabras[1]="Puerta";
	palabras[2]="Cerradura";
	palabras[3]="Maletin";
	palabras[4]="Maletero";
	palabras[5]="Pluscuamperfecto";
	palabras[6]="Abrelatas";
	palabras[7]="Crucero";
	palabras[8]="Pintalabios";
	palabras[9]="Putojoseluis";
	
	return palabras;
	}

//		Metodo para generar una cadena de _ con el numero de caracteres que tendra la palabra secreta
//		y posteriormente editarla y mostrar el desarrollo de la partida.
	
	public char[] generarAuxiliar() {
		
		char auxCaracteres[]=new char[caracteres.length];
		for(int i=0;i<caracteres.length;i++) {
			auxCaracteres[i]='_';
		}
		return auxCaracteres;
		
	}
	
	public void resolver() {
		
		for (int i = 0; i < auxCaracteres.length; i++) {
			if (auxCaracteres[i] == '_') {
				auxCaracteres[i] = caracteres[i];
				contAciertos++;
				
				auxString = charToString();
				txtPalabra.setText(auxString);
				
				if (contAciertos >= auxCaracteres.length) {
					teclado.reiniciarTeclado();
					menu.ganar();
				}
			}
		}
	}
	
	public void mostrarPista() {
		
		for (int i = 0; i < auxCaracteres.length; i++) {
			if (auxCaracteres[i] == '_') {
				
				String letra = String.valueOf(caracteres[i]);
				teclado.desactivarBoton(letra);
				
				break;
			}
		}
	}
	
	public void getObjetos(Menu menu, Teclado teclado) {
		this.menu = menu;
		this.teclado = teclado;
	}

	// Setters & Getters
	public int getnRnd() {
		return nRnd;
	}
	
}
