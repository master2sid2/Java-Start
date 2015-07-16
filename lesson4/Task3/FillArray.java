package lessons4.task3;

/**
 * Заполнить массив числами от 100 до 0.
 */
import java.util.Arrays;

public class FillArray {
    public static void main(String[] args){

        int[] arr = new int[101];
        int num = 100;

        for(int i = 0; i <= 100; i++){
            arr[i] = num;
            num--;
        }

        System.out.println(Arrays.toString(arr));
    }
}
