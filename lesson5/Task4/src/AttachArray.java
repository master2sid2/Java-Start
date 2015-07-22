import java.util.Arrays;
import java.util.Random;

/**
 * Created by Master on 7.22.2015.
 */
public class AttachArray {
    public static void main(String[] args){

        Random rnd = new Random();
        int[] array = new int[rnd.nextInt(10)+1];
        int[] attachArray = new int[rnd.nextInt(10)+1];

        fillArray(array);
        fillArray(attachArray);

        myAttachArray(array,attachArray);
        System.out.println("Длина первого массива: " + array.length);
        System.out.println("Массив: " + Arrays.toString(array));
        System.out.println("Длина второго массива: " + attachArray.length);
        System.out.println("Массив: " + Arrays.toString(attachArray));
        System.out.println("Длина объеденнёного массива: " + myAttachArray(array,attachArray).length);
        System.out.println("объединённые массивы: " + Arrays.toString(myAttachArray(array,attachArray)));
    }

    static void fillArray(int[] array){
        Random rnd = new Random();
        for(int i = 0; i < array.length; i++){
            array[i] = rnd.nextInt(10)+1;
        }
    }

    static int[] myAttachArray(int[] array, int[] attachArray) {

        int[] tmpArray = new int[array.length + attachArray.length];

        System.arraycopy(array,0,tmpArray,0,array.length);
        System.arraycopy(attachArray,0,tmpArray,array.length,attachArray.length);

        return tmpArray;
    }
}
