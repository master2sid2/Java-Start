package java_start.lesson6.Task6;

import java.util.Scanner;

/**
 * Created by Master on 8.28.2015.
 */
public class CountBin {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Введите целое число:");
        int digit = scn.nextInt();
        count(digit);

    }

    static void count(int x) {
        String bin = Integer.toBinaryString(x);
        int[] array = new int[bin.length()];
        for (int i = 0; i < array.length; i++) {
            array[i] = Character.getNumericValue(bin.charAt(i));
        }
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                count++;
            }
        }
        System.out.println("Количество едениц в бинарном представлении: \n" + bin + " -> " + count);
    }
}
