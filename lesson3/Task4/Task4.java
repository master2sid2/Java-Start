import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args){
        Random rnd = new Random();
        Random rnd2 = new Random();
        int num = rnd2.nextInt(15);
        int[] arr = new int[num];
        for(int i = 0; i < arr.length; i++){
            arr[i] = rnd.nextInt(100)+1;
        }
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        int arrSize = arr.length;
        System.out.println("Размер массива: " + arrSize);
        System.out.println("Массив: " + Arrays.toString(arr));
        System.out.println("Сумма всех элементов массива равно: " + sum);
        System.out.println("Среднее арифметическое элементов массива равно: " + (sum / num));
    }
}