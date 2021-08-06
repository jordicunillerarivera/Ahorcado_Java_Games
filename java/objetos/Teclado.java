package objetos;

import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Teclado extends JPanel {

	// Atributo
	private Palabra palabra;
	
	// Constructor
	public Teclado() {
		
		setLayout(null);

		// Botones A-E

		final JButton btnA = new JButton("A");
		btnA.setBounds(10, 21, 112, 41);
		add(btnA);
		btnA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnA.setBackground(Color.lightGray);
				palabra.editarAuxiliar('A');
				btnA.setEnabled(false);
			}
		});

		final JButton btnB = new JButton("B");
		btnB.setBounds(121, 21, 112, 41);
		add(btnB);
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnB.setBackground(Color.lightGray);
				palabra.editarAuxiliar('B');
				btnB.setEnabled(false);
			}
		});

		final JButton btnC = new JButton("C");
		btnC.setBounds(231, 21, 112, 41);
		add(btnC);
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnC.setBackground(Color.lightGray);
				palabra.editarAuxiliar('C');
				btnC.setEnabled(false);
			}
		});

		final JButton btnD = new JButton("D");
		btnD.setBounds(341, 21, 112, 41);
		add(btnD);
		btnD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnD.setBackground(Color.lightGray);
				palabra.editarAuxiliar('D');
				btnD.setEnabled(false);
			}
		});

		final JButton btnE = new JButton("E");
		btnE.setBounds(454, 21, 112, 41);
		add(btnE);
		btnE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnE.setBackground(Color.lightGray);
				palabra.editarAuxiliar('E');
				btnE.setEnabled(false);
			}
		});

		// Botones F-J

		final JButton btnF = new JButton("F");
		btnF.setBounds(10, 62, 112, 41);
		add(btnF);
		btnF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnF.setBackground(Color.lightGray);
				palabra.editarAuxiliar('F');
				btnF.setEnabled(false);
			}
		});

		final JButton btnG = new JButton("G");
		btnG.setBounds(121, 62, 112, 41);
		add(btnG);
		btnG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnG.setBackground(Color.lightGray);
				palabra.editarAuxiliar('G');
				btnG.setEnabled(false);
			}
		});

		final JButton btnH = new JButton("H");
		btnH.setBounds(231, 62, 112, 41);
		add(btnH);
		btnH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnH.setBackground(Color.lightGray);
				palabra.editarAuxiliar('H');
				btnH.setEnabled(false);
			}
		});

		final JButton btnI = new JButton("I");
		btnI.setBounds(341, 62, 112, 41);
		add(btnI);
		btnI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnI.setBackground(Color.lightGray);
				palabra.editarAuxiliar('I');
				btnI.setEnabled(false);
			}
		});

		final JButton btnJ = new JButton("J");
		btnJ.setBounds(454, 62, 112, 41);
		add(btnJ);
		btnJ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnJ.setBackground(Color.lightGray);
				palabra.editarAuxiliar('J');
				btnJ.setEnabled(false);
			}
		});

		// Botones K-Ñ

		final JButton btnK = new JButton("K");
		btnK.setBounds(10, 102, 112, 41);
		add(btnK);
		btnK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnK.setBackground(Color.lightGray);
				palabra.editarAuxiliar('K');
				btnK.setEnabled(false);
			}
		});

		final JButton btnL = new JButton("L");
		btnL.setBounds(121, 102, 112, 41);
		add(btnL);
		btnL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnL.setBackground(Color.lightGray);
				palabra.editarAuxiliar('L');
				btnL.setEnabled(false);
			}
		});

		final JButton btnM = new JButton("M");
		btnM.setBounds(231, 102, 112, 41);
		add(btnM);
		btnM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnM.setBackground(Color.lightGray);
				palabra.editarAuxiliar('M');
				btnM.setEnabled(false);
			}
		});

		final JButton btnN = new JButton("N");
		btnN.setBounds(341, 102, 112, 41);
		add(btnN);
		btnN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnN.setBackground(Color.lightGray);
				palabra.editarAuxiliar('N');
				btnN.setEnabled(false);
			}
		});

		final JButton btnÑ = new JButton("Ñ");
		btnÑ.setBounds(454, 102, 112, 41);
		add(btnÑ);
		btnÑ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnÑ.setBackground(Color.lightGray);
				palabra.editarAuxiliar('Ñ');
				btnÑ.setEnabled(false);
			}
		});

		// Botones O-S

		final JButton btnO = new JButton("O");
		btnO.setBounds(10, 142, 112, 41);
		add(btnO);
		btnO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnO.setBackground(Color.lightGray);
				palabra.editarAuxiliar('O');
				btnO.setEnabled(false);
			}
		});

		final JButton btnP = new JButton("P");
		btnP.setBounds(121, 142, 112, 41);
		add(btnP);
		btnP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnP.setBackground(Color.lightGray);
				palabra.editarAuxiliar('P');
				btnP.setEnabled(false);
			}
		});

		final JButton btnQ = new JButton("Q");
		btnQ.setBounds(231, 142, 112, 41);
		add(btnQ);
		btnQ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnQ.setBackground(Color.lightGray);
				palabra.editarAuxiliar('Q');
				btnQ.setEnabled(false);
			}
		});

		final JButton btnR = new JButton("R");
		btnR.setBounds(341, 142, 112, 41);
		add(btnR);
		btnR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnR.setBackground(Color.lightGray);
				palabra.editarAuxiliar('R');
				btnR.setEnabled(false);
			}
		});

		final JButton btnS = new JButton("S");
		btnS.setBounds(454, 142, 112, 41);
		add(btnS);
		btnS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnS.setBackground(Color.lightGray);
				palabra.editarAuxiliar('S');
				btnS.setEnabled(false);
			}
		});

		// Botones T-X

		final JButton btnT = new JButton("T");
		btnT.setBounds(10, 183, 112, 41);
		add(btnT);
		btnT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnT.setBackground(Color.lightGray);
				palabra.editarAuxiliar('T');
				btnT.setEnabled(false);
			}
		});

		final JButton btnU = new JButton("U");
		btnU.setBounds(121, 183, 112, 41);
		add(btnU);
		btnU.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnU.setBackground(Color.lightGray);
				palabra.editarAuxiliar('U');
				btnU.setEnabled(false);
			}
		});

		final JButton btnV = new JButton("V");
		btnV.setBounds(231, 183, 112, 41);
		add(btnV);
		btnV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnV.setBackground(Color.lightGray);
				palabra.editarAuxiliar('V');
				btnV.setEnabled(false);
			}
		});

		final JButton btnW = new JButton("W");
		btnW.setBounds(341, 183, 112, 41);
		add(btnW);
		btnW.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnW.setBackground(Color.lightGray);
				palabra.editarAuxiliar('W');
				btnW.setEnabled(false);
			}
		});

		final JButton btnX = new JButton("X");
		btnX.setBounds(454, 183, 112, 41);
		add(btnX);
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnX.setBackground(Color.lightGray);
				palabra.editarAuxiliar('X');
				btnX.setEnabled(false);
			}
		});
		// Botones Y Z
		final JButton btnY = new JButton("Y");
		btnY.setBounds(10, 224, 112, 41);
		add(btnY);
		btnY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnY.setBackground(Color.lightGray);
				palabra.editarAuxiliar('Y');
				btnY.setEnabled(false);
			}
		});

		final JButton btnZ = new JButton("Z");
		btnZ.setBounds(121, 224, 112, 41);
		add(btnZ);
		btnZ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnZ.setBackground(Color.lightGray);
				palabra.editarAuxiliar('Z');
				btnZ.setEnabled(false);
			}
		});
	}
	
	// Metodos
	public void llamarPalabra(Palabra palabra) {
		this.palabra=palabra;
	}
	
}
