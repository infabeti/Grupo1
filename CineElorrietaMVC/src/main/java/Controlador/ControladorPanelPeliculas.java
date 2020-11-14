package Controlador;

import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JList;

import Modelo.Modelo;
import Modelo.Pelicula;
import Vista.PanelPeliculas;
import Vista.Vista;
import Vista.PanelGeneros;

public class ControladorPanelPeliculas {

	@SuppressWarnings("unused")
	private Modelo modelo;
	private Vista vista;
	private Controlador controlador;
	private PanelPeliculas panelPeliculas;
	
	
	//Estos dos arrays tendran almacenadas las peliculas que selecciona el usuario
	private static ArrayList<Pelicula> peliculasSabado=new ArrayList <Pelicula>();
	private static ArrayList<Pelicula> peliculasDomingo=new ArrayList <Pelicula>();
	
	
	
	
	public ControladorPanelPeliculas(Modelo modelo, Vista vista, Controlador controlador) {
		this.modelo = modelo;
		this.vista = vista;
		this.controlador = controlador;	
	}
	
	public void mostrarPanelPeliculas(int genero) {
		this.panelPeliculas = new PanelPeliculas(this);
		this.vista.mostrarPanel(this.panelPeliculas);
		System.out.println("Este es el genero seleccionado: "+genero);
		//Cargar las peliculas del genero seleccionado
		
		
		
		 
		
		
	}
	public int minutosTotalesSabado() {
		int minutosTotales=0;
		for(int i=0;i<peliculasSabado.size();i++) {
			minutosTotales=(int) (minutosTotales+peliculasSabado.get(i).getDuracion());
		}
		
		
		return minutosTotales;
		
		
	}
	public int minutosTotalesDomingo() {
		int minutosTotales=0;
		for(int i=0;i<peliculasSabado.size();i++) {
			minutosTotales=(int) (minutosTotales+peliculasDomingo.get(i).getDuracion());
		}
		
		
		return minutosTotales;
		
		
	}
	
	public void accionadoBotonAnadirPanelPeliculas() {
		Pelicula[] peliculas=PanelGeneros.getPeliculas();
		JList lista_pelis=PanelPeliculas.getLista_pelis();
		System.out.println((String)lista_pelis.getSelectedValue());
		
	
		if(lista_pelis.getSelectedValue()==null) {
			
			System.out.println("No has seleccionado ninguna pelicula");
			
		}
		else {
			String titulo;
			
			for(int i=0;i<peliculas.length;i++) {
				titulo=peliculas[i].getTitulo();
				//System.out.println(titulo+"  "+(String)lista_pelis.getSelectedValue());
				
				//no funciona este if////////////////////////////////////////////////////////////////////////////////////////////
				if(((String)titulo.trim()).equals((String)lista_pelis.getSelectedValue())) {
					
					System.out.println("Entro");
					//Para que se pueda añadir una pelicula tiene que sumar menos de 8horas el sabado completo (480minutos)
					if((peliculas[i].getDuracion()+minutosTotalesSabado())<480){
						peliculasSabado.add(peliculas[i]);
						
					}
					else if((peliculas[i].getDuracion()+minutosTotalesDomingo())<360){
						peliculasDomingo.add(peliculas[i]);
						
					}
					else {
						System.out.println("No se puede introducir la pelicula, porque no hay tiempo");
					}
					
					
				}
				
			}
			
		}
	}
	
	
	
}
