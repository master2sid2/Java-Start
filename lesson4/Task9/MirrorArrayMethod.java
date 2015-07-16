package lessons4.task9;

import java.util.Arrays;
import java.util.Random;

/**
 * Написать метод для зеркального переворота
 * элементов в массиве ([1, 2, 3, 4] -> [4, 3, 2, 1]).
 */

public class MirrorArrayMethod {

    public static void main(String[] args){

//        Random rnd = new Random();
        int[] arr = {1,2,3,4};

//        for(int i = 0; i < arr.length; i++){
//            arr[i] = rnd.nextInt(100)+1;
//        }

        System.out.println("Полученный массив");
        System.out.println(Arrays.toString(arr));
        System.out.println("Перевёрнутый масив");
        System.out.println(Arrays.toString(mirrorArray(arr)));
    }

    public static int[] mirrorArray(int[] array){

        for(int i = 0; i < array.length>>1; i++) {
            int arrSize = array[array.length - i - 1];
            array[array.length - i - 1] = array[i];
            array[i] = arrSize;
        }

        return array;
    }
}
