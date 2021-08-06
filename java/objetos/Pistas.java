package objetos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;


@SuppressWarnings("serial")
public class Pistas extends JPanel {

    private JLabel labelImagen;
    private JLabel labelImagen1;
    private JLabel labelImagen2;
    private JLabel labelImagen3;
    private JLabel labelImagen4;


	public Pistas() {

		setLayout(null);
		
		final JButton btnPista = new JButton("Pista");
		btnPista.setBounds(470, 11, 99, 49);
		add(btnPista);
		btnPista.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labelImagen4.setVisible(false);
			}
		});
        
        labelImagen=new JLabel();
        labelImagen.setBounds(10,11,90,90);
        labelImagen.setIcon(new ImageIcon(getClass().
              getResource("/Imagenes/peepoPista80.gif")));
        add(labelImagen);

        labelImagen1=new JLabel();
        labelImagen1.setBounds(101,11,90,90);
        labelImagen1.setIcon(new ImageIcon(getClass().
              getResource("/Imagenes/peepoPista80.gif")));
        add(labelImagen1);
        
        labelImagen2=new JLabel();
        labelImagen2.setBounds(192,11,90,90);
        labelImagen2.setIcon(new ImageIcon(getClass().
              getResource("/Imagenes/peepoPista80.gif")));
        add(labelImagen2);
        
        labelImagen3=new JLabel();
        labelImagen3.setBounds(283,11,90,90);
        labelImagen3.setIcon(new ImageIcon(getClass().
              getResource("/Imagenes/peepoPista80.gif")));
        add(labelImagen3);
        
        labelImagen4=new JLabel();
        labelImagen4.setBounds(374,11,90,90);
        labelImagen4.setIcon(new ImageIcon(getClass().
              getResource("/Imagenes/peepoPista80.gif")));
        add(labelImagen4);
        
//        Border bordePista = new LineBorder(Color.black);
//		labelImagen.setBorder(bordePista);
//		labelImagen1.setBorder(bordePista);
//		labelImagen2.setBorder(bordePista);
//		labelImagen3.setBorder(bordePista);
//		labelImagen4.setBorder(bordePista);
		
        
	}

}
