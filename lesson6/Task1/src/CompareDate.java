import java.util.Date;
import java.util.Scanner;

/**
 * Ввести с консоли дату. Сравнить ее с текущей датой в
 * системе. Вывести отличающиеся части (год, месяц) на
 * экран.
 */
public class CompareDate {
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);

        long ctm = System.currentTimeMillis();
        Date crndt = new Date(ctm);

        System.out.println(crndt);


    }


}
