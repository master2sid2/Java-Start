package lessons4.task1;

/**
 * Вывести на экран числа от 10 до 20 с помощью
 * всех известных циклов.
 */
public class DigitRange {
    public static void  main(String[] args){

        System.out.println("Цыкл for: ");

        for(int i = 10; i <= 20; i++){
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("Цыкл while: ");

        int num = 10;
        while ( num < 21){
            System.out.print(num + " ");
            num++;
        }

        System.out.println();
        System.out.println("Цыкл do while: ");

        num = 10;
        do{
            System.out.print(num + " ");
            num++;
        } while (num < 21);
    }
}
