package modelo;

public class Soldier {
    private int x,y;
    private String team;

    public Soldier(int x, int y, String team) {
        this.x = x;
        this.y = y;
        this.team = team;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
        
  
}

