import java.lang.Math;

public class Simulation {


    public static void main(String[] args) {
        solarSystem ss = new solarSystem();
        ss.addSun(
                new Sun("Sun", 5000,10,0, 0));
        Planets earth = new Planets("Earth", 47.5, 1000, 0.0, 0.0, 0.0, 0.0);
        ss.addPlanets(earth);
        Planets mars = new Planets("Mars", 31.7, 800, 0.0, 0.0, 0.0, 0.0);
        ss.addPlanets(mars);

        ss.showPlanets();

        int timePeriod = 100;
        for (int i = 0; i<timePeriod; i++) {
            ss.movePlanets();
            ss.showPlanets();
        }
    }
}
