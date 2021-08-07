package objetos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

@SuppressWarnings("serial")
public class Menu extends JPanel {

	public Menu() {
		
	setLayout(null);
	
	final JButton btnInicio = new JButton("Iniciar juego");
	btnInicio.setBounds(10, 22, 573, 41);
	add(btnInicio);
	btnInicio.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
		}
	});

	final JButton btnResolver = new JButton("Resolver");
	btnResolver.setBounds(10, 70, 573, 41);
	add(btnResolver);
	btnResolver.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		}
	});

	}
}
