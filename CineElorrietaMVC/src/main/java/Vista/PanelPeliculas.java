package Vista;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.JScrollPane;


import Controlador.ControladorPanelPeliculas;

public class PanelPeliculas extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelPeliculas(ControladorPanelPeliculas controladorPanelPeliculas) {
		setLayout(null);
		
		JButton btnAadirPelicula = new JButton("A\u00F1adir Pelicula");
		btnAadirPelicula.setBounds(221, 322, 168, 23);
		add(btnAadirPelicula);
		
		JLabel lblGenero = new JLabel("Genero Seleccionado:");
		lblGenero.setBounds(37, 45, 141, 14);
		add(lblGenero);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(221, 129, 168, 137);
		add(scrollPane);
		
		JList lista_pelis = new JList();
		scrollPane.setViewportView(lista_pelis);
		
		JPanel txtGenero = new JPanel();
		txtGenero.setBounds(221, 45, 156, 23);
		add(txtGenero);

	}
}
