package java_oop.presentation.Task5;

/**
 * Created by Master on 8.7.2015.
 */
public class RectangleRunner {
    public static void main (String[] args) {
        Qadrilateral square = new Qadrilateral();
        square.square();
        square.setHeightX(5);
        System.out.println(square.area());
    }
}
