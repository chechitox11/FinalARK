package vistaG;

import javax.swing.JButton; 

import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JTextField;

import controladorG.Controlador;

//JFrame, para crear ventanas
@SuppressWarnings("serial")
public class Ventana extends JFrame{
	
	//JLabel, texto puesto sobre la ventana
	private JLabel desde = new JLabel("iniciar ataque desde: ");

	private JLabel hasta = new JLabel("moverse A: ");
	
	private JLabel a = new JLabel("Usted es el rojo ");

	//Llamando a la calse controlador y la estoy poniendo como un atributo de la 
	//ventana, la clase controlador se llama para que se ejecuten los botones
	private Controlador cG;
	
	//Inicia todo, partida de todo
	private JButton boton1 = new JButton("Iniciar Juego");
	
	private JButton boton2 = new JButton("MOVER TROPAS"); 
	
	private JButton boton3 = new JButton("ATACAR"); 
	
	//JTextField, caja de texto, para colocar los lugares del mapa, osea A,B,C
	private JTextField texto1 = new JTextField();
	
	private JTextField texto2 = new JTextField();
	
	
	//Para identificar que el texto1 es para el desde
	public JTextField gettexto1() {
        return texto1;
    }
	
	//Para identificar que el texto2 es para el hasta
    public JTextField gettexto2() {
        return texto2;
    }

    public void settexto1(JTextField texto1) {
        this.texto1 = texto1;
    }
    public void settexto2(JTextField texto2) {
        this.texto2 = texto2;
    }
    
    //Estoy creando una instancia de la clase Panel
    private Panel panel = new Panel();
	
	public Ventana() {
		/**
		 * En esta parte tengo lo que requiere la ventana, lo que es ancho y largo de la ventana, ...
		 */
		
		this.setBounds(10,10,1000,1000);
		
		//Para que se cierre la ventana del todo al momento de salir
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//
		this.setLayout(null);
		
		//El titulo de la ventana
		this.setTitle("RISK VERSION 2");
		
		//Este metodo incluyen todos los componentes de la ventana
		initComponents();
		
		//Este es para que se pueda ver
		this.setVisible(true);
	}
	
	
	//ACA ES TODO PARA DIBUJAR
	private void initComponents()  {
	
	//La ubicacion, y el tamaño del boton1, las propiedades
	this.boton1.setBounds(820, 10, 150, 30);
	this.add(boton1);
	//Asi mismo con el boton2
	this.boton2.setBounds(820, 50, 140, 30);
	this.add(boton2);
	
	this.boton3.setBounds(820, 199, 150, 30);
	this.add(boton3);
	
	//El tamaño del panel
	this.panel.setBounds(0,0,800,800); 
	panel.setVisible(true);
	this.add(panel);
	
	//Es el ancho y largo del JLabel desde
	desde.setBounds(805, 80, 200, 60);
	this.add(desde);
	
	//Ancho y largo del JLabel hasta
	hasta.setBounds(900, 150, 200, 60);
	this.add(hasta);
	
	a.setBounds(850, 180, 300, 200);
	this.add(a);
	
	//Ancho y largo de la caja de texto1
	this.texto1.setBounds(810, 130, 60, 40);
	//Ancho y largo de la caja de textto2
	this.texto2.setBounds(920, 130, 60, 40);
	
	
	//los add son para añadir ese objeto a la ventana
	this.add(texto1);
	this.add(texto2);
	
	}

	// El metodo que almacena los botones para que puedan tener una funcionalodad
	//Conexion entre la ventana y el controlador
	public void setController(Controlador controlador) {
	
	//cG, como se llamo al controlador en esta clase
	//y aqui se le atribuye el actionListener, y de esta manera funcionan los botones 1 y 2
	this.cG = controlador;
	boton1.addActionListener(cG);
	boton2.addActionListener(cG);
	boton3.addActionListener(cG);
	
	}
	
	//metodo get del panel
	public Panel getPanel() {
	return panel;
	
	}

	//metodo get del boton 1
	public JButton getBoton1() {
	
	return boton1;
	
	}
	
	//metodo get del boton 2
	public JButton getBoton2() {
		
		return boton2;
		
	}
	public JButton getBoton3() {
		
		return boton3;
		
		}
}
