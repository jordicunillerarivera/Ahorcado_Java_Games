package objetos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

@SuppressWarnings("serial")
public class Menu extends JPanel {
	
	// Atributos
	private JButton btnInicio;
	private JButton btnResolver;
	
	// Constructor
	public Menu() {
		
	setLayout(null);
	
	btnInicio = new JButton("Iniciar juego");
	btnInicio.setBounds(10, 22, 573, 41);
	add(btnInicio);

	btnResolver = new JButton("Resolver");
	btnResolver.setBounds(10, 70, 573, 41);
	add(btnResolver);
	btnResolver.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		}
	});

	}

	// Setters & Getters
	public JButton getBtnInicio() {
		return btnInicio;
	}

	public JButton getBtnResolver() {
		return btnResolver;
	}
	
	
}
