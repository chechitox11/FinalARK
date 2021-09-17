package modeloG;

import java.util.Random;
import java.util.Scanner;

import vistaG.Ventana;

public class Operacion {
	
private Ventana ventana = null;
	
	public Operacion(Ventana vG) {
		
		this.ventana = vG;
	}
	
	//Este es el metodo llamado llenarData que 
	public void llenarData() {
		
		//Aca se esta ubicando el nombre de cada territorio, y 0 significa los soldados iniciales de cada territorio
		ventana.getPanel().getlistadoTerritorio().add(new Territorio(new Punto(169, 156), "A", 0));
		
		ventana.getPanel().getlistadoTerritorio().add(new Territorio(new Punto(234, 124), "B", 0));
		
		ventana.getPanel().getlistadoTerritorio().add(new Territorio(new Punto(302, 102), "C", 0));
		
		ventana.getPanel().getlistadoTerritorio().add(new Territorio(new Punto(385, 48), "D", 0));
		
		ventana.getPanel().getlistadoTerritorio().add(new Territorio(new Punto(470, 102), "E", 0));
		
		ventana.getPanel().getlistadoTerritorio().add(new Territorio(new Punto(530, 122), "F", 0));
		
		ventana.getPanel().getlistadoTerritorio().add(new Territorio(new Punto (600, 246), "G", 0));
		
		ventana.getPanel().getlistadoTerritorio().add(new Territorio(new Punto(147, 254), "H", 0));
		
		ventana.getPanel().getlistadoTerritorio().add(new Territorio(new Punto(380, 160), "I", 0));
		
		ventana.getPanel().getlistadoTerritorio().add(new Territorio(new Punto(620, 142), "J", 0));
		
		ventana.getPanel().getlistadoTerritorio().add(new Territorio(new Punto(480, 350), "K", 0));
		
		ventana.getPanel().getlistadoTerritorio().add(new Territorio(new Punto(600, 324), "L", 0));
		
		ventana.getPanel().getlistadoTerritorio().add(new Territorio(new Punto(260, 246), "M", 0));
		
		ventana.getPanel().getlistadoTerritorio().add(new Territorio(new Punto(470, 226), "N", 0));
		
		ventana.getPanel().getlistadoTerritorio().add(new Territorio(new Punto(155, 320), "O", 0));
		
		ventana.getPanel().getlistadoTerritorio().add(new Territorio(new Punto(265, 325), "P", 0));
		
		ventana.getPanel().getlistadoTerritorio().add(new Territorio(new Punto(385, 395), "Q", 0));
		
		ventana.getPanel().getlistadoTerritorio().add(new Territorio(new Punto(165, 420), "R", 0));
		
		ventana.getPanel().getlistadoTerritorio().add(new Territorio(new Punto(240, 440), "S", 0));
		
		ventana.getPanel().getlistadoTerritorio().add(new Territorio(new Punto(302, 470), "T", 0));
		
		ventana.getPanel().getlistadoTerritorio().add(new Territorio(new Punto(465, 470), "W", 0));
		
		ventana.getPanel().getlistadoTerritorio().add(new Territorio(new Punto(535, 446), "X", 0));
		
		ventana.getPanel().getlistadoTerritorio().add(new Territorio(new Punto(605, 430), "Y", 0));
		
		ventana.getPanel().getlistadoTerritorio().add(new Territorio(new Punto(385, 530), "Z", 0));
		
		
		//Aca estoy implementando los vecinos de cada territorio
		
		//Mediante una expresion funcional, que es como una busqueda sin necesidad de iteracion, ose (for)
		
		Territorio hallarVecinosA = ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("A")).findFirst().get();
		
		//el filter es para filtrar mediante una expresion lambda
		
		hallarVecinosA.getVecinos().add(ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("B")).findFirst().get());
		
		hallarVecinosA.getVecinos().add(ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("H")).findFirst().get());
		
		
		
		Territorio hallarVecinosB = ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("B")).findFirst().get();
		
		hallarVecinosB.getVecinos().add(ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("A")).findFirst().get());
		
		hallarVecinosB.getVecinos().add(ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("M")).findFirst().get());
		
		hallarVecinosB.getVecinos().add(ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("C")).findFirst().get());
		
		
		
		
		Territorio hallarVecinosC = ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("C")).findFirst().get();
		
		hallarVecinosC.getVecinos().add(ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("B")).findFirst().get());
		
		hallarVecinosC.getVecinos().add(ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("I")).findFirst().get());
		
		hallarVecinosC.getVecinos().add(ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("D")).findFirst().get());
		
		
		
		
		Territorio hallarVecinosD = ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("D")).findFirst().get();
		
		hallarVecinosD.getVecinos().add(ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("C")).findFirst().get());
		
		hallarVecinosD.getVecinos().add(ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("E")).findFirst().get());
		
		
		
		Territorio hallarVecinosE = ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("E")).findFirst().get();
		
		hallarVecinosE.getVecinos().add(ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("D")).findFirst().get());
		
		hallarVecinosE.getVecinos().add(ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("I")).findFirst().get());
		
		hallarVecinosE.getVecinos().add(ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("F")).findFirst().get());
		
		
		
		
		Territorio hallarVecinosF = ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("F")).findFirst().get();
		
		hallarVecinosF.getVecinos().add(ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("E")).findFirst().get());
		
		hallarVecinosF.getVecinos().add(ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("N")).findFirst().get());
		
		hallarVecinosF.getVecinos().add(ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("J")).findFirst().get());
		
		
		
		
		Territorio hallarVecinosG = ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("G")).findFirst().get();
		
		hallarVecinosG.getVecinos().add(ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("J")).findFirst().get());
		
		hallarVecinosG.getVecinos().add(ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("N")).findFirst().get());
		
		hallarVecinosG.getVecinos().add(ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("L")).findFirst().get());
		
		
		
		
		Territorio hallarVecinosJ = ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("J")).findFirst().get();
		
		hallarVecinosJ.getVecinos().add(ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("F")).findFirst().get());
		
		hallarVecinosJ.getVecinos().add(ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("G")).findFirst().get());
		
		
		
		
		Territorio hallarVecinosN = ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("N")).findFirst().get();
		
		hallarVecinosN.getVecinos().add(ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("G")).findFirst().get());
		
		hallarVecinosN.getVecinos().add(ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("F")).findFirst().get());
		
		hallarVecinosN.getVecinos().add(ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("I")).findFirst().get());
		
		
		hallarVecinosN.getVecinos().add(ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("K")).findFirst().get());
		
		
		
		
		Territorio hallarVecinosI = ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("I")).findFirst().get();
		
		hallarVecinosI.getVecinos().add(ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("C")).findFirst().get());
		
		hallarVecinosI.getVecinos().add(ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("C")).findFirst().get());
		
		hallarVecinosI.getVecinos().add(ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("M")).findFirst().get());
		
		hallarVecinosI.getVecinos().add(ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("N")).findFirst().get());
		
		hallarVecinosI.getVecinos().add(ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("E")).findFirst().get());
		
		
		
		
		Territorio hallarVecinosM = ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("M")).findFirst().get();
		
		hallarVecinosM.getVecinos().add(ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("B")).findFirst().get());
		
		hallarVecinosM.getVecinos().add(ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("H")).findFirst().get());
		
		hallarVecinosM.getVecinos().add(ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("P")).findFirst().get());
		
		hallarVecinosM.getVecinos().add(ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("I")).findFirst().get());
		
		
		
		
		Territorio hallarVecinosH = ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("H")).findFirst().get();
		
		hallarVecinosH.getVecinos().add(ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("M")).findFirst().get());
		
		hallarVecinosH.getVecinos().add(ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("A")).findFirst().get());
		
		hallarVecinosH.getVecinos().add(ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("O")).findFirst().get());
		
		
		
		
		
		Territorio hallarVecinosO = ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("O")).findFirst().get();
		
		hallarVecinosO.getVecinos().add(ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("H")).findFirst().get());
		
		hallarVecinosO.getVecinos().add(ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("P")).findFirst().get());
		
		hallarVecinosO.getVecinos().add(ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("R")).findFirst().get());
		
		
		
		
		
		Territorio hallarVecinosP = ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("P")).findFirst().get();
		
		hallarVecinosP.getVecinos().add(ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("M")).findFirst().get());
		
		hallarVecinosP.getVecinos().add(ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("O")).findFirst().get());
		
		hallarVecinosP.getVecinos().add(ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("S")).findFirst().get());
		
		hallarVecinosP.getVecinos().add(ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("Q")).findFirst().get());
		
		
		
		
		Territorio hallarVecinosR = ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("R")).findFirst().get();
		
		hallarVecinosR.getVecinos().add(ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("O")).findFirst().get());
				
		hallarVecinosR.getVecinos().add(ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("S")).findFirst().get());
		
		
		
		
		Territorio hallarVecinosS = ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("S")).findFirst().get();
		
		hallarVecinosS.getVecinos().add(ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("R")).findFirst().get());
				
		hallarVecinosS.getVecinos().add(ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("P")).findFirst().get());
				
		hallarVecinosS.getVecinos().add(ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("T")).findFirst().get());
		
		
		
		
		Territorio hallarVecinosT = ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("T")).findFirst().get();
						
		hallarVecinosT.getVecinos().add(ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("S")).findFirst().get());
		
		hallarVecinosT.getVecinos().add(ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("Q")).findFirst().get());
						
		hallarVecinosT.getVecinos().add(ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("Z")).findFirst().get());
		
		
		
		
		Territorio hallarVecinosQ = ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("Q")).findFirst().get();
		
		hallarVecinosQ.getVecinos().add(ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("P")).findFirst().get());
				
		hallarVecinosQ.getVecinos().add(ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("T")).findFirst().get());
				
		hallarVecinosQ.getVecinos().add(ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("W")).findFirst().get());
				
		hallarVecinosQ.getVecinos().add(ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("K")).findFirst().get());
		
		
		
		
		Territorio hallarVecinosK = ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("K")).findFirst().get();
		
		hallarVecinosK.getVecinos().add(ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("N")).findFirst().get());
						
		hallarVecinosK.getVecinos().add(ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("Q")).findFirst().get());
						
		hallarVecinosK.getVecinos().add(ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("X")).findFirst().get());
						
		hallarVecinosK.getVecinos().add(ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("L")).findFirst().get());
		
		
		
		
		Territorio hallarVecinosL = ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("L")).findFirst().get();
		
		hallarVecinosL.getVecinos().add(ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("G")).findFirst().get());
								
		hallarVecinosL.getVecinos().add(ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("K")).findFirst().get());
								
		hallarVecinosL.getVecinos().add(ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("Y")).findFirst().get());
		
		
		
		
		Territorio hallarVecinosY = ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("Y")).findFirst().get();
		
		hallarVecinosY.getVecinos().add(ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("L")).findFirst().get());
										
		hallarVecinosY.getVecinos().add(ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("X")).findFirst().get());
		
		
		
		
		Territorio hallarVecinosX = ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("X")).findFirst().get();
		
		hallarVecinosX.getVecinos().add(ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("Y")).findFirst().get());
										
		hallarVecinosX.getVecinos().add(ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("K")).findFirst().get());
										
		hallarVecinosX.getVecinos().add(ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("W")).findFirst().get());
		
		
		
		
		Territorio hallarVecinosW = ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("W")).findFirst().get();
		
		hallarVecinosW.getVecinos().add(ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("X")).findFirst().get());
												
		hallarVecinosW.getVecinos().add(ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("Q")).findFirst().get());
												
		hallarVecinosW.getVecinos().add(ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("Z")).findFirst().get());
		
		
		
		
		Territorio hallarVecinosZ = ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("Z")).findFirst().get();
		
		hallarVecinosZ.getVecinos().add(ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("T")).findFirst().get());
														
		hallarVecinosZ.getVecinos().add(ventana.getPanel().getlistadoTerritorio().stream()
		.filter(p -> p.getNombre().equals("W")).findFirst().get());

		
		
		// eso es para pintar
		//ventana.getPanel().repaint();
		
	//	ventana.getPanel().getlistadoTerritorio().forEach(System.out :: println);
		
	}
	
	
	//Este metodo es para generar los soldados
	public void generarSoldados() {
			
		//este for lo que hace es recorrer la lista de territorios del usuario
		for (int i = 0; i < ventana.getPanel().getusuario().size(); i++) {
			
			//Aca estoy obteniendo cada territorio
			Territorio territorio = ventana.getPanel().getusuario().get(i);
			
			//Sirve para actualizar los soldados
			territorio.getPuntoSoldados().clear();
			
			//Este for recorre la cantidad de los soldados osea el numero, aca estoy obteniendo solo el numero
			for (int j = 0; j < territorio.getCantidadSoldados(); j++) {
				
				//Aca estoy declarando cuales van a ser los valores minimos y maximos de X y Y
				int minX = territorio.getPunto().getX()-20;
				int maxX = territorio.getPunto().getX()+20;
				int minY = territorio.getPunto().getY()-20;
				int maxY = territorio.getPunto().getY()+20;

				//Crea un random
				Random random = new Random();

				//En X estoy obteniendo un valor random entre el valor minimo y maximo de X
				int x = random.nextInt(maxX - minX) + minX;
				
				//Asi mismo con Y
				int y = random.nextInt(maxY - minY) + minY;
				
				//Aca estoy añadiendo los random X y Y que se crearon anteriormente
				territorio.getPuntoSoldados().add(new Punto(x,y)); 
				
			}
			//territorio.getPuntoSoldados().forEach(System.out :: println);
		}
		
		//Este for recorre la lista de territorios del enemigo, y hace 
		//exactamente lo mismo que el for anterior solo que se adapto al del enemigo
		for (int i = 0; i < ventana.getPanel().getcomputador().size(); i++) {
			
			Territorio territorio = ventana.getPanel().getcomputador().get(i);
			territorio.getPuntoSoldados().clear();
			for (int j = 0; j < territorio.getCantidadSoldados(); j++) {
				
				//System.out.println(territorio.getPunto().getX()+" " + territorio.getPunto().getY());
				
				int minX = territorio.getPunto().getX()-20;
				int maxX = territorio.getPunto().getX()+20;
				int minY = territorio.getPunto().getY()-20;
				int maxY = territorio.getPunto().getY()+20;

				Random random = new Random();

				int x = random.nextInt(maxX - minX) + minX;
				
				int y = random.nextInt(maxY - minY) + minY;
				
				territorio.getPuntoSoldados().add(new Punto(x,y)); 
				
			}
			//territorio.getPuntoSoldados().forEach(System.out :: println);
		}
		
		//Este actualiza el panel y se vuelve a pintar
		ventana.getPanel().repaint();
	}
	
	//Metodo donde se obtiene el lugar donde de inicio tanto de usuario como el del enemigo
	int	inicialEnemigo;
	public void inicio(String llamado) {
		
		//Este for recorre el listadoterritorio
		for (int i = 0; i < ventana.getPanel().getlistadoTerritorio().size(); i++) {
			
			//Este if busca cual es el nombre que es igual al territorio que el usuario desea iniciar
			if (ventana.getPanel().getlistadoTerritorio().get(i).getNombre().equals(llamado)) {
				
				//Se le ponen los soldados al lugar especificado
				ventana.getPanel().getlistadoTerritorio().get(i).setCantidadSoldados(20);
				
				//Se añadio el territorio a mi propiedad
				ventana.getPanel().getusuario().add(ventana.getPanel().getlistadoTerritorio().get(i));
				
				//Se hace el llamado del metodo
				generarSoldados();
			}
			
		}
		
			// A partir de esta linea estoy generando el pais inicial del enemigo de forma aleatoria
		
			//Se crea un random
			Random random = new Random();
			
			// Estoy obteniendo el tammaño del listado del territorio para que no genere problemas 
			//al momento de la iteracion
			//inicialEnemigo es el indice aleatorio generado del enemigo
			
			
			//estoy obteniendo un indice cualquiera, para que inicie en cualquier territorio
			inicialEnemigo = random.nextInt(ventana.getPanel().getlistadoTerritorio().size() - 1);
			
			//mientras que ese inidice llamado inicialEnemigo se igual al territorio de la 
			//listaterritorio, entonces hace que el enemigo no elija el mismo territorio que yo ya elegi
			
			while (inicialEnemigo == ventana.getPanel().getlistadoTerritorio().
					indexOf(ventana.getPanel().getusuario().get(0))){
				
				inicialEnemigo = random.nextInt(ventana.getPanel().getlistadoTerritorio().size() - 1);
			
			}
			
			//Aca estoy obteniendo el territorio aleatorio del enemigo y le estoy cargando los 20 soldados
			ventana.getPanel().getlistadoTerritorio().get(inicialEnemigo).setCantidadSoldados(20);
			
			//Aca estoy añadiendo el territorio al listado del territorio de los enemigos
			ventana.getPanel().getcomputador().add(ventana.getPanel().getlistadoTerritorio().get(inicialEnemigo));
			
			//Aca estoy llamando el metodo generar soldados para que vuelva a pintar los soldados
			generarSoldados();
		
	}
	
	//Este metodo hasta es para moverme entre los territorios, siempre y cuando sea vecino
	@SuppressWarnings("resource")
	public void hasta(String inicio, String fin) {
		
		// Este leer se creo para imprimir mensajes por consola
		Scanner leer = new Scanner(System.in);
		
		//Este for recorre la lista de territorios del ususario
		for (int i = 0; i < ventana.getPanel().getusuario().size(); i++) {
			
			//Este if busca el nombre del territorio del usuario cuyo nombre sea igual a inicio
			if (ventana.getPanel().getusuario().get(i).getNombre().equals(inicio)) {
			
			//find - encontrar
			boolean find = false;	
			
				//este for recorre el listado de vecinos del territorio del usuario
			//(un territorio, muchos vecinos)
				
				for (int j = 0; j < ventana.getPanel().getusuario().get(i).getVecinos().size(); j++) {
					
					//Este if busca si el territorio al que voy es igual a un vecino
					if ( ventana.getPanel().getusuario().get(i).getVecinos().get(j).getNombre().equals(fin) ) {
						
						//Aca estoy obteniendo el vecino 
						Territorio traer = ventana.getPanel().getusuario().get(i).getVecinos().get(j);
						
						//Este if busca si el vecino al que voy ya es parte de mi listado de propiedad
						if(ventana.getPanel().getusuario().stream().filter(p -> p.equals(traer)).findAny().isPresent()) {
							
							//inicio es el nombre del territorio inicial
							System.out.println(" �A cuantos del territorio " +inicio + " quiere mover?" );
							
							//se muestra la cantidad de soldados disponibles para mover a un nuevo territorio
							System.out.println(inicio + " Tiene  " + ventana.getPanel().getusuario().get(i).getCantidadSoldados() + " soldados");
							
							//Aca se lee por consola la cantidad de soldados
							int n = leer.nextInt();
							
							//Este while sirve para que solo se ingrese un valor valido
							while( n>= ventana.getPanel().getusuario().get(i).getCantidadSoldados()){
								
								System.out.println("No pase todos los soldados");
								
								//n es la cantidfad de soldados que se quieren mover a otro territorio vecino
								n = leer.nextInt();
								
							}
							//Aca a la CantidadSoldados se resta n que son la cantidad de soldados que la persona quizo leer 
							ventana.getPanel().getusuario().get(i).setCantidadSoldados(ventana.getPanel().getusuario().get(i).getCantidadSoldados()-n);
							
							// En esta parte a la cantidad soldados se le suma n que son los que la persona quizo aumentarle al momento de actualizar
							traer.setCantidadSoldados(traer.getCantidadSoldados() + n);
							
							//Aca se llama el metodo generar soldado para poder actualizar
							generarSoldados();
							
							//Si fue encontrado, por eso true
							find = true;
							
							
						}else {
						
							//Como no es del listado de la propiedad de vecinos, entonces 
							
							ventana.getPanel().getusuario().add(traer);
						
							//Este es si el territorio esta vacio
						
							System.out.println("lugar del territorio " +inicio + " al que quieres mover?" );
							//
							System.out.println(inicio + "Tiene  " + ventana.getPanel().getusuario().get(i).getCantidadSoldados() + " soldados");
							int n = leer.nextInt();
							while( n>= ventana.getPanel().getusuario().get(i).getCantidadSoldados()){
						
								System.out.println("No pase todos los soldados");
						
								n = leer.nextInt();
						
							}
							
							//A la cantidad soldados del territorio inicial se le resta n
							
						ventana.getPanel().getusuario().get(i).setCantidadSoldados(ventana.getPanel().getusuario().get(i).getCantidadSoldados()-n);
					
						//como el territorio esta vacio se le ponen n soldados
						traer.setCantidadSoldados(n);
						
						//se llama el metodo generarSoldados para actualizarlo
						generarSoldados();
					
						//Al territorio que fue, fue encontrado
						find = true;
					
						}
					}
					
				}
				
				//Si sigue siendo false
				if(!find ) {
					
					System.out.println("El pais al que va no esta disponible");
					
				}
				
			}else {
				
				System.out.println("El territorio desde donde se quiere no es de su propiedad");
				
			}
		}
		
		//Actualizar el panel
		ventana.getPanel().repaint();
		
	}	
	@SuppressWarnings("unused")
	public void atacar(String fin)
	{
		for (int i = 0; i < ventana.getPanel().getusuario().size(); i++) 
		{
			for (int j = 0; j < ventana.getPanel().getusuario().get(i).getVecinos().size(); j++) 
			{
				if ( ventana.getPanel().getusuario().get(i).getVecinos().get(j).getNombre().equals(fin) ) 
				{
					Territorio traer = ventana.getPanel().getusuario().get(i).getVecinos().get(j);
					ventana.getPanel().getusuario().get(i).setCantidadSoldados(ventana.getPanel().getusuario().get(i).getCantidadSoldados()-(int)Math.random()*(1-2)-1);
					System.out.println("a la guerra");
					generarSoldados();
				
					Territorio traer2 = ventana.getPanel().getcomputador().get(i).getVecinos().get(j);
					ventana.getPanel().getcomputador().get(i).setCantidadSoldados(ventana.getPanel().getcomputador().get(i).getCantidadSoldados()-(int)Math.random()*(1-2)-1);
					generarSoldados();
					System.out.println("a la guerra 2");
				}
			}
		}
		ventana.getPanel().repaint();
	}
	@SuppressWarnings("unused")
	public void mover() {
		Random nn = new Random();
		boolean find = false;
		Random l = new Random();
	    char r1 = (char) (l.nextInt(26) + 'A');
	    String letra="";
	   
	    String setOfCharacters = "ABCDEFGHIJKLMNOPQSTWXYZ";   
	    int randomInt = l.nextInt(setOfCharacters.length());
	    char r2 = setOfCharacters.charAt(randomInt);
	    letra = Character.toString(r2);
	    

	    System.out.println("ubicacion seleccionada por la maquina: " + letra);


		System.out.println(inicialEnemigo +" "+ letra);
		
		for (int i = 0; i < ventana.getPanel().getcomputador().size(); i++) {
			
			//Este if busca el nombre del territorio del usuario cuyo nombre sea igual a inicio
			
			
				
	 for (int j = 0; j < ventana.getPanel().getcomputador().get(i).getVecinos().size(); j++) {
			
			//Este if busca si el territorio al que voy es igual a un vecino
			if ( ventana.getPanel().getcomputador().get(i).getVecinos().get(j).getNombre().equals(letra) ) {
				
				//Aca estoy obteniendo el vecino 
				Territorio traer = ventana.getPanel().getcomputador().get(i).getVecinos().get(j);
				
				//Este if busca si el vecino al que voy ya es parte de mi listado de propiedad
				if(ventana.getPanel().getcomputador().stream().filter(p -> p.equals(traer)).findAny().isPresent()) {
				
					
					//inicio es el nombre del territorio inicial
					System.out.println("A cuantos del territorio " +inicialEnemigo + " quiere mover?" );
					
					//se muestra la cantidad de soldados disponibles para mover a un nuevo territorio
					System.out.println(inicialEnemigo + "Tiene  " + ventana.getPanel().getcomputador().get(i).getCantidadSoldados() + " soldados");
					
					
					
					//Aca se lee por consola la cantidad de soldados
					int n2 = nn.nextInt(18+1);
					
					//Este while sirve para que solo se ingrese un valor valido
					while( n2>= ventana.getPanel().getcomputador().get(i).getCantidadSoldados()){
						
						System.out.println("No pase todos los soldados");
						
						//n es la cantidfad de soldados que se quieren mover a otro territorio vecino
						n2 = nn.nextInt(18+1);
						System.out.println("esto es lo que la maquina quiere hacer"+n2+" "+ nn);
					}
					//Aca a la CantidadSoldados se resta n que son la cantidad de soldados que la persona quizo leer 
					ventana.getPanel().getcomputador().get(i).setCantidadSoldados(ventana.getPanel().getcomputador().get(i).getCantidadSoldados()-n2);
					
					// En esta parte a la cantidad soldados se le suma n que son los que la persona quizo aumentarle al momento de actualizar
					traer.setCantidadSoldados(traer.getCantidadSoldados() + n2);
					
					//Aca se llama el metodo generar soldado para poder actualizar
					generarSoldados();
					
					//Si fue encontrado, por eso true
					find = true;
					
					
				}else {
				
					//Como no es del listado de la propiedad de vecinos, entonces 
					
					ventana.getPanel().getcomputador().add(traer);
				
					//Este es si el territorio esta vacio
				
					System.out.println("A Cuantos del territorio " +inicialEnemigo + " quiere mover?" );
					//
					System.out.println(inicialEnemigo + "Tiene  " + ventana.getPanel().getcomputador().get(i).getCantidadSoldados() + " soldados");
					int n2 = 0;
					n2 = nn.nextInt(19-n2);
					while( n2>= ventana.getPanel().getcomputador().get(i).getCantidadSoldados()){
				
						System.out.println("No pase todos los soldados");
				
						n2 = nn.nextInt(19+n2);
				
					}
					
					//A la cantidad soldados del territorio inicial se le resta n
					
				ventana.getPanel().getcomputador().get(i).setCantidadSoldados(ventana.getPanel().getcomputador().get(i).getCantidadSoldados()-n2);
			
				//como el territorio esta vacio se le ponen n soldados
				traer.setCantidadSoldados(n2);
				
				//se llama el metodo generarSoldados para actualizarlo
				generarSoldados();
			
				//Al territorio que fue, fue encontrado
				find = true;
			
				}
			}
			
			
		}
			
		
		
		//Si sigue siendo false
		if(!find ) {
			
			System.out.println("la maquina selecciono una zona fuera de su alcance");
			
		
		
	}else {
		
		System.out.println("El territorio desde donde se quiere no es de su propiedad");
		
	}
		

		//Actualizar el panel
		ventana.getPanel().repaint();
		
	}
		}
}