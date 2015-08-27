package java_start.lesson3.Task1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Master on 8.28.2015.
 */
public class ArrayOperation {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(100) + 1;
        }
        System.out.println("Созданный массив: ");
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.print("]\n");
        Arrays.sort(arr);
        System.out.println("Отсортирован массив:");
        System.out.println(Arrays.toString(arr));

        System.out.println("Сейчас необходимо вручную ввести элементы массива:");

        Scanner scn = new Scanner(System.in);
        int[] arr2 = new int[10];
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Элемент №" + (i + 1));
            int num = Integer.parseInt(scn.nextLine());
            arr2[i] = num;
        }
        System.out.println("Созданный массив: ");
        System.out.print("[ ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + ", ");
        }
        System.out.print("]\n");
        Arrays.sort(arr2);
        System.out.println("Отсортирован массив:");
        System.out.println(Arrays.toString(arr2));
    }
}
