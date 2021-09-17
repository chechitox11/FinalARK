package launcherG;

import controladorG.Controlador; 

import modeloG.Operacion;

import vistaG.Ventana;

public class Launcher {
	
	//Aca se llan todas las clases para correr el programa
	public static void main (String args[]) {
		
		Ventana v = new Ventana();
		
		Operacion a = new Operacion(v);
		
		//Este metodo es para llenar la informacion al momento de correr el programa
		a.llenarData();
		
		@SuppressWarnings("unused")
		Controlador c = new Controlador(a,v);
		
		}
}
