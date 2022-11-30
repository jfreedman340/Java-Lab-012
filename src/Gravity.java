public class Gravity {
    double f;
    double g;
    double m1;
    double m2;
    double d;


    public Gravity () {
        this.f = f;
        this.g = g;
        this.m1 = m1;
        this.m2 = m2;
        this.d = d;
        setGrav(f, g, m1, m2, d);
    }

    public double setGrav (double f, double g, double m1, double m2, double d) {
        f = g * ((m1 * m2)/(d*d));
        return f;
    }
}
