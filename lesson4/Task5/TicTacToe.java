package Task5;

import java.util.Scanner;

/**
 * * Написать игру «Крестики нолики» используя
 * двухмерные массивы.
 */

public class TicTacToe {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        char[][] field = new char[3][3];

        System.out.println("Координаты поля");
        printFieldCord();
        System.out.println("----------");
        fillFieldsNewGame(field);
        printField(field);

        int cord, finCount = 0;
        boolean x = true;

        while (true) {
            if (x) {
                System.out.println("Сейчас ход \"х\"");
                System.out.println("Введите координату точки куда хотите поставить \"x\"");
                cord = scn.nextInt();

                if (cord > 9 && cord < 9) {
                    System.out.println("Неверный ввод");
                    continue;
                } else {
                    switch (cord) {
                        case 1:
                            if (field[0][0] != '.') {
                                System.out.println("Тут занято, сюда ставить нельзя!");
                                break;
                            } else
                                printFieldCord();
                            System.out.println("----------");
                            field[0][0] = 'x';
                            printField(field);
                            x = false;
                            finCount++;
                            break;
                        case 2:
                            if (field[0][1] != '.') {
                                System.out.println("Тут занято, сюда ставить нельзя!");
                                break;
                            } else
                                printFieldCord();
                            System.out.println("----------");
                            field[0][1] = 'x';
                            printField(field);
                            x = false;
                            finCount++;
                            break;
                        case 3:
                            if (field[0][2] != '.') {
                                System.out.println("Тут занято, сюда ставить нельзя!");
                                break;
                            } else
                                printFieldCord();
                            System.out.println("----------");
                            field[0][2] = 'x';
                            printField(field);
                            x = false;
                            finCount++;
                            break;
                        case 4:
                            if (field[1][0] != '.') {
                                System.out.println("Тут занято, сюда ставить нельзя!");
                                break;
                            } else
                                printFieldCord();
                            System.out.println("----------");
                            field[1][0] = 'x';
                            printField(field);
                            x = false;
                            finCount++;
                            break;
                        case 5:
                            if (field[1][1] != '.') {
                                System.out.println("Тут занято, сюда ставить нельзя!");
                                break;
                            } else
                                printFieldCord();
                            System.out.println("----------");
                            field[1][1] = 'x';
                            printField(field);
                            x = false;
                            finCount++;
                            break;
                        case 6:
                            if (field[1][2] != '.') {
                                System.out.println("Тут занято, сюда ставить нельзя!");
                                break;
                            } else
                                printFieldCord();
                            System.out.println("----------");
                            field[1][2] = 'x';
                            printField(field);
                            x = false;
                            finCount++;
                            break;
                        case 7:
                            if (field[2][0] != '.') {
                                System.out.println("Тут занято, сюда ставить нельзя!");
                                break;
                            } else
                                printFieldCord();
                            System.out.println("----------");
                            field[2][0] = 'x';
                            printField(field);
                            x = false;
                            finCount++;
                            break;
                        case 8:
                            if (field[2][1] != '.') {
                                System.out.println("Тут занято, сюда ставить нельзя!");
                                break;
                            } else
                                printFieldCord();
                            System.out.println("----------");
                            field[2][1] = 'x';
                            printField(field);
                            x = false;
                            finCount++;
                            break;
                        case 9:
                            if (field[2][2] != '.') {
                                System.out.println("Тут занято, сюда ставить нельзя!");
                                break;
                            } else
                                printFieldCord();
                            System.out.println("----------");
                            field[2][2] = 'x';
                            printField(field);
                            x = false;
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

                if (cord > 9 && cord < 9) {
                    System.out.println("Неверный ввод");
                    continue;
                } else {
                    switch (cord) {
                        case 1:
                            if (field[0][0] != '.') {
                                System.out.println("Тут занято, сюда ставить нельзя!");
                                break;
                            } else
                                printFieldCord();
                            System.out.println("----------");
                            field[0][0] = 'o';
                            printField(field);
                            x = true;
                            finCount++;
                            break;
                        case 2:
                            if (field[0][1] != '.') {
                                System.out.println("Тут занято, сюда ставить нельзя!");
                                break;
                            } else
                                printFieldCord();
                            System.out.println("----------");
                            field[0][1] = 'o';
                            printField(field);
                            x = true;
                            finCount++;
                            break;
                        case 3:
                            if (field[0][2] != '.') {
                                System.out.println("Тут занято, сюда ставить нельзя!");
                                break;
                            } else
                                printFieldCord();
                            System.out.println("----------");
                            field[0][2] = 'o';
                            printField(field);
                            x = true;
                            finCount++;
                            break;
                        case 4:
                            if (field[1][0] != '.') {
                                System.out.println("Тут занято, сюда ставить нельзя!");
                                break;
                            } else
                                printFieldCord();
                            System.out.println("----------");
                            field[1][0] = 'o';
                            printField(field);
                            x = true;
                            finCount++;
                            break;
                        case 5:
                            if (field[1][1] != '.') {
                                System.out.println("Тут занято, сюда ставить нельзя!");
                                break;
                            } else
                                printFieldCord();
                            System.out.println("----------");
                            field[1][1] = 'o';
                            printField(field);
                            x = true;
                            finCount++;
                            break;
                        case 6:
                            if (field[1][2] != '.') {
                                System.out.println("Тут занято, сюда ставить нельзя!");
                                break;
                            } else
                                printFieldCord();
                            System.out.println("----------");
                            field[1][2] = 'o';
                            printField(field);
                            x = true;
                            finCount++;
                            break;
                        case 7:
                            if (field[2][0] != '.') {
                                System.out.println("Тут занято, сюда ставить нельзя!");
                                break;
                            } else
                                printFieldCord();
                            System.out.println("----------");
                            field[2][0] = 'o';
                            printField(field);
                            x = true;
                            finCount++;
                            break;
                        case 8:
                            if (field[2][1] != '.') {
                                System.out.println("Тут занято, сюда ставить нельзя!");
                                break;
                            } else
                                printFieldCord();
                            System.out.println("----------");
                            field[2][1] = 'o';
                            printField(field);
                            x = true;
                            finCount++;
                            break;
                        case 9:
                            if (field[2][2] != '.') {
                                System.out.println("Тут занято, сюда ставить нельзя!");
                                break;
                            } else
                                printFieldCord();
                            System.out.println("----------");
                            field[2][2] = 'o';
                            printField(field);
                            x = true;
                            finCount++;
                            break;
                        default:
                            System.out.println("0_o");
                            break;
                    }
                }
            }
            if (winGameX(field)) {
                scn.close();
                System.out.println("Победил X");
                break;
            } else if (winGameO(field)) {
                scn.close();
                System.out.println("Победил O");
                break;
            } else if (finCount == 9) {
                scn.close();
                System.out.println("Ничья");
                break;
            }
        }
    }

    public static void fillFieldsNewGame(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = '.';
            }
        }
    }

    public static int[][] printFieldCord() {
        int[][] array = new int[3][3];
        int num = 1 ;

        for(int i = 0; i < array.length; i++){
            for(int k = 0; k < array.length; k++){
                array[i][k]=num++;
            }
        }
        for (int[] anArray : array) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(anArray[j] + "\t");
            }
            System.out.println();
        }
        return array;
    }

    public static void printField(char[][] array) {
        for (char[] anArray : array) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(anArray[j] + "\t");
            }
            System.out.println();
        }
    }

    public static boolean winGameX(char[][] array) {
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

    public static boolean winGameO(char[][] array) {
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