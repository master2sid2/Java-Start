/**
 * Created by Master on 8.12.2015.
 */
public class Car {

    private final int FUEL = 0;

    private String carName;
    private int maxFuel;
    private int fuel;

    private Engine engine = new Engine(5);

    Car(){
        this.carName = "Неопределено";
        this.maxFuel = FUEL;
        this.fuel = maxFuel;
        inicializateWheels();
    }
    Car(String name, int fuel){
        if(name == null || name.equals("")){
            throw new IllegalArgumentException("У машины должна быть марка");
        } else
            this.carName = name;
        if(fuel < 0)
            throw new IllegalArgumentException("Ёмкость бака не может быть отрецательной");
        else
            this.maxFuel = fuel;
        this.fuel = maxFuel;
        inicializateWheels();
    }
    Car(String name, int fuel, int tank){
        if(name == null || name.equals("")){
            throw new IllegalArgumentException("У машины должна быть марка");
        } else
            this.carName = name;
        if(fuel < 0)
            throw new IllegalArgumentException("Ёмкость бака не может быть отрецательной");
        else
            this.maxFuel = tank;
        this.fuel = maxFuel;
        inicializateWheels();
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public void setTank(int tank){
        this.maxFuel = tank;
        this.fuel = this.maxFuel;
    }

    public int getFuel(){
        return this.fuel;
    }

    public void ride() {
        if(this.fuel==0)
            System.out.println("Ехать не возможно, бак пуст");
        else if (!engine.hasSterted()){
            System.out.println("Дигатель не заведён");
        }
        else {
            System.out.println("Едем");
            isRide();
        }
    }

    private void isRide(){
        int balance = this.fuel;
        int border = this.engine.getExpense();
        for(int i = balance; i > 0; i-=border){
            if(balance - this.engine.getExpense() < 0){
                this.engine.stopEngine();
                break;
            } else {
            balance = balance - this.engine.getExpense();
            this.engine.increase();
            }
        }
        this.fuel = balance;
        this.engine.stopEngine();
        System.out.println("Мало бениза, необходимо заправится");
    }

    public void chargeFuel(int fuel) {
        int balance = this.maxFuel - this.fuel;
        int availability = this.maxFuel - balance;
        if(this.maxFuel==0)
            System.out.println("Не инициализирована ёмкость бака");
        else if(this.maxFuel < fuel)
            System.out.println("Бак на " + this.maxFuel + " литров, в него не влезет " + fuel + " литров");
        else if (availability + fuel == this.maxFuel){
            System.out.println("Машина успешно заправлена на " + fuel + " литров");
        }
        else if (this.fuel == this.maxFuel && this.maxFuel - this.fuel!=0){
                System.out.println("Невозмонжно заправить на " + fuel + " литров");
                System.out.println("Бак не пуст. Остаток " + availability + " литров");
                System.out.println("Заправить можно не больше чем на " + balance + " литров");
        }
        else {
            this.fuel = fuel;
            System.out.println("Машина успешно заправлена на " + fuel + " литров");
        }
    }

    public void changeWheel(double radius) {
        if(this.engine.hasSterted()){
            System.out.println("Нельзя менять колёса на ходу");
        } else {
            Wheel frontRight = new Wheel(radius);
            Wheel frontLeft = new Wheel(radius);
            Wheel rearRight = new Wheel(radius);
            Wheel rearLeft = new Wheel(radius);
            System.out.println("Колёса успешно заменены");
        }
    }

    private void inicializateWheels(){
        Wheel frontRight = new Wheel();
        Wheel frontLeft = new Wheel();
        Wheel rearRight = new Wheel();
        Wheel rearLeft = new Wheel();
    }

    public void startEngine(){
        if(this.fuel!=0)
            this.engine.startEngine();
        else
            System.out.println("Машину не завести, бак пуст");
    }

    public int getMileage(){
        return this.engine.getMileage();
    }
    public void setExpense(int expense){
        this.engine.setExpense(expense);
    }
}
