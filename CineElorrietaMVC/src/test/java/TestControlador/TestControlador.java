package TestControlador;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

import org.junit.Test;

import Controlador.Controlador;
import Controlador.ControladorPanelFin;
import Modelo.Modelo;
import Vista.Vista;

public class TestControlador {
	private Controlador controlador;
	private Modelo modeloMock = mock(Modelo.class);
	private Vista vistaMock = mock(Vista.class);

	@Test
	public void testNavegarPanelBienvenida() {
		controlador=new Controlador(modeloMock,vistaMock);
		
		controlador.navegarPanelBienvenida();
	}
	@Test
	public void testNavegarPanelLogin() {
		controlador=new Controlador(modeloMock,vistaMock);
		
		controlador.navegarPanelLogin();
	}
	
	@Test
	public void testNavegarPanelGeneros() {
		controlador=new Controlador(modeloMock,vistaMock);
		
		controlador.navegarPanelGeneros();
	}
	@Test
	public void testNavegarPanelPeliculas(int genero) {
		controlador=new Controlador(modeloMock,vistaMock);
		
		controlador.navegarPanelPeliculas(2);
		
	}
	@Test
	public void testNavegarPanelResumen() {
		controlador=new Controlador(modeloMock,vistaMock);
		
		controlador.navegarPanelResumen();
		
	}
	@Test
	public void navegarPanelFin() {
		controlador=new Controlador(modeloMock,vistaMock);
		
		controlador.navegarPanelFin();
		
		
	}

}
