package java_oop.blinov.lesson3_4;

/**
 * Created by Master on 8.12.2015.
 */
public class Engine {

    private int mileage = 0;
    private boolean hasStarted = false;
    private int expense = 5;

    public Engine(int expense) {
        this.expense = expense;
    }

    public void startEngine() {
        this.hasStarted = true;
        System.out.println("Двигатель заведён");
    }

    public void stopEngine() {
        this.hasStarted = false;
    }

    public boolean hasSterted() {
        return this.hasStarted;
    }

    public int getExpense() {
        return this.expense;
    }

    public void setExpense(int expense) {
        this.expense = expense;
    }

    public int getMileage() {
        return this.mileage;
    }

    public void increase() {
        this.mileage++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Engine)) return false;

        Engine engine = (Engine) o;

        if (expense != engine.expense) return false;
        if (hasStarted != engine.hasStarted) return false;
        if (mileage != engine.mileage) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = mileage;
        result = 31 * result + (hasStarted ? 1 : 0);
        result = 31 * result + expense;
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Engine{");
        sb.append("mileage=").append(mileage);
        sb.append(", hasStarted=").append(hasStarted);
        sb.append(", expense=").append(expense);
        sb.append('}');
        return sb.toString();
    }
}
