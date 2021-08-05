package objetos;

import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Teclado extends JPanel {

	// Atributos
	private JLabel labelTeclado;

	// Constructor
	public Teclado() {
		
		setLayout(null);

		// Botones A-E

		final JButton btnA = new JButton("A");
		btnA.setBounds(21, 11, 112, 41);
		add(btnA);
		btnA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnA.setBackground(Color.lightGray);
			}
		});

		final JButton btnB = new JButton("B");
		btnB.setBounds(132, 11, 112, 41);
		add(btnB);
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnB.setBackground(Color.lightGray);
			}
		});

		final JButton btnC = new JButton("C");
		btnC.setBounds(242, 11, 112, 41);
		add(btnC);
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnC.setBackground(Color.lightGray);
			}
		});

		final JButton btnD = new JButton("D");
		btnD.setBounds(352, 11, 112, 41);
		add(btnD);
		btnD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnD.setBackground(Color.lightGray);
			}
		});

		final JButton btnE = new JButton("E");
		btnE.setBounds(465, 11, 112, 41);
		add(btnE);
		btnE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnE.setBackground(Color.lightGray);
			}
		});

		// Botones F-J

		final JButton btnF = new JButton("F");
		btnF.setBounds(21, 52, 112, 41);
		add(btnF);
		btnF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnF.setBackground(Color.lightGray);
			}
		});

		final JButton btnG = new JButton("G");
		btnG.setBounds(132, 52, 112, 41);
		add(btnG);
		btnG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnG.setBackground(Color.lightGray);
			}
		});

		final JButton btnH = new JButton("H");
		btnH.setBounds(242, 52, 112, 41);
		add(btnH);
		btnH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnH.setBackground(Color.lightGray);
			}
		});

		final JButton btnI = new JButton("I");
		btnI.setBounds(352, 52, 112, 41);
		add(btnI);
		btnI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnI.setBackground(Color.lightGray);
			}
		});

		final JButton btnJ = new JButton("J");
		btnJ.setBounds(465, 52, 112, 41);
		add(btnJ);
		btnJ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnJ.setBackground(Color.lightGray);
			}
		});

		// Botones K-Ñ

		final JButton btnK = new JButton("K");
		btnK.setBounds(21, 92, 112, 41);
		add(btnK);
		btnK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnK.setBackground(Color.lightGray);
			}
		});

		final JButton btnL = new JButton("L");
		btnL.setBounds(132, 92, 112, 41);
		add(btnL);
		btnL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnL.setBackground(Color.lightGray);
			}
		});

		final JButton btnM = new JButton("M");
		btnM.setBounds(242, 92, 112, 41);
		add(btnM);
		btnM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnM.setBackground(Color.lightGray);
			}
		});

		final JButton btnN = new JButton("N");
		btnN.setBounds(352, 92, 112, 41);
		add(btnN);
		btnN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnN.setBackground(Color.lightGray);
			}
		});

		final JButton btnÑ = new JButton("Ñ");
		btnÑ.setBounds(465, 92, 112, 41);
		add(btnÑ);
		btnÑ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnÑ.setBackground(Color.lightGray);
			}
		});

		// Botones O-S

		final JButton btnO = new JButton("O");
		btnO.setBounds(21, 132, 112, 41);
		add(btnO);
		btnO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnO.setBackground(Color.lightGray);
			}
		});

		final JButton btnP = new JButton("P");
		btnP.setBounds(132, 132, 112, 41);
		add(btnP);
		btnP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnP.setBackground(Color.lightGray);
			}
		});

		final JButton btnQ = new JButton("Q");
		btnQ.setBounds(242, 132, 112, 41);
		add(btnQ);
		btnQ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnQ.setBackground(Color.lightGray);
			}
		});

		final JButton btnR = new JButton("R");
		btnR.setBounds(352, 132, 112, 41);
		add(btnR);
		btnR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnR.setBackground(Color.lightGray);
			}
		});

		final JButton btnS = new JButton("S");
		btnS.setBounds(465, 132, 112, 41);
		add(btnS);
		btnS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnS.setBackground(Color.lightGray);
			}
		});

		// Botones T-X

		final JButton btnT = new JButton("T");
		btnT.setBounds(21, 173, 112, 41);
		add(btnT);
		btnT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnT.setBackground(Color.lightGray);
			}
		});

		final JButton btnU = new JButton("U");
		btnU.setBounds(132, 173, 112, 41);
		add(btnU);
		btnU.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnU.setBackground(Color.lightGray);
			}
		});

		final JButton btnV = new JButton("V");
		btnV.setBounds(242, 173, 112, 41);
		add(btnV);
		btnV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnV.setBackground(Color.lightGray);
			}
		});

		final JButton btnW = new JButton("W");
		btnW.setBounds(352, 173, 112, 41);
		add(btnW);
		btnW.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnW.setBackground(Color.lightGray);
			}
		});

		final JButton btnX = new JButton("X");
		btnX.setBounds(465, 173, 112, 41);
		add(btnX);
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnX.setBackground(Color.lightGray);
			}
		});
		// Botones Y Z
		final JButton btnY = new JButton("Y");
		btnY.setBounds(21, 214, 112, 41);
		add(btnY);
		btnY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnY.setBackground(Color.lightGray);
			}
		});

		final JButton btnZ = new JButton("Z");
		btnZ.setBounds(132, 214, 112, 41);
		add(btnZ);
		btnZ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnZ.setBackground(Color.lightGray);
			}
		});
	}
}
