/**
 * Created by Master on 8.12.2015.
 */
public class Engine {

    private int mileage = 0;
    private boolean hasStarted = false;
    private int expense=5;

     public Engine(int expense){
        this.expense = expense;
    }

    public void startEngine(){
        this.hasStarted = true;
        System.out.println("Двигатель заведён");
    }
    public void stopEngine(){
        this.hasStarted = false;
    }

    public boolean hasSterted(){
        return this.hasStarted;
    }

    public void setExpense(int expense){
        this.expense = expense;
    }

    public int getExpense(){
        return this.expense;
    }

    public int getMileage(){
       return this.mileage;
    }
    public void increase(){
        this.mileage++;
    }
}
