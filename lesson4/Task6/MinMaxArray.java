package lessons4.task6;

import java.util.Arrays;
import java.util.Random;

/**
 * Найти в массиве чисел элементы с наибольшим и
 * наименьшим значениями.
 */
public class MinMaxArray {

    public static void main(String[] args){

        Random rnd = new Random();
        int[] arr = new int[rnd.nextInt(30)+1];

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