package Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
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
import javax.swing.JTabbedPane;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.JScrollPane;

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
		ArrayList<Pelicula> pelis_seleccion = new ArrayList<>();

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

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(271, 63, 168, 137);
		add(scrollPane);
		
		JList lista_pelis = new JList();
		scrollPane.setViewportView(lista_pelis);
		
		DefaultListModel modelo = new DefaultListModel();//necesario crear un modelo con el que llenar el jlist
		
		JButton btnElegir = new JButton("Aceptar");
		btnElegir.setBounds(140, 304, 89, 23);
		btnElegir.addActionListener(new ActionListener() {
		

			public void actionPerformed(ActionEvent arg0) {
				String seleccion;
				seleccion = txt_seleccion.getText();// recogemos el dato de seleccion de genero

				if (seleccion.equals("1")) {
					modelo.clear();//vaciamos el jlist
					for (int i = 0; i < peliculas.length; i++) {
						if (peliculas[i].getGenero() == 1) {
							String resultado = "";
							System.out.println(peliculas[i].getTitulo());
							resultado += peliculas[i].getTitulo() + "\n";
							modelo.addElement(resultado);
							
						}

					}

				}
				if (seleccion.equals("2")) {
					modelo.clear();
					for (int i = 0; i < peliculas.length; i++) {
						if (peliculas[i].getGenero() == 2) {
							String resultado = "";
							System.out.println(peliculas[i].getTitulo());
							resultado += peliculas[i].getTitulo() + "\n";
							modelo.addElement(resultado);
						
							
						
						}

					}
				}
				if (seleccion.equals("3")) {
					modelo.clear();
					for (int i = 0; i < peliculas.length; i++) {
						if (peliculas[i].getGenero() == 3) {
							String resultado = "";
							System.out.println(peliculas[i].getTitulo());
							resultado += peliculas[i].getTitulo() + "\n";
							modelo.addElement(resultado);
							
						}
					}

				}
				if (seleccion.equals("4")) {
					modelo.clear();
					for (int i = 0; i < peliculas.length; i++) {
						if (peliculas[i].getGenero() == 4) {
							String resultado = "";
							System.out.println(peliculas[i].getTitulo());
							resultado += peliculas[i].getTitulo() + "\n";
							modelo.addElement(resultado);
						}
					}

				}
			
				lista_pelis.setModel(modelo);
			}
		});

		add(btnElegir);
		// ---------------------------PELIS---------------------------------------------
		JLabel lblPelis = new JLabel("Peliculas Disponibles");
		lblPelis.setBounds(282, 35, 181, 14);
		add(lblPelis);

		JButton btnAnadir = new JButton("A\u00F1adir");
		btnAnadir.setBounds(350, 304, 89, 23);
		add(btnAnadir);
		//probar para añadir pelis al arraylist desde j list
		//pelis_seleccion.add((Pelicula) (lista_pelis.getModel().getElementAt(lista_pelis.getSelectedIndex())));
		JLabel lblSeleccion = new JLabel("Panel Generos");
		lblSeleccion.setBounds(492, 35, 115, 14);
		add(lblSeleccion);
		// ---------------------------PELIS
		// SELECCIONADAS----------------------------------------------
		JTextPane txtSeleccion = new JTextPane();
		txtSeleccion.setBounds(492, 63, 168, 133);
		txtSeleccion.setText("");
		add(txtSeleccion);

		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(571, 304, 89, 23);
		add(btnAceptar);

		btnVolver = new JButton("Volver");
		btnVolver.setBounds(571, 382, 89, 23);
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
