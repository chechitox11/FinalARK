package modeloG;

import java.util.ArrayList;

public class Territorio {
	
	//Este atributo corresponde a al X y Y del territorio
	private Punto punto;
	
	//Este atributo corresponde al nombre de cada territorio, quiero decir: A,B,C,D
	private String nombre;
	
	//Este atributo corresponde a la cantidad de los soldados del territorio
	private int cantidadSoldados;
	
	//Este ArrayList corresponde a la lista de los puntos de los soldados
	private ArrayList<Punto> puntoSoldados = new ArrayList<>();
	
	//Este  ArrayList corresponde lista de los vecinos de cada uno de los territorios
	private ArrayList<Territorio> vecinos = new ArrayList<>();

	//constructor
	public Territorio(Punto punto, String nombre, int cantidadSoldados) {
		super();
		this.punto = punto;
		this.nombre = nombre;
		this.cantidadSoldados = cantidadSoldados;
	}

	public Punto getPunto() {
		return punto;
	}

	public String getNombre() {
		return nombre;
	}

	public int getCantidadSoldados() {
		return cantidadSoldados;
	}

	public ArrayList<Punto> getPuntoSoldados() {
		return puntoSoldados;
	}

	public ArrayList<Territorio> getVecinos() {
		return vecinos;
	}

	public void setPunto(Punto punto) {
		this.punto = punto;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setCantidadSoldados(int cantidadSoldados) {
		this.cantidadSoldados = cantidadSoldados;
	}

	public void setPuntoSoldados(ArrayList<Punto> puntoSoldados) {
		this.puntoSoldados = puntoSoldados;
	}

	public void setVecinos(ArrayList<Territorio> vecinos) {
		this.vecinos = vecinos;
	}

	@Override
	public String toString() {
		return "Territorio [punto=" + punto + ", nombre=" + nombre + ", cantidadSoldados=" + cantidadSoldados
				+ ", puntoSoldados=" + puntoSoldados + ", vecinos=" + vecinos + "]";
	}
}
