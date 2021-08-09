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
	
	// Constructores
	public Palabra(int numAnterior) {
	
	crearPalabra(numAnterior);	
		
	}
	
	// Metodo
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
			JOptionPane.showMessageDialog(null, "Has ganado!!");
			menu.reiniciar();
		}
		
		if (cont == palabra.length()) {
			imagenes.sumaNumIMagen();
		}

	}
		
	public String charToString() {
		auxString = " ";
		for(int i=0;i<auxCaracteres.length;i++) {
			auxString+=auxCaracteres[i]+" ";
		}
		return auxString;
	}
	
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

	public char[] generarAuxiliar() {
		
	char auxCaracteres[]=new char[caracteres.length];
	for(int i=0;i<caracteres.length;i++) {
		auxCaracteres[i]='_';
	}
	
	return auxCaracteres;
	}
	
	public void getMenu(Menu menu) {
		this.menu = menu;
	}

	// Setters & Getters
	public int getnRnd() {
		return nRnd;
	}
	
}
