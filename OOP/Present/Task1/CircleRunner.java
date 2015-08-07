/**
 * Created by Master on 8.7.2015.
 */
public class CircleRunner {
    public static void main (String[] args) {

        Circle circle = new Circle(5);
        Circle newCirlce = new Circle(1);
        System.out.println(circle.square());
        newCirlce.setRadius(35.6);
        System.out.println(newCirlce.getRadius());
        System.out.println(newCirlce.square());
    }
}
