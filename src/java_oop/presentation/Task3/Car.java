package java_oop.presentation.Task3;

/**
 * Created by Master on 8.7.2015.
 */
public class Car {

    private final static int STOP = 0;
    private final static int START = 1;
    private final static int MOVE = 2;
    private final static int HOLD = 3;
    private int carState = STOP;

    public Car(){

    }

    public void runCar(){
        if(carState == START)
            System.out.println("Машина уже запущена");
        else if (carState == MOVE)
            System.out.println("Машина уже запущена и находится в движении");
        else if (carState == HOLD)
            System.out.println("Машина уже запущена и находится в движении");
        else {
            System.out.println("Машина запущена");
            carState = START;
        }
    }

    public void stopCar() {
        if(carState==STOP)
            System.out.println("Машина не запущена");
        else {
            System.out.println("Машина остановлена");
            carState = STOP;
        }
    }

    public void moveCar() {
        if(carState==STOP)
            System.out.println("Нельзя поехать на не заведённой машине");
        else if (carState==MOVE)
            System.out.println("Машина уже Находится в движении");
        else {
            System.out.println("Машина начала движение");
            carState = MOVE;
        }
    }

    public void holdSpeed() {
        if(carState==STOP)
            System.out.println("Машина не запущена");
        else if (carState==START)
            System.out.println("Машина не в движении");
        else if (carState==HOLD)
            System.out.println("Машина уже держит скорость");
        else {
            System.out.println("Машина держит необхордимую скорость");
            carState = HOLD;
        }
    }
}
