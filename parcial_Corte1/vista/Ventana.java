package vista;

import controlador.Controlador;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;

public class Ventana extends JFrame {
    
        private Controlador c;
        private JLabel label = new JLabel("Welcome to Risk");
        private Panel panel=new Panel();
        private JButton boton = new JButton("Start");
        private JButton boton2= new JButton("Siguiente Turno");
        private JButton boton3= new JButton("elegir lugar");
        
        
        public Ventana() {
        this.setBounds(10, 10, 1000, 1000);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setTitle("RISK");
        initComponents();
        this.setVisible(true);

    }
    
        private void initComponents() {
        label.setBounds(1, 0, 100, 100);
        this.add(label);
        this.boton.setBounds(810, 100, 80, 30);
        this.add(boton);
        this.boton2.setBounds(810, 150, 100, 30);
        this.add(boton2);
        this.boton3.setBounds(100, 100, 100, 30);
        this.add(boton3);
        panel.setBounds(0, 0, 800, 800);
        this.add(panel);
        
    }

        public void updateView(String s) {
        label.setText(s);
    }
  
     public Panel getPanel(){
        return panel;
    }
    
    public void setController(Controlador cont) {
        this.c = cont;
        boton.setActionCommand("Start");
        boton2.setActionCommand("NextTurn");
        boton.addActionListener(c);
        boton3.setActionCommand("choose place");
        boton3.addActionListener(c);
        boton2.addActionListener(c);
    }
    
}

