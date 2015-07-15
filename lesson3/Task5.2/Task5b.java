import java.util.Scanner;
import java.util.Random;

public class Task5b {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Random rnd = new Random();
        System.out.println("Для ввода нового массива наберите \"новый массив\" в строке ввода индекса массива!");
        System.out.println("Для выхода из программы наберите \"выход\" в строке ввода размера массива!");
        while (true){
            System.out.println("Введите размер массива:");
            String strExit = scn.nextLine();
            String strExitLowCase = strExit.toLowerCase();
            int num=0;
            if(strExitLowCase.equals("выход")){
                break;
            } else {
                num = Integer.parseInt(strExit);
                int[] arr = new int[num];

                for (int i = 0; i < arr.length; i++) {
                    arr[i] = rnd.nextInt(100) + 1;
                }
                int sizeArr = arr.length;
                while (true) {
                    System.out.println("Введите индекс элемента (от 0 до " + (sizeArr - 1) + "): ");
                    String strNewArr = scn.nextLine();
                    String strNewArrLowCase = strNewArr.toLowerCase();
                    int ind = 0;
                    if (strNewArrLowCase.equals("новый массив")) {
                        break;
                    } else {
                        ind = Integer.parseInt(strNewArr);
                    }
                    if (ind > arr.length - 1) {
                        System.out.println("Индекс не может превышать размер массива!");
                    } else if (ind < arr.length) {
                        System.out.println("Ваш элемент массива под индексом " + ind + " :");
                        System.out.println(arr[ind]);
                    }

                }
            }
        }
    }
}