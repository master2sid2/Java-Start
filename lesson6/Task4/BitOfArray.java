import java.util.*;

/**
 * Написать код, который позволит менять и читать значения
 * произвольных битов в массиве int-ов.
 **/

public class BitOfArray {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        Random rnd = new Random();
        int[] arr = new int[rnd.nextInt(10)+1];
        for(int i = 0; i < arr.length; i++){
            arr[i] = rnd.nextInt(10)+1;
        }
        while (true){
            System.out.println("Выберете оперцию которую хотете совершить:" + "\n" + "1 - Прочитать бит.\n" + "2 - Записать бит.");
            int act;
            act = scn.nextInt();
            while (act < 1 || act > 2 ){
                System.out.println("Неверный ввод");
                act = scn.nextInt();
            }
            if(act==1){
             readBit(arr);
            } else {
                setBit(arr);
            }
        }
    }

    static void readBit(int[] array){
        Scanner scn = new Scanner(System.in);
        System.out.println(Arrays.toString(array));
        System.out.println("Выберете № элемента в котором хотите прочитать бит\n" + "от 0 до " + (array.length-1) + ".");
        int number = scn.nextInt();
        while (number < 0 || number > array.length-1){
            System.out.println("Неверный ввод");
            number = scn.nextInt();
        }
        System.out.println("Выберете № бита который хотите прочитать от 0 до 31");
        System.out.println("Биты выводятся с право на лево:");
        int bit = scn.nextInt();
        while (number < 0 || number > 31){
            System.out.println("Неверный ввод");
            bit = scn.nextInt();
        }
        boolean prnBit = ((array[number] & (1 << bit)) !=0);
        if (!prnBit){
            System.out.println("Бит = 0");
        } else
            System.out.println("Бит = 1");
    }

    static void setBit(int[] array){
        Scanner scn = new Scanner(System.in);
        System.out.println(Arrays.toString(array));
        System.out.println("Выберете № элемента в котором хотите Заменить бит\n" + "от 0 до " + (array.length-1) + ".");
        int number = scn.nextInt();
        while (number < 0 || number > array.length-1){
            System.out.println("Неверный ввод");
            number = scn.nextInt();
        }
        System.out.println(String.format("%32s", Integer.toBinaryString(array[number])).replace(' ', '0'));
        System.out.println("Выберете № бита который хотите заменить от 0 до 31");
        System.out.println("Биты выводятся с право на лево:");
        int bit = scn.nextInt();
        while (bit < 0 || bit > 31){
            System.out.println("Неверный ввод");
            bit = scn.nextInt();
        }
        System.out.println("Введите бит для замены");
        int chnBit = scn.nextInt();
        while (chnBit < 0 || chnBit > 1){
            System.out.println("Неверный ввод");
            chnBit = scn.nextInt();
        }
        if (chnBit == 1)
            array[number] = array[number] | (1 << bit);
        else
            array[number] = array[number] &~ (1 << bit);
        System.out.println(String.format("%32s", Integer.toBinaryString(array[number])).replace(' ', '0'));
        System.out.println("Массив после измененния бита");
        System.out.println(Arrays.toString(array));
    }
}