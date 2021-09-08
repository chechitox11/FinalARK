package launcher;

import controlador.Controlador;
import modelo.A;
import vista.Ventana;


public class Launcher {

    public static void main(String args[]) {

        Ventana v = new Ventana();

        A a = new A(v);

        @SuppressWarnings("unused")
		Controlador c = new Controlador(a, v);
        
    }

}