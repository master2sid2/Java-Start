package java_start.lesson4.Task4;

import java.util.Arrays;
import java.util.Random;

/**
 * Дано массив из 10 целых чисел. Вывести на экран
 * сумму всех его элементов кроме первого и
 * последнего.
 */
public class SumOfArray {
    public static void main(String[] args) {

        Random rnd = new Random();
        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = rnd.nextInt(100) + 1;
        }

        System.out.println("Массив: ");
        System.out.println(Arrays.toString(arr));

        int sum = 0;
        for (int i = 1; i <= arr.length - 2; i++) {
            sum += arr[i];
        }

        System.out.println("Сума элементов массива кроме первого и последнего: ");
        System.out.println(sum);

        int digit;
        String str = "";
        for (int i = 1; i <= arr.length - 2; i++) {
            digit = arr[i];
            str += digit + " ";
        }

        System.out.println("Элементы которые суммировались: ");
        System.out.println(str);
    }
}
