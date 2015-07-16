package lessons4.task10;

import java.util.Arrays;
import java.util.Random;

/**
 * Написать метод, который заполнит массив
 * произвольного размера числами по возрастанию,
 * начиная с центра массива, например,
 * [5,4,3,2,1,0,1,2,3,4,5].
 */
public class FillArrayBy {
    public static void main(String[] args){

        Random rnd = new Random();

        int[] arr = new int[rnd.nextInt(10)+1];

        System.out.println("Размер массива: " + arr.length);
        System.out.println("Заполнение массива методом начиная с центра");
        (FillArrayByUp(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void FillArrayByUp(int[] array){

        int mid = array.length / 2;
        int num = 1;

        for(int i = 0; i < mid; i++){
            array[mid - i - 1] = num;
            if(array.length%2!=0){
                array[mid + i + 1] = num;
            } else
                array[mid + i] = num;
            num++;
        }
    }
}
