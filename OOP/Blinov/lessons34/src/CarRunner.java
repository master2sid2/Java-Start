/**
 * Created by Master on 8.12.2015.
 */
public class CarRunner {
    public static void main(String[] args) {
        Car mitsuboshi = new Car();
        inicializateCar(mitsuboshi);
        System.out.println(mitsuboshi.getCarName());
        mitsuboshi.ride();
        mitsuboshi.chargeFuel(100);
        mitsuboshi.ride();
        mitsuboshi.startEngine();
        mitsuboshi.changeWheel(21);
        mitsuboshi.ride();
        System.out.println("Пробег автомобиля составляет " + mitsuboshi.getMileage() + " км.");
        System.out.println("Остаток топлива " + mitsuboshi.getFuel() + " литров.");
        mitsuboshi.chargeFuel(119);
        mitsuboshi.ride();
        mitsuboshi.startEngine();
        mitsuboshi.ride();
       // mitsuboshi.changeWheel(21);
        System.out.println("Пробег автомобиля составляет " + mitsuboshi.getMileage() + " км.");
        System.out.println("Остаток топлива " + mitsuboshi.getFuel() + " литров.");

        System.out.println(mitsuboshi.toString());
    }

    public static void inicializateCar(Car car){
        car.setExpense(7);
        car.setCarName("Lancer");
        car.setTank(120);
    }
}
