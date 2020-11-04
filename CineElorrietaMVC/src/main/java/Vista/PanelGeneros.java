package Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import Controlador.ControladorPanelGeneros;
import Modelo.Pelicula;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTextPane;

@SuppressWarnings("serial")
public class PanelGeneros extends JPanel {

	private JButton btnVolver;
	private JLabel lblGeneros;
	private ControladorPanelGeneros controladorPanelGeneros;
	private JTextField txt_seleccion;
	

	public PanelGeneros(ControladorPanelGeneros controladorPanelGeneros) {
	

		this.controladorPanelGeneros = controladorPanelGeneros;

		setLayout(null);

		lblGeneros = new JLabel("Panel Generos");
		lblGeneros.setBounds(61, 35, 115, 14);
		add(lblGeneros);

		JTextPane textPaneGeneros = new JTextPane();
		textPaneGeneros.setBounds(61, 63, 168, 111);
		add(textPaneGeneros);
		textPaneGeneros.setText("1. DRAMA\n2. COMEDIA\r\n3. TERROR\r\n4. CIENCIA FICCION");
		/*
		 * for(int i=0;i<=peliculas.length;i++) {
		 * txtGeneros.setText(peliculas[i].toString()); }
		 */
		btnVolver = new JButton("Volver");
		btnVolver.setBounds(61, 190, 89, 23);
		add(btnVolver);

		JLabel lbl_SeleccionGenero = new JLabel("Genero seleccionado");
		lbl_SeleccionGenero.setBounds(277, 35, 149, 14);
		add(lbl_SeleccionGenero);

		txt_seleccion = new JTextField();
		txt_seleccion.setBounds(277, 132, 115, 42);
		add(txt_seleccion);
		txt_seleccion.setColumns(10);

		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String seleccion;
				seleccion = txt_seleccion.getText();// recogemos el dato de seleccion de genero
				if (seleccion.equals("1") || seleccion.equals("2") || seleccion.equals("3") || seleccion.equals("4")) {

				} else {
					JOptionPane.showMessageDialog(null, "Seleccion incorrecta");

				}
			}
		});
		btnAceptar.setBounds(277, 190, 89, 23);
		add(btnAceptar);

		initializeEvents();

	}

	private void initializeEvents() {
		this.btnVolver.addActionListener(listenerBotonVolver(this.controladorPanelGeneros));
	}

	private ActionListener listenerBotonVolver(ControladorPanelGeneros controladorPanelGeneros) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Ejecutando evento Boton Volver");
				controladorPanelGeneros.accionadoBottonVolverPanelGeneros();
			}
		};
	}
}
	/*private ActionListener listenerBotonPanelPelis(ControladorPanelGeneros controladorPanelGeneros) {
		return new ActionListener() {
			String seleccion;
			seleccion = txt_seleccion.getText();// recogemos el dato de seleccion de genero
			if (seleccion.equals("1") || seleccion.equals("2") || seleccion.equals("3") || seleccion.equals("4")) {

			} else {
				JOptionPane.showMessageDialog(null, "Seleccion incorrecta");

			}
		};
	}*/

