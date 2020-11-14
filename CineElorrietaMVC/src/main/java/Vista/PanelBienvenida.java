package Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import Controlador.ControladorPanelBienvenida;

import java.awt.Dimension;
import java.awt.Font;

@SuppressWarnings("serial")
public class PanelBienvenida extends JPanel{
	private JLabel lblBienvenida;
	private ControladorPanelBienvenida controladorPanelBienvenida;
	
	public PanelBienvenida(ControladorPanelBienvenida controladorPanelBienvenida) {
		this.controladorPanelBienvenida = controladorPanelBienvenida;
		
		setLayout(null);
		
		lblBienvenida = new JLabel("BIENVENIDO");
		lblBienvenida.setFont(new Font("Tahoma", Font.PLAIN, 29));
		lblBienvenida.setBounds(125, 66, 176, 56);
		add(lblBienvenida);
		
		initializeEvents();
	}
	
	private void initializeEvents() {
	}
	
	
}


