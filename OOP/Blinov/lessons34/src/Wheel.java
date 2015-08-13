/**
 * Created by Master on 8.12.2015.
 */
public class Wheel {

    private final double RADIUS = 15;

    private double radius;

    Wheel(){
        this.radius = RADIUS;
    }

    Wheel(double radius){
        if(radius < 14 || radius > 32){
            System.out.println("Размер колеса должен быть от 14 до 32 дюймов");
        } else
            this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRaduis(double radius){
        if(radius < 14 || radius > 32){
            throw new IllegalArgumentException("Размер колеса должен быть от 14 до 32 дюймов");
        } else
            this.radius = radius;
    }
}
