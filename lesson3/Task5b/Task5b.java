import java.util.Scanner;
import java.util.Random;

public class ArrayIndex {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Random rnd = new Random();
        System.out.println("Для ввода нового массива наберите \"new array\" в строке ввода индекса массива!");
        System.out.println("Для выхода из программы наберите \"exit\" в строке ввода размера массива!");
        while (true) {
            System.out.println("Введите размер массива:");
            String strExit = scn.nextLine();
            String strExitLowCase = strExit.toLowerCase();
            int num = 0;
            if (strExitLowCase.equals("exit")) {
                break;
            } else if (!strExitLowCase.equals("exit")) {
                try {
                    num = Integer.parseInt(strExit);
                    if (num < 0) {
                        try {
                            int[] arr = new int[num];
                        } catch (NegativeArraySizeException e) {
                            System.out.println("Размер массива не может быть отрецательным или равен 0");
                            continue;
                        }
                    } else if (num == 0) {
                        System.out.println("Размер массива не может быть отрецательным или равен 0");
                        continue;
                    }
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
                        if (strNewArrLowCase.equals("new array")) {
                            break;
                        } else if (!strNewArrLowCase.equals("new array")) {
                            try {
                                ind = Integer.parseInt(strNewArr);
                                if(ind < 0){
                                    System.out.println("Индекс массива не может быть отрецательным");
                                } else
                                if (ind > arr.length - 1) {
                                    System.out.println("Индекс не может превышать размер массива!");
                                } else if (ind < arr.length) {
                                    System.out.println("Ваш элемент массива под индексом " + ind + " :");
                                    System.out.println(arr[ind]);
                                }
                            } catch (NumberFormatException e) {
                                System.out.println("Неизвестная комманда, повторите ввод!");
                            }
                        }
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Неизвестная комманда, повторите ввод!");
                }
            }
        }

    }
}
