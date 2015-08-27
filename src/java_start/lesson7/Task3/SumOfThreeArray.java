package java_start.lesson7.Task3;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Master on 8.28.2015.
 */
public class SumOfThreeArray {
    public static void main(String[] args) {
        Random rnd = new Random();

        int[] array1 = new int[10];
        int[] array2 = new int[9];
        int[] array3 = new int[8];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = rnd.nextInt(10) + 1;
        }
        for (int i = 0; i < array2.length; i++) {
            array2[i] = rnd.nextInt(10) + 1;
        }
        for (int i = 0; i < array3.length; i++) {
            array3[i] = rnd.nextInt(10) + 1;
        }

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));

        System.out.println(mySum(array1, array2, array3));

    }

    static int mySum(int[] array1, int[] array2, int[] array3) {
        int sum = 0;
        int[][] arrayTmp = {array1, array2, array3};

        for (int[] anArrayTmp : arrayTmp) {
            for (int anAnArrayTmp : anArrayTmp) {
                sum += anAnArrayTmp;
            }
        }
        return sum;
    }
}
