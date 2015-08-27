package java_start.lesson2.Task2;

import java.util.Scanner;

/**
 * Created by Master on 8.28.2015.
 */
public class MathOperation {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Введите первое число:");
        int a = Integer.parseInt(scn.nextLine());
        System.out.println("Введите второе число:");
        int b = Integer.parseInt(scn.nextLine());

        System.out.println("Результаты выполнения операций:");
        System.out.println("num1 + num2: " + (a + b));
        System.out.println("num1 - num2: " + (a - b));
        System.out.println("num1 * num2: " + (a * b));
        System.out.println("num1 / num2: " + (a / b));
        System.out.println("Деление по модулю: " + (a % b));
        System.out.println("Инкремент: " + (a++ - b));
        System.out.println("Декремент: " + (a-- + b));
    }
}
