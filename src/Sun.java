public class Sun {

    private double radius;
    private double mass;

    private double x;
    private double y;
    private double velX;
    private double velY;

    private String name;

    public Sun(String name, double radius, double mass, double x, double y) {
        this.mass = mass;
        this.radius = radius;
        this.velX = velX;
        this.velY = velY;
        this.x = x;
        this.y = y;

    }

    public void moveTo(double newX, double newY) {
        this.x = newX;
        this.y = newY;
    }

    public double setVelX(double newVelX) {return this.velX = newVelX;}

    public double setVelY(double newVelY) {return this.velX = newVelY;}

    public double getMass() {
        return this.mass;
    }

}
