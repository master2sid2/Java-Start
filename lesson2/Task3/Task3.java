import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Введите первое число:");
        int a = Integer.parseInt(scn.nextLine());
        System.out.println("Введите второе число:");
        int b = Integer.parseInt(scn.nextLine());

        System.out.println("Результаты выполнения операций:");
        System.out.println("a + b: " + a + b);
        System.out.println("a - b: " + (a - b));
        System.out.println("a * b: " + (a * b));
        try{
            double div = a/b;
            System.out.println("a / b: " + (float)div);
        }
        catch (ArithmeticException e){
            System.out.println("Деление на 0 невозможно");
        }
        try{
            System.out.println("Деление по модулю: " + (a % b));
        }
        catch (ArithmeticException e){
            System.out.println("Деление на 0 невозможно");
        }
        System.out.println("Инкремент: " + (a ++-b));
        System.out.println("Декремент: " + (a --+b));
    }
}