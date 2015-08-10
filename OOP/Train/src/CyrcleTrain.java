import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Master on 8.10.2015.
 */
public class CyrcleTrain implements Train{

    private boolean lamp;

    public CyrcleTrain(int lebght) {

    }

    private void CreateTrain(int lenght) {

        if(lenght < 0 || lenght == 0) {
            throw new IllegalArgumentException();
        }

        Random rnd = new Random();

        List<Wagon> list = new ArrayList<Wagon>();

        for( int i = 0; i < lenght; i++) {
            Wagon wagon = new Wagon();
            wagon.isLightOn = rnd.nextBoolean();
            list.add(wagon);
        }


    }

    private class Wagon {
        boolean isLightOn;
    }

    @Override
    public void turnLeft() {

    }

    @Override
    public void turnRight() {

    }

    @Override
    public void lightOn() {
        lamp = true;
    }

    @Override
    public void lightOff() {
        lamp = false;
    }

    @Override
    public boolean isLightOn() {
        if(lamp) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isLength(int expectedLength) {
        return false;
    }
}
