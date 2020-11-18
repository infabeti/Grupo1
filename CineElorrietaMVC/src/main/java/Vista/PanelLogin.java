package Vista;

import javax.swing.JPanel;

import Controlador.ControladorPanelLogin;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;



public class PanelLogin extends JPanel {
	private JTextField txtUsuario;
	private JPasswordField passContrasena;
	private JLabel lblError;
	private JLabel lblLogin;

	/**
	 * Create the panel.
	 */
	public PanelLogin(ControladorPanelLogin controladorPanelLogin) {
		setLayout(null);
		
		JLabel lblContrasena = new JLabel("Contrase\u00F1a:");
		lblContrasena.setBounds(92, 110, 70, 14);
		add(lblContrasena);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(92, 85, 70, 14);
		add(lblUsuario);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(171, 82, 86, 20);
		add(txtUsuario);
		txtUsuario.setColumns(10);
		
		passContrasena = new JPasswordField();
		passContrasena.setBounds(172, 107, 121, 20);
		add(passContrasena);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controladorPanelLogin.accionadoBotonEntrarPanelLogin(txtUsuario.getText()
						, String.valueOf(getPassContrasena().getPassword()));
				
				
			}
		});
		btnEntrar.setBounds(171, 222, 89, 23);
		add(btnEntrar);
		
		lblError = new JLabel("usuario/contrase\u00F1a incorrectos");
		lblError.setForeground(Color.RED);
		lblError.setBounds(92, 170, 272, 14);
		add(lblError);
		
		lblLogin = new JLabel("LOGIN");
		lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblLogin.setBounds(171, 11, 141, 55);
		add(lblLogin);
		lblError.setVisible(false);
	

	}

	public JLabel getLblError() {
		return lblError;
	}

	public void setLblError(JLabel lblError) {
		this.lblError = lblError;
	}

	public JTextField getTxtUsuario() {
		return txtUsuario;
	}

	public void setTxtUsuario(JTextField txtUsuario) {
		this.txtUsuario = txtUsuario;
	}

	public JPasswordField getPassContrasena() {
		return passContrasena;
	}

	public void setPassContrasena(JPasswordField passContrasena) {
		this.passContrasena = passContrasena;
	}

}
