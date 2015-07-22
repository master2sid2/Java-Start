import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.LongSummaryStatistics;
import java.util.Scanner;

/**
 * Ввести с консоли дату. Сравнить ее с текущей датой в
 * системе. Вывести отличающиеся части (год, месяц) на
 * экран.
 */
public class MyCompareDate {
    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        Date currentDate = new Date(System.currentTimeMillis());
        SimpleDateFormat myFormat = new SimpleDateFormat("dd.MM.yyyy");
        System.out.println("Введите дату в формате dd.MM.yyyy");
        String uDateStr = scn.nextLine();
        Date newDate = null;
        try{
            newDate = myFormat.parse(uDateStr);
        } catch (ParseException e) {
            System.out.println("Неверный формат даты!");
        }

        compareDate(currentDate,newDate);
    }

    static void compareDate(Date currDate, Date newDate){
        Calendar currCal = Calendar.getInstance();
        Calendar newCal = Calendar.getInstance();
        currCal.setTime(currDate);
        newCal.setTime(newDate);
        if(currCal!=newCal){
            System.out.println("Текущее число: " + currCal.get(Calendar.DAY_OF_MONTH) + "\n"
                    + "введённое число: " + newCal.get(Calendar.DAY_OF_MONTH));
            System.out.println("Текущий месяц: " + currCal.get(Calendar.MONTH) + "\n"
                    + "введённый месяц: " + newCal.get(Calendar.MONTH));
            System.out.println("Текущий год: " + currCal.get(Calendar.YEAR) + "\n"
                    + "введённый год: " + newCal.get(Calendar.YEAR));
        } else if (currDate.equals(newDate)){
            System.out.println("Даты одинаковы");
            System.out.println("Текущяя дата: " + currDate);
            System.out.println("Введённая дата: " + newDate);
        }
    }
}
