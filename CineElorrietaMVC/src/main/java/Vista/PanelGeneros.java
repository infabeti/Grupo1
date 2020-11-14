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
	String resultado="";
	String seleccion;
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
		ArrayList <Pelicula> pelis_seleccion = new ArrayList<>();

		this.controladorPanelGeneros = controladorPanelGeneros;

		setLayout(null);

		// ---------------------------Ventana----------------------------------------------
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
		txt_seleccion.setBounds(61, 252, 168, 37);
		add(txt_seleccion);
		txt_seleccion.setColumns(10);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(271, 63, 168, 137);
		add(scrollPane);
		
		JList lista_pelis = new JList();
		scrollPane.setViewportView(lista_pelis);
		
		DefaultListModel modelo = new DefaultListModel();//necesario crear un modelo con el que llenar el jlist
		
		JButton btnElegir = new JButton("Aceptar");
		btnElegir.setBounds(61, 304, 168, 23);
		btnElegir.addActionListener(new ActionListener() {
		

			public void actionPerformed(ActionEvent arg0) {
				
				seleccion = txt_seleccion.getText();// recogemos el dato de seleccion de genero

				if (seleccion.equals("1")) {
					modelo.clear();//vaciamos el jlist
					for (int i = 0; i < peliculas.length; i++) {
						if (peliculas[i].getGenero() == 1) {
							String resultado = "";
							System.out.println(peliculas[i].getTitulo());
							resultado += peliculas[i].getTitulo() + "\n";
							modelo.addElement(resultado);
							txt_seleccion.setText("");
							
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
							txt_seleccion.setText("");
						
							
						
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
							txt_seleccion.setText("");
							
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
							txt_seleccion.setText("");
						}
					}

				}
				/*REVISAR XQ SIEMPRE SALTA EL MESNSAJE DE SELECCION INCORRECTA
				 * 
				 * if ((!seleccion.equals("4")||(!seleccion.equals("3"))||(!seleccion.equals("2"))||(!seleccion.equals("1"))))  {
					JOptionPane.showMessageDialog(null, "Seleccion incorrecta");
					txt_seleccion.setText("");
					
				}
				else{
					JOptionPane.showMessageDialog(null, "Seleccion incorrecta");
					txt_seleccion.setText("");
				}*/
			
				lista_pelis.setModel(modelo);
			}
		});

		add(btnElegir);
	
		JLabel lblPelis = new JLabel("Peliculas Disponibles");
		lblPelis.setBounds(282, 35, 181, 14);
		add(lblPelis);

		JButton btnAnadir = new JButton("Seleccionar");
		btnAnadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controladorPanelGeneros.accionadoBotonSeleccionarPanelGeneros(Integer.parseInt(seleccion));
				
				
			}
		});

		btnAnadir.setBounds(271, 304, 168, 23);
		add(btnAnadir);

		/*INTENTO DE RELLENAR EL ARRAYLIST-QUITAR DE ESTA PANTALLA
		 * 
		 * btnAnadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//recogemos la peli seleccionada y rellenamos el arraylist 
			for (int i = 0; i < peliculas.length; i++) {
			
				if(peliculas[i].getTitulo().equals(lista_pelis.getSelectedValue())) {
					System.out.println(lista_pelis.getSelectedValue());
					System.out.println(peliculas[i].getTitulo());
					pelis_seleccion.add(peliculas[i]);
				
				}
			}
			for (int i = 0; i < pelis_seleccion.size(); i++) {
			//System.out.println(pelis_seleccion.get(i).toString());
				resultado+=pelis_seleccion.get(i).getTitulo()+"\n";
			
			}
			//pelis_seleccion.add((Pelicula) lista_pelis.getSelectedValue());
				//pelis_seleccion.add((Pelicula) (lista_pelis.getModel().getElementAt(lista_pelis.getSelectedIndex())));
			}
		});
*/
		btnVolver = new JButton("Volver");
		btnVolver.setBounds(350, 372, 89, 23);
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

