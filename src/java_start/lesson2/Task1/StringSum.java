package java_start.lesson2.Task1;

import java.util.Scanner;

/**
 * Created by Master on 8.28.2015.
 */
public class StringSum {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Введите первую строку:");
        String s1 = scn.nextLine();
        System.out.println("Введите вторую строку:");
        String s2 = scn.nextLine();
        System.out.println("Введите третью строку:");
        String s3 = scn.nextLine();

        System.out.println("Результат:");
        System.out.println("s1 + s3: " + s1 + s3);
        System.out.println("s3 + s2 + s1: " + s3 + s2 + s1);
        System.out.println("s1 + s2 + s3: " + s1 + s2 + s3);
    }
}
