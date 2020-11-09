package Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

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
		// ARRAY DE PELICULAS
		Pelicula[] peliculas = new Pelicula[16];

		peliculas[0] = new Pelicula(1, "Handia", 116);
		peliculas[1] = new Pelicula(1, "La lista de Schindler", 197);
		peliculas[2] = new Pelicula(1, "Cadena Perpetua", 142);
		peliculas[3] = new Pelicula(1, "Million Dollar Baby", 133);

		peliculas[4] = new Pelicula(2, "Scary movie", 90);
		peliculas[5] = new Pelicula(2, "El gran Lebowsky", 119);
		peliculas[6] = new Pelicula(2, "La vida de Brian", 94);
		peliculas[7] = new Pelicula(2, "Aterriza como puedas", 117);

		peliculas[8] = new Pelicula(3, "Psicosis:", 109);
		peliculas[9] = new Pelicula(3, "El resplandor", 146);
		peliculas[10] = new Pelicula(3, "Dracula", 155);
		peliculas[11] = new Pelicula(3, "Cisne negro", 100);

		peliculas[12] = new Pelicula(4, "2001: Odisea en el espacio", 142);
		peliculas[13] = new Pelicula(4, "La novia de Frankenstein:", 75);
		peliculas[14] = new Pelicula(4, "El planeta de los simios:", 115);
		peliculas[15] = new Pelicula(4, "Alien, el octavo pasajero:", 117);

		// ARRAYLIST PARA PARA PELIS SELECCIONADAS
		ArrayList<Pelicula> pelis_Seleccion = new ArrayList<>();

		this.controladorPanelGeneros = controladorPanelGeneros;

		setLayout(null);

		// ---------------------------GENEROS----------------------------------------------
		lblGeneros = new JLabel("Panel Generos");
		lblGeneros.setBounds(61, 35, 115, 14);
		add(lblGeneros);

		JTextPane textPaneGeneros = new JTextPane();
		textPaneGeneros.setBounds(61, 63, 168, 137);
		add(textPaneGeneros);
		textPaneGeneros.setText("1. DRAMA\n2. COMEDIA\r\n3. TERROR\r\n4. CIENCIA FICCION");

		JLabel lbl_SeleccionGenero = new JLabel("Genero seleccionado");
		lbl_SeleccionGenero.setBounds(61, 227, 149, 14);
		add(lbl_SeleccionGenero);

		txt_seleccion = new JTextField();
		txt_seleccion.setBounds(61, 252, 60, 37);
		add(txt_seleccion);
		txt_seleccion.setColumns(10);
		// HAY QUE CAMBIARLO!! PARA PODER SELECCIONAR Y QUE NO SE ACUMULE DMMENTO EN
		// TEXTO!!
		JTextPane txtPelis = new JTextPane();
		txtPelis.setBounds(282, 63, 168, 133);
		// txtPelis.setText("");
		add(txtPelis);

		JButton btnElegir = new JButton("Aceptar");
		btnElegir.setBounds(140, 304, 89, 23);
		btnElegir.addActionListener(new ActionListener() {
			String resultado = "";

			public void actionPerformed(ActionEvent arg0) {
				String seleccion;
				seleccion = txt_seleccion.getText();// recogemos el dato de seleccion de genero

				if (seleccion.equals("1")) {
					for (int i = 0; i < peliculas.length; i++) {
						if (peliculas[i].getGenero() == 1) {
							System.out.println(peliculas[i].getTitulo());
							resultado += peliculas[i].getTitulo() + "\n";
						}

					}

				}
				if (seleccion.equals("2")) {
					for (int i = 0; i < peliculas.length; i++) {
						if (peliculas[i].getGenero() == 2) {
							System.out.println(peliculas[i].getTitulo());
							resultado += peliculas[i].getTitulo() + "\n";
						}

					}
				}
				if (seleccion.equals("3")) {
					for (int i = 0; i < peliculas.length; i++) {
						if (peliculas[i].getGenero() == 3) {
							System.out.println(peliculas[i].getTitulo());
							resultado += peliculas[i].getTitulo() + "\n";
						}
					}

				}
				if (seleccion.equals("4")) {
					for (int i = 0; i < peliculas.length; i++) {
						if (peliculas[i].getGenero() == 4) {
							System.out.println(peliculas[i].getTitulo());
							resultado += peliculas[i].getTitulo() + "\n";
						}
					}

				}
				txtPelis.setText(resultado);
			}
		});
		txtPelis.setText("");

		add(btnElegir);
		// ---------------------------PELIS---------------------------------------------
		JLabel lblPelis = new JLabel("Peliculas Disponibles");
		lblPelis.setBounds(282, 35, 181, 14);
		add(lblPelis);

		// JTextPane txtPelis = new JTextPane();
		// txtPelis.setBounds(282, 63, 168, 133);
		// txtPelis.setText("");
		// add(txtPelis);

		JButton btnAnadir = new JButton("A\u00F1adir");
		btnAnadir.setBounds(361, 304, 89, 23);
		add(btnAnadir);

		JLabel lblSeleccion = new JLabel("Panel Generos");
		lblSeleccion.setBounds(505, 35, 115, 14);
		add(lblSeleccion);
		// ---------------------------PELIS
		// SELECCIONADAS----------------------------------------------
		JTextPane txtSeleccion = new JTextPane();
		txtSeleccion.setBounds(505, 63, 168, 133);
		txtSeleccion.setText("");
		add(txtSeleccion);

		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(584, 304, 89, 23);
		add(btnAceptar);

		btnVolver = new JButton("Volver");
		btnVolver.setBounds(584, 384, 89, 23);
		add(btnVolver);

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
/*
 * private ActionListener listenerBotonPanelPelis(ControladorPanelGeneros
 * controladorPanelGeneros) { return new ActionListener() { String seleccion;
 * seleccion = txt_seleccion.getText();// recogemos el dato de seleccion de
 * genero if (seleccion.equals("1") || seleccion.equals("2") ||
 * seleccion.equals("3") || seleccion.equals("4")) {
 * 
 * } else { JOptionPane.showMessageDialog(null, "Seleccion incorrecta");
 * 
 * } }; }
 */
