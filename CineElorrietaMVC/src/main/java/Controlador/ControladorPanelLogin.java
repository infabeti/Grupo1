package Controlador;

import Modelo.Modelo;
import Vista.PanelLogin;
import Vista.Vista;

public class ControladorPanelLogin {
	@SuppressWarnings("unused")
	private Modelo modelo;
	private Vista vista;
	private Controlador controlador;
	private PanelLogin panelLogin;
	private final String usuario="usuario";
	private final String contrasena="12345";
	
	
	
	
	public ControladorPanelLogin(Modelo modelo, Vista vista, Controlador controlador) {
		this.modelo = modelo;
		this.vista = vista;
		this.controlador = controlador;	
	}
	
	public void mostrarPanelLogin() {
		this.panelLogin = new PanelLogin(this);
		this.vista.mostrarPanel(this.panelLogin);
		
		//Parar ejecucion durante 3 segundos y Mostrar Panel de Login
		
		
	}
	
	public void accionadoBotonEntrarPanelLogin() {
		System.out.println("Ejecutando evento Boton Entrar");
		System.out.println(this.panelLogin.getTxtUsuario().getText());
		System.out.println(this.panelLogin.getPassContrasena().getPassword());
		
		if(this.panelLogin.getTxtUsuario().getText().equals(usuario) && new String(this.panelLogin.getPassContrasena().getPassword()).equals(contrasena)) {
		
			System.out.println("Usuario/Contraseña correctos");
			this.panelLogin.getLblError().setVisible(false);
			
			this.controlador.navegarPanelGeneros();
		}
		
		
		else {
			System.out.println("Usuario/contraseña incorrectos");
			this.panelLogin.getLblError().setVisible(true);
		}
		
	}
	
	
}


