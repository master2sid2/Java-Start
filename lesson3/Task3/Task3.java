import java.util.Scanner;
import java.util.Arrays;

public class Task3 {
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Введите 10 элементов массива:");
        for(int i = 0; i < arr.length; i++){
            System.out.println("Элемент №" + (i+1));
            int num = Integer.parseInt(scn.nextLine());
            arr[i] = num;
        }
        int[] arr2 = Arrays.copyOfRange(arr, 0, 5);
        int[] arr3 = Arrays.copyOfRange(arr, 5, 10);
        System.out.println("Введённый массив: " + Arrays.toString(arr));
        System.out.println("Первая половинка: " + Arrays.toString(arr2));
        System.out.println("Вторая половинка: " + Arrays.toString(arr3));
        Arrays.sort(arr2);
        Arrays.sort(arr3);
        System.out.println("Первая половинка (отсортирован): " + Arrays.toString(arr2));
        System.out.println("Вторая половинка (отсортирован): " + Arrays.toString(arr3));
    }
}