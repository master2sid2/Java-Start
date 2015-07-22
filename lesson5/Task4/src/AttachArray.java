import java.util.Arrays;
import java.util.Random;

/**
 * Created by Master on 7.22.2015.
 */
public class AttachArray {
    public static void main(String[] args){

        Random rnd = new Random();
        int[] array = new int[5];
        int[] attachArray = new int[3];

        for(int i = 0; i < array.length; i++){
            array[i] = rnd.nextInt(10)+1;
        }
        for(int i = 0; i < attachArray.length; i++){
            attachArray[i] = rnd.nextInt(10)+1;
        }
        myAttachArray(array,attachArray);
        System.out.println("Длина первого массива: " + array.length);
        System.out.println("Массив: " + Arrays.toString(array));
        System.out.println("Длина второго массива: " + attachArray.length);
        System.out.println("Массив: " + Arrays.toString(attachArray));
        System.out.println("объединённые массивы: " + Arrays.toString(myAttachArray(array,attachArray)));
    }

    static int[] myAttachArray(int[] array, int[] attachArray){

        int[] tmpArray = new int[array.length + attachArray.length];

        System.arraycopy(array,0,tmpArray,0,array.length);
        System.arraycopy(attachArray,0,tmpArray,array.length,attachArray.length);

        return tmpArray;
    }
}
