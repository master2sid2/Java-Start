import java.util.Random;

/**
 * Created by Master on 7.22.2015.
 */
public class LeightToByte {
    public static void main(String[] args){

        Random rnd = new Random();

        int[] arr = new int[rnd.nextInt(10)+1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(10) + 1;
        }
        System.out.println("Длина массива: " + arr.length);
        System.out.println("Длина массива в байтах " + myToByte(arr));
    }

    static int myToByte(int[] array){
        return array.length * 4;
    }
}
