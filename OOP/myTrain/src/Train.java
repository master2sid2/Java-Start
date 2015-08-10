/**
 * Created by Master on 8.10.2015.
 */
public interface Train {
    void turnLeft();
    void turnRight();
    void lightOn();
    void lightOff();
    boolean isLightOn();

    boolean isLength(int expectedLength);
}