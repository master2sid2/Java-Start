package Task5;

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
        System.out.println("-------------------");
        printFieldCord();
        System.out.println("-------------------");

        char[][] field = new char[3][3];

        fillFieldsNewGame(field);

        for (char[] aField : field) {
            for (int j = 0; j < field.length; j++) {
                Arrays.fill(new int[]{aField[j]}, 0);
                System.out.print(aField[j] + "\t");
            }
            System.out.println();
        }
        System.out.println("-------------------");

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
                            if(field[0][0] == 'o'){
                                System.out.println("Тут занято, сюда ставить нельзя!");
                                break;
                            } else if(field[0][0] == 'x'){
                                System.out.println("Тут занято, сюда ставить нельзя!");
                                break;
                            } else
                                System.out.println("-------------------");
                            printFieldCord();
                            System.out.println("-------------------");
                            field[0][0] = 'x';
                            printField(field);
                            System.out.println("-------------------");
                            x = !turnX(field[0][0]);
                            finCount++;
                            break;
                        case 2:
                            if(field[0][1] == 'o'){
                                System.out.println("Тут занято, сюда ставить нельзя!");
                                break;
                            } else if(field[0][1] == 'x'){
                                System.out.println("Тут занято, сюда ставить нельзя!");
                                break;
                            } else
                                System.out.println("-------------------");
                            printFieldCord();
                            System.out.println("-------------------");
                            field[0][1] = 'x';
                            printField(field);
                            System.out.println("-------------------");
                            x = !turnX(field[0][1]);
                            finCount++;
                            break;
                        case 3:
                            if(field[0][2] == 'o'){
                                System.out.println("Тут занято, сюда ставить нельзя!");
                                break;
                            } else if(field[0][2] == 'x'){
                                System.out.println("Тут занято, сюда ставить нельзя!");
                                break;
                            } else
                                System.out.println("-------------------");
                            printFieldCord();
                            System.out.println("-------------------");
                            field[0][2] = 'x';
                            printField(field);
                            System.out.println("-------------------");
                            x = !turnX(field[0][2]);
                            finCount++;
                            break;
                        case 4:
                            if(field[1][0] == 'o'){
                                System.out.println("Тут занято, сюда ставить нельзя!");
                                break;
                            } else if(field[1][0] == 'x'){
                                System.out.println("Тут занято, сюда ставить нельзя!");
                                break;
                            } else
                                System.out.println("-------------------");
                            printFieldCord();
                            System.out.println("-------------------");
                            field[1][0] = 'x';
                            printField(field);
                            System.out.println("-------------------");
                            x = !turnX(field[1][0]);
                            finCount++;
                            break;
                        case 5:
                            if(field[1][1] == 'o'){
                                System.out.println("Тут занято, сюда ставить нельзя!");
                                break;
                            } else if(field[1][1] == 'x'){
                                System.out.println("Тут занято, сюда ставить нельзя!");
                                break;
                            } else
                                System.out.println("-------------------");
                            printFieldCord();
                            System.out.println("-------------------");
                            field[1][1] = 'x';
                            printField(field);
                            System.out.println("-------------------");
                            x = !turnX(field[1][1]);
                            finCount++;
                            break;
                        case 6:
                            if(field[1][2] == 'o'){
                                System.out.println("Тут занято, сюда ставить нельзя!");
                                break;
                            } else if(field[1][2] == 'x'){
                                System.out.println("Тут занято, сюда ставить нельзя!");
                                break;
                            } else
                                System.out.println("-------------------");
                            printFieldCord();
                            System.out.println("-------------------");
                            field[1][2] = 'x';
                            printField(field);
                            System.out.println("-------------------");
                            x = !turnX(field[1][2]);
                            finCount++;
                            break;
                        case 7:
                            if(field[2][0] == 'o'){
                                System.out.println("Тут занято, сюда ставить нельзя!");
                                break;
                            } else if(field[2][0] == 'x'){
                                System.out.println("Тут занято, сюда ставить нельзя!");
                                break;
                            } else
                                System.out.println("-------------------");
                            printFieldCord();
                            System.out.println("-------------------");
                            field[2][0] = 'x';
                            printField(field);
                            System.out.println("-------------------");
                            x = !turnX(field[2][0]);
                            finCount++;
                            break;
                        case 8:
                            if(field[2][1] == 'o'){
                                System.out.println("Тут занято, сюда ставить нельзя!");
                                break;
                            } else if(field[2][1] == 'x'){
                                System.out.println("Тут занято, сюда ставить нельзя!");
                                break;
                            } else
                                System.out.println("-------------------");
                            printFieldCord();
                            System.out.println("-------------------");
                            field[2][1] = 'x';
                            printField(field);
                            System.out.println("-------------------");
                            x = !turnX(field[2][1]);
                            finCount++;
                            break;
                        case 9:
                            if(field[2][2] == 'o'){
                                System.out.println("Тут занято, сюда ставить нельзя!");
                                break;
                            } else if(field[2][2] == 'x'){
                                System.out.println("Тут занято, сюда ставить нельзя!");
                                break;
                            } else
                                System.out.println("-------------------");
                            printFieldCord();
                            System.out.println("-------------------");
                            field[2][2] = 'x';
                            printField(field);
                            System.out.println("-------------------");
                            x = !turnX(field[2][2]);
                            finCount++;
                            break;
                        default:
                            System.out.println("0_o");
                            break;
                    }
                }
            } else {
                System.out.println("Сейчас ход \"o\"");
                System.out.println("Введите координату точки куда хотите поставить \"o\"");
                cord = scn.nextInt();

                if (cord > 9) {
                    System.out.println("Неверный ввод");
                    break;
                } else {
                    switch (cord) {
                        case 1:
                            if(field[0][0] == 'x'){
                                System.out.println("Тут занято, сюда ставить нельзя!");
                                break;
                            } else if(field[0][0] == 'o'){
                                System.out.println("Тут занято, сюда ставить нельзя!");
                                break;
                            } else
                                System.out.println("-------------------");
                            printFieldCord();
                            System.out.println("-------------------");
                            field[0][0] = 'o';
                            printField(field);
                            System.out.println("-------------------");
                            x = !turnX(field[0][0]);
                            finCount++;
                            break;
                        case 2:
                            if(field[0][1] == 'x'){
                                System.out.println("Тут занято, сюда ставить нельзя!");
                                break;
                            } else if(field[0][1] == 'o'){
                                System.out.println("Тут занято, сюда ставить нельзя!");
                                break;
                            } else
                                System.out.println("-------------------");
                            printFieldCord();
                            System.out.println("-------------------");
                            field[0][1] = 'o';
                            printField(field);
                            System.out.println("-------------------");
                            x = !turnX(field[0][1]);
                            finCount++;
                            break;
                        case 3:
                            if(field[0][2] == 'x'){
                                System.out.println("Тут занято, сюда ставить нельзя!");
                                break;
                            } else if(field[0][2] == 'o'){
                                System.out.println("Тут занято, сюда ставить нельзя!");
                                break;
                            } else
                                System.out.println("-------------------");
                            printFieldCord();
                            System.out.println("-------------------");
                            field[0][2] = 'o';
                            printField(field);
                            System.out.println("-------------------");
                            x = !turnX(field[0][2]);
                            finCount++;
                            break;
                        case 4:
                            if(field[1][0] == 'x'){
                                System.out.println("Тут занято, сюда ставить нельзя!");
                                break;
                            } else if(field[1][0] == 'o'){
                                System.out.println("Тут занято, сюда ставить нельзя!");
                                break;
                            } else
                                System.out.println("-------------------");
                            printFieldCord();
                            System.out.println("-------------------");
                            field[1][0] = 'o';
                            printField(field);
                            System.out.println("-------------------");
                            x = !turnX(field[1][0]);
                            finCount++;
                            break;
                        case 5:
                            if(field[1][1] == 'x'){
                                System.out.println("Тут занято, сюда ставить нельзя!");
                                break;
                            } else if(field[1][1] == 'o'){
                                System.out.println("Тут занято, сюда ставить нельзя!");
                                break;
                            } else
                                System.out.println("-------------------");
                            printFieldCord();
                            System.out.println("-------------------");
                            field[1][1] = 'o';
                            printField(field);
                            System.out.println("-------------------");
                            x = !turnX(field[1][1]);
                            finCount++;
                            break;
                        case 6:
                            if(field[1][2] == 'x'){
                                System.out.println("Тут занято, сюда ставить нельзя!");
                                break;
                            } else if(field[1][2] == 'o'){
                                System.out.println("Тут занято, сюда ставить нельзя!");
                                break;
                            } else
                                System.out.println("-------------------");
                            printFieldCord();
                            System.out.println("-------------------");
                            field[1][2] = 'o';
                            printField(field);
                            System.out.println("-------------------");
                            x = !turnX(field[1][2]);
                            finCount++;
                            break;
                        case 7:
                            if(field[2][0] == 'x'){
                                System.out.println("Тут занято, сюда ставить нельзя!");
                                break;
                            } else if(field[2][0] == 'o'){
                                System.out.println("Тут занято, сюда ставить нельзя!");
                                break;
                            } else
                                System.out.println("-------------------");
                            printFieldCord();
                            System.out.println("-------------------");
                            field[2][0] = 'o';
                            printField(field);
                            System.out.println("-------------------");
                            x = !turnX(field[2][0]);
                            finCount++;
                            break;
                        case 8:
                            if(field[2][1] == 'x'){
                                System.out.println("Тут занято, сюда ставить нельзя!");
                                break;
                            } else if(field[2][1] == 'o'){
                                System.out.println("Тут занято, сюда ставить нельзя!");
                                break;
                            } else
                                System.out.println("-------------------");
                            printFieldCord();
                            System.out.println("-------------------");
                            field[2][1] = 'o';
                            printField(field);
                            System.out.println("-------------------");
                            x = !turnX(field[2][1]);
                            finCount++;
                            break;
                        case 9:
                            if(field[2][2] == 'x'){
                                System.out.println("Тут занято, сюда ставить нельзя!");
                                break;
                            } else if(field[2][2] == 'o'){
                                System.out.println("Тут занято, сюда ставить нельзя!");
                                break;
                            } else
                                System.out.println("-------------------");
                            printFieldCord();
                            System.out.println("-------------------");
                            field[2][2] = 'o';
                            printField(field);
                            System.out.println("-------------------");
                            x = !turnX(field[2][2]);
                            finCount++;
                            break;
                        default:
                            System.out.println("0_o");
                            break;
                    }
                }
            }
            if (winGameX(field)){
                scn.close();
                System.out.println("Победил X");
                break;
            } else if (winGameO(field)){
                scn.close();
                System.out.println("Победил O");
                break;
            } else if (finCount == 9){
                scn.close();
                System.out.println("Ничья");
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
                System.out.print(anArray[j] + "\t");
            }
            System.out.println();
        }
    }

    public static boolean turnX(char c){
        boolean checkTurn;
        checkTurn = c == 'x';
        return checkTurn;
    }


    public static boolean winGameX(char[][] array){

        boolean winStatus;

        winStatus = array[0][0] == 'x' && array[0][1] == 'x' && array[0][2] == 'x' ||
                array[1][0] == 'x' && array[1][1] == 'x' && array[1][2] == 'x' ||
                array[2][0] == 'x' && array[2][1] == 'x' && array[2][2] == 'x' ||
                array[0][0] == 'x' && array[1][0] == 'x' && array[2][0] == 'x' ||
                array[0][1] == 'x' && array[1][1] == 'x' && array[2][1] == 'x' ||
                array[0][2] == 'x' && array[1][2] == 'x' && array[2][2] == 'x' ||
                array[0][0] == 'x' && array[1][1] == 'x' && array[2][2] == 'x' ||
                array[0][2] == 'x' && array[1][1] == 'x' && array[2][0] == 'x';

        return winStatus;
    }

    public static boolean winGameO(char[][] array){

        boolean winStatus;
        winStatus = array[0][0] == 'o' && array[0][1] == 'o' && array[0][2] == 'o' ||
                array[1][0] == 'o' && array[1][1] == 'o' && array[1][2] == 'o' ||
                array[2][0] == 'o' && array[2][1] == 'o' && array[2][2] == 'o' ||
                array[0][0] == 'o' && array[1][0] == 'o' && array[2][0] == 'o' ||
                array[0][1] == 'o' && array[1][1] == 'o' && array[2][1] == 'o' ||
                array[0][2] == 'o' && array[1][2] == 'o' && array[2][2] == 'o' ||
                array[0][0] == 'o' && array[1][1] == 'o' && array[2][2] == 'o' ||
                array[0][2] == 'o' && array[1][1] == 'o' && array[2][0] == 'o';

        return winStatus;
    }
}