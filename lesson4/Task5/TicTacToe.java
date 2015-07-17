package lessons4.task5;

import java.util.Arrays;
import java.util.Scanner;

/**
 * * Написать игру «Крестики нолики» используя
 * двухмерные массивы.
 */

public class TicTacToe {
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        int finCount = 0;

        System.out.println("Координаты поля");
        printFieldCord();

        char[][] field = new char[3][3];

        char c1 = field[0][0];
        char c2 = field[0][1];
        char c3 = field[0][2];
        char c4 = field[1][0];
        char c5 = field[1][1];
        char c6 = field[1][2];
        char c7 = field[2][0];
        char c8 = field[2][1];
        char c9 = field[2][2];

        fillFieldsNewGame(field);

        for (char[] aField : field) {
            for (int j = 0; j < field.length; j++) {
                Arrays.fill(new int[]{aField[j]}, 0);
                System.out.print(aField[j] + "\t");
            }
            System.out.println();
        }

        int cord;

            boolean x = true;
            while (true) {
                if (x) {
                    System.out.println("Сейчас ход \"х\"");
                    System.out.println("Введите координату точки куда хотите поставить \"x\"");
                    cord = scn.nextInt();

                    if (cord > 9) {
                        System.out.println("Неверный ввод");
                        break;
                    } else {
                        switch (cord) {
                            case 1:
                                if(c1 == 'o'){
                                    System.out.println("Тут занято, сюда ставить нельзя!");
                                    break;
                                } else
                                System.out.println("-------------------------------------------");
                                printFieldCord();
                                System.out.println("-------------------------------------------");
                                field[0][0] = 'x';
                                printField(field);
                                System.out.println("-------------------------------------------");
                                x = !turnX(field[0][0]);
                                break;
                            case 2:
                                if(c2 == 'o'){
                                    System.out.println("Тут занято, сюда ставить нельзя!");
                                    break;
                                } else
                                System.out.println("-------------------------------------------");
                                printFieldCord();
                                System.out.println("-------------------------------------------");
                                field[0][1] = 'x';
                                printField(field);
                                System.out.println("-------------------------------------------");
                                x = !turnX(field[0][1]);
                                break;
                            case 3:
                                if(c3 == 'o'){
                                    System.out.println("Тут занято, сюда ставить нельзя!");
                                    break;
                                } else
                                System.out.println("-------------------------------------------");
                                printFieldCord();
                                System.out.println("-------------------------------------------");
                                field[0][2] = 'x';
                                printField(field);
                                System.out.println("-------------------------------------------");
                                x = !turnX(field[0][2]);
                                break;
                            case 4:
                                if(c4 == 'o'){
                                    System.out.println("Тут занято, сюда ставить нельзя!");
                                    break;
                                } else
                                System.out.println("-------------------------------------------");
                                printFieldCord();
                                System.out.println("-------------------------------------------");
                                field[1][0] = 'x';
                                printField(field);
                                System.out.println("-------------------------------------------");
                                x = !turnX(field[1][0]);
                                break;
                            case 5:
                                if(c5 == 'o'){
                                    System.out.println("Тут занято, сюда ставить нельзя!");
                                    break;
                                } else
                                System.out.println("-------------------------------------------");
                                printFieldCord();
                                System.out.println("-------------------------------------------");
                                field[1][1] = 'x';
                                printField(field);
                                System.out.println("-------------------------------------------");
                                x = !turnX(field[1][1]);
                                break;
                            case 6:
                                if(c6 == 'o'){
                                    System.out.println("Тут занято, сюда ставить нельзя!");
                                    break;
                                } else
                                System.out.println("-------------------------------------------");
                                printFieldCord();
                                System.out.println("-------------------------------------------");
                                field[1][2] = 'x';
                                printField(field);
                                System.out.println("-------------------------------------------");
                                x = !turnX(field[1][2]);
                                break;
                            case 7:
                                if(c7 == 'o'){
                                    System.out.println("Тут занято, сюда ставить нельзя!");
                                    break;
                                } else
                                System.out.println("-------------------------------------------");
                                printFieldCord();
                                System.out.println("-------------------------------------------");
                                field[2][0] = 'x';
                                printField(field);
                                System.out.println("-------------------------------------------");
                                x = !turnX(field[2][0]);
                                break;
                            case 8:
                                if(c8 == 'o'){
                                    System.out.println("Тут занято, сюда ставить нельзя!");
                                    break;
                                } else
                                System.out.println("-------------------------------------------");
                                printFieldCord();
                                System.out.println("-------------------------------------------");
                                field[2][1] = 'x';
                                printField(field);
                                System.out.println("-------------------------------------------");
                                x = !turnX(field[2][1]);
                                break;
                            case 9:
                                if(c9 == 'o'){
                                    System.out.println("Тут занято, сюда ставить нельзя!");
                                    break;
                                } else
                                System.out.println("-------------------------------------------");
                                printFieldCord();
                                System.out.println("-------------------------------------------");
                                field[2][2] = 'x';
                                printField(field);
                                System.out.println("-------------------------------------------");
                                x = !turnX(field[2][2]);
                                break;
                            default:
                                System.out.println("0_o");
                                break;
                        }
                    }
                } else if (!x) {
                    System.out.println("Сейчас ход \"o\"");
                    System.out.println("Введите координату точки куда хотите поставить \"o\"");
                    cord = scn.nextInt();

                    if (cord > 9) {
                        System.out.println("Неверный ввод");
                        break;
                    } else {
                        switch (cord) {
                            case 1:
                                if(c1 == 'x'){
                                    System.out.println("Тут занято, сюда ставить нельзя!");
                                    break;
                                } else
                                System.out.println("-------------------------------------------");
                                printFieldCord();
                                System.out.println("-------------------------------------------");
                                field[0][0] = 'o';
                                printField(field);
                                System.out.println("-------------------------------------------");
                                x = !turnX(field[0][0]);
                                break;
                            case 2:
                                if(c2 == 'x'){
                                    System.out.println("Тут занято, сюда ставить нельзя!");
                                    break;
                                } else
                                System.out.println("-------------------------------------------");
                                printFieldCord();
                                System.out.println("-------------------------------------------");
                                field[0][1] = 'o';
                                printField(field);
                                System.out.println("-------------------------------------------");
                                x = !turnX(field[0][1]);
                                break;
                            case 3:
                                if(c3 == 'x'){
                                    System.out.println("Тут занято, сюда ставить нельзя!");
                                    break;
                                } else
                                System.out.println("-------------------------------------------");
                                printFieldCord();
                                System.out.println("-------------------------------------------");
                                field[0][2] = 'o';
                                printField(field);
                                System.out.println("-------------------------------------------");
                                x = !turnX(field[0][2]);
                                break;
                            case 4:
                                if(c4 == 'x'){
                                    System.out.println("Тут занято, сюда ставить нельзя!");
                                    break;
                                } else
                                System.out.println("-------------------------------------------");
                                printFieldCord();
                                System.out.println("-------------------------------------------");
                                field[1][0] = 'o';
                                printField(field);
                                System.out.println("-------------------------------------------");
                                x = !turnX(field[1][0]);
                                break;
                            case 5:
                                if(c5 == 'x'){
                                    System.out.println("Тут занято, сюда ставить нельзя!");
                                    break;
                                } else
                                System.out.println("-------------------------------------------");
                                printFieldCord();
                                System.out.println("-------------------------------------------");
                                field[1][1] = 'o';
                                printField(field);
                                System.out.println("-------------------------------------------");
                                x = !turnX(field[1][1]);
                                break;
                            case 6:
                                if(c6 == 'x'){
                                    System.out.println("Тут занято, сюда ставить нельзя!");
                                    break;
                                } else
                                System.out.println("-------------------------------------------");
                                printFieldCord();
                                System.out.println("-------------------------------------------");
                                field[1][2] = 'o';
                                printField(field);
                                System.out.println("-------------------------------------------");
                                x = !turnX(field[1][2]);
                                break;
                            case 7:
                                if(c7 == 'x'){
                                    System.out.println("Тут занято, сюда ставить нельзя!");
                                    break;
                                } else
                                System.out.println("-------------------------------------------");
                                printFieldCord();
                                System.out.println("-------------------------------------------");
                                field[2][0] = 'o';
                                printField(field);
                                System.out.println("-------------------------------------------");
                                x = !turnX(field[2][0]);
                                break;
                            case 8:
                                if(c8 == 'x'){
                                    System.out.println("Тут занято, сюда ставить нельзя!");
                                    break;
                                } else
                                System.out.println("-------------------------------------------");
                                printFieldCord();
                                System.out.println("-------------------------------------------");
                                field[2][1] = 'o';
                                printField(field);
                                System.out.println("-------------------------------------------");
                                x = !turnX(field[2][1]);
                                break;
                            case 9:
                                if(c9 == 'x'){
                                    System.out.println("Тут занято, сюда ставить нельзя!");
                                    break;
                                } else
                                System.out.println("-------------------------------------------");
                                printFieldCord();
                                System.out.println("-------------------------------------------");
                                field[2][2] = 'o';
                                printField(field);
                                System.out.println("-------------------------------------------");
                                x = !turnX(field[2][2]);
                                break;
                            default:
                                System.out.println("0_o");
                                break;
                        }
                    }
                }
                finCount++;
                if (winGameX(field)){
                    System.out.println("Победил X");
                    break;
                } else if (winGameO(field)){
                    System.out.println("Победил O");
                    break;
                }
            }    }

    public static void fillFieldsNewGame(char[][] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
               array[i][j] = '.';
            }
        }
    }

    public static int[][] printFieldCord(){
        int[][] array = new int[3][3];

        array[0][0] = 1;
        array[0][1] = 2;
        array[0][2] = 3;
        array[1][0] = 4;
        array[1][1] = 5;
        array[1][2] = 6;
        array[2][0] = 7;
        array[2][1] = 8;
        array[2][2] = 9;

        for (int[] anArray : array) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(anArray[j] + "\t");
            }
            System.out.println();
        }

        return array;
    }

    public static void printField(char[][] array){
        for (char[] anArray : array) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(anArray[j] + "\t");            }
            System.out.println();
        }

    }

    public static boolean turnX(char c){
        boolean checkTrun;
        if(c == 'x')
            checkTrun = true;
        else
            checkTrun = false;
        return checkTrun;
    }


    public static boolean winGameX(char[][] array){

        boolean winStatus;

        char c1 = array[0][0];
        char c2 = array[0][1];
        char c3 = array[0][2];
        char c4 = array[1][0];
        char c5 = array[1][1];
        char c6 = array[1][2];
        char c7 = array[2][0];
        char c8 = array[2][1];
        char c9 = array[2][2];

        if(c1 == 'x' && c2=='x' && c3=='x'){
                    winStatus = true;
        } else if (c4 == 'x' && c5=='x' && c6=='x'){
                    winStatus = true;
        } else if (c7 == 'x' && c8=='x' && c9=='x'){
            winStatus = true;
        } else if (c1 == 'x' && c4=='x' && c7=='x'){
            winStatus = true;
        } else if (c2=='x' && c5=='x' && c8=='x'){
            winStatus = true;
        } else if (c3=='x' && c6=='x' && c9=='x'){
            winStatus = true;
        } else if (c1=='x' && c5=='x' && c9=='x'){
            winStatus = true;
        } else if (c3=='x' && c5=='x' && c7=='x'){
            winStatus = true;
        } else
        winStatus=false;

        return winStatus;
    }

    public static boolean winGameO(char[][] array){

        boolean winStatus;
        char c1 = array[0][0];
        char c2 = array[0][1];
        char c3 = array[0][2];
        char c4 = array[1][0];
        char c5 = array[1][1];
        char c6 = array[1][2];
        char c7 = array[2][0];
        char c8 = array[2][1];
        char c9 = array[2][2];
        if(c1 == 'o' && c2=='o' && c3=='o'){
            winStatus = true;
        } else if (c4 == 'o' && c5=='o' && c6=='o'){
            winStatus = true;
        } else if (c7 == 'o' && c8=='o' && c9=='o'){
            winStatus = true;
        } else if (c1 == 'o' && c4=='o' && c7=='o'){
            winStatus = true;
        } else if (c2=='o' && c5=='o' && c8=='o'){
            winStatus = true;
        } else if (c3=='o' && c6=='o' && c9=='o'){
            winStatus = true;
        } else if (c1=='o' && c5=='o' && c9=='o'){
            winStatus = true;
        } else if (c3=='o' && c5=='o' && c7=='o'){
            winStatus = true;
        } else
            winStatus=false;

        return winStatus;
    }
}
