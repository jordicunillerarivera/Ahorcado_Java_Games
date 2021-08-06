package objetos;

import javax.swing.*;

import java.awt.Color;
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

	public Palabra() {
	
	//panel
	setLayout(null);
	
	//Texto
	
	rnd=new Random();
	palabras=generarPalabras();
	int nRnd=rnd.nextInt(10);
	palabra=palabras[nRnd];
	
	caracteres=palabra.toUpperCase().toCharArray();
	auxCaracteres=generarAuxiliar();
	auxString=charToString();
	
	
	txtPalabra  =new JLabel(auxString);
	Font font = new Font("SansSerif", Font.BOLD, 30);
	txtPalabra.setFont(font);
	txtPalabra.setBounds(10,0,374,62);
	txtPalabra.setForeground(Color.BLACK);
	add(txtPalabra);		
	}
	
	// Metodo
	public void editarAuxiliar(char letra) {
		for(int i=0;i<caracteres.length;i++) {
			if(caracteres[i]==letra) {
			auxCaracteres[i]=letra;
			System.out.println(auxCaracteres[i]);
			}else {
			System.out.println("no funsiono");
			}
		}
		
		auxString = charToString();
		System.out.println(auxString);
		txtPalabra.setText(auxString);

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
	
	palabras[0]="Palabra1";
	palabras[1]="Palabra2";
	palabras[2]="Palabra3";
	palabras[3]="Palabra4";
	palabras[4]="Palabra5";
	palabras[5]="Palabra6";
	palabras[6]="Palabra7";
	palabras[7]="Palabra8";
	palabras[8]="Palabra9";
	palabras[9]="Palabra10";
	
	return palabras;
	}

	public char[] generarAuxiliar() {
		
	char auxCaracteres[]=new char[caracteres.length];
	for(int i=0;i<caracteres.length;i++) {
		auxCaracteres[i]='_';
	}
	
	return auxCaracteres;
	}
}
