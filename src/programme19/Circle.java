package programme19;



public class Circle {
    private static final double PI = 3.14;
    double radius;

    public Circle(double radius) {
        if (radius < 0)
            this.radius = 0;
        else {
            this.radius = radius;
        }
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return (getRadius() * getRadius() * PI);
    }
}
