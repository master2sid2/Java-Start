package Task8;

import java.util.Arrays;
import java.util.Scanner;

/**
 * С помощью консоли пользователь вводит
 * математическое выражение типа “1+33-4*7”. Написать
 * программу для подсчета его значения. Приоритет
 * операций не учитывается.
 */
public class simpleCalc {
    public static void main (String[] args){

        Scanner scn = new Scanner(System.in);
        System.out.println("Введите выражение:");

        String str = scn.nextLine();

        String[] generic = str.split("[+-/*]");
        String[] oper = str.split("\\d+");
        double[] digit = new double[generic.length];

        for(int i = 0; i < generic.length; i++){
            digit[i] = Double.parseDouble(generic[i]);
        }
        double sum = digit[0];
        for(int i = 1; i < oper.length; i++){
            if(oper[i].equals("+")){
                sum += digit[i];
            } else if (oper[i].equals("-")){
                sum -= digit[i];
            } else if (oper[i].equals("*")){
                sum *= digit[i];
            } else if (oper[i].equals("/")){
                sum /= digit[i];
            }
        }
        System.out.println(sum);
    }
}
