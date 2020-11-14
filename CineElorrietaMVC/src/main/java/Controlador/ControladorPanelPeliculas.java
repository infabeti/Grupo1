package Controlador;

import Modelo.Modelo;
import Vista.PanelPeliculas;
import Vista.Vista;

public class ControladorPanelPeliculas {

	@SuppressWarnings("unused")
	private Modelo modelo;
	private Vista vista;
	private Controlador controlador;
	private PanelPeliculas panelPeliculas;
	
	
	
	
	
	public ControladorPanelPeliculas(Modelo modelo, Vista vista, Controlador controlador) {
		this.modelo = modelo;
		this.vista = vista;
		this.controlador = controlador;	
	}
	
	public void mostrarPanelPeliculas(int genero) {
		this.panelPeliculas = new PanelPeliculas(this);
		this.vista.mostrarPanel(this.panelPeliculas);
		System.out.println("Este es el genero seleccionado: "+genero);
		//Parar ejecucion durante 3 segundos y Mostrar Panel de Login
		
		
	}
	
	
	
	
}
