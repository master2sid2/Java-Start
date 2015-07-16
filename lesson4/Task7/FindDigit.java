package lessons4.task7;

import java.util.Arrays;
import java.util.Random;

/**
 * Найти в массиве число, которое повторяется
 * наибольшее количество раз. Не использовать
 * коллекции.
 */

public class FindDigit {
    public static void main(String[] args){

        Random rnd = new Random();
        int[] arr = new int[12];
        int[] arr2 = new int[12];

        for(int i = 0; i < arr.length; i++){
            arr[i] = rnd.nextInt(5)+1;
        }

        int num;
        int count = 0;

        for(int i = 0; i < arr.length; i++){
            num = arr[i];
            for(int j = 0; j < arr.length; j++){
                if(num == arr[j]){
                    count++;
                }
            }
            arr2[i] = count;
            count = 0;
        }

        int max = arr2[0];
        int maxInd = 0;
        for(int i = 0; i < arr2.length; i++){
            if(max < arr2[i]){
                max = arr2[i];
                maxInd = i;
            }
        }

        System.out.println("Полученный массив: \n" + Arrays.toString(arr));
        System.out.println("Наибольшое количество раз, повторяется число " + arr[maxInd] + ".\n" +
                "Оно потворяется " + max + " раз.");
    }
}
