package modelo;

import vista.Ventana;
import java.util.ArrayList;


public class A {
    private Ventana ventana;

    Juego j=new Juego();
    public A(Ventana v) {

        ventana = v;
        
    }

    public void iniciarJuego(){
        j.createSoldiers();
        refreshUI();
    }
    
    public void jugar() {
            j.EliminarSoldado();
                refreshUI();
            

    }
    
    private void refreshUI(){
            ventana.getPanel().soldiers= new ArrayList<>();
            ventana.getPanel().soldiers.addAll(j.teamA);
            ventana.getPanel().soldiers.addAll(j.teamB);
            ventana.getPanel().repaint();
            
    }
    
}

