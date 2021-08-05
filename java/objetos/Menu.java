package objetos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

@SuppressWarnings("serial")
public class Menu extends JPanel {

	public Menu() {
		
	setLayout(null);
	
	final JButton btnInicio = new JButton("Iniciar juego");
	btnInicio.setBounds(10, 11, 230, 41);
	add(btnInicio);
	btnInicio.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
		}
	});

	final JButton btnResolver = new JButton("Recolver");
	btnResolver.setBounds(10, 59, 230, 41);
	add(btnResolver);
	btnResolver.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		}
	});

	}

}
