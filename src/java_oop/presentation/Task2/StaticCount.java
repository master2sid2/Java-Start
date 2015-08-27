package java_oop.presentation.Task2;

/**
 * Created by Master on 8.7.2015.
 */
public class StaticCount {

    private static int count = 0;

    public StaticCount(){
        count++;
    }

    public static int getCount() {
        return count;
    }
}
