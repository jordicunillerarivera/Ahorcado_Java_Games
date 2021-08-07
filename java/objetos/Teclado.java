package objetos;

import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Teclado extends JPanel {

	// Atributo
	private Palabra palabra;
	private Imagenes imagenes;
	final JButton btnA, btnB, btnC, btnD, btnE, btnF, btnG, btnH, btnI, btnJ, btnK, btnL, btnM, btnN, btnÑ, btnO, btnP, btnQ, btnR, btnS, btnT, btnU, btnV, btnW, btnX, btnY, btnZ;
	
	// Constructor
	public Teclado() {
		
		setLayout(null);

		// Botones A-E

		btnA = new JButton("A");
		btnA.setBounds(10, 21, 112, 41);
		add(btnA);
		btnA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnA.setBackground(Color.lightGray);
				palabra.editarAuxiliar('A', imagenes);
				btnA.setEnabled(false);
			}
		});

		btnB = new JButton("B");
		btnB.setBounds(121, 21, 112, 41);
		add(btnB);
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnB.setBackground(Color.lightGray);
				palabra.editarAuxiliar('B', imagenes);
				btnB.setEnabled(false);
			}
		});

		btnC = new JButton("C");
		btnC.setBounds(231, 21, 112, 41);
		add(btnC);
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnC.setBackground(Color.lightGray);
				palabra.editarAuxiliar('C', imagenes);
				btnC.setEnabled(false);
			}
		});

		btnD = new JButton("D");
		btnD.setBounds(341, 21, 112, 41);
		add(btnD);
		btnD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnD.setBackground(Color.lightGray);
				palabra.editarAuxiliar('D', imagenes);
				btnD.setEnabled(false);
			}
		});

		btnE = new JButton("E");
		btnE.setBounds(454, 21, 112, 41);
		add(btnE);
		btnE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnE.setBackground(Color.lightGray);
				palabra.editarAuxiliar('E', imagenes);
				btnE.setEnabled(false);
			}
		});

		// Botones F-J

		btnF = new JButton("F");
		btnF.setBounds(10, 62, 112, 41);
		add(btnF);
		btnF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnF.setBackground(Color.lightGray);
				palabra.editarAuxiliar('F', imagenes);
				btnF.setEnabled(false);
			}
		});

		btnG = new JButton("G");
		btnG.setBounds(121, 62, 112, 41);
		add(btnG);
		btnG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnG.setBackground(Color.lightGray);
				palabra.editarAuxiliar('G', imagenes);
				btnG.setEnabled(false);
			}
		});

		btnH = new JButton("H");
		btnH.setBounds(231, 62, 112, 41);
		add(btnH);
		btnH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnH.setBackground(Color.lightGray);
				palabra.editarAuxiliar('H', imagenes);
				btnH.setEnabled(false);
			}
		});

		btnI = new JButton("I");
		btnI.setBounds(341, 62, 112, 41);
		add(btnI);
		btnI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnI.setBackground(Color.lightGray);
				palabra.editarAuxiliar('I', imagenes);
				btnI.setEnabled(false);
			}
		});

		btnJ = new JButton("J");
		btnJ.setBounds(454, 62, 112, 41);
		add(btnJ);
		btnJ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnJ.setBackground(Color.lightGray);
				palabra.editarAuxiliar('J', imagenes);
				btnJ.setEnabled(false);
			}
		});

		// Botones K-Ñ

		btnK = new JButton("K");
		btnK.setBounds(10, 102, 112, 41);
		add(btnK);
		btnK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnK.setBackground(Color.lightGray);
				palabra.editarAuxiliar('K', imagenes);
				btnK.setEnabled(false);
			}
		});

		btnL = new JButton("L");
		btnL.setBounds(121, 102, 112, 41);
		add(btnL);
		btnL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnL.setBackground(Color.lightGray);
				palabra.editarAuxiliar('L', imagenes);
				btnL.setEnabled(false);
			}
		});

		btnM = new JButton("M");
		btnM.setBounds(231, 102, 112, 41);
		add(btnM);
		btnM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnM.setBackground(Color.lightGray);
				palabra.editarAuxiliar('M', imagenes);
				btnM.setEnabled(false);
			}
		});

		btnN = new JButton("N");
		btnN.setBounds(341, 102, 112, 41);
		add(btnN);
		btnN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnN.setBackground(Color.lightGray);
				palabra.editarAuxiliar('N', imagenes);
				btnN.setEnabled(false);
			}
		});

		btnÑ = new JButton("Ñ");
		btnÑ.setBounds(454, 102, 112, 41);
		add(btnÑ);
		btnÑ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnÑ.setBackground(Color.lightGray);
				palabra.editarAuxiliar('Ñ', imagenes);
				btnÑ.setEnabled(false);
			}
		});

		// Botones O-S

		btnO = new JButton("O");
		btnO.setBounds(10, 142, 112, 41);
		add(btnO);
		btnO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnO.setBackground(Color.lightGray);
				palabra.editarAuxiliar('O', imagenes);
				btnO.setEnabled(false);
			}
		});

		btnP = new JButton("P");
		btnP.setBounds(121, 142, 112, 41);
		add(btnP);
		btnP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnP.setBackground(Color.lightGray);
				palabra.editarAuxiliar('P', imagenes);
				btnP.setEnabled(false);
			}
		});

		btnQ = new JButton("Q");
		btnQ.setBounds(231, 142, 112, 41);
		add(btnQ);
		btnQ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnQ.setBackground(Color.lightGray);
				palabra.editarAuxiliar('Q', imagenes);
				btnQ.setEnabled(false);
			}
		});

		btnR = new JButton("R");
		btnR.setBounds(341, 142, 112, 41);
		add(btnR);
		btnR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnR.setBackground(Color.lightGray);
				palabra.editarAuxiliar('R', imagenes);
				btnR.setEnabled(false);
			}
		});

		btnS = new JButton("S");
		btnS.setBounds(454, 142, 112, 41);
		add(btnS);
		btnS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnS.setBackground(Color.lightGray);
				palabra.editarAuxiliar('S', imagenes);
				btnS.setEnabled(false);
			}
		});

		// Botones T-X

		btnT = new JButton("T");
		btnT.setBounds(10, 183, 112, 41);
		add(btnT);
		btnT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnT.setBackground(Color.lightGray);
				palabra.editarAuxiliar('T', imagenes);
				btnT.setEnabled(false);
			}
		});

		btnU = new JButton("U");
		btnU.setBounds(121, 183, 112, 41);
		add(btnU);
		btnU.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnU.setBackground(Color.lightGray);
				palabra.editarAuxiliar('U', imagenes);
				btnU.setEnabled(false);
			}
		});

		btnV = new JButton("V");
		btnV.setBounds(231, 183, 112, 41);
		add(btnV);
		btnV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnV.setBackground(Color.lightGray);
				palabra.editarAuxiliar('V', imagenes);
				btnV.setEnabled(false);
			}
		});

		btnW = new JButton("W");
		btnW.setBounds(341, 183, 112, 41);
		add(btnW);
		btnW.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnW.setBackground(Color.lightGray);
				palabra.editarAuxiliar('W', imagenes);
				btnW.setEnabled(false);
			}
		});

		btnX = new JButton("X");
		btnX.setBounds(454, 183, 112, 41);
		add(btnX);
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnX.setBackground(Color.lightGray);
				palabra.editarAuxiliar('X', imagenes);
				btnX.setEnabled(false);
			}
		});
		
		// Botones Y Z
		btnY = new JButton("Y");
		btnY.setBounds(10, 224, 112, 41);
		add(btnY);
		btnY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnY.setBackground(Color.lightGray);
				palabra.editarAuxiliar('Y', imagenes);
				btnY.setEnabled(false);
			}
		});

		btnZ = new JButton("Z");
		btnZ.setBounds(121, 224, 112, 41);
		add(btnZ);
		btnZ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnZ.setBackground(Color.lightGray);
				palabra.editarAuxiliar('Z', imagenes);
				btnZ.setEnabled(false);
			}
		});
	}
	
	// Metodos
	public void llamarObjetos(Palabra palabra, Imagenes imagenes) {
		this.palabra=palabra;
		this.imagenes = imagenes;
	}
	
	public void reiniciarTeclado() {
		btnA.setEnabled(true);
		btnA.setBackground(null);
		btnB.setEnabled(true);
		btnB.setBackground(null);
		btnC.setEnabled(true);
		btnC.setBackground(null);
		btnD.setEnabled(true);
		btnD.setBackground(null);
		btnE.setEnabled(true);
		btnE.setBackground(null);
		btnF.setEnabled(true);
		btnF.setBackground(null);
		btnG.setEnabled(true);
		btnG.setBackground(null);
		btnH.setEnabled(true);
		btnH.setBackground(null);
		btnI.setEnabled(true);
		btnI.setBackground(null);
		btnJ.setEnabled(true);
		btnJ.setBackground(null);
		btnK.setEnabled(true);
		btnK.setBackground(null);
		btnL.setEnabled(true);
		btnL.setBackground(null);
		btnM.setEnabled(true);
		btnM.setBackground(null);
		btnN.setEnabled(true);
		btnN.setBackground(null);
		btnÑ.setEnabled(true);
		btnÑ.setBackground(null);
		btnO.setEnabled(true);
		btnO.setBackground(null);
		btnP.setEnabled(true);
		btnP.setBackground(null);
		btnQ.setEnabled(true);
		btnQ.setBackground(null);
		btnR.setEnabled(true);
		btnR.setBackground(null);
		btnS.setEnabled(true);
		btnS.setBackground(null);
		btnT.setEnabled(true);
		btnT.setBackground(null);
		btnU.setEnabled(true);
		btnU.setBackground(null);
		btnV.setEnabled(true);
		btnV.setBackground(null);
		btnW.setEnabled(true);
		btnW.setBackground(null);
		btnX.setEnabled(true);
		btnX.setBackground(null);
		btnY.setEnabled(true);
		btnY.setBackground(null);
		btnZ.setEnabled(true);
		btnZ.setBackground(null);
	}
	
}
