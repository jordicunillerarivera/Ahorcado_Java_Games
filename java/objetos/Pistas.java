package objetos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


@SuppressWarnings("serial")
public class Pistas extends JPanel {

	// Atributos
	private int vida;
    private JLabel labelImagen;
    private JLabel labelImagen1;
    private JLabel labelImagen2;
    private JLabel labelImagen3;
    private JLabel labelImagen4;
    final JButton btnPista;

    // Constructor
	public Pistas() {

		setLayout(null);
		vida = 5;
		
		btnPista = new JButton("Pista");
		btnPista.setBounds(470, 11, 99, 49);
		add(btnPista);
		btnPista.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vida--;
				imagenVida();
				btnPista.setEnabled(false);
			}
		});
		
		pintarPeepos();
	           
	}
	
	// Metodos
	public void pintarPeepos() {
	
		if (vida >= 1) {
	        labelImagen=new JLabel();
	        labelImagen.setBounds(10,11,90,90);
	        labelImagen.setIcon(new ImageIcon(getClass().
	              getResource("/Imagenes/peepoPista80.gif")));
	        add(labelImagen);
        } 
		if (vida >= 2) {
	        labelImagen1=new JLabel();
	        labelImagen1.setBounds(101,11,90,90);
	        labelImagen1.setIcon(new ImageIcon(getClass().
	              getResource("/Imagenes/peepoPista80.gif")));
	        add(labelImagen1);
		}
        if (vida >= 3) {
	        labelImagen2=new JLabel();
	        labelImagen2.setBounds(192,11,90,90);
	        labelImagen2.setIcon(new ImageIcon(getClass().
	              getResource("/Imagenes/peepoPista80.gif")));
	        add(labelImagen2);
        }
        if (vida >= 4) {
	        labelImagen3=new JLabel();
	        labelImagen3.setBounds(283,11,90,90);
	        labelImagen3.setIcon(new ImageIcon(getClass().
	              getResource("/Imagenes/peepoPista80.gif")));
	        add(labelImagen3);
        }
        if (vida >= 5) {
	        labelImagen4=new JLabel();
	        labelImagen4.setBounds(374,11,90,90);
	        labelImagen4.setIcon(new ImageIcon(getClass().
	              getResource("/Imagenes/peepoPista80.gif")));
	        add(labelImagen4);		
        }
		
	}
	
	public void imagenVida() {
		if (vida >= 5) {
			labelImagen.setVisible(true);
			labelImagen1.setVisible(true);
			labelImagen2.setVisible(true);
			labelImagen3.setVisible(true);
			labelImagen4.setVisible(true);
		} else if (vida >= 4) {
			labelImagen4.setVisible(false);
		} else if (vida >= 3) {
			labelImagen3.setVisible(false);
		} else if (vida >= 2) {
			labelImagen2.setVisible(false);
		} else if (vida >= 1) {
			labelImagen1.setVisible(false);
		} else {
			labelImagen.setVisible(false);
			JOptionPane.showMessageDialog(null, "Has perdido!!");
		}
	}

	// Setters & Getters
	public JButton getBtnPista() {
		return btnPista;
	}

	public void setVida(int vida) {
		this.vida = vida;
		imagenVida();
	}
	
	
	
}
