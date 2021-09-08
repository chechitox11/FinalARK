package controlador;

import modelo.A;
import vista.Ventana;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener{
    
    private A model;
    private Ventana vista;

    public Controlador(A a, Ventana v) {

        model = a;
        vista = v;


        vista.setController(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Start")) {
            model.iniciarJuego();
        }else if(e.getActionCommand().equals("NextTurn")){
            model.jugar();
        }
        
    }
    
    
}

