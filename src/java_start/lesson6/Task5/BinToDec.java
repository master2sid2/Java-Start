package java_start.lesson6.Task5;

import java.util.Scanner;

/**
 * Created by Master on 8.28.2015.
 */
public class BinToDec {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Введите число в бинарном формате");
        String num = scn.nextLine();
        convertBin(num);
    }

    static void convertBin(String x) {
        int y = Integer.parseInt(x, 2);
        System.out.println("\"" + x + "\"" + " -> " + y);
    }
}
