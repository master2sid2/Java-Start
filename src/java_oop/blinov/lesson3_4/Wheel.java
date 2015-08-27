package java_oop.blinov.lesson3_4;

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
            throw new IllegalArgumentException("Размер колеса должен быть от 14 до 32 дюймов");
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Wheel)) return false;

        Wheel wheel = (Wheel) o;

        if (Double.compare(wheel.radius, radius) != 0) return false;

        return true;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(radius);
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Wheel{");
        sb.append("radius=").append(radius);
        sb.append('}');
        return sb.toString();
    }
}
