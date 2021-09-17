package controladorG;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import modeloG.Operacion;

import vistaG.Ventana;

//En el controlador se implementa ActionListener para que 
//cuando en las otras clases se llame Controlador pueda actualizar todo

public class Controlador implements ActionListener {
	
	//model es una instancia de la clase operacion, sirve para acceder con ese nombre a operacion
	private Operacion model;
	
	//vista es instancia de la clase Ventana, sirve para acceder con ese nombre a ventana
	private Ventana vista;
	
	//Constructor
	public Controlador(Operacion a, Ventana v) {
		
		this.model = a;
		
		this.vista = v;
		
		this.vista.setController(this);
		
	}
	
		String desde = null;
		
		String a = null;
		
		String hasta = null;
		
		int contador = 1;
		
	//actionPerformed hace que funcione el boton
	
	public void actionPerformed(ActionEvent e) {
		
		
		//revisando que el estado del ususario este vacio
		//el contador cuando esta en 1, significa que se inicio el juego y se resta, porque al inicio no hay nada
		
		if (contador==1) {
			
		// ActionCommand para que funcione el boton de iniciar juego
		if(e.getActionCommand().equals("Iniciar Juego")) {
			
			//Estoy leyendo lo que dice la caja1
			String llamado = this.vista.gettexto1().getText();
			
			model.inicio(llamado);
			contador --;
			
			}
		}
		
		else 
		{
			
			//Si el contador no es 1, es que ya estamos en el desarrollo de la partida
			
			
			//lectura de la caja 1
			String llamado = this.vista.gettexto1().getText();
			
			//lectura de la caja 2
			String llamado2 = this.vista.gettexto2().getText();
			
			// Esto esta verificando que los textos ingresados de las cajas son validos
			if(llamado != null && llamado2 != null)
			{
			
				if (e.getActionCommand().equals("MOVER TROPAS")) 
				{
				
					//model.hasta es el movimiento entre territorios
					 model.hasta(llamado, llamado2);
				 
				}
			}				
			if (e.getActionCommand().equals("ATACAR")) 
			{
				model.atacar(llamado2);
			}
			
			model.mover();
		}
	}
}   
