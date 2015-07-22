import java.text.SimpleDateFormat;
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
        Date crndt = new Date(System.currentTimeMillis());
        SimpleDateFormat newDateFormat = new SimpleDateFormat("yyyy-MM-dd");

        String printDate = newDateFormat.format(crndt);

        System.out.println(printDate);


    }


}
