public class Planets {

    private double radius;
    private double mass;

    private double x;
    private double y;
    private double velX;
    private double velY;

    private String name;

    public Planets(String name, double radius, double mass, double x, double y, double velX, double velY) {
        this.name = name;
        this.mass = mass;
        this.radius = radius;
        this.x = x;
        this.y = y;
        this.velX = velX;
        this.velY = velY;

        setPos(velX, velY);
    }

    public void moveTo(double newX, double newY) {
        this.x = newX;
        this.y = newY;
    }

    public double setVelX (double newVelX) {
        return this.velX = newVelX;
    }

    public double setVelY (double newVelY) {
        return this.velX = newVelY;
    }

    public double getPosX () {return this.x;}

    public double getPosY () {return this.y;}

    public double getMass() {return this.mass;}

    public void setPos (double velX, double velY) {
        this.velX = velX;
        this.velY = velY;
    }

    @Override
    public String toString() {
        return String.format("%s: x:%f", this.name, this.x, this.y);
    }
}
