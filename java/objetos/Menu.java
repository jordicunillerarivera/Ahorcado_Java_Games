package Ahorcodo.Java_Games;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Menu extends JFrame {

	private JPanel contentPane;


	public Menu() {
		//ventana
		setTitle("Menu");
		setBounds(600, 500, 266, 147);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		final JButton btnInicio = new JButton("Iniciar juego");
		btnInicio.setBounds(10, 11, 230, 41);
		contentPane.add(btnInicio);
		btnInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});

		final JButton btnResolver = new JButton("Recolver");
		btnResolver.setBounds(10, 59, 230, 41);
		contentPane.add(btnResolver);
		btnResolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

	}

}
