import java.util.Scanner;

/**
 * Created by Master on 7.22.2015.
 */
public class AtachLine {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите строку:");
        String s = scn.nextLine();
        System.out.println("Введите целое число:");

        int y=0; float z=0;

        try { y = scn.nextInt();
        } catch (Exception e){
            System.out.println("Вы ввели строку");
        }
        System.out.println("Введите число с плавающей точкой:");

        try { z = scn.nextFloat();
        } catch (Exception e){
            System.out.println("Вы ввели строку");
        }
        myAtach(s,y,z);
    }

    static void myAtach(String x,int y, float z){
        System.out.println("S = " + x + "+" + y + "+" + z);
    }
}
