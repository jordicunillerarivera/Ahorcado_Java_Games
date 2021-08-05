package Ahorcodo.Java_Games;

import javax.swing.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.util.Random;

public class Palabra extends JFrame {

	private JPanel contentPane;
	private String palabras[];
	private Random rnd;
	private String palabra;
	private char caracteres[];
	private char auxCaracteres[];
	private String auxString;

	public Palabra() {
		
		//ventana
		setTitle("Palabra secreta");
		setBounds(600, 500, 390, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		//panel
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		//Texto
		
		rnd=new Random();
		palabras=generarPalabras();
		int nRnd=rnd.nextInt(10);
		palabra=palabras[nRnd];
		caracteres=palabra.toCharArray();
		auxCaracteres=generarAuxiliar();
		auxString=" ";
		for(int i=0;i<auxCaracteres.length;i++) {
			auxString+=auxCaracteres[i]+" ";
		}
		JLabel txtPalabra=new JLabel(auxString);
		Font font = new Font("SansSerif", Font.BOLD, 30);
		txtPalabra.setFont(font);
		txtPalabra.setBounds(0,0,374,61);
		txtPalabra.setForeground(Color.BLACK);
		contentPane.add(txtPalabra);
		System.out.println(caracteres);
		
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
