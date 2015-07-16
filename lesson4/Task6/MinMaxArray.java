package lessons4.task6;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.Arrays;
import java.util.Random;

/**
 * Найти в массиве чисел элементы с наибольшим и
 * наименьшим значениями.
 */
public class MinMaxArray {

    public static void main(String[] args){

        Random rnd = new Random();

        int[] arr = new int[10];

        for(int i = 0; i < arr.length; i++){

            arr[i] = rnd.nextInt(100)+1;

        }

        System.out.println("Сгенерированый масив: ");
        System.out.println(Arrays.toString(arr));

        int min = arr[0];
        int minInd = 0;
        int max = arr[0];
        int maxInd = 0;

        for(int i = 0; i < arr.length; i++){

            if(min > arr[i]){

                min = arr[i];
                minInd = i;

            }

            if(max < arr[i]){

                max = arr[i];
                maxInd = i;

            }
        }

        System.out.println("Минимальный элемент массива " + min + " находится по индексу " + minInd);
        System.out.println("Максемальный элемент массива " + max + " находится по индексу " + maxInd);

    }
}