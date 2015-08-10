import java.util.Random;

/**
 * Created by Master on 8.10.2015.
 */
public class TrainRunner {
    public static void main(String[] args) {
        Random rnd = new Random();
        int rndInt = rnd.nextInt(20)+1;
        CyrcleTrain train = new CyrcleTrain(rndInt);
        String str = train.toString();
        System.out.println("Длина поезда ранвяется длине сгенерированого числа: " + train.isLength(lenght(train)));
        System.out.println("Рассчитана длина поезда: " + lenght(train));
        System.out.println("Длина сгенерированого поезда: " + rndInt);
        System.out.println("Визуализация поезда: " + str);
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