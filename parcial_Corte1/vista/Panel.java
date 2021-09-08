package vista;

import modelo.Soldier;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;

public class Panel extends JPanel{
    public ArrayList<Soldier> soldiers=new ArrayList<>();
    
    
    public Panel(){
        this.setVisible(true);
        this.setLayout(null);  
    }
    
    @Override
    public void paint(Graphics g){  
        g.clearRect(0, 0, 800, 800);
        for(int i=0;i<soldiers.size();i++){
            if(soldiers.get(i).getTeam().equals("A")){
                g.setColor(Color.red);
            }else{
                g.setColor(Color.blue);
            }
            g.fillOval(soldiers.get(i).getX(), soldiers.get(i).getY(), 10, 10);
        }
    }
    

}

