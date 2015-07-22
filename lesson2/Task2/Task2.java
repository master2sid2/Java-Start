import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){

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
        System.out.println("Инкремент: " + (a++-b));
        System.out.println("Декремент: " + (a--+b));
    }
}
