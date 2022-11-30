import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class solarSystem {
    private Sun theSun;
    private ArrayList<Planets> planets;

    String p;

    public solarSystem () {
        planets = new ArrayList<>();

    }
    public double setVelX(double newVelX) {return this.velX = newVelX;}

    public double setVelY(double newVelY) {return this.velX = newVelY;}

    public void addPlanets (Planets p) {
        planets.add(p);
    }

    public void addSun (Sun sun) {this.theSun = sun;}

    public void showPlanets () {
        for(Planets p : this.planets) {
            System.out.println(p);
        }
    }

    public void movePlanets () {
        double G = 0.1;
        double dt = 0.001;
        for(Planets p : this.planets) {
            p.moveTo(p.getPosX().getPosX() * dt * p.getVelX()

            );

            double rx = this.theSun.getPosX() - p.getPosX();
            double ry = this.theSun.getPosY() - p.getPosY();
            double r = Math.sqrt(Math.pow(rx, 2) * Math.pow(ry, 2));

            double accX = G * this.theSun.getMass() * rx / Math.pow(r, 3);
            double accY = G * this.theSun.getMass() * ry / Math.pow(r, 3);

            p.setVelX(p.getVelX() * dt * accX);
            p.setVelX(p.getVelX() * dt * accY);
        }
    }




}
