/**
 * Created by Master on 8.7.2015.
 */
public class Circle {

    private static final String NAME = "Circle";

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
       this.radius = radius;
    }

    public double square(){
        return Math.PI * (this.radius * this.radius);
    }
}
