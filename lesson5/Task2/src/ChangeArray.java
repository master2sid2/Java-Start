import java.util.Arrays;
import java.util.Random;

/**
 * Created by Master on 7.22.2015.
 */
public class ChangeArray {
    public static void main(String[] args) {

        Random rnd = new Random();
        int rndTmp = 5 + (int) (Math.random() * ((10 - 5) + 1));

        int[] arr = new int[rndTmp];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(10) + 1;
        }
        System.out.println("Созданный массив:");
        System.out.println(Arrays.toString(arr));
        System.out.println("Увелечение первых трёх элементов на 1:");
        System.out.println(tryChange(arr));
    }

    static int tryChange(int[] array) {

        int sum = 0;
        for (int i = 0; i < 3; i++) {
            array[i] = array[i] + 1;
            sum += array[i];
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Сумма первых трёх элементов:");
        return sum;
    }
}
