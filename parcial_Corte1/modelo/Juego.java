package modelo;

import java.util.ArrayList;
import java.util.Random;

public class Juego {
    public ArrayList<Soldier> teamA=new ArrayList<>();
    public ArrayList<Soldier> teamB=new ArrayList<>();

    public void createSoldiers(){
        Random r=new Random();
        int teamASize=r.nextInt(20);
        int teamBSize=r.nextInt(20);
        System.out.println("soldados A "+teamASize);
        System.out.println("soldados B "+teamBSize);
        
        for(int i=0;i<teamASize;i++){
            teamA.add(new Soldier(r.nextInt(200), r.nextInt(400), "A"));
            
        }   
        for(int i=0;i<teamBSize;i++){
            teamB.add(new Soldier(r.nextInt(100), r.nextInt(50), "B"));
        }      
    }
    
    public void Ganar(){
        if(teamA.size()==0){
            System.out.println("El equipo A es el ganador");
        }
        else{
            System.out.println("El equipo B es el ganador");
        }
    }
    
    public void EliminarSoldado(){
      Random r= new Random();  
      int randomNumC=r.nextInt(teamA.size()+teamB.size());
      
      
        if (randomNumC==0) {
            teamA.remove(teamA.size()-1);
            
            
        }else{
             teamB.remove(teamB.size()-1);
        }
        
    }
    
}
