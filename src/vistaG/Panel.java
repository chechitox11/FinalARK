package vistaG;

import java.awt.Color; 

import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import modeloG.Punto;
import modeloG.Territorio;


//JPanel, es para crear como tal un panel
@SuppressWarnings("serial")
public class Panel extends JPanel{
	
	//lista de territorios
	private ArrayList<Territorio> listadoTerritorio = new ArrayList<>();

	//lista de los territorios de los usuarios
	private ArrayList<Territorio> usuario = new ArrayList<>();
	
	//lista de los territorios del enemigo
	private ArrayList<Territorio> computador = new ArrayList<>();
	
	//constructor de la clase
	public Panel() {
		
		//donde se tiene el ancho del panel
		this.setSize(800, 800);
		//y el setVisible es para que se pueda ver
		this.setVisible(true);	
	}
	
	//Este metodo es para que pinte
	public void paint (Graphics g) {
	
	//aca se importo la imagen descargada de internet
	Image imagen = new ImageIcon("./src/Imagen/Grafo.png").getImage();
	
	//determine el tamaño de la imagen descargada
	g.drawImage(imagen, 0,0, 800, 600, this);

		
		g.setColor(Color.pink);
		
		//Este for no tiene importancia porque no estableci las bases de cada territorio
		for (int i = 0; i <listadoTerritorio.size() ; i++) {
			
			//g.fillOval(listadoTerritorio.get(i).getPunto().getX(), listadoTerritorio.get(i).getPunto().getY(), 20, 20);
			
			Territorio obtenerTerritorio = listadoTerritorio.get(i);
			
			ArrayList<Punto> listadoPunto = obtenerTerritorio.getPuntoSoldados();
			
			for (int j = 0; j < listadoPunto.size(); j++) {
				
				g.fillOval(listadoPunto.get(j).getX(),listadoPunto.get(j).getY(), 10, 10);
			}
		}
		
		//Este es el color de los soldados
		g.setColor(Color.red);
		
		//Este for recorre el listado de los territorios que obtiene el ususario
		for (int i = 0; i <usuario.size() ; i++) {
			
			//g.fillOval(usuario.get(i).getPunto().getX(), usuario.get(i).getPunto().getY(), 20, 20);
			
			Territorio obtenerTerritorio = usuario.get(i);
			
			ArrayList<Punto> listadoPunto = obtenerTerritorio.getPuntoSoldados();
			
			//Este for recorre el listado de puntos de los soldados
			for (int j = 0; j < listadoPunto.size(); j++) {
				
				g.fillOval(listadoPunto.get(j).getX(),listadoPunto.get(j).getY(), 10, 10);
			}
		}
		
		//este es el color de los soldados del enemigo
		g.setColor(Color.ORANGE);
		
		//Este for recorre la lista de territorios que obtuvo el enemigo durante el juego
		for (int i = 0; i <computador.size() ; i++) {
			
			//g.fillOval(computador.get(i).getPunto().getX(), computador.get(i).getPunto().getY(), 20, 20);
			
			Territorio obtenerTerritorio = computador.get(i);
			
			ArrayList<Punto> listadoPunto = obtenerTerritorio.getPuntoSoldados();
			
			//Este for recorre el listadopunto que son los puntos de los soldados
			for (int j = 0; j < listadoPunto.size(); j++) {
				
				g.fillOval(listadoPunto.get(j).getX(),listadoPunto.get(j).getY(), 10, 10);
			}
		}
	}
	
	//Este es el metodo get de la lista de tipo territorio 
	public ArrayList<Territorio> getlistadoTerritorio() {
	return listadoTerritorio;
	}
	
	//Este es el metodo get de la lista de territorios del usuario
	public ArrayList<Territorio> getusuario() {
	return usuario;
	}
	
	//Este es el metodo get de la lista de territorios del enemigo
	public ArrayList<Territorio> getcomputador() {
		return computador;
		}
}
