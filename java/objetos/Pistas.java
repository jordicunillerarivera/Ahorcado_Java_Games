package objetos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


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
		btnPista.setBounds(519, 11, 99, 49);
		add(btnPista);
		btnPista.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labelImagen4.setVisible(false);
			}
		});
        
        labelImagen=new JLabel();
        labelImagen.setBounds(10,11,99,89);
        labelImagen.setIcon(new ImageIcon(getClass().
              getResource("/Imagenes/peepoPista.gif")));
        add(labelImagen);

        labelImagen1=new JLabel();
        labelImagen1.setBounds(110,11,99,89);
        labelImagen1.setIcon(new ImageIcon(getClass().
              getResource("/Imagenes/peepoPista.gif")));
        add(labelImagen1);
        
        labelImagen2=new JLabel();
        labelImagen2.setBounds(210,11,99,89);
        labelImagen2.setIcon(new ImageIcon(getClass().
              getResource("/Imagenes/peepoPista.gif")));
        add(labelImagen2);
        
        labelImagen3=new JLabel();
        labelImagen3.setBounds(309,11,99,89);
        labelImagen3.setIcon(new ImageIcon(getClass().
              getResource("/Imagenes/peepoPista.gif")));
        add(labelImagen3);
        
        labelImagen4=new JLabel();
        labelImagen4.setBounds(410,11,99,89);
        labelImagen4.setIcon(new ImageIcon(getClass().
              getResource("/Imagenes/peepoPista.gif")));
        add(labelImagen4);
        
	}

}
