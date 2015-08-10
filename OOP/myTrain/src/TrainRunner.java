import java.util.Random;

/**
 * Created by Master on 8.10.2015.
 */
public class TrainRunner {
    public static void main(String[] args) {
        Random rnd = new Random();
        CyrcleTrain train = new CyrcleTrain(rnd.nextInt(20)+1);
        System.out.println(train.toString());

        System.out.println(train.isLength(lenght(train)));
        System.out.println(train.getStep());


        System.out.println(train.toString());
    }

    private static int lenght(CyrcleTrain train){
        if(train.isLightOn()){
            train.lightOff();
        }
        train.turnRight();
        while (!train.isLightOn()){
            train.lightOn();
            train.turnLeft();
        }

        return train.getStep();
    }
}