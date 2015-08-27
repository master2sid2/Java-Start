package java_start.lesson3.Task2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Master on 8.28.2015.
 */
public class ArraySwap {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Random rnd = new Random();
        System.out.println("Укажите размер массива:");
        int num = Integer.parseInt(scn.nextLine());
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(100) + 1;
        }
        System.out.println("Созданный массив:");
        System.out.println(Arrays.toString(arr));
        int min = arr[0];
        int max = arr[num - 1];
        System.out.println("Поменять первый и последний элемент местами:");
        arr[0] = max;
        arr[num - 1] = min;
        System.out.println(Arrays.toString(arr));
    }
}
